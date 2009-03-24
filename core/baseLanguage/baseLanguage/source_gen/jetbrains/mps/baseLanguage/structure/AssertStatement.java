package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AssertStatement extends jetbrains.mps.baseLanguage.structure.Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AssertStatement";
  public static final String CONDITION = "condition";
  public static final String MESSAGE = "message";

  public AssertStatement(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getCondition() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, AssertStatement.CONDITION);
  }

  public void setCondition(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(AssertStatement.CONDITION, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getMessage() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, AssertStatement.MESSAGE);
  }

  public void setMessage(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(AssertStatement.MESSAGE, node);
  }


  public static AssertStatement newInstance(SModel sm, boolean init) {
    return (AssertStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssertStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AssertStatement newInstance(SModel sm) {
    return AssertStatement.newInstance(sm, false);
  }

}
