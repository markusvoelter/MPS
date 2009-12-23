package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MinusAssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.MinusAssingmentExpression";

  public MinusAssingmentExpression(SNode node) {
    super(node);
  }

  public static MinusAssingmentExpression newInstance(SModel sm, boolean init) {
    return (MinusAssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.MinusAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MinusAssingmentExpression newInstance(SModel sm) {
    return MinusAssingmentExpression.newInstance(sm, false);
  }
}
