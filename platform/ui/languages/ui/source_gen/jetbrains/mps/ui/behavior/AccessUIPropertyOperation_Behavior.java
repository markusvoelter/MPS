package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class AccessUIPropertyOperation_Behavior {
  private static Class[] PARAMETERS_1870423755832759935 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isLValue_1213877410080(SNode thisNode) {
    return true;
  }

  public static boolean call_isLValue_1870423755832759935(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.AccessUIPropertyOperation"), "virtual_isLValue_1213877410080", PARAMETERS_1870423755832759935);
  }

  public static boolean callSuper_isLValue_1870423755832759935(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.AccessUIPropertyOperation"), callerConceptFqName, "virtual_isLValue_1213877410080", PARAMETERS_1870423755832759935);
  }
}
