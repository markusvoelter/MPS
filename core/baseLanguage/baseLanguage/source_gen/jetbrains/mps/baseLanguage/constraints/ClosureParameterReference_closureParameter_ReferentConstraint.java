package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class ClosureParameterReference_closureParameter_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public ClosureParameterReference_closureParameter_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClosureParameterReference", "closureParameter", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.ClosureParameterReference", "closureParameter");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode enclosingClosure = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.Closure", true, false);
    return new SimpleSearchScope(SNodeOperations.getChildren(enclosingClosure));
  }

}
