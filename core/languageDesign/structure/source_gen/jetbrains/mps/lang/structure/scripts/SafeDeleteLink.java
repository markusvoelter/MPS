package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.SafeDelete;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class SafeDeleteLink extends AbstractLoggableRefactoring {
  public static final String sourceLanguage = "sourceLanguage";

  private Set<String> myTransientParameters = SetSequence.<String>fromArray();

  public SafeDeleteLink() {
    this.myTransientParameters.add("sourceLanguage");
  }

  public String getUserFriendlyName() {
    return "Safe Delete Link";
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
    return "jetbrains.mps.lang.structure.structure.LinkDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return SafeDelete.getClass_static();
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    return true;
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return true;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    refactoringContext.setParameter("sourceLanguage", Language.getLanguageFor(SNodeOperations.getModel(refactoringContext.getSelectedNode()).getModelDescriptor()));
    return FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.LinkInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      SNode node = refactoringContext.getSelectedNode();
      refactoringContext.deleteFeature(node);
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = MapSequence.fromMap(new HashMap<IModule, List<SModel>>());
      if (((Language)refactoringContext.getParameter("sourceLanguage")) == null) {
        return result;
      }
      List<SModel> list = ListSequence.<SModel>fromArray();
      MapSequence.fromMap(result).put(((Language)refactoringContext.getParameter("sourceLanguage")), list);
      ListSequence.fromList(list).addElement(((Language)refactoringContext.getParameter("sourceLanguage")).getStructureModelDescriptor().getSModel());
      SModelDescriptor editorModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        ListSequence.fromList(list).addElement(editorModelDescriptor.getSModel());
      }
      SModelDescriptor constraintsModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        ListSequence.fromList(list).addElement(constraintsModelDescriptor.getSModel());
      }
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(final RefactoringContext refactoringContext) {
    return ListSequence.<SModel>fromArray();
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public List<SNode> getNodesToOpen(final RefactoringContext refactoringContext) {
    return ListSequence.<SNode>fromArray();
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      Boolean result = ModelAccess.instance().runReadAction(new Computable <Boolean>() {

        public Boolean compute() {
          return SafeDeleteLink.this.isApplicable(refactoringContext);
        }
      });
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return SafeDelete.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return SafeDeleteLink.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.LinkDeclaration"))) {
      return true;
    } else
    {
      return SafeDelete.isApplicableWRTConcept_static(node);
    }
  }

}
