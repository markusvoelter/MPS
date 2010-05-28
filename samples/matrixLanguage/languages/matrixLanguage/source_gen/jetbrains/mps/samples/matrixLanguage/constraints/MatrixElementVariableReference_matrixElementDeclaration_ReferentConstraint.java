package jetbrains.mps.samples.matrixLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.smodel.SNodePointer;

public class MatrixElementVariableReference_matrixElementDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public MatrixElementVariableReference_matrixElementDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference", "variableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference", "variableDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getEnclosingNode(), null, false);
    List<SNode> vars = new ArrayList<SNode>();
    for (SNode node : nodes) {
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement")) {
        ListSequence.fromList(vars).addElement(SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement"), "element", true));
      }
    }
    SimpleSearchScope result = new SimpleSearchScope(vars);
    return result;
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959044f(jetbrains.mps.samples.matrixLanguage.constraints)", "1213107435732");
  }
}
