package jetbrains.mps.baseLanguage.ext.collections.lang.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class MapElement_DataFlow extends DataFlowBuilder {

  public MapElement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "map", true));
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "key", true));
  }

}
