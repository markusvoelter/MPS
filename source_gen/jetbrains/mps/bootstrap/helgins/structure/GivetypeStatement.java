package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class GivetypeStatement extends Statement {
  public static String TYPE_EXPRESSION = "typeExpression";
  public static String TERM_EXPRESSION = "termExpression";

  public  GivetypeStatement(SNode node) {
    super(node);
  }

  public static GivetypeStatement newInstance(SModel sm, boolean init) {
    return (GivetypeStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.GivetypeStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GivetypeStatement newInstance(SModel sm) {
    return GivetypeStatement.newInstance(sm, false);
  }


  public Expression getTypeExpression() {
    return (Expression)this.getChild(GivetypeStatement.TYPE_EXPRESSION);
  }

  public void setTypeExpression(Expression node) {
    super.setChild(GivetypeStatement.TYPE_EXPRESSION, node);
  }

  public Expression getTermExpression() {
    return (Expression)this.getChild(GivetypeStatement.TERM_EXPRESSION);
  }

  public void setTermExpression(Expression node) {
    super.setChild(GivetypeStatement.TERM_EXPRESSION, node);
  }

}
