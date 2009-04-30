package jetbrains.mps.baseLanguage.collections.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class InsertElementOperation_DataFlow extends DataFlowBuilder {

  public InsertElementOperation_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "index", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "element", true));
  }

}
