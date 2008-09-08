package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReplaceWithRegexpExpression extends Expression implements RegexpUsingConstruction {
  public static final String concept = "jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String EXPR = "expr";
  public static String REPLACE_BLOCK = "replaceBlock";
  public static String REGEXP = "regexp";

  public ReplaceWithRegexpExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ReplaceWithRegexpExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ReplaceWithRegexpExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ReplaceWithRegexpExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ReplaceWithRegexpExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ReplaceWithRegexpExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ReplaceWithRegexpExpression.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpr() {
    return (Expression)this.getChild(ReplaceWithRegexpExpression.EXPR);
  }

  public void setExpr(Expression node) {
    super.setChild(ReplaceWithRegexpExpression.EXPR, node);
  }

  public ReplaceBlock getReplaceBlock() {
    return (ReplaceBlock)this.getChild(ReplaceWithRegexpExpression.REPLACE_BLOCK);
  }

  public void setReplaceBlock(ReplaceBlock node) {
    super.setChild(ReplaceWithRegexpExpression.REPLACE_BLOCK, node);
  }

  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(ReplaceWithRegexpExpression.REGEXP);
  }

  public void setRegexp(RegexpExpression node) {
    super.setChild(ReplaceWithRegexpExpression.REGEXP, node);
  }


  public static ReplaceWithRegexpExpression newInstance(SModel sm, boolean init) {
    return (ReplaceWithRegexpExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReplaceWithRegexpExpression newInstance(SModel sm) {
    return ReplaceWithRegexpExpression.newInstance(sm, false);
  }

}
