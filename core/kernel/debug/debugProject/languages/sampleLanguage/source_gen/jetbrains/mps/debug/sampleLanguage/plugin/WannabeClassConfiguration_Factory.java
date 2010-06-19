package jetbrains.mps.debug.sampleLanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

public class WannabeClassConfiguration_Factory extends ConfigurationFactory {
  public WannabeClassConfiguration_Factory(ConfigurationType type) {
    super(type);
  }

  public RunConfiguration createTemplateConfiguration(Project p) {
    return new WannabeClassConfiguration_Configuration(p, this, "TemplateName");
  }

  public String getName() {
    return "WannabeClass configuration";
  }
}
