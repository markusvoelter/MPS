package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GroupIdConditionalExpression extends UnaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.GroupIdConditionalExpression";

  public GroupIdConditionalExpression(SNode node) {
    super(node);
  }

  public static GroupIdConditionalExpression newInstance(SModel sm, boolean init) {
    return (GroupIdConditionalExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.GroupIdConditionalExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GroupIdConditionalExpression newInstance(SModel sm) {
    return GroupIdConditionalExpression.newInstance(sm, false);
  }
}
