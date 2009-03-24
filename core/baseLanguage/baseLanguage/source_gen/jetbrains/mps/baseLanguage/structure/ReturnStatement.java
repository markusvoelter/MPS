package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReturnStatement extends jetbrains.mps.baseLanguage.structure.Statement implements jetbrains.mps.baseLanguage.structure.TypeDerivable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ReturnStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPRESSION = "expression";

  public ReturnStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ReturnStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ReturnStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ReturnStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ReturnStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ReturnStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ReturnStatement.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getExpression() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, ReturnStatement.EXPRESSION);
  }

  public void setExpression(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(ReturnStatement.EXPRESSION, node);
  }


  public static ReturnStatement newInstance(SModel sm, boolean init) {
    return (ReturnStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReturnStatement newInstance(SModel sm) {
    return ReturnStatement.newInstance(sm, false);
  }

}
