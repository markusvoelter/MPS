package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class ForeachStatement_DataFlow extends DataFlowBuilder {

  public ForeachStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "iterable", true));
    _context.getBuilder().emitLabel("condition");
    _context.getBuilder().emitIfJump(_context.getBuilder().after(_context.getNode()));
    _context.getBuilder().emitWrite(SLinkOperations.getTarget(_context.getNode(), "variable", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().label(_context.getNode(), "condition"));
      }

    });
  }

}
