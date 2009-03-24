package jetbrains.mps.baseLanguage.collections.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.NodeListChildrenSearchScope;

public class ForEachVariableReference_variable_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public ForEachVariableReference_variable_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", "variable", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", "variable");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    //     cycle-variable of enclosing 'foreach' cycle
    List<SNode> forEachStatements = SNodeOperations.getAncestors(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement", false);
    return new NodeListChildrenSearchScope(forEachStatements);
  }

}
