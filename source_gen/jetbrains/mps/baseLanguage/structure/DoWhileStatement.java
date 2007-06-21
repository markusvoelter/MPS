package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DoWhileStatement extends AbstractLoopStatement {
  public static String CONDITION = "condition";

  public  DoWhileStatement(SNode node) {
    super(node);
  }

  public static DoWhileStatement newInstance(SModel sm, boolean init) {
    return (DoWhileStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.DoWhileStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static DoWhileStatement newInstance(SModel sm) {
    return DoWhileStatement.newInstance(sm, false);
  }

  public Expression getCondition() {
    return (Expression)this.getChild(DoWhileStatement.CONDITION);
  }
  public void setCondition(Expression node) {
    super.setChild(DoWhileStatement.CONDITION, node);
  }
}
