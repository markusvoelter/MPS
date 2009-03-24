package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GreaterThanOrEqualsExpression extends jetbrains.mps.baseLanguage.structure.BinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression";

  public GreaterThanOrEqualsExpression(SNode node) {
    super(node);
  }

  public static GreaterThanOrEqualsExpression newInstance(SModel sm, boolean init) {
    return (GreaterThanOrEqualsExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GreaterThanOrEqualsExpression newInstance(SModel sm) {
    return GreaterThanOrEqualsExpression.newInstance(sm, false);
  }

}
