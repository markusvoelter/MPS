package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseAndExpression extends BinaryArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BitwiseAndExpression";

  public BitwiseAndExpression(SNode node) {
    super(node);
  }

  public static BitwiseAndExpression newInstance(SModel sm, boolean init) {
    return (BitwiseAndExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BitwiseAndExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseAndExpression newInstance(SModel sm) {
    return BitwiseAndExpression.newInstance(sm, false);
  }
}
