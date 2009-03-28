package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MathDateTimeOperation extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation";
  public static final String LEFT_EXPRESSION = "leftExpression";
  public static final String RIGHT_EXPRESSION = "rightExpression";

  public MathDateTimeOperation(SNode node) {
    super(node);
  }

  public Expression getLeftExpression() {
    return (Expression)this.getChild(Expression.class, MathDateTimeOperation.LEFT_EXPRESSION);
  }

  public void setLeftExpression(Expression node) {
    super.setChild(MathDateTimeOperation.LEFT_EXPRESSION, node);
  }

  public Expression getRightExpression() {
    return (Expression)this.getChild(Expression.class, MathDateTimeOperation.RIGHT_EXPRESSION);
  }

  public void setRightExpression(Expression node) {
    super.setChild(MathDateTimeOperation.RIGHT_EXPRESSION, node);
  }


  public static MathDateTimeOperation newInstance(SModel sm, boolean init) {
    return (MathDateTimeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MathDateTimeOperation newInstance(SModel sm) {
    return MathDateTimeOperation.newInstance(sm, false);
  }

}
