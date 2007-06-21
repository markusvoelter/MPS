package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LessThanOrEqualsExpression extends BinaryOperation {

  public  LessThanOrEqualsExpression(SNode node) {
    super(node);
  }

  public static LessThanOrEqualsExpression newInstance(SModel sm, boolean init) {
    return (LessThanOrEqualsExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.LessThanOrEqualsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LessThanOrEqualsExpression newInstance(SModel sm) {
    return LessThanOrEqualsExpression.newInstance(sm, false);
  }
}
