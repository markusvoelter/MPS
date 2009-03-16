package jetbrains.mps.lang.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;

public class Rename extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  private Set<String> myTransientParameters = new HashSet<String>();

  public Rename() {
    this.myTransientParameters.add("newName");
  }

  public String getUserFriendlyName() {
    return "Rename";
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
    return "jetbrains.mps.lang.core.structure.INamedConcept";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    return refactoringContext.getSelectedNode() != null && SNodeOperations.isInstanceOf(refactoringContext.getSelectedNode(), "jetbrains.mps.lang.core.structure.INamedConcept");
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

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      SNode node = refactoringContext.getSelectedNode();
      node.setName(((String)refactoringContext.getParameter("newName")));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public List<SModel> getModelsToUpdate(final RefactoringContext refactoringContext) {
    return ListOperations.<SModel>createList();
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
  }

  public List<SNode> getNodesToOpen(final RefactoringContext refactoringContext) {
    return ListOperations.<SNode>createList();
  }

  public boolean doesUpdateModel() {
    return false;
  }

  public String newName_initialValue(final RefactoringContext refactoringContext) {
    return refactoringContext.getSelectedNode().getName();
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      boolean result = false;
      final List<IChooseComponent> components = ListOperations.<IChooseComponent>createList();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          {
            IChooseComponent<String> chooseComponent;
            chooseComponent = new ChooseStringComponent();
            chooseComponent.setPropertyName("newName");
            chooseComponent.setCaption("new name:");
            chooseComponent.initComponent();
            chooseComponent.setInitialValue(Rename.this.newName_initialValue(refactoringContext));
            ListOperations.addElement(components, chooseComponent);
          }
        }

      });
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return "shift F6";
  }

  public static Class getClass_static() {
    return Rename.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.lang.core.structure.INamedConcept")) {
      return true;
    } else
    {
      return false;
    }
  }

}
