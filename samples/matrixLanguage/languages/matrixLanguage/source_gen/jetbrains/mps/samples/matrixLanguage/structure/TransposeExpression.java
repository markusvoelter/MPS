package jetbrains.mps.samples.matrixLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TransposeExpression extends Expression {
  public static final String concept = "jetbrains.mps.samples.matrixLanguage.structure.TransposeExpression";
  public static final String MATRIX = "matrix";

  public TransposeExpression(SNode node) {
    super(node);
  }

  public Expression getMatrix() {
    return (Expression)this.getChild(Expression.class, TransposeExpression.MATRIX);
  }

  public void setMatrix(Expression node) {
    super.setChild(TransposeExpression.MATRIX, node);
  }

  public static TransposeExpression newInstance(SModel sm, boolean init) {
    return (TransposeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.TransposeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TransposeExpression newInstance(SModel sm) {
    return TransposeExpression.newInstance(sm, false);
  }
}
