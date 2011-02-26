package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RunConfigurationExecutor extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RUN_CONFIGURATION = "runConfiguration";
  public static final String DEBUGGER = "debugger";
  public static final String EXECUTE = "execute";
  public static final String _$ATTRIBUTE = "_$attribute";

  public RunConfigurationExecutor(SNode node) {
    super(node);
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

  public RunConfiguration getRunConfiguration() {
    return (RunConfiguration) this.getReferent(RunConfiguration.class, RunConfigurationExecutor.RUN_CONFIGURATION);
  }

  public void setRunConfiguration(RunConfiguration node) {
    super.setReferent(RunConfigurationExecutor.RUN_CONFIGURATION, node);
  }

  public Expression getDebugger() {
    return (Expression) this.getChild(Expression.class, RunConfigurationExecutor.DEBUGGER);
  }

  public void setDebugger(Expression node) {
    super.setChild(RunConfigurationExecutor.DEBUGGER, node);
  }

  public ExecuteConfiguration_Function getExecute() {
    return (ExecuteConfiguration_Function) this.getChild(ExecuteConfiguration_Function.class, RunConfigurationExecutor.EXECUTE);
  }

  public void setExecute(ExecuteConfiguration_Function node) {
    super.setChild(RunConfigurationExecutor.EXECUTE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(RunConfigurationExecutor._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, RunConfigurationExecutor._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, RunConfigurationExecutor._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(RunConfigurationExecutor._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, RunConfigurationExecutor._$ATTRIBUTE, node);
  }

  public static RunConfigurationExecutor newInstance(SModel sm, boolean init) {
    return (RunConfigurationExecutor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RunConfigurationExecutor newInstance(SModel sm) {
    return RunConfigurationExecutor.newInstance(sm, false);
  }
}
