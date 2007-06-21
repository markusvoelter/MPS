package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LessThanExpression extends BinaryOperation {

  public  LessThanExpression(SNode node) {
    super(node);
  }

  public static LessThanExpression newInstance(SModel sm, boolean init) {
    return (LessThanExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.LessThanExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LessThanExpression newInstance(SModel sm) {
    return LessThanExpression.newInstance(sm, false);
  }
}
