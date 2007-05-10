package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeBuilderPart;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_RemoveBy_Condition;

public class RemoveByConditionPart extends NodeBuilderPart {
  public static String CONDITION = "condition";

  public  RemoveByConditionPart(SNode node) {
    super(node);
  }

  public static RemoveByConditionPart newInstance(SModel sm, boolean init) {
    return (RemoveByConditionPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.RemoveByConditionPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static RemoveByConditionPart newInstance(SModel sm) {
    return RemoveByConditionPart.newInstance(sm, false);
  }

  public QueryFunction_RemoveBy_Condition getCondition() {
    return (QueryFunction_RemoveBy_Condition)this.getChild(RemoveByConditionPart.CONDITION);
  }
  public void setCondition(QueryFunction_RemoveBy_Condition node) {
    super.setChild(RemoveByConditionPart.CONDITION, node);
  }
}
