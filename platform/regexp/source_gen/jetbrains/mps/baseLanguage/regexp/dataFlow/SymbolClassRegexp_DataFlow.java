package jetbrains.mps.baseLanguage.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SymbolClassRegexp_DataFlow extends DataFlowBuilder {
  public SymbolClassRegexp_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for (SNode part : SLinkOperations.getTargets(_context.getNode(), "part", true)) {
      _context.getBuilder().build((SNode)part);
    }
  }
}
