package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.core.scripts.Rename;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class RenameConcept extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  private Set<String> myTransientParameters = new HashSet<String>();

  public RenameConcept() {
    this.myTransientParameters.add("newName");
  }

  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return RenameConcept.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration")) {
      return true;
    } else
    {
      return Rename.isApplicableWRTConcept_static(node);
    }
  }


  public String getUserFriendlyName() {
    return "Rename Concept";
  }

  public Set<String> getTransientParameters() {
    return new HashSet<String>(this.myTransientParameters);
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return Rename.getClass_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      if (node == null) {
        return false;
      }
      return SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration");
    }
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return false;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(actionContext.createProgressIndicator(), actionContext.getNode(), GlobalScope.getInstance(), "jetbrains.mps.bootstrap.structureLanguage.findUsages.ConceptInstances_Finder", "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = (SNode)actionContext.getNode();
      refactoringContext.changeFeatureName(node, SNodeOperations.getModel(node).toString() + "." + ((String)refactoringContext.getParameter("newName")), ((String)refactoringContext.getParameter("newName")));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      SModel model = actionContext.getNode().getModel();
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      if (language != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(language.getAspectModelDescriptors()))).select(new ISelector <SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(language, aspectList);
      }
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public String newName_initialValue(ActionContext actionContext) {
    SNode node = actionContext.getNode();
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"))) {
      return "";
    }
    return SPropertyOperations.getString(node, "name");
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      boolean result = false;
      List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      {
        IChooseComponent<String> chooseComponent;
        chooseComponent = new ChooseStringComponent();
        chooseComponent.setInitialValue(this.newName_initialValue(actionContext));
        chooseComponent.setPropertyName("newName");
        components.add(chooseComponent);
      }
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }

}
