package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.constraints.SearchScopeStatus;
import jetbrains.mps.smodel.constraints.ModelConstraintsUtil;

@Deprecated
public class SearchScopesChecker extends SpecificChecker {
  @Deprecated
  public SearchScopesChecker() {
  }

  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressMonitor monitor, IOperationContext operationContext) {
    List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

    monitor.start("Checking " + SModelOperations.getModelName(model) + " for valid search scopes in references...", 1);
    for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
      if (monitor.isCanceled()) {
        break;
      }
      SNode concept = SNodeOperations.getConceptDeclaration(node);

      for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node)).where(new IWhereFilter<SReference>() {
        public boolean accept(SReference it) {
          return ModelCheckerUtils.isDeclaredLink(SLinkOperations.findLinkDeclaration(it), false) && (SLinkOperations.getTargetNode(it) != null);
        }
      })) {
        SNode targetNode = SLinkOperations.getTargetNode(ref);
        try {
          SNode genuineLinkDeclaration = ((SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SLinkOperations.findLinkDeclaration(ref), "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "call_getGenuineLink_1213877254523", new Class[]{SNode.class}));

          IModule thisModelModule = model.getModelDescriptor().getModule();
          if (checkScope(concept, node, targetNode, genuineLinkDeclaration, operationContext)) {
          } else if (checkScope(concept, node, targetNode, genuineLinkDeclaration, new ModuleContext(thisModelModule, operationContext.getIdeaProject()))) {
          } else {
            addIssue(results, node, "Reference in role \"" + SPropertyOperations.getString(genuineLinkDeclaration, "role") + "\" is out of search scope", ModelChecker.SEVERITY_WARNING, "wrong scope", null);
          }
        } catch (Exception e) {
          e.printStackTrace();
          addIssue(results, node, "Exception \"" + e.getMessage() + "\" during search scope checking", "scope exception", ModelChecker.SEVERITY_WARNING, null);
        }
      }
    }
    monitor.done();

    return results;
  }

  private static boolean checkScope(SNode concept, SNode node, SNode targetNode, SNode linkDeclaration, IOperationContext operationContext) {
    SearchScopeStatus status = ModelConstraintsUtil.getSearchScope(null, node, concept, linkDeclaration, operationContext);
    if (status.isOk() && !(status.isDefault())) {
      status.getSearchScope().isInScope(targetNode);
    }
    return true;
  }
}
