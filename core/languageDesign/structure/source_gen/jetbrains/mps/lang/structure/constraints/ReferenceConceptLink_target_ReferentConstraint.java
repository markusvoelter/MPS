package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ReferenceConceptLink_target_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ReferenceConceptLink_target_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.ReferenceConceptLink", "target", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.ReferenceConceptLink", "target");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // only nodes assignable to target type specified in concept link declaration 
    if (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getReferenceNode(), "conceptLinkDeclaration", false), "targetType", false) == null) {
      return null;
    }
    return new ReferenceConceptLinkTargetSearchScope(_context.getReferenceNode(), operationContext.getScope());
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)", "1213104847457");
  }
}
