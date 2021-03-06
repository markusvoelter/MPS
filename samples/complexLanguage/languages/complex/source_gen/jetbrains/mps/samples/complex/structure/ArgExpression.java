package jetbrains.mps.samples.complex.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArgExpression extends SingleComplexExpression {
  public static final String concept = "jetbrains.mps.samples.complex.structure.ArgExpression";

  public ArgExpression(SNode node) {
    super(node);
  }

  public static ArgExpression newInstance(SModel sm, boolean init) {
    return (ArgExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.complex.structure.ArgExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArgExpression newInstance(SModel sm) {
    return ArgExpression.newInstance(sm, false);
  }
}
