package jetbrains.mps.baseLanguage.util.plugin.run;

/*Generated by MPS */

import java.io.File;

public class ConfigRunParameters implements Cloneable {
  private String vmParam;
  private String programParam;
  private String workingDir;
  private String alternativeJRE;
  private boolean useAlternativeJRE = false;
  private boolean make = false;
  private int myDefaultPort = 5005;

  public ConfigRunParameters() {
  }

  public ConfigRunParameters(boolean makeBeforeRun) {
    this.make = makeBeforeRun;
  }

  public String getErrorReport() {
    if (this.useAlternativeJRE) {
      if (this.alternativeJRE != null) {
        File file = new File(BaseRunner.getJavaCommand(this.alternativeJRE));
        if (file.exists()) {
          return null;
        }
        return "not valid JRE home";
      }
    }
    return null;
  }

  public void setVMParameters(String value) {
    this.vmParam = value;
  }

  public void setProgramParameters(String value) {
    this.programParam = value;
  }

  public void setWorkingDirectory(String value) {
    this.workingDir = value;
  }

  public void setMake(boolean value) {
    this.make = value;
  }

  public void setAlternativeJRE(String value) {
    this.alternativeJRE = value;
  }

  public void setUseAlternativeJRE(boolean value) {
    this.useAlternativeJRE = value;
  }

  public boolean getUseAlternativeJRE() {
    return this.useAlternativeJRE;
  }

  public String getVMParameters() {
    return this.vmParam;
  }

  public String getProgramParameters() {
    return this.programParam;
  }

  public String getWorkingDirectory() {
    return this.workingDir;
  }

  public boolean getMake() {
    return this.make;
  }

  public int getHardcodedDebugPort() {
    return this.myDefaultPort;
  }

  public String getAlternativeJRE() {
    return this.alternativeJRE;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
