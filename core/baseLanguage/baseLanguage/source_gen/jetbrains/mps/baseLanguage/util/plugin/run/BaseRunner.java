package jetbrains.mps.baseLanguage.util.plugin.run;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.IModule;
import com.intellij.execution.configurations.GeneralCommandLine;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.EachClassPathItemVisitor;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.reloading.JarFileClassPathItem;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import java.io.File;

public abstract class BaseRunner {
  private String myJavaHome = System.getProperty("java.home");
  protected final ConfigRunParameters myRunParameters;

  public BaseRunner(ConfigRunParameters parameters) {
    this.myRunParameters = parameters;
    this.updateJavaHome(parameters);
  }

  public String getCommandString(ProcessBuilder p) {
    StringBuilder res = new StringBuilder();
    for (String s : p.command()) {
      res.append(s).append(" ");
    }
    return res.toString();
  }

  protected String[] splitParams(String programParams) {
    return programParams.split("(\\s)+");
  }

  public void setJavaHomePath(String alternativeJavaHome) {
    this.myJavaHome = alternativeJavaHome.replace("/", fs());
  }

  protected void addJavaCommand(List<String> params) {
    ListSequence.fromList(params).addElement(getJavaCommand(this.myJavaHome));
  }

  protected void addDebug(List<String> params, String arguments) {
    ListSequence.fromList(params).addElement(arguments);
  }

  protected void addMaxHeapSize(List<String> params, int megaBytes) {
    ListSequence.fromList(params).addElement("-Xmx" + megaBytes + "m");
  }

  protected void addVmOptions(List<String> params) {
    this.addParametersString(params, myRunParameters.getVMParameters());
  }

  protected void addProgramParameters(List<String> params) {
    this.addParametersString(params, myRunParameters.getProgramParameters());
  }

  private void addParametersString(List<String> params, String parametersString) {
    if (parametersString != null && StringUtils.isNotEmpty(parametersString)) {
      String[] paramList = this.splitParams(parametersString);
      ListSequence.fromList(params).addSequence(Sequence.fromIterable(Sequence.fromArray(paramList)));
    }
  }

  protected void addClassPath(List<String> params, SNode node) {
    this.addClassPath(params, this.getClasspath(node));
  }

  protected void addClassPath(List<String> params, String classPath) {
    if (classPath == null) {
      return;
    }
    ListSequence.fromList(params).addElement("-cp");
    ListSequence.fromList(params).addElement(classPath);
  }

  protected String getClasspath(SNode node) {
    SModel model = SNodeOperations.getModel(node);
    if (model == null) {
      return null;
    }
    IModule module = model.getModelDescriptor().getModule();
    return this.getClasspath(module, true);
  }

  protected String getClasspath(IModule module, boolean withDependencies) {
    StringBuilder res = new StringBuilder();
    for (String cp : getModuleClasspath(module, withDependencies)) {
      res.append(cp).append(BaseRunner.ps());
    }
    return res.toString();
  }

  public String getJavaHome() {
    return this.myJavaHome;
  }

  protected GeneralCommandLine getCommandLine() {
    return getCommandLine(myRunParameters.getWorkingDirectory());
  }

  protected GeneralCommandLine getCommandLine(String workingDir) {
    GeneralCommandLine commandLine = new GeneralCommandLine();
    commandLine.setExePath(getJavaCommand(this.getJavaHome()));
    commandLine.setWorkDirectory(workingDir);
    return commandLine;
  }

  private void updateJavaHome(ConfigRunParameters parameters) {
    if (parameters != null && parameters.getUseAlternativeJRE()) {
      this.setJavaHomePath(parameters.getAlternativeJRE());
    } else {
      this.setJavaHomePath(getJdkHome());
    }
  }

  protected static String fs() {
    return System.getProperty("file.separator");
  }

  protected static String ps() {
    return System.getProperty("path.separator");
  }

  protected static Set<String> getModuleClasspath(IModule module, boolean withDependencies) {
    Set<String> res = SetSequence.fromSet(new HashSet<String>());
    IFile classesGen = module.getClassesGen();
    if (classesGen != null) {
      SetSequence.fromSet(res).addElement(classesGen.getAbsolutePath());
    }
    createModuleClasspath(module.getClassPathItem(), res);
    if (withDependencies) {
      createModuleClasspath(AbstractModule.getDependenciesClasspath(CollectionUtil.set(module), true), res);
    }

    Set<String> delete = SetSequence.fromSet(new HashSet<String>());
    List<String> jdkPath = CommonPaths.getJDKPath();
    for (String cpItem : SetSequence.fromSet(res)) {
      if (jdkPath.contains(cpItem)) {
        SetSequence.fromSet(delete).addElement(cpItem);
      }
    }

    SetSequence.fromSet(res).removeSequence(SetSequence.fromSet(delete));
    return res;
  }

  private static void createModuleClasspath(IClassPathItem cp, final Set<String> res) {
    cp.accept(new EachClassPathItemVisitor() {
      public void visit(FileClassPathItem p0) {
        SetSequence.fromSet(res).addElement(p0.getClassPath());
      }

      public void visit(JarFileClassPathItem p0) {
        SetSequence.fromSet(res).addElement(p0.getFile().getAbsolutePath());
      }
    });
  }

  public static String getJavaCommand(String javaHome) {
    String result = javaHome + fs() + "bin" + fs();
    String osName = System.getProperty("os.name");
    if (osName.startsWith("Mac OS")) {
      return result + "java";
    } else
    if (osName.startsWith("Windows")) {
      return result + "java.exe";
    } else {
      return result + "java";
    }
  }

  public static List<String> getJavaHomes() {
    String systemJavaHome = System.getProperty("java.home");
    List<String> homes = ListSequence.fromList(new LinkedList<String>());
    String systemJdkHome = systemJavaHome.substring(0, systemJavaHome.length() - "/jre".length());
    if (systemJavaHome.endsWith("jre") && new File(systemJdkHome + File.separator + "bin").exists()) {
      ListSequence.fromList(homes).addElement(systemJdkHome);
    }
    if (StringUtils.isNotEmpty(System.getenv("JAVA_HOME"))) {
      ListSequence.fromList(homes).addElement(System.getenv("JAVA_HOME"));
    }
    ListSequence.fromList(homes).addElement(systemJavaHome);
    return homes;
  }

  public static String getJdkHome() {
    for (String javaHome : ListSequence.fromList(BaseRunner.getJavaHomes())) {
      String javaBinHome = javaHome + File.separator + "bin" + File.separator;
      String osName = System.getProperty("os.name");
      if (osName.startsWith("Mac OS")) {
        if (new File(javaBinHome + "java").exists()) {
          return javaHome;
        }
      } else
      if (osName.startsWith("Windows")) {
        if (new File(javaBinHome + "java.exe").exists()) {
          return javaHome;
        }
      } else {
        if (new File(javaBinHome + "java").exists()) {
          return javaHome;
        }
      }
    }
    return ListSequence.fromList(BaseRunner.getJavaHomes()).first();
  }
}
