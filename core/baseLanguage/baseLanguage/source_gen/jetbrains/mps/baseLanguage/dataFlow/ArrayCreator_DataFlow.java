package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class ArrayCreator_DataFlow extends DataFlowBuilder {

  public ArrayCreator_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode expression : SLinkOperations.getTargets(_context.getNode(), "dimensionExpression", true)) {
      _context.getBuilder().build((SNode)expression);
    }
  }

}
