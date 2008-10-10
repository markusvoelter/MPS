package jetbrains.mps.baseLanguage.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class Regexps_DataFlow extends DataFlowBuilder {

  public Regexps_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode regexp : SLinkOperations.getTargets(_context.getNode(), "regexp", true)) {
      _context.getBuilder().build((SNode)regexp);
    }
  }

}
