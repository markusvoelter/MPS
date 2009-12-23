package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.AssingmentExpression";

  public AssingmentExpression(SNode node) {
    super(node);
  }

  public static AssingmentExpression newInstance(SModel sm, boolean init) {
    return (AssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.AssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AssingmentExpression newInstance(SModel sm) {
    return AssingmentExpression.newInstance(sm, false);
  }
}
