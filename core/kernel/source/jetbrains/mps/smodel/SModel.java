/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.smodel;

import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.refactoring.framework.RefactoringHistory;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.smodel.search.IsInstanceCondition;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.WeakSet;
import org.apache.commons.lang.ObjectUtils;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Author: Sergey Dmitriev
 * Created Sep 16, 2003
 */
public class SModel implements Iterable<SNode> {
  private static final Logger LOG = Logger.getLogger(SModel.class);

  private List<ModuleReference> myVersionedLanguages = new ArrayList<ModuleReference>();

  private Set<SNode> myRoots = new LinkedHashSet<SNode>();
  private SModelReference myReference;

  private boolean myDisposed;
  private boolean myLoading;

  private FastNodeFinder myFastNodeFinder;

  private int myMaxImportIndex;
  private List<ModuleReference> myLanguages = new ArrayList<ModuleReference>();
  private List<ModuleReference> myLanguagesEngagedOnGeneration = new ArrayList<ModuleReference>();
  private List<ModuleReference> myDevKits = new ArrayList<ModuleReference>();
  private List<ImportElement> myImports = new ArrayList<ImportElement>();
  private List<ImportElement> myAdditionalModelsVersions = new ArrayList<ImportElement>();

  private Map<SNodeId, SNode> myIdToNodeMap = new HashMap<SNodeId, SNode>();

  private RefactoringHistory myRefactoringHistory = new RefactoringHistory();
  private boolean myUsesLog;
  private boolean myRegistrationsForbidden = false;

  private int myPersistenceVersion = -1;

  private SModelDescriptor myModelDescriptor;

  public SModel(@NotNull SModelReference modelReference) {
    myReference = modelReference;
  }

  public void setPersistenceVersion(int persistenceVersion) {
    myPersistenceVersion = persistenceVersion;
  }

  public int getPersistenceVersion() {
    return myPersistenceVersion;
  }

  @NotNull
  public SModelReference getSModelReference() {
    return myReference;
  }

  public SModelFqName getSModelFqName() {
    return getSModelReference().getSModelFqName();
  }

  public SModelId getSModelId() {
    return getSModelReference().getSModelId();
  }

  @NotNull
  public String getShortName() {
    return myReference.getShortName();
  }

  public void runLoadingAction(@NotNull Runnable runnable) {
    boolean wasLoading = setLoading(true);
    try {
      runnable.run();
    } finally {
      setLoading(wasLoading);
    }
  }

  @NotNull
  public Iterator<SNode> iterator() {
    return roots();
  }

  @NotNull
  public String getStereotype() {
    return myReference.getStereotype();
  }

  @NotNull
  public String getLongName() {
    return myReference.getLongName();
  }

  @Deprecated
  public boolean usesLog() {
    return myUsesLog;
  }

  public void setUsesLog(boolean usesLog) {
    myUsesLog = usesLog;
  }

  @NotNull
  public Iterator<SNode> roots() {
    return myRoots.iterator();
  }

  @NotNull
  public List<SNode> getRoots() {
    return new ArrayList<SNode>(myRoots);
  }

  public boolean isRoot(@Nullable SNode node) {
    return myRoots.contains(node);
  }

  @NotNull
  public List<SNode> getRoots(@NotNull Condition<SNode> condition) {
    List<SNode> list = new ArrayList<SNode>();
    for (SNode node : myRoots) {
      if (condition.met(node)) list.add(node);
    }
    return list;
  }

  public List<INodeAdapter> getRootsAdapters() {
    List<INodeAdapter> result = new ArrayList<INodeAdapter>();
    for (SNode root : getRoots()) {
      result.add(root.getAdapter());
    }
    return result;
  }

  public <N extends INodeAdapter> List<N> getRootsAdapters(@NotNull Class<N> cls) {
    List<N> result = new ArrayList<N>();
    for (SNode root : getRoots()) {
      INodeAdapter a = root.getAdapter();
      if (cls.isInstance(a)) {
        result.add((N) a);
      }
    }
    return result;
  }


  public void addRoot(@NotNull INodeAdapter node) {
    addRoot(node.getNode());
  }

  public void removeRoot(@NotNull INodeAdapter node) {
    removeRoot(node.getNode());
  }


  public void addRoot(@NotNull SNode node) {
    ModelChange.assertLegalNodeRegistration(this, node);
    if (myRoots.contains(node)) return;
    if (node.getModel() != this && node.getModel().isRoot(node)) {
      node.getModel().removeRoot(node);
    } else {
      SNode parent = node.getParent();
      if (parent != null) {
        parent.removeChild(node);
      }
    }

    myRoots.add(node);
    node.registerInModel(this);
    if (ModelChange.needRegisterUndo(this)) {
      UndoUtil.addUndoableAction(new AddRootUndoableAction(node));
    }
    fireRootAddedEvent(node);
  }

  public void removeRoot(@NotNull SNode node) {
    ModelChange.assertLegalNodeUnRegistration(this, node);
    if (myRoots.contains(node)) {
      myRoots.remove(node);
      node.unRegisterFromModel();
      if (ModelChange.needRegisterUndo(this)) {
        UndoUtil.addUndoableAction(new RemoveRootUndoableAction(node));
      }
      fireRootRemovedEvent(node);
    }
  }

