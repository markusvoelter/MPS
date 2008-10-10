package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class TryCatchStatement_DataFlow extends DataFlowBuilder {

  public TryCatchStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode c : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().emitIfJump(_context.getBuilder().before(c));
    }
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()));
      }

    });
    for(SNode c : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().build((SNode)c);
      _context.getBuilder().emitMayBeUnreachable(new Runnable() {

        public void run() {
          _context.getBuilder().emitJump(_context.getBuilder().after(_context.getNode()));
        }

      });
    }
  }

}
