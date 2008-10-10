package jetbrains.mps.baseLanguage.unitTest.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class AssertEquals_DataFlow extends DataFlowBuilder {

  public AssertEquals_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "expected", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "actual", true));
  }

}
