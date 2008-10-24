package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PlusAssignmentExpression extends BaseAssignmentExpression {
public    static final String concept = "jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression";

  public PlusAssignmentExpression(SNode node) {
    super(node);
  }

  public static PlusAssignmentExpression newInstance(SModel sm, boolean init) {
    return (PlusAssignmentExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PlusAssignmentExpression newInstance(SModel sm) {
    return PlusAssignmentExpression.newInstance(sm, false);
  }

}
