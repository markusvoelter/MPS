package jetbrains.mps.lang.refactoring.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ChangeFeatureNameOperation_DataFlow extends DataFlowBuilder {
  public ChangeFeatureNameOperation_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "feature", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "newConceptFQName", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "newFeatureName", true));
  }
}
