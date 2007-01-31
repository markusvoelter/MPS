package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;

public class ThrowStatement extends Statement {
  public static String THROWABLE = "throwable";

  public  ThrowStatement(SNode node) {
    super(node);
  }

  public Expression getThrowable() {
    return (Expression)this.getChild(ThrowStatement.THROWABLE);
  }
  public void setThrowable(Expression node) {
    super.setChild(ThrowStatement.THROWABLE, node);
  }
}
