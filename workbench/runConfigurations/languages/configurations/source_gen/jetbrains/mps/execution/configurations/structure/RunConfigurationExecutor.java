package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.execution.common.structure.IGeneratedToClass;
import jetbrains.mps.execution.settings.structure.PersistentConfigurationAssistent;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.execution.settings.structure.PersistentConfiguration;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RunConfigurationExecutor extends BaseConcept implements INamedConcept, IGeneratedToClass, PersistentConfigurationAssistent {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor";
  public static final String CONFIGURATION_NAME = "configurationName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CAN_RUN = "canRun";
  public static final String CONFIGURATION = "configuration";
  public static final String EXECUTE = "execute";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public RunConfigurationExecutor(SNode node) {
    super(node);
  }

  public String getConfigurationName() {
    return this.getProperty(RunConfigurationExecutor.CONFIGURATION_NAME);
  }

  public void setConfigurationName(String value) {
    this.setProperty(RunConfigurationExecutor.CONFIGURATION_NAME, value);
  }

  public String getName() {
    return this.getProperty(RunConfigurationExecutor.NAME);
  }

  public void setName(String value) {
    this.setProperty(RunConfigurationExecutor.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(RunConfigurationExecutor.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RunConfigurationExecutor.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RunConfigurationExecutor.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RunConfigurationExecutor.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RunConfigurationExecutor.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RunConfigurationExecutor.VIRTUAL_PACKAGE, value);
  }

  public boolean getCanRun() {
    return this.getBooleanProperty(RunConfigurationExecutor.CAN_RUN);
  }

  public void setCanRun(boolean value) {
    this.setBooleanProperty(RunConfigurationExecutor.CAN_RUN, value);
  }

  public PersistentConfiguration getConfiguration() {
    return (PersistentConfiguration) this.getReferent(PersistentConfiguration.class, RunConfigurationExecutor.CONFIGURATION);
  }

  public void setConfiguration(PersistentConfiguration node) {
    super.setReferent(RunConfigurationExecutor.CONFIGURATION, node);
  }

  public RunConfiguration getRunConfiguration() {
    return this.ensureAdapter(RunConfiguration.class, "configuration", this.getConfiguration());
  }

  public void setRunConfiguration(RunConfiguration node) {
    this.setConfiguration(node);
  }

  public ExecuteConfiguration_Function getExecute() {
    return (ExecuteConfiguration_Function) this.getChild(ExecuteConfiguration_Function.class, RunConfigurationExecutor.EXECUTE);
  }

  public void setExecute(ExecuteConfiguration_Function node) {
    super.setChild(RunConfigurationExecutor.EXECUTE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(RunConfigurationExecutor.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, RunConfigurationExecutor.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, RunConfigurationExecutor.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(RunConfigurationExecutor.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, RunConfigurationExecutor.SMODEL_ATTRIBUTE, node);
  }

  public static RunConfigurationExecutor newInstance(SModel sm, boolean init) {
    return (RunConfigurationExecutor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RunConfigurationExecutor newInstance(SModel sm) {
    return RunConfigurationExecutor.newInstance(sm, false);
  }
}
