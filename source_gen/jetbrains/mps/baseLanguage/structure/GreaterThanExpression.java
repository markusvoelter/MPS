package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GreaterThanExpression extends BinaryOperation {

  public  GreaterThanExpression(SNode node) {
    super(node);
  }

  public static GreaterThanExpression newInstance(SModel sm, boolean init) {
    return (GreaterThanExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.GreaterThanExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static GreaterThanExpression newInstance(SModel sm) {
    return GreaterThanExpression.newInstance(sm, false);
  }
}
