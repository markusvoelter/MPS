package jetbrains.mps.bootstrap.helgins.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.IOperationContext;

public class TypeVarDeclaration_DataFlow extends DataFlowBuilder {

  public TypeVarDeclaration_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitWrite(_context.getNode());
  }

}
