package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class PoundExpression extends BaseConcept implements IPropertyAccessQualifier, ILinkAccessQualifier, IRefConceptArg {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String EXPRESSION = "expression";

  public PoundExpression(SNode node) {
    super(node);
  }

  public static PoundExpression newInstance(SModel sm, boolean init) {
    return (PoundExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PoundExpression newInstance(SModel sm) {
    return PoundExpression.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(PoundExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PoundExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PoundExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PoundExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PoundExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PoundExpression.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(PoundExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(PoundExpression.EXPRESSION, node);
  }

}
