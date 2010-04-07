package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateRunConfigStatement extends Statement {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.CreateRunConfigStatement";
  public static final String RUN_CONFIG = "runConfig";
  public static final String CONFIG_NAME = "configName";
  public static final String SUGGESTED_NAME = "suggestedName";
  public static final String PROPERTY = "property";

  public CreateRunConfigStatement(SNode node) {
    super(node);
  }

  public RunConfigurationDeclaration getRunConfig() {
    return (RunConfigurationDeclaration) this.getReferent(RunConfigurationDeclaration.class, CreateRunConfigStatement.RUN_CONFIG);
  }

  public void setRunConfig(RunConfigurationDeclaration node) {
    super.setReferent(CreateRunConfigStatement.RUN_CONFIG, node);
  }

  public Expression getConfigName() {
    return (Expression) this.getChild(Expression.class, CreateRunConfigStatement.CONFIG_NAME);
  }

  public void setConfigName(Expression node) {
    super.setChild(CreateRunConfigStatement.CONFIG_NAME, node);
  }

  public Expression getSuggestedName() {
    return (Expression) this.getChild(Expression.class, CreateRunConfigStatement.SUGGESTED_NAME);
  }

  public void setSuggestedName(Expression node) {
    super.setChild(CreateRunConfigStatement.SUGGESTED_NAME, node);
  }

  public int getPropertiesCount() {
    return this.getChildCount(CreateRunConfigStatement.PROPERTY);
  }

  public Iterator<IRunConfigPropertyInstance> properties() {
    return this.children(IRunConfigPropertyInstance.class, CreateRunConfigStatement.PROPERTY);
  }

  public List<IRunConfigPropertyInstance> getProperties() {
    return this.getChildren(IRunConfigPropertyInstance.class, CreateRunConfigStatement.PROPERTY);
  }

  public void addProperty(IRunConfigPropertyInstance node) {
    this.addChild(CreateRunConfigStatement.PROPERTY, node);
  }

  public void insertProperty(IRunConfigPropertyInstance prev, IRunConfigPropertyInstance node) {
    this.insertChild(prev, CreateRunConfigStatement.PROPERTY, node);
  }

  public static CreateRunConfigStatement newInstance(SModel sm, boolean init) {
    return (CreateRunConfigStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.CreateRunConfigStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateRunConfigStatement newInstance(SModel sm) {
    return CreateRunConfigStatement.newInstance(sm, false);
  }
}
