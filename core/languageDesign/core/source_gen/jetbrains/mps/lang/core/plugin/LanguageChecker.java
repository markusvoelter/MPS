package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.checking.BaseEditorChecker;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.Map;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.smodel.SModelRepositoryAdapter;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.SModelAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.typesystem.checking.TypesEditorChecker;
import java.util.List;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.MessageStatus;
import jetbrains.mps.nodeEditor.HighlighterMessage;
import jetbrains.mps.typesystem.checking.HighlightUtil;
import jetbrains.mps.util.NameUtil;

public class LanguageChecker extends BaseEditorChecker {
  private static Logger LOG = Logger.getLogger(LanguageChecker.class);

  private boolean myMessagesChanged = false;
  private Set<AbstractConstraintsChecker> myRules = SetSequence.fromSet(new HashSet<AbstractConstraintsChecker>());
  private Map<SNodePointer, LanguageErrorsComponent> myRootsToComponents = MapSequence.fromMap(new HashMap<SNodePointer, LanguageErrorsComponent>());
  private Set<EditorComponent> myEditorComponents = SetSequence.fromSet(new HashSet<EditorComponent>());
  private EditorComponent.EditorDisposeListener myDisposeListener = new EditorComponent.EditorDisposeListener() {
    public void editorWillBeDisposed(EditorComponent editorComponent) {
      SetSequence.fromSet(myEditorComponents).removeElement(editorComponent);
      MapSequence.fromMap(myRootsToComponents).removeKey(new SNodePointer(editorComponent.getEditedNode()));
    }
  };
  private SModelRepositoryAdapter myRepositoryListener = new SModelRepositoryAdapter() {
    public void beforeModelRemoved(SModelDescriptor descriptor) {
      modelDescriptorRemoved(descriptor);
    }

    public void beforeModelDeleted(SModelDescriptor descriptor) {
      modelDescriptorRemoved(descriptor);
    }
  };
  private SModelListener myModelListener = new SModelAdapter() {
    public void beforeModelDisposed(SModel model) {
      clearForModel(model.getSModelReference());
    }
  };
  private Set<SModelDescriptor> myListenedModels = SetSequence.fromSet(new HashSet<SModelDescriptor>());

  public LanguageChecker() {
    SetSequence.fromSet(myRules).addElement(new ConstraintsChecker());
    SetSequence.fromSet(myRules).addElement(new RefScopeChecker());
    SetSequence.fromSet(myRules).addElement(new CardinalitiesChecker());
    SetSequence.fromSet(myRules).addElement(new TargetConceptChecker());

    SModelRepository.getInstance().addModelRepositoryListener(this.myRepositoryListener);
  }

  public void doDispose() {
    for (LanguageErrorsComponent comp : MapSequence.fromMap(myRootsToComponents).values()) {
      comp.dispose();
    }
    for (EditorComponent component : myEditorComponents) {
      component.removeDisposeListener(myDisposeListener);
    }
    SModelRepository.getInstance().removeModelRepositoryListener(myRepositoryListener);
    for (SModelDescriptor modelDescriptor : SetSequence.fromSetWithValues(new HashSet<SModelDescriptor>(), myListenedModels)) {
      removeModelListener(modelDescriptor);
    }
    super.doDispose();
  }

  private void modelDescriptorRemoved(SModelDescriptor modelDescriptor) {
    this.removeModelListener(modelDescriptor);
    this.clearForModel(modelDescriptor.getSModelReference());
  }

  private void removeModelListener(SModelDescriptor modelDescriptor) {
    if (SetSequence.fromSet(myListenedModels).contains(modelDescriptor)) {
      modelDescriptor.removeModelListener(myModelListener);
      SetSequence.fromSet(myListenedModels).removeElement(modelDescriptor);
    }
  }

  private void addModelListener(SModelDescriptor modelDescriptor) {
    if (!(SetSequence.fromSet(myListenedModels).contains(modelDescriptor))) {
      modelDescriptor.addModelListener(myModelListener);
      SetSequence.fromSet(myListenedModels).addElement(modelDescriptor);
    }
  }

