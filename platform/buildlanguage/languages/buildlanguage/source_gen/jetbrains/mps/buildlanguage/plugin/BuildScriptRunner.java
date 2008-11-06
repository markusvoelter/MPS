package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.BaseRunner;
import java.io.File;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.plugin.BaseOutputReader;
import java.io.IOException;
import com.intellij.openapi.application.PathMacros;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class BuildScriptRunner extends BaseRunner {

  private BuildScriptRunnerComponent myComponent;

  public BuildScriptRunner(BuildScriptRunnerComponent component) {
    this.myComponent = component;
  }

  public void run(File file) {
    List<String> parameters = ListSequence.<String>fromArray();
    this.addBasicParameters(parameters, file);
    this.addMacroValues(parameters);
    ProcessBuilder builder = new ProcessBuilder(parameters);
    try {
      Process process = builder.start();
      BaseOutputReader input = new BaseOutputReader(process.getInputStream()) {

        protected void addMessage(String message) {
          BuildScriptRunner.this.myComponent.addMessage(message);
        }

      };
      input.start();
      BaseOutputReader error = new BaseOutputReader(process.getErrorStream()) {

        protected void addMessage(String message) {
          BuildScriptRunner.this.myComponent.addError(message);
        }

      };
      error.start();
      process.waitFor();
    } catch (IOException exception) {
    } catch (InterruptedException exception) {
    }
  }

  private void addMacroValues(List<String> parameters) {
    PathMacros pathMacros = PathMacros.getInstance();
    Set<String> macroNames = pathMacros.getAllMacroNames();
    for(String macro : Sequence.fromIterable(macroNames)) {
      ListSequence.fromList(parameters).addElement("-D" + macro + "=" + pathMacros.getValue(macro));
    }
  }

  private void addBasicParameters(List<String> parameters, File file) {
    ListSequence.fromList(parameters).addElement(this.getAntPath());
    ListSequence.fromList(parameters).addElement("-f");
    ListSequence.fromList(parameters).addElement(file.getAbsolutePath());
  }

  private String getAntPath() {
    return "ant";
  }

}
