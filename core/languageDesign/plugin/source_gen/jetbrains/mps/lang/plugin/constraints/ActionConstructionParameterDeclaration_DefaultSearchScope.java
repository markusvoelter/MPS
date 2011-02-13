package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ActionConstructionParameterDeclaration_DefaultSearchScope extends BaseNodeReferenceSearchScopeProvider {
  public ActionConstructionParameterDeclaration_DefaultSearchScope() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeDefaultSearchScopeProvider("jetbrains.mps.lang.plugin.structure.ActionConstructionParameterDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeDefaultSearchScopeProvider("jetbrains.mps.lang.plugin.structure.ActionConstructionParameterDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode action = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.plugin.structure.ActionDeclaration", true, false);
    if (action == null) {
      return null;
    }
    return SLinkOperations.getTargets(action, "constructionParameter", true);
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590361(jetbrains.mps.lang.plugin.constraints)", "7043625615963660229");
  }
}
