package jetbrains.mps.lang.typesystem.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CoerceStatement_DataFlow extends DataFlowBuilder {

  public CoerceStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "nodeToCoerce", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "pattern", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().label(_context.getNode(), "endOfTrue"));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "body", true));
    if ((SLinkOperations.getTarget(_context.getNode(), "elseClause", true) != null)) {
      _context.getBuilder().emitMayBeUnreachable(new Runnable() {

        public void run() {
          _context.getBuilder().emitJump(_context.getBuilder().after(SLinkOperations.getTarget(_context.getNode(), "elseClause", true)));
        }
      });
    }
    _context.getBuilder().emitLabel("endOfTrue");
    if ((SLinkOperations.getTarget(_context.getNode(), "elseClause", true) != null)) {
      _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "elseClause", true));
    }
  }

}
