package jetbrains.mps.ui.internal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContextWrapperExpression extends Expression implements IContextWrapper {
  public static final String concept = "jetbrains.mps.ui.internal.structure.ContextWrapperExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPRESSION = "expression";
  public static final String CONTEXT = "context";

  public ContextWrapperExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ContextWrapperExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ContextWrapperExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ContextWrapperExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ContextWrapperExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ContextWrapperExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ContextWrapperExpression.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpression() {
    return (Expression) this.getChild(Expression.class, ContextWrapperExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(ContextWrapperExpression.EXPRESSION, node);
  }

  public Expression getContext() {
    return (Expression) this.getChild(Expression.class, ContextWrapperExpression.CONTEXT);
  }

  public void setContext(Expression node) {
    super.setChild(ContextWrapperExpression.CONTEXT, node);
  }

  public static ContextWrapperExpression newInstance(SModel sm, boolean init) {
    return (ContextWrapperExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.internal.structure.ContextWrapperExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContextWrapperExpression newInstance(SModel sm) {
    return ContextWrapperExpression.newInstance(sm, false);
  }
}
