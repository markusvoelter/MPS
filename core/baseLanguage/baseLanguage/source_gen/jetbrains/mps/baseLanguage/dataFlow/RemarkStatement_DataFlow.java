package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;

public class RemarkStatement_DataFlow extends DataFlowBuilder {

  public RemarkStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().emitNop();
      }
    });
  }

}
