package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import java.util.List;
import com.intellij.execution.junit.RuntimeConfigurationProducer;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.StaticMethodDeclaration_Behavior;
import jetbrains.mps.execution.lib.Java_Command;
import jetbrains.mps.execution.configurations.behavior.IMainClass_Behavior;

public class Java_Producer {
  private static String CONFIGURATION_FACTORY_CLASS_NAME = "jetbrains.mps.baseLanguage.plugin.Java_Configuration_Factory";

  public Java_Producer() {
  }

  public static List<RuntimeConfigurationProducer> getProducers(ConfigurationType configurationType) {
    List<RuntimeConfigurationProducer> creators = ListSequence.fromList(new ArrayList<RuntimeConfigurationProducer>());
    ListSequence.fromList(creators).addElement(new Java_Producer.ProducerPart_NodeClassConcept_d1i8dk_a(configurationType, CONFIGURATION_FACTORY_CLASS_NAME));
    ListSequence.fromList(creators).addElement(new Java_Producer.ProducerPart_NodeStaticMethodDeclaration_d1i8dk_b(configurationType, CONFIGURATION_FACTORY_CLASS_NAME));
    ListSequence.fromList(creators).addElement(new Java_Producer.ProducerPart_NodeIMainClass_d1i8dk_c(configurationType, CONFIGURATION_FACTORY_CLASS_NAME));
    return creators;
  }

  public static class ProducerPart_NodeClassConcept_d1i8dk_a extends BaseConfigCreator<SNode> {
    public ProducerPart_NodeClassConcept_d1i8dk_a(ConfigurationType configurationType, String factoryName) {
      super(configurationType, factoryName);
    }

    protected boolean isApplicable(Object source) {
      return source instanceof SNode && SNodeOperations.isInstanceOf(((SNode) source), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    }

    protected Java_Configuration doCreateConfiguration(SNode source) {
      setSourceElement(new MPSPsiElement(source));
      if ((ClassConcept_Behavior.call_getMainMethod_1213877355884(source) == null)) {
        return null;
      }
      Java_Configuration configuration = new Java_Configuration(getContext().getProject(), (Java_Configuration_Factory) getConfigurationFactory(), "Class " + SPropertyOperations.getString(source, "name"));
      configuration.getNode().setNode(source);
      return configuration;
    }

    @Override
    public Java_Producer.ProducerPart_NodeClassConcept_d1i8dk_a clone() {
      return (Java_Producer.ProducerPart_NodeClassConcept_d1i8dk_a) super.clone();
    }
  }

  public static class ProducerPart_NodeStaticMethodDeclaration_d1i8dk_b extends BaseConfigCreator<SNode> {
    public ProducerPart_NodeStaticMethodDeclaration_d1i8dk_b(ConfigurationType configurationType, String factoryName) {
      super(configurationType, factoryName);
    }

    protected boolean isApplicable(Object source) {
      return source instanceof SNode && SNodeOperations.isInstanceOf(((SNode) source), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
    }

    protected Java_Configuration doCreateConfiguration(SNode source) {
      setSourceElement(new MPSPsiElement(source));
      if (!(StaticMethodDeclaration_Behavior.call_isMainMethod_1213877536670(source))) {
        return null;
      }
      SNode classifier = SNodeOperations.getAncestor(source, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if ((classifier == null)) {
        return null;
      }
      Java_Configuration configuration = new Java_Configuration(getContext().getProject(), (Java_Configuration_Factory) getConfigurationFactory(), "Class " + SPropertyOperations.getString(classifier, "name"));
      configuration.getNode().setNode(classifier);
      return configuration;
    }

    @Override
    public Java_Producer.ProducerPart_NodeStaticMethodDeclaration_d1i8dk_b clone() {
      return (Java_Producer.ProducerPart_NodeStaticMethodDeclaration_d1i8dk_b) super.clone();
    }
  }

  public static class ProducerPart_NodeIMainClass_d1i8dk_c extends BaseConfigCreator<SNode> {
    public ProducerPart_NodeIMainClass_d1i8dk_c(ConfigurationType configurationType, String factoryName) {
      super(configurationType, factoryName);
    }

    protected boolean isApplicable(Object source) {
      return source instanceof SNode && SNodeOperations.isInstanceOf(((SNode) source), "jetbrains.mps.execution.configurations.structure.IMainClass");
    }

    protected Java_Configuration doCreateConfiguration(SNode source) {
      setSourceElement(new MPSPsiElement(source));
      if (!(Java_Command.isUnitNode(source))) {
        return null;
      }
      String name = (SNodeOperations.isInstanceOf(source, "jetbrains.mps.lang.core.structure.INamedConcept") ?
        SPropertyOperations.getString(SNodeOperations.cast(source, "jetbrains.mps.lang.core.structure.INamedConcept"), "name") :
        IMainClass_Behavior.call_getUnitName_747009152928925147(source)
      );
      Java_Configuration configuration = new Java_Configuration(getContext().getProject(), (Java_Configuration_Factory) getConfigurationFactory(), "Node " + name);
      configuration.getNode().setNode(source);
      return configuration;
    }

    @Override
    public Java_Producer.ProducerPart_NodeIMainClass_d1i8dk_c clone() {
      return (Java_Producer.ProducerPart_NodeIMainClass_d1i8dk_c) super.clone();
    }
  }
}
