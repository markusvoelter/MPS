package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AssertStatement extends Statement {
  public static String CONDITION = "condition";
  public static String MESSAGE = "message";

  public  AssertStatement(SNode node) {
    super(node);
  }

  public static AssertStatement newInstance(SModel sm, boolean init) {
    return (AssertStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.AssertStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AssertStatement newInstance(SModel sm) {
    return AssertStatement.newInstance(sm, false);
  }

  public Expression getCondition() {
    return (Expression)this.getChild(AssertStatement.CONDITION);
  }
  public void setCondition(Expression node) {
    super.setChild(AssertStatement.CONDITION, node);
  }
  public Expression getMessage() {
    return (Expression)this.getChild(AssertStatement.MESSAGE);
  }
  public void setMessage(Expression node) {
    super.setChild(AssertStatement.MESSAGE, node);
  }
}
