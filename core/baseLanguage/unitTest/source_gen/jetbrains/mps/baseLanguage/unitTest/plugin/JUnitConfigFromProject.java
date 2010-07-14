package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.project.MPSProject;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class JUnitConfigFromProject extends BaseConfigCreator<MPSProject> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromProject() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(MPSProject node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final MPSProject parameter) {
    if (!(TestRunUtil.containsTest(parameter))) {
      return;
    }

    JUnitConfigFromProject.this.setSourceElement(new MPSPsiElement(parameter));

    final String name = parameter.getProject().getName();
    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromProject.this.getContext().getProject(), findFactory(configType, "DefaultJUnit"), "NewConfig") {
        @Override
        public String suggestedName() {
          return "All Tests in Project";
        }
      };
      _config.setName(name);
      _config.getStateObject().type = JUnitRunTypes.PROJECT;
      JUnitConfigFromProject.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromProject clone() {
    return ((JUnitConfigFromProject) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof MPSProject;
  }

  @Nullable
  public ConfigurationFactory findFactory(ConfigurationType configurationType, String configurationName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().contains(configurationName)) {
        return factory;
      }
    }
    return null;
  }
}
