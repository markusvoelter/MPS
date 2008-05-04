package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class TreeNodeKindOccurrence_nodeKind_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public TreeNodeKindOccurrence_nodeKind_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.TreeNodeKindOccurrence", "nodeKind", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.TreeNodeKindOccurrence", "nodeKind");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode tpoe = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
    SNode tpa = (SNode)ITreePathExpression_Behavior.call_getTreePath_1194366873089(tpoe);
    return new SimpleSearchScope(ListSequence.fromList(SNodeOperations.getDescendants(tpa, null, false)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.TreeNodeKind");
      }

    }).toListSequence());
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
