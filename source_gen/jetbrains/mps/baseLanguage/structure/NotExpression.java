package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;

public class NotExpression extends Expression {
  public static String EXPRESSION = "expression";

  public  NotExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(NotExpression.EXPRESSION);
  }
  public void setExpression(Expression node) {
    super.setChild(NotExpression.EXPRESSION, node);
  }
}
