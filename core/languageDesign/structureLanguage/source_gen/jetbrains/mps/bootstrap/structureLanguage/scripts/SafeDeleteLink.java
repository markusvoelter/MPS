package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.findUsages.LinkExamples_Finder;
import jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.core.scripts.SafeDelete;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.TreeBuilder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.smodel.*;

import java.util.*;

public class SafeDeleteLink extends AbstractLoggableRefactoring {

  private Set<String> myTransientParameters = new HashSet<String>();

  public SafeDeleteLink() {
  }

  public static String getKeyStroke_static() {
    return SafeDelete.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return SafeDeleteLink.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration")) {
      return true;
    } else {
      return SafeDelete.isApplicableWRTConcept_static(node);
    }
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
    return "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return SafeDelete.getClass_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
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

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      SearchQuery searchQuery = new SearchQuery(node, GlobalScope.getInstance());
      IResultProvider resultProvider = TreeBuilder.forFinders(new LinkExamples_Finder(), new NodeAndDescendantsUsages_Finder());
      SearchResults searchResults = resultProvider.getResults(searchQuery, actionContext.createProgressIndicator());
      return searchResults;
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      refactoringContext.deleteFeature(node);
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      if (((Language) refactoringContext.getParameter("sourceLanguage")) == null) {
        return result;
      }
      ArrayList<SModel> list = new ArrayList<SModel>();
      result.put(((Language) refactoringContext.getParameter("sourceLanguage")), list);
      list.add(((Language) refactoringContext.getParameter("sourceLanguage")).getStructureModelDescriptor().getSModel());
      SModelDescriptor editorModelDescriptor = ((Language) refactoringContext.getParameter("sourceLanguage")).getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        list.add(editorModelDescriptor.getSModel());
      }
      SModelDescriptor constraintsModelDescriptor = ((Language) refactoringContext.getParameter("sourceLanguage")).getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        list.add(constraintsModelDescriptor.getSModel());
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

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    return this.isApplicable(actionContext, refactoringContext);
  }

}
