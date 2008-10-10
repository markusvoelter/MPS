package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ElsifClause_Behavior;

public class ElsifClause_DataFlow extends DataFlowBuilder {

  public ElsifClause_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "condition", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().after(_context.getNode()));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "statementList", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {

      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().after(ElsifClause_Behavior.call_getIfStatement_1213877360521(_context.getNode())));
      }

    });
  }

}
