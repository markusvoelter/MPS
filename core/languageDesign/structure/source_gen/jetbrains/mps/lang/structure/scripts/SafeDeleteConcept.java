package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.SafeDelete;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration;
import jetbrains.mps.ide.findusages.model.SearchResult;
import java.util.ArrayList;
import java.util.Collection;
import jetbrains.mps.lang.behavior.structure.ConceptBehavior;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;

public class SafeDeleteConcept extends AbstractLoggableRefactoring {
  public static final String sourceLanguage = "sourceLanguage";
  public static final String conceptBehavior = "conceptBehavior";
  public static final String conceptEditorDeclaration = "conceptEditorDeclaration";

  private Set<String> myTransientParameters = new HashSet<String>();

  public SafeDeleteConcept() {
    this.myTransientParameters.add("sourceLanguage");
    this.myTransientParameters.add("conceptBehavior");
    this.myTransientParameters.add("conceptEditorDeclaration");
  }

  public String getUserFriendlyName() {
    return "Safe Delete Concept";
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
    return "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
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
    {
      SNode node = refactoringContext.getSelectedNode();
      SearchResults searchResults = FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
      refactoringContext.setParameter("sourceLanguage", Language.getLanguageFor(SNodeOperations.getModel(node).getModelDescriptor()));
      if (((Language)refactoringContext.getParameter("sourceLanguage")) != null) {
        SModelDescriptor editorModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getEditorModelDescriptor();
        List<SNode> searchResultsList = searchResults.getSearchResults();
        if (editorModelDescriptor != null) {
          refactoringContext.setParameter("conceptEditorDeclaration", SModelUtil_new.findEditorDeclaration(editorModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node))));
          if (((ConceptEditorDeclaration)refactoringContext.getParameter("conceptEditorDeclaration")) != null) {
            SNode editorNode = ((ConceptEditorDeclaration)refactoringContext.getParameter("conceptEditorDeclaration")).getNode();
            for(SearchResult<SNode> searchResult : new ArrayList<SearchResult<SNode>>((Collection)searchResultsList)) {
              if (searchResult.getObject().getContainingRoot() == editorNode) {
                searchResults.remove(searchResult);
              }
            }
          }
        }
        SModelDescriptor behaviorModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getBehaviorModelDescriptor();
        if (behaviorModelDescriptor != null) {
          refactoringContext.setParameter("conceptBehavior", SModelUtil_new.findBehaviorDeclaration(behaviorModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node))));
          if (((ConceptBehavior)refactoringContext.getParameter("conceptBehavior")) != null) {
            SNode behaviorNode = ((ConceptBehavior)refactoringContext.getParameter("conceptBehavior")).getNode();
            for(SearchResult<SNode> searchResult : new ArrayList<SearchResult<SNode>>((Collection)searchResultsList)) {
              if (searchResult.getObject().getContainingRoot() == behaviorNode) {
                searchResults.remove(searchResult);
              }
            }
          }
        }
      }
      return searchResults;
    }
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      SNode node = refactoringContext.getSelectedNode();
      if (((ConceptBehavior)refactoringContext.getParameter("conceptBehavior")) != null) {
        ((ConceptBehavior)refactoringContext.getParameter("conceptBehavior")).delete();
      }
      if (((ConceptEditorDeclaration)refactoringContext.getParameter("conceptEditorDeclaration")) != null) {
        ((ConceptEditorDeclaration)refactoringContext.getParameter("conceptEditorDeclaration")).delete();
      }
      SNodeOperations.deleteNode(node);
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      if (((Language)refactoringContext.getParameter("sourceLanguage")) == null) {
        return result;
      }
      List<SModel> list = new ArrayList<SModel>();
      result.put(((Language)refactoringContext.getParameter("sourceLanguage")), list);
      list.add(((Language)refactoringContext.getParameter("sourceLanguage")).getStructureModelDescriptor().getSModel());
      SModelDescriptor editorModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        list.add(editorModelDescriptor.getSModel());
      }
      SModelDescriptor constraintsModelDescriptor = ((Language)refactoringContext.getParameter("sourceLanguage")).getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        list.add(constraintsModelDescriptor.getSModel());
      }
      return result;
    }
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

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      Boolean result = ModelAccess.instance().runReadAction(new Computable <Boolean>() {

        public Boolean compute() {
          return SafeDeleteConcept.this.isApplicable(refactoringContext);
        }

      });
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return SafeDelete.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return SafeDeleteConcept.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      return true;
    } else
    {
      return SafeDelete.isApplicableWRTConcept_static(node);
    }
  }

}
