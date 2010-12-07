package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.logging.Logger;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class JUnitConfigFromMethod extends BaseConfigCreator<SNode> implements Cloneable {
  private static final Logger LOG = Logger.getLogger(JUnitConfigFromMethod.class);

  private RunConfiguration myConfig;

  public JUnitConfigFromMethod() {
    super(findFactoryImpl(ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class), "DefaultJUnit"));
  }

  protected RunConfiguration doCreateConfiguration(SNode node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final SNode parameter) {
    ITestNodeWrapper wrapper = TestNodeWrapperFactory.tryToWrap(parameter);
    if (wrapper == null || wrapper.isTestCase()) {
      return;
    }
    JUnitConfigFromMethod.this.setSourceElement(new MPSPsiElement(parameter));

    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromMethod.this.getContext().getProject(), findFactory(configType, "DefaultJUnit"), "NewConfig");
      _config.setName(SPropertyOperations.getString(parameter, "name"));
      _config.getStateObject().type = JUnitRunTypes.METHOD;
      _config.getStateObject().testMethods = new ClonableList<String>(TestUtils.pointerToString(new SNodePointer(parameter)));
      JUnitConfigFromMethod.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromMethod clone() {
    return ((JUnitConfigFromMethod) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof SNode && SNodeOperations.isInstanceOf(((SNode) element), "jetbrains.mps.lang.core.structure.INamedConcept");
  }

  @NotNull
  private ConfigurationFactory findFactory(ConfigurationType configurationType, String configurationName) {
    return findFactoryImpl(configurationType, configurationName);
  }

  @NotNull
  private static ConfigurationFactory findFactoryImpl(ConfigurationType configurationType, String configurationName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().contains(configurationName)) {
        return factory;
      }
    }
    LOG.warning("Cound not find configuration factory for " + configurationName + " in type " + configurationType.getDisplayName() + ".");
    return configurationType.getConfigurationFactories()[0];
  }
}
