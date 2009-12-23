package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XorAssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.XorAssingmentExpression";

  public XorAssingmentExpression(SNode node) {
    super(node);
  }

  public static XorAssingmentExpression newInstance(SModel sm, boolean init) {
    return (XorAssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.XorAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XorAssingmentExpression newInstance(SModel sm) {
    return XorAssingmentExpression.newInstance(sm, false);
  }
}
