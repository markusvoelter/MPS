package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IVariableAssignment_Behavior {
  private static Class[] PARAMETERS_1223985713603 = {SNode.class};
  private static Class[] PARAMETERS_1224857430232 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isCanBeUnused_1223985713603(SNode thisNode) {
    return true;
  }

  public static boolean call_isCanBeUnused_1223985713603(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IVariableAssignment"), "virtual_isCanBeUnused_1223985713603", PARAMETERS_1223985713603);
  }

  public static SNode call_getValue_1224857430232(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IVariableAssignment"), "virtual_getValue_1224857430232", PARAMETERS_1224857430232);
  }

  public static boolean callSuper_isCanBeUnused_1223985713603(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IVariableAssignment"), callerConceptFqName, "virtual_isCanBeUnused_1223985713603", PARAMETERS_1223985713603);
  }

  public static SNode callSuper_getValue_1224857430232(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IVariableAssignment"), callerConceptFqName, "virtual_getValue_1224857430232", PARAMETERS_1224857430232);
  }
}
