package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class DefaultJavaAppFromClass extends BaseConfigCreator<SNode> implements Cloneable {
  private RunConfiguration myConfig;

  public DefaultJavaAppFromClass() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JavaApplication_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(SNode node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final SNode parameter) {
    SNode classConcept = SNodeOperations.getAncestor(parameter, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, true);
    if (classConcept == null) {
      return;
    }
    SNode mainMethod = ClassConcept_Behavior.call_getMainMethod_1213877355884(classConcept);

    if ((mainMethod == null)) {
      return;
    }

    DefaultJavaAppFromClass.this.setSourceElement(new MPSPsiElement(classConcept));

    {
      JavaApplication_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP), JavaApplication_ConfigurationType.class);
      DefaultJavaApplication_Configuration _config = new DefaultJavaApplication_Configuration(DefaultJavaAppFromClass.this.getContext().getProject(), findFactory(configType, "DefaultJavaApplication"), "NewConfig");
      _config.setName(SPropertyOperations.getString(classConcept, "name"));
      _config.getStateObject().nodeId = classConcept.getId();
      _config.getStateObject().modelId = classConcept.getModel().getModelDescriptor().getSModelReference().toString();
      DefaultJavaAppFromClass.this.myConfig = _config;
    }
  }

  @Override
  public DefaultJavaAppFromClass clone() {
    return ((DefaultJavaAppFromClass) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof SNode && SNodeOperations.isInstanceOf(((SNode) element), "jetbrains.mps.lang.core.structure.BaseConcept");
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
