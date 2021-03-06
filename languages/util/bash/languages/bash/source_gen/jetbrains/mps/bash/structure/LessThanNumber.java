package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LessThanNumber extends BinaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.LessThanNumber";

  public LessThanNumber(SNode node) {
    super(node);
  }

  public static LessThanNumber newInstance(SModel sm, boolean init) {
    return (LessThanNumber) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.LessThanNumber", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LessThanNumber newInstance(SModel sm) {
    return LessThanNumber.newInstance(sm, false);
  }
}