  public boolean setLoading(boolean loading) {
    boolean wasLoading = myLoading;
    myLoading = loading;
    if (wasLoading != loading) {
      fireLoadingStateChanged();
    }
    return wasLoading;
  }

  public boolean isLoading() {
    return myLoading;
  }

  public synchronized SModelDescriptor getModelDescriptor() {
    return myModelDescriptor;
  }

  public synchronized void setModelDescritor(SModelDescriptor modelDescriptor) {
    myModelDescriptor = modelDescriptor;
  }

  private boolean canFireEvent() {
    return !myLoading;
  }

  private SModelListener[] getModelListeners() {
    SModelDescriptor modelDescriptor = getModelDescriptor();
    return modelDescriptor != null ? modelDescriptor.getModelListeners() : new SModelListener[0];
  }

  private void fireDevKitAddedEvent(@NotNull ModuleReference ref) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.devkitAdded(new SModelDevKitEvent(this, ref));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireDevKitRemovedEvent(@NotNull ModuleReference ref) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.devkitRemoved(new SModelDevKitEvent(this, ref));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireLanguageAddedEvent(@NotNull ModuleReference ref) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.languageAdded(new SModelLanguageEvent(this, ref));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireLanguageRemovedEvent(@NotNull ModuleReference ref) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.languageRemoved(new SModelLanguageEvent(this, ref));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireImportAddedEvent(@NotNull SModelReference modelReference) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.importAdded(new SModelImportEvent(this, modelReference));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireImportRemovedEvent(@NotNull SModelReference modelReference) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.importAdded(new SModelImportEvent(this, modelReference));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireRootAddedEvent(@NotNull SNode root) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.rootAdded(new SModelRootEvent(this, root, true));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireRootRemovedEvent(@NotNull SNode root) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.rootRemoved(new SModelRootEvent(this, root, false));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void firePropertyChangedEvent(@NotNull SNode node,
                                @NotNull String property,
                                @Nullable String oldValue,
                                @Nullable String newValue) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.propertyChanged(new SModelPropertyEvent(this, property, node, oldValue, newValue));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void fireChildAddedEvent(@NotNull SNode parent,
                           @NotNull String role,
                           @NotNull SNode child,
                           SNode anchor) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        int childIndex = anchor == null ? 0 : parent.getChildren().indexOf(anchor) + 1;
        sModelListener.childAdded(new SModelChildEvent(this, true, parent, role, childIndex, child));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void fireChildRemovedEvent(@NotNull SNode parent,
                             @NotNull String role,
                             @NotNull SNode child,
                             SNode anchor) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        int childIndex = anchor == null ? 0 : parent.getChildren().indexOf(anchor) + 1;
        sModelListener.childRemoved(new SModelChildEvent(this, false, parent, role, childIndex, child));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void fireBeforeChildRemovedEvent(@NotNull SNode parent,
                                          @NotNull String role,
                                          @NotNull SNode child,
                                          SNode anchor) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        int childIndex = anchor == null ? 0 : parent.getChildren().indexOf(anchor) + 1;
        sModelListener.beforeChildRemoved(new SModelChildEvent(this, false, parent, role, childIndex, child));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void fireReferenceAddedEvent(@NotNull SReference reference) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.referenceAdded(new SModelReferenceEvent(this, reference, true));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  void fireReferenceRemovedEvent(@NotNull SReference reference) {
    if (!canFireEvent()) return;
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.referenceRemoved(new SModelReferenceEvent(this, reference, false));
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireLoadingStateChanged() {
    for (SModelListener sModelListener : getModelListeners()) {
      try {
        sModelListener.loadingStateChanged(getModelDescriptor(), isLoading());
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  public boolean hasLanguage(@NotNull ModuleReference ref) {
    return getLanguageRefs(GlobalScope.getInstance()).contains(ref);
  }

  public boolean hasLanguage(String namespace) {
    for (ModuleReference ref : getLanguageRefs(GlobalScope.getInstance())) {
      if (namespace.equals(ref.getModuleFqName())) {
        return true;
      }
    }
    return false;
  }

  public void addLanguage(@NotNull Language language) {
    addLanguage_internal(language.getModuleReference());
    addAspectModelsVersions(language);
  }

  public void addLanguage(@NotNull ModuleReference ref) {
    addLanguage(ref, false);
  }

  public void addLanguage(@NotNull ModuleReference ref, boolean firstVersion) {
    addLanguage_internal(ref);
    Language language = GlobalScope.getInstance().getLanguage(ref);
    if (language != null) {
      addAspectModelsVersions(language, firstVersion);
    }
  }

  public void addAspectModelsVersions(@NotNull Language language) {
    addAspectModelsVersions(language, false);
  }

  public void addAspectModelsVersions(@NotNull Language language, boolean firstVersion) {
    ModelChange.assertLegalChange(this);
    if (myVersionedLanguages.contains(language.getModuleReference())) return;

    for (EditableSModelDescriptor modelDescriptor : language.getAspectModelDescriptors()) {
      addAdditionalModelVersion(modelDescriptor.getSModelReference(), firstVersion ? -1 : modelDescriptor.getVersion());
    }
    myVersionedLanguages.add(language.getModuleReference());
    for (Language l : language.getExtendedLanguages()) {
      addAspectModelsVersions(l);
    }
  }

  private void addAspectModelsVersions(DevKit devKit) {
    for (Language language : devKit.getExportedLanguages()) {
      addAspectModelsVersions(language);
    }
  }


  public void addLanguage_internal(@NotNull ModuleReference ref) {
    ModelChange.assertLegalChange(this);
    if (hasLanguage(ref)) return;

    if (ref.getModuleId() == null) {
      LOG.warning("Attempt to add language reference to a language without id in model " + getSModelFqName() + ". Language = " + ref);
    }

    if (!myLanguages.contains(ref)) {
      myLanguages.add(ref);
      fireLanguageAddedEvent(ref);
    }
  }

  public void deleteLanguage(@NotNull ModuleReference ref) {
    ModelChange.assertLegalChange(this);

    myLanguages.remove(ref);
    myVersionedLanguages.remove(ref);
    removeUnusedLanguageAspectModelElements();
    fireLanguageRemovedEvent(ref);
  }

  public void deleteAllLanguages() {
    ArrayList<ModuleReference> languages = new ArrayList<ModuleReference>(myLanguages);
    for (ModuleReference language : languages) {
      deleteLanguage(language);
    }
  }

  public void addNewlyImportedDevKit(ModuleReference ref) {
    addDevKit(ref);
    addAspectModelsVersions(GlobalScope.getInstance().getDevKit(ref));
  }

  public void addDevKit(@NotNull DevKit devKit) {
    addDevKit(devKit.getModuleReference());
  }

  public void addDevKit(@NotNull ModuleReference ref) {
    ModelChange.assertLegalChange(this);

    if (!myDevKits.contains(ref)) {
      myDevKits.add(ref);
      fireDevKitAddedEvent(ref);
    }
  }

  public void deleteDevKit(@NotNull ModuleReference ref) {
    ModelChange.assertLegalChange(this);

    myDevKits.remove(ref);
    fireDevKitRemovedEvent(ref);
  }

  @NotNull
  public List<Language> getLanguages(@NotNull IScope scope) {
    Set<Language> languages = new LinkedHashSet<Language>();

    for (ModuleReference lang : myLanguages) {
      Language language = scope.getLanguage(lang);

      if (language != null) {
        languages.add(language);
        languages.addAll(language.getAllExtendedLanguages());
        //addAspectModelsVersions(languageNamespace, language);
      }
    }

    for (ModuleReference dk : getDevKitRefs()) {
      DevKit devKit = scope.getDevKit(dk);
      if (devKit != null) {
        //addDevkitModelsVersions(dk, devKit);
        for (Language l : devKit.getAllExportedLanguages()) {
          if (!languages.contains(l)) {
            languages.add(l);
            languages.addAll(l.getAllExtendedLanguages());
          }
        }
      }
    }

    if (getModelDescriptor() != null && getModelDescriptor().getModule() != null) {
      IModule module = getModelDescriptor().getModule();
      languages.addAll(module.getImplicitlyImportedLanguages(getModelDescriptor()));
    }

    return new ArrayList<Language>(languages);
  }

  public List<DevKit> getDevkits(@NotNull IScope scope) {
    ModelAccess.assertLegalRead();

    List<DevKit> result = new ArrayList<DevKit>();
    for (ModuleReference dk : myDevKits) {
      DevKit devKit = scope.getDevKit(dk);
      if (devKit != null) {
        //addDevkitModelsVersions(dk, devKit);
        result.add(devKit);
      } else {
        LOG.error("Can't find devkit " + dk.getModuleFqName() + " in scope " + scope);
      }
    }
    return result;
  }

  @NotNull
  public Set<ModuleReference> getLanguageRefs(IScope scope) {
//    ModelAccess.assertLegalRead();

    Set<ModuleReference> result = new HashSet<ModuleReference>(myLanguages.size() + myDevKits.size() * 8);
    result.addAll(myLanguages);
    for (ModuleReference dk : myDevKits) {
      DevKit devKit = scope.getDevKit(dk);
      if (devKit != null) {
        //addDevkitModelsVersions(dk, devKit);
        for (Language l : devKit.getExportedLanguages()) {
          if (!result.contains(l.getModuleReference())) {
            result.add(l.getModuleReference());
          }
        }
      }
    }
    return result;
  }

  @NotNull
  public List<ModuleReference> getDevKitRefs() {
    return new ArrayList<ModuleReference>(myDevKits);
  }

  public INodeAdapter getRootAdapterByName(@NotNull String name) {
    return BaseAdapter.fromNode(getRootByName(name));
  }


  @Nullable
  public SNode getRootByName(@NotNull String name) {
    for (SNode root : getRoots()) {
      if (name.equals(root.getName())) return root;
    }
    return null;
  }

  @NotNull
  public List<ModuleReference> getExplicitlyImportedLanguages() {
    return new ArrayList<ModuleReference>(myLanguages);
  }

  public boolean hasImportedModel(@NotNull SModelReference modelReference) {
    return getImportElement(modelReference) != null;
  }

  public void addImportedModel(@NotNull SModelReference modelReference) {
    addImportedModel(modelReference, false);
  }

  public void addImportedModel(@NotNull SModelReference modelReference, boolean firstVersion) {
    addImportElement(modelReference, firstVersion);
  }

  void addImportElement(@NotNull SModelReference modelReference, boolean firstVersion) {
    ModelChange.assertLegalChange(this);

    ImportElement importElement = getImportElement(modelReference);
    if (importElement != null) return;
    SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(modelReference);
    int usedVersion = -1;
    if (modelDescriptor instanceof EditableSModelDescriptor) {
      usedVersion = ((EditableSModelDescriptor) modelDescriptor).getVersion();
    }
    importElement = new ImportElement(modelReference, ++myMaxImportIndex, firstVersion ? -1 : usedVersion);
    myImports.add(importElement);

    fireImportAddedEvent(modelReference);
  }

  public void addImportElement(ImportElement importElement) {
    ModelChange.assertLegalChange(this);

    myImports.add(importElement);
    fireImportAddedEvent(importElement.getModelReference());
  }

  public void addAdditionalModelVersion(@NotNull SModelReference modelReference, int usedVersion) {
    ModelChange.assertLegalChange(this);

    ImportElement importElement = new ImportElement(modelReference, -1, usedVersion);
    myAdditionalModelsVersions.add(importElement);
  }

  @Nullable
  public ImportElement getImportElement(@NotNull SModelReference modelReference) {
    for (ImportElement importElement : myImports) {
      if (importElement.getModelReference().equals(modelReference)) {
        return importElement;
      }
    }
    return null;
  }

  @Nullable
  ImportElement getAdditionalModelElement(@NotNull SModelReference modelReference) {
    for (ImportElement importElement : myAdditionalModelsVersions) {
      if (importElement.getModelReference().equals(modelReference)) {
        return importElement;
      }
    }
    return null;
  }

  public List<ImportElement> getLanguageAspectModelElements() {
    return new ArrayList<ImportElement>(myAdditionalModelsVersions);
  }

  public void removeUnusedLanguageAspectModelElements() {
    Set<SModelReference> dependencies = getDependenciesModelUIDs();
    for (Iterator<ImportElement> iter = myAdditionalModelsVersions.iterator(); iter.hasNext(); ) {
      ImportElement elem = iter.next();
      if (!dependencies.contains(elem.getModelReference())) {
        iter.remove();
      }
    }
  }

  public void deleteImportedModel(@NotNull SModelReference modelReference) {
    ModelChange.assertLegalChange(this);

    ImportElement importElement = getImportElement(modelReference);
    if (importElement != null) {
      myImports.remove(importElement);
      fireImportRemovedEvent(modelReference);
    }
  }

  public void deleteImportedModel(@NotNull SModel model) {
    deleteImportedModel(model.getSModelReference());
  }

  @NotNull
  public List<SModelReference> getImportedModelUIDs() {
    List<SModelReference> references = new ArrayList<SModelReference>();
    for (ImportElement importElement : myImports) {
      references.add(importElement.getModelReference());
    }
    return Collections.unmodifiableList(references);
  }

  @NotNull
  public Set<SModelDescriptor> getDependenciesModels() {
    Set<SModelDescriptor> modelDescriptors = new HashSet<SModelDescriptor>();
    Set<Language> languages = new HashSet<Language>();
    Set<Language> frontier = new HashSet<Language>(getLanguages(GlobalScope.getInstance()));
    Set<Language> newFrontier = new HashSet<Language>();
    while (!frontier.isEmpty()) {
      for (Language l : frontier) {
        if (languages.contains(l)) continue;
        languages.add(l);
        newFrontier.addAll(l.getExtendedLanguages());
      }
      frontier = newFrontier;
      newFrontier = new HashSet<Language>();
    }
    for (Language language : languages) {
      for (SModelDescriptor modelDescriptor : language.getAspectModelDescriptors()) {
        modelDescriptors.add(modelDescriptor);
      }
    }
    for (SModelDescriptor modelDescriptor : allImportedModels(GlobalScope.getInstance())) {
      modelDescriptors.add(modelDescriptor);
    }
    return modelDescriptors;
  }

  @NotNull
  public Set<SModelReference> getDependenciesModelUIDs() {
    Set<SModelReference> result = new HashSet<SModelReference>();
    for (SModelDescriptor sm : getDependenciesModels()) {
      result.add(sm.getSModelReference());
    }
    return result;
  }

  @Nullable
  public SModelReference getImportedModelUID(int referenceID) {
    for (ImportElement importElement : myImports) {
      if (importElement.getReferenceID() == referenceID) {
        return importElement.getModelReference();
      }
    }
    return null;
  }

  @NotNull
  public List<SModelDescriptor> importedModels(@NotNull IScope scope) {
    List<SModelDescriptor> modelsList = new ArrayList<SModelDescriptor>();
    for (ImportElement importElement : myImports) {
      SModelReference modelReference = importElement.getModelReference();
      SModelDescriptor modelDescriptor = scope.getModelDescriptor(modelReference);

      if (modelDescriptor == null) {
        for (Language l : getLanguages(scope)) {
          for (SModelDescriptor accessory : l.getAccessoryModels()) {
            if (modelReference.equals(accessory.getSModelReference())) {
              modelDescriptor = accessory;
              break;
            }
          }
        }
      }

      if (modelDescriptor != null) {
        modelsList.add(modelDescriptor);
      }
    }
    return modelsList;
  }

  public List<SModelDescriptor> allImportedModels(IScope scope) {
    SModelDescriptor sourceModel = getModelDescriptor();
    Set<SModelDescriptor> result = new LinkedHashSet<SModelDescriptor>();
    for (Language language : getLanguages(scope)) {
      for (SModelDescriptor am : language.getAccessoryModels()) {
        if (am != sourceModel) {
          result.add(am);
        }
      }
    }

    for (SModelDescriptor importedModel : importedModels(scope)) {
      if (importedModel != sourceModel) {
        result.add(importedModel);
      }
    }

    if (sourceModel != null) {
      IModule module = sourceModel.getModule();
      if (module != null) {
        result.addAll(module.getImplicitlyImportedModelsFor(sourceModel));
      }
    }

    return new ArrayList<SModelDescriptor>(result);
  }

  @NotNull
  public Iterator<ImportElement> importElements() {
    return myImports.iterator();
  }

  public List<ImportElement> getImportElements() {
    return new ArrayList<ImportElement>(myImports);
  }

  public boolean isImported(@NotNull SModel model) {
    return getImportElement(model.getSModelReference()) != null;
  }

  public void setMaxImportIndex(int i) {
    myMaxImportIndex = i;
  }

  public int getMaxImportIndex() {
    return myMaxImportIndex;
  }

  @NotNull
  public String toString() {
    return this.getSModelReference().toString();
  }

  @Nullable
  public SNode getNodeById(String idString) {
    SNodeId nodeId = SNodeId.fromString(idString);
    return getNodeById(nodeId);
  }

  @Nullable
  public SNode getNodeById(SNodeId nodeId) {
    checkNotDisposed();
    if(myDisposed) return null;
    return myIdToNodeMap.get(nodeId);
  }

  public Set<SNodeId> getNodeIds() {
    checkNotDisposed();
    if(myDisposed) return Collections.emptySet();
    return new HashSet<SNodeId>(myIdToNodeMap.keySet());
  }

  private static AtomicLong ourCounter = new AtomicLong();

  static {
    resetIdCounter();
  }

  static void resetIdCounter() {
    ourCounter.set(Math.abs(new SecureRandom().nextLong()));
  }
  
  public static SNodeId generateUniqueId() {
    long id = Math.abs(ourCounter.incrementAndGet());
    return new SNodeId.Regular(id);
  }

  void registerNode(@NotNull SNode node) {
    checkNotDisposed();
    if(myDisposed) return;
    
    if (myRegistrationsForbidden) {
      LOG.error("Registration in model " + getSModelReference() + " is temporarily forbidden");
    }

    SNodeId id = node.hasId() ? node.getSNodeId() : null;
    SNode existingNode = id != null ? myIdToNodeMap.get(id) : null;
    if(id == null || existingNode != null && existingNode != node) {
      id = generateUniqueId();
      while(myIdToNodeMap.containsKey(id)) {
        resetIdCounter();
        id = generateUniqueId();
      }
      node.setId(id);
    }
    myIdToNodeMap.put(id, node);
  }

  void unregisterNode(@NotNull SNode node) {
    checkNotDisposed();
    SNodeId id = node.getSNodeId();
    if(myDisposed || id == null) return;
    myIdToNodeMap.remove(id);
  }

  @NotNull
  public Collection<SNode> getAllNodesWithIds() {
    checkNotDisposed();
    if(myDisposed) return Collections.emptySet();
    return Collections.unmodifiableCollection(myIdToNodeMap.values());
  }

  public boolean isNotEditable() {
    assert !isDisposed();
    SModelDescriptor modelDescriptor = getModelDescriptor();
//    assert modelDescriptor != null;
    return modelDescriptor == null || modelDescriptor.isReadOnly();
  }

  public void clear() {
    ModelChange.assertLegalChange(this);

    List<SNode> roots = new ArrayList<SNode>(myRoots);
    for (SNode root : roots) {
      root.delete();
    }
  }

  public void dispose() {
    ModelChange.assertLegalChange(this);
    if(myDisposed) return;

    myDisposed = true;
    for (SNode sn : myIdToNodeMap.values()) {
      sn.dispose();
    }
    disposeFastNodeFinder();
    myIdToNodeMap = null;
    myRoots.clear();
  }

  public boolean isDisposed() {
    return myDisposed;
  }

  public void validateLanguagesAndImports() {
    validateLanguagesAndImports(false, false);
  }

  public Set<ModuleReference> getUsedLanguages() {
    Set<ModuleReference> result = new HashSet<ModuleReference>();
    for (SNode node : allNodes()) {
      Language lang = node.getLanguage(GlobalScope.getInstance());
      ModuleReference ref = lang.getModuleReference();
      result.add(ref);
    }
    return result;
  }

  public Set<SModelReference> getUsedImportedModels() {
    Set<SModelReference> result = new HashSet<SModelReference>();
    for (SNode node : allNodes()) {
      List<SReference> references = node.getReferences();
      for (SReference reference : references) {
        if (reference.isExternal()) {
          SModelReference targetModelReference = reference.getTargetSModelReference();
          if (targetModelReference != null && !result.contains(targetModelReference)) {
            result.add(targetModelReference);
          }
        }
      }
    }
    return result;
  }

  public void validateLanguagesAndImports(boolean respectModulesScopes, boolean firstVersion) {
    ModelChange.assertLegalChange(this);
    
    GlobalScope scope = GlobalScope.getInstance();
    SModelDescriptor modelDescriptor = this.getModelDescriptor();
    IModule module = modelDescriptor == null ? null : modelDescriptor.getModule();
    Set<ModuleReference> usedLanguages = getLanguageRefs(scope);
    Set<SModelReference> importedModels = new HashSet<SModelReference>();
    for (SModelDescriptor sm : allImportedModels(scope)) {
      importedModels.add(sm.getSModelReference());
    }
    List<SNode> nodes = allNodes();
    for (SNode node : nodes) {
      Language lang = node.getLanguage(scope);
      if (lang == null) {
        LOG.error("Can't find language " + node.getLanguageNamespace());
        continue;
      }
      ModuleReference ref = lang.getModuleReference();
      if (!usedLanguages.contains(ref)) {

        if (module != null) {
          if (respectModulesScopes && !module.getAllUsedLanguages().contains(lang)) {
              module.addUsedLanguage(ref);
          }
        }

        usedLanguages.add(ref);

        addLanguage(ref, firstVersion);
      }

      for (SReference reference : node.getReferencesIterable()) {
        if (reference.isExternal()) {
          SModelReference targetModelReference = reference.getTargetSModelReference();
          if (targetModelReference != null && !importedModels.contains(targetModelReference)) {
            if (respectModulesScopes && module != null) {
              SModelDescriptor targetModelDescriptor = SModelRepository.getInstance().getModelDescriptor(targetModelReference);
              IModule targetModule = targetModelDescriptor == null ? null : targetModelDescriptor.getModule();
              if (targetModule != null && !module.getAllDependOnModules().contains(targetModule)) {
                module.addDependency(targetModule.getModuleReference(), false); // cannot decide re-export or not here!
              }
            }
            addImportedModel(targetModelReference, firstVersion);
            importedModels.add(targetModelReference);
          }
        }
      }
    }
    importedModels.clear();
  }

  public SNode getNodeByCondition(Condition<SNode> c) {
    checkNotDisposed();
    if(myDisposed) return null;

    for (SNode node : myIdToNodeMap.values()) {
      if (c.met(node)) {
        return node;
      }
    }
    return null;
  }

  /**
   * not used anymore?
   */
  public void clearAdapters() {
    for (SNode node : getAllNodesWithIds()) {
      node.clearAdapter();
    }
  }

  public void clearUserObjects() {
    for (SNode root : getRoots()) {
      root.clearUserObjects();
    }
  }

  public void changeModelReference(SModelReference newModelReference) {
    SModelReference oldReference = myReference;
    myReference = newModelReference;
    for (SNode node : getAllNodesWithIds()) {
      for (SReference reference : node.getReferences()) {
        if (oldReference.equals(reference.getTargetSModelReference())) {
          reference.setTargetSModelReference(newModelReference);
        }
      }
    }
  }

  public void addEngagedOnGenerationLanguage(ModuleReference ref) {
    ModelChange.assertLegalChange(this);

    if (!myLanguagesEngagedOnGeneration.contains(ref)) {
      myLanguagesEngagedOnGeneration.add(ref);
      // don't send event but mark model as changed
      if (!isLoading()) {
        SModelRepository.getInstance().markChanged(this);
      }
    }
  }

  public void removeEngagedOnGenerationLanguage(ModuleReference ref) {
    ModelChange.assertLegalChange(this);

    if (myLanguagesEngagedOnGeneration.contains(ref)) {
      myLanguagesEngagedOnGeneration.remove(ref);
      // don't send event but mark model as changed
      if (!isLoading()) {
        SModelRepository.getInstance().markChanged(this);
      }
    }
  }

  @NotNull
  public List<ModuleReference> getEngagedOnGenerationLanguages() {
    return new ArrayList<ModuleReference>(myLanguagesEngagedOnGeneration);
  }

  public int getUsedVersion(SModelReference sModelReference) {
    ImportElement importElement = getImportElement(sModelReference);
    if (importElement == null) {
      return getLanguageAspectModelVersion(sModelReference);
    }
    return importElement.getUsedVersion();
  }

  public int getLanguageAspectModelVersion(SModelReference sModelReference) {
    ImportElement importElement = getAdditionalModelElement(sModelReference);
    if (importElement == null) return -1;
    return importElement.getUsedVersion();
  }

  void updateImportedModelUsedVersion(SModelReference sModelReference, int currentVersion) {
    ModelChange.assertLegalChange(this);
    
    ImportElement importElement = getImportElement(sModelReference);
    if (importElement != null) {
      importElement.myUsedVersion = currentVersion;
    }

    importElement = getAdditionalModelElement(sModelReference);
    if (importElement != null) {
      importElement.myUsedVersion = currentVersion;
    } else {
      addAdditionalModelVersion(sModelReference, currentVersion);
    }
    fireImportAddedEvent(myReference);
  }

  /**
   * @deprecated Use SModelDescriptor.getRefactoringsHistory()
   */
  @Deprecated
  public RefactoringHistory getRefactoringHistory() {
    return myRefactoringHistory;
  }

  public void refreshRefactoringHistory() {
    ModelChange.assertLegalChange(this);

    try {
      Element e = myRefactoringHistory.toElement();
      myRefactoringHistory = new RefactoringHistory();
      myRefactoringHistory.fromElement(e);
    } catch (Throwable t) {
      LOG.error("refactoring history refresh failed " + this, t, this);
    }
  }

  @Deprecated
  public void setRefactoringHistory(RefactoringHistory refactoringHistory) {
    ModelChange.assertLegalChange(this);

    myRefactoringHistory = refactoringHistory;
  }

  public void clearAdaptersAndUserObjects() {
    for (SNode node : getAllNodesWithIds()) {
      node.clearAdapter();
      node.removeAllUserObjects();
    }
  }

  public int size() {
    return myIdToNodeMap.size();
  }

  void validateLanguages(SNode node) {
    Collection<ModuleReference> allrefs = getLanguageRefs(GlobalScope.getInstance());
    Set<String> available = new HashSet<String>(allrefs.size());
    for(ModuleReference ref : allrefs) {
      available.add(ref.getModuleFqName());
    }
    for(SNode n : node.getDescendantsIterable(null, true)) {
      String namespace = n.getLanguageNamespace();
      if (!available.contains(namespace)) {
        available.add(namespace);
        Language lang = GlobalScope.getInstance().getLanguage(namespace);
        if (lang != null) {
          addLanguage_internal(lang.getModuleReference());
        }
      }
    }
  }

  public static class ImportElement {
    private SModelReference myModelDescriptor;
    private int myReferenceID;
    private int myUsedVersion;

    public ImportElement(SModelReference modelReference, int referenceID) {
      this(modelReference, referenceID, -1);
    }

    public ImportElement(SModelReference modelReference, int referenceID, int usedVersion) {
      myModelDescriptor = modelReference;
      myReferenceID = referenceID;
      myUsedVersion = usedVersion;
    }

    public SModelReference getModelReference() {
      return myModelDescriptor;
    }

    public int getReferenceID() {
      return myReferenceID;
    }

    public int getUsedVersion() {
      return myUsedVersion;
    }

    public String toString() {
      return "ImportElement(" +
        "uid=" + myModelDescriptor + ", " +
        "referenceId=" + myReferenceID + ", " +
        "usedVersion=" + myUsedVersion + ")";
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      ImportElement that = (ImportElement) o;

      if (myReferenceID != that.myReferenceID) return false;
      if (myUsedVersion != that.myUsedVersion) return false;
      if (myModelDescriptor != null ? !myModelDescriptor.equals(that.myModelDescriptor) : that.myModelDescriptor != null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = myModelDescriptor != null ? myModelDescriptor.hashCode() : 0;
      result = 31 * result + myReferenceID;
      result = 31 * result + myUsedVersion;
      return result;
    }
  }

  @NotNull
  public List<SNode> allNodes() {
    SModel model = this;
    List<SNode> result = new ArrayList<SNode>(this.size());
    for (SNode root : model.getRoots()) {
      for(SNode i : root.getDescendantsIterable(null, true)) {
        result.add(i);
      }
    }

    return result;
  }

  public List<SNode> allNodes(Condition<SNode> condition) {
    if (condition instanceof IsInstanceCondition) {
      IsInstanceCondition c = (IsInstanceCondition) condition;
      return getFastNodeFinder().getNodes(c.getConceptFqName(), true);
    }

    List<SNode> resultNodes = new ArrayList<SNode>();

    for (SNode node : getRoots()) {
      for(SNode i : node.getDescendantsIterable(condition, true)) {
        resultNodes.add(i);
      }
    }

    return resultNodes;
  }

  public void setRegistrationsForbidden(boolean registrationsForbidden) {
    myRegistrationsForbidden = registrationsForbidden;
  }

  public <E extends INodeAdapter> List<E> allAdapters(final Class<E> cls) {
    return BaseAdapter.toAdapters(allNodes(new IsInstanceCondition(SModelUtil_new.findConceptDeclaration(cls.getName(), GlobalScope.getInstance()))));
  }

  public <E extends INodeAdapter> List<E> allAdapters(final Class<E> cls, Condition<? super E> condition) {
    List<E> result = allAdapters(cls);
    Iterator<E> it = result.iterator();
    while (it.hasNext()) {
      E e = it.next();
      if (!condition.met(e)) {
        it.remove();
      }
    }
    return result;
  }

  public List<SNode> allNodesIncludingImported(IScope scope, Condition<SNode> condition) {
    List<SModel> modelsList = new ArrayList<SModel>();
    modelsList.add(this);
    List<SModelDescriptor> modelDescriptors = allImportedModels(scope);
    for (SModelDescriptor descriptor : modelDescriptors) {
      modelsList.add(descriptor.getSModel());
    }

    List<SNode> resultNodes = new ArrayList<SNode>();
    for (SModel aModel : modelsList) {
      resultNodes.addAll(aModel.allNodes(condition));
    }
    return resultNodes;
  }

  public List<SNode> allRootsIncludingImported(IScope scope) {
    List<SModel> modelsList = new ArrayList<SModel>();
    modelsList.add(this);
    List<SModelDescriptor> modelDescriptors = allImportedModels(scope);
    for (SModelDescriptor descriptor : modelDescriptors) {
      modelsList.add(descriptor.getSModel());
    }

    List<SNode> resultNodes = new ArrayList<SNode>();
    for (SModel aModel : modelsList) {
      resultNodes.addAll(aModel.getRoots());
    }
    return resultNodes;
  }

  public List<AbstractConceptDeclaration> conceptAdaptersFromModelLanguages(final Condition<AbstractConceptDeclaration> condition, IScope scope) {
    List<AbstractConceptDeclaration> list = new ArrayList<AbstractConceptDeclaration>();
    List<Language> languages = getLanguages(scope);
    for (Language language : languages) {
      SModelDescriptor structureModelDescriptor = language.getStructureModelDescriptor();
      SModel structureModel = structureModelDescriptor.getSModel();
      list.addAll(structureModel.allAdapters(ConceptDeclaration.class, condition));
    }
    return list;
  }

  public boolean updateSModelReferences() {
    ModelChange.assertLegalChange(this);

    boolean changed = false;
    for (SNode node : getAllNodesWithIds()) {
      for (SReference reference : node.getReferences()) {
        SModelReference oldReference = reference.getTargetSModelReference();
        if (oldReference == null) continue;
        SModelReference newRef = oldReference.update();
        if (newRef.differs(oldReference)) {
          changed = true;
          reference.setTargetSModelReference(newRef);
        }
      }
    }

    for (ImportElement e : myImports) {
      SModelReference oldReference = e.myModelDescriptor;
      SModelReference newRef = oldReference.update();
      if (newRef.differs(oldReference)) {
        changed = true;
        e.myModelDescriptor = newRef;
      }
    }

    for (ImportElement e : myAdditionalModelsVersions) {
      SModelReference oldReference = e.myModelDescriptor;
      SModelReference newRef = oldReference.update();
      if (newRef.differs(oldReference)) {
        changed = true;
        e.myModelDescriptor = newRef;
      }
    }

    return changed;
  }

  public boolean updateModuleReferences() {
    ModelChange.assertLegalChange(this);

    boolean changed = false;

    if (updateRefs(myDevKits)) {
      changed = true;
    }

    if (updateRefs(myLanguages)) {
      changed = true;
    }

    if (updateRefs(myLanguagesEngagedOnGeneration)) {
      changed = true;
    }

    if (updateRefs(myVersionedLanguages)) {
      changed = true;
    }

    return changed;
  }

  private boolean updateRefs(List<ModuleReference> refs) {
    boolean changed = false;
    for (int i = 0; i < refs.size(); i++) {
      ModuleReference ref = refs.get(i);
      IModule module = MPSModuleRepository.getInstance().getModule(ref);
      if (module != null) {
        ModuleReference newRef = module.getModuleReference();
        refs.set(i, newRef);
        changed = changed || changed(ref, newRef);
      }
    }
    return changed;
  }

  private boolean changed(ModuleReference ref1, ModuleReference ref2) {
    return !ObjectUtils.equals(ref1.getModuleFqName(), ref2.getModuleFqName()) ||
      !ObjectUtils.equals(ref1.getModuleId(), ref2.getModuleId());
  }

  public synchronized FastNodeFinder getFastNodeFinder() {
    if (myFastNodeFinder == null) {
      myFastNodeFinder = createFastNodeFinder();
    }
    return myFastNodeFinder;
  }

  protected FastNodeFinder createFastNodeFinder() {
    return new DefaultFastNodeFinder(this);
  }

  public synchronized void disposeFastNodeFinder() {
    if(myFastNodeFinder != null) {
      myFastNodeFinder.dispose();
      myFastNodeFinder = null;
    }
  }


  private static WeakSet<SModel> ourActiveModels = new WeakSet<SModel>();

  {
    ourActiveModels.add(this);
  }

  public static void checkModels() {
    System.out.println("total models : " + ourActiveModels.size());

    for (SModel sm : ourActiveModels) {
      if (sm == null) continue;
      SModelDescriptor md = SModelRepository.getInstance().getModelDescriptor(sm.getSModelReference());

      if (md == null) {
        System.out.println("can't find a descriptor for " + sm.getSModelReference());
      } else if (sm != md.getSModel()) {
        System.out.println("Found a leak! : " + sm.getSModelReference());
      }
    }
  }

  public void checkNotDisposed() {
    if(myDisposed) {
      LOG.error(new IllegalModelAccessError("accessing disposed model"));
    }
  }

  public boolean isTransient() {
    return false;
  }
}
