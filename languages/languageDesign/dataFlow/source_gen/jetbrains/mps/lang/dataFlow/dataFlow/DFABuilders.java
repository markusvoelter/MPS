package jetbrains.mps.lang.dataFlow.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.dataFlow.structure.BaseEmitJumpStatement", new BaseEmitJumpStatement_DataFlow());
    manager.register("jetbrains.mps.lang.dataFlow.structure.BaseEmitVariableStatement", new BaseEmitVariableStatement_DataFlow());
    manager.register("jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement", new EmitCodeForStatement_DataFlow());
    manager.register("jetbrains.mps.lang.dataFlow.structure.EmitMayBeUnreachable", new EmitMayBeUnreachable_DataFlow());
    manager.register("jetbrains.mps.lang.dataFlow.structure.RelativePosition", new RelativePosition_DataFlow());
  }
}