  private void clearForModel(SModelReference modelReference) {
    for (SNodePointer root : SetSequence.fromSetWithValues(new HashSet<SNodePointer>(), MapSequence.fromMap(myRootsToComponents).keySet())) {
      if (root.getModelReference().equals(modelReference)) {
        MapSequence.fromMap(myRootsToComponents).get(root).dispose();
        MapSequence.fromMap(myRootsToComponents).removeKey(root);
      }
    }
    for (EditorComponent component : SetSequence.fromSetWithValues(new HashSet<EditorComponent>(), myEditorComponents)) {
      if (component.getEditedNode().getModel().getSModelReference().equals(modelReference)) {
        component.removeDisposeListener(myDisposeListener);
        SetSequence.fromSet(myEditorComponents).removeElement(component);
      }
    }
  }

  public boolean areMessagesChanged() {
    return myMessagesChanged;
  }

  public boolean isLaterThan(BaseEditorChecker checker) {
    if (checker instanceof TypesEditorChecker) {
      return true;
    }
    return false;
  }

  public boolean hasDramaticalEvent(List<SModelEvent> list) {
    return true;
  }

  public Set<EditorMessage> createMessages(SNode node, List<SModelEvent> list, boolean wasCheckedOnce, EditorContext editorContext) {
    myMessagesChanged = false;
    EditorComponent editorComponent = editorContext.getNodeEditorComponent();
    SNode root = node.getContainingRoot();
    Set<EditorMessage> result = SetSequence.fromSet(new HashSet<EditorMessage>());
    if (root == null) {
      LOG.error("containing root for node " + node + " is null");
      return result;
    }
    SModelDescriptor descriptor = SNodeOperations.getModel(root).getModelDescriptor();
    if (descriptor == null) {
      // descriptor is null for a replaced model 
      // after model is replaced but before it is disposed (this can happen asyncronously) 
      return result;
    }
    SNodePointer rootPointer = new SNodePointer(root);
    LanguageErrorsComponent errorsComponent = MapSequence.fromMap(myRootsToComponents).get(rootPointer);

    if (errorsComponent == null) {
      errorsComponent = new LanguageErrorsComponent(editorComponent.getEditedNode());
      MapSequence.fromMap(myRootsToComponents).put(rootPointer, errorsComponent);
    }
    if (!(editorComponent instanceof InspectorEditorComponent) && !(SetSequence.fromSet(myEditorComponents).contains(editorComponent))) {
      SetSequence.fromSet(myEditorComponents).addElement(editorComponent);
      editorComponent.addDisposeListener(myDisposeListener);
    }
    addModelListener(descriptor);

    if (!(wasCheckedOnce)) {
      errorsComponent.clear();
    }
    boolean changed = false;
    TypeCheckingContext typecheckingContext = editorComponent.getTypeCheckingContext();
    try {
      if (typecheckingContext != null) {
        typecheckingContext.setIsNonTypesystemComputation();
      }
      changed = errorsComponent.check(node, myRules, editorContext.getOperationContext());
    } finally {
      if (typecheckingContext != null) {
        typecheckingContext.resetIsNonTypesystemComputation();
      }
    }
    myMessagesChanged = changed;
    for (IErrorReporter errorReporter : errorsComponent.getErrors()) {

      MessageStatus status = errorReporter.getMessageStatus();
      String errorString = errorReporter.reportError();
      HighlighterMessage message = HighlightUtil.createHighlighterMessage(errorReporter.getSNode(), NameUtil.capitalize(status.getPresentation()) + ": " + errorString, errorReporter, LanguageChecker.this, editorContext);
      SetSequence.fromSet(result).addElement(message);
    }
    return result;
  }

  public void clear(SNode node, EditorComponent component) {
    if (node == null) {
      return;
    }
    SNode containingRoot = node.getContainingRoot();
    if (containingRoot == null) {
      return;
    }
    LanguageErrorsComponent errorsComponent = MapSequence.fromMap(myRootsToComponents).get(new SNodePointer(containingRoot));
    if (errorsComponent == null) {
      return;
    }
    errorsComponent.clear();
  }
}
