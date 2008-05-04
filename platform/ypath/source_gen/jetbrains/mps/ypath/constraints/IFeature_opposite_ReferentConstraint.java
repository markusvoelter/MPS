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
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class IFeature_opposite_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public IFeature_opposite_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.IFeature", "opposite", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.IFeature", "opposite");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    final SNode feature = _context.getReferenceNode();
    final boolean isGeneric = SNodeOperations.isInstanceOf(feature, "jetbrains.mps.ypath.structure.IGenericFeature");
    return new SimpleSearchScope(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getParent(feature, null, false, false), "features", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return it != feature && ((isGeneric ?
          SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.IGenericFeature") :
          !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.IGenericFeature"))
        ));
      }

    }).toListSequence());
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
