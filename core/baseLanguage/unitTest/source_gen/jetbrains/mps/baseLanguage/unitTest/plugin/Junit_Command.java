package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import java.util.List;
import java.io.File;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import jetbrains.mps.execution.lib.Java_Command;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.LinkedHashSet;
import jetbrains.mps.debug.api.run.IDebuggerConfiguration;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debug.api.IDebuggerSettings;
import jetbrains.mps.debug.runtime.settings.LocalConnectionSettings;
import jetbrains.mps.debug.api.Debuggers;

public class Junit_Command {
  private List<ITestNodeWrapper> myTests;
  private String myVirtualMachineParameter;
  private String myJrePath;
  private File myWorkingDirectory = new File(System.getProperty("user.home"));
  private String myDebuggerSettings;

  public Junit_Command() {
  }

  public Junit_Command setTests(List<ITestNodeWrapper> tests) {
    if (tests != null) {
      myTests = tests;
    }
    return this;
  }

  public Junit_Command setVirtualMachineParameter(String virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter = virtualMachineParameter;
    }
    return this;
  }

  public Junit_Command setJrePath(String jrePath) {
    if (jrePath != null) {
      myJrePath = jrePath;
    }
    return this;
  }

  public Junit_Command setWorkingDirectory(File workingDirectory) {
    if (workingDirectory != null) {
      myWorkingDirectory = workingDirectory;
    }
    return this;
  }

  public Junit_Command setDebuggerSettings(String debuggerSettings) {
    if (debuggerSettings != null) {
      myDebuggerSettings = debuggerSettings;
    }
    return this;
  }

  public ProcessHandler createProcess() throws ExecutionException {
    Tuples._2<List<ITestNodeWrapper>, TestRunParameters> testsToRun = Junit_Command.getTestsToRunWithParameters(myTests);
    return new Java_Command().setVirtualMachineParameter(IterableUtils.join(ListSequence.fromList(testsToRun._1().getVmParameters()), " ")).setDebuggerSettings(myDebuggerSettings).setClassPath(ListSequence.fromList(testsToRun._1().getClassPath()).union(ListSequence.fromList(Junit_Command.getClasspath(testsToRun._0()))).toListSequence()).setJrePath(myJrePath).setWorkingDirectory(myWorkingDirectory).setClassName(testsToRun._1().getTestRunner()).setProgramParameter(Junit_Command.getProgramParameters(testsToRun._0())).createProcess();
  }

  public static IDebugger getDebugger() {
    return getDebuggerConfiguration().getDebugger();
  }

  private static String getProgramParameters(final List<ITestNodeWrapper> tests) {
    final Wrappers._T<List<String>> testsCommandLine = new Wrappers._T<List<String>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        testsCommandLine.value = ListSequence.fromList(new ArrayList<String>(ListSequence.fromList(tests).count()));
        for (ITestNodeWrapper test : ListSequence.fromList(tests)) {
          List<String> parametersPart = ListSequence.fromListAndArray(new ArrayList<String>(), (test.isTestCase() ?
            "-c" :
            "-m"
          ), test.getFqName());
          ListSequence.fromList(testsCommandLine.value).addSequence(ListSequence.fromList(parametersPart));
        }
      }
    });
    return IterableUtils.join(ListSequence.fromList(testsCommandLine.value), " ");
  }

  private static Tuples._2<List<ITestNodeWrapper>, TestRunParameters> getTestsToRunWithParameters(final List<ITestNodeWrapper> tests) throws ExecutionException {
    final Wrappers._T<TestRunParameters> runParams = new Wrappers._T<TestRunParameters>();
    final Wrappers._T<List<ITestNodeWrapper>> testsToRun = new Wrappers._T<List<ITestNodeWrapper>>();
    final Wrappers._boolean ok = new Wrappers._boolean(true);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        runParams.value = ListSequence.fromList(tests).first().getTestRunParameters();
        testsToRun.value = ListSequence.fromList(tests).where(new IWhereFilter<ITestNodeWrapper>() {
          public boolean accept(ITestNodeWrapper it) {
            return eq_yo2c7x_a0a0a0a0a0a0b0a0a0a0d0c(check_u7m9j_a0a0a0a0a1a0d0b(it), runParams.value);
          }
        }).toListSequence();
        ListSequence.fromList(tests).visitAll(new IVisitor<ITestNodeWrapper>() {
          public void visit(ITestNodeWrapper it) {
            if (!(eq_yo2c7x_a0a0a0a0a0a2a0a0a0a3a2(check_u7m9j_a0a0a0a0c0a3a1(it), runParams.value))) {
              ok.value = false;
            }
          }
        });
      }
    });
    if (!(ok.value)) {
      throw new ExecutionException("Can not execute tests " + ": run parameters does not match.");
    }
    return MultiTuple.<List<ITestNodeWrapper>,TestRunParameters>from(testsToRun.value, runParams.value);
  }

  private static List<String> getClasspath(final List<ITestNodeWrapper> tests) {
    final Set<IModule> uniqueModules = SetSequence.fromSet(new HashSet<IModule>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (ITestNodeWrapper testable : tests) {
          IModule module = SNodeOperations.getModel(testable.getNode()).getModelDescriptor().getModule();
          SetSequence.fromSet(uniqueModules).addElement(module);
        }
      }
    });
    Set<String> classpath = SetSequence.fromSet(new LinkedHashSet<String>());
    for (IModule module : uniqueModules) {
      SetSequence.fromSet(classpath).addSequence(ListSequence.fromList(Java_Command.getClasspath(module, true)));
    }
    return SetSequence.fromSet(classpath).toListSequence();
  }

  public static IDebuggerConfiguration getDebuggerConfiguration() {
    return new IDebuggerConfiguration() {
      @Nullable
      public IDebuggerSettings createDebuggerSettings() {
        return new LocalConnectionSettings(true);
      }

      public IDebugger getDebugger() {
        return Debuggers.getInstance().getDebuggerByName("Java");
      }
    };
  }

  private static TestRunParameters check_u7m9j_a0a0a0a0a1a0d0b(ITestNodeWrapper checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTestRunParameters();
    }
    return null;
  }

  private static TestRunParameters check_u7m9j_a0a0a0a0c0a3a1(ITestNodeWrapper checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTestRunParameters();
    }
    return null;
  }

  private static boolean eq_yo2c7x_a0a0a0a0a0a0b0a0a0a0d0c(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_yo2c7x_a0a0a0a0a0a2a0a0a0a3a2(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
