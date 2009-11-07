package jetbrains.mps.baseLanguage.builders.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.builders.behavior.BaseSimpleBuilderDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SimpleBuilderParameterReference_parameter_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public SimpleBuilderParameterReference_parameter_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameterReference", "parameter", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameterReference", "parameter");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return SLinkOperations.getTargets(BaseSimpleBuilderDeclaration_Behavior.call_getContextDeclaration_6254726786820551255(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration", true, false)), "parameter", true);
  }
}
