package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PlusExpression extends BinaryOperation {

  public  PlusExpression(SNode node) {
    super(node);
  }

  public static PlusExpression newInstance(SModel sm, boolean init) {
    return (PlusExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.PlusExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static PlusExpression newInstance(SModel sm) {
    return PlusExpression.newInstance(sm, false);
  }
}
