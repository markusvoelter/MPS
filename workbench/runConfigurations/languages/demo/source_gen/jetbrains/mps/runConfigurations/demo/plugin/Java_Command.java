package jetbrains.mps.runConfigurations.demo.plugin;

/*Generated by MPS */

import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.process.ProcessListener;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.runConfigurations.runtime.ProcessHandlerBuilder;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.debug.api.Debuggers;

public class Java_Command {
  public Java_Command() {
  }

  public static ProcessHandler createProcess(RunConfigurationBase configuration, boolean debug, ProcessListener processListener) throws ExecutionException {
    String java = "/usr/lib/jvm/java-1.6.0-openjdk/bin/java";
    return new ProcessHandlerBuilder().append(java).append("-version").build(processListener);
  }

  public static IDebugger getDebugger() {
    return Debuggers.getInstance().getDebuggerByName("Java");
  }
}
