package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DoWhileStatement_DataFlow extends DataFlowBuilder {

  public DoWhileStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(, "body", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().build((SNode)SLinkOperations.getTarget(, "condition", true));
      }
    });
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().emitIfJump(_context.getBuilder().before());
      }
    });
  }

}
