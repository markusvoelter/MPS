package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class NodeKindSpecificCase_treeNodeKind_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  NodeKindSpecificCase_treeNodeKind_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.NodeKindSpecificCase", "treeNodeKind", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.NodeKindSpecificCase", "treeNodeKind");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new SimpleSearchScope(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getEnclosingNode(), "nodeExpression", true), "treepathAspect", false), "nodeKinds", true));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
