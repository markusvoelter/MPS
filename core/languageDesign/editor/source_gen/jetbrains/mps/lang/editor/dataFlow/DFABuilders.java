package jetbrains.mps.lang.editor.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.editor.structure.AbstractStyledTextOperation", new AbstractStyledTextOperation_DataFlow());
  }
}
