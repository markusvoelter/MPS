package jetbrains.mps.execution.configurations.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ConfigurationFromExecutorReference_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getExecutor_7806358006983757897(SNode thisNode) {
    return SNodeOperations.cast(SNodeOperations.getContainingRoot(thisNode), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor");
  }
}
