package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.dataFlow.runtime.NullableVariableState;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Expression_Behavior {
  private static Class[] PARAMETERS_1213877519769 = {SNode.class ,IModule.class};
  private static Class[] PARAMETERS_1213877519781 = {SNode.class};
  private static Class[] PARAMETERS_1213877519786 = {SNode.class};
  private static Class[] PARAMETERS_1230540989695 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static Object virtual_eval_1213877519769(SNode thisNode, IModule module) {
    throw new UnsupportedOperationException(thisNode.getDebugText());
  }

  public static String virtual_getVariableExpectedName_1213877519781(SNode thisNode) {
    return null;
  }

  public static boolean virtual_isLValue_1213877519786(SNode thisNode) {
    return SConceptPropertyOperations.getBoolean(thisNode, "lvalue");
  }

  public static NullableVariableState virtual_getNullableState_1230540989695(SNode thisNode) {
    return NullableVariableState.UNKNOWN;
  }

  public static Object call_eval_1213877519769(SNode thisNode, IModule module) {
    return (Object)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_eval_1213877519769", PARAMETERS_1213877519769, module);
  }

  public static String call_getVariableExpectedName_1213877519781(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getVariableExpectedName_1213877519781", PARAMETERS_1213877519781);
  }

  public static boolean call_isLValue_1213877519786(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, thisNode, "virtual_isLValue_1213877519786", PARAMETERS_1213877519786);
  }

  public static NullableVariableState call_getNullableState_1230540989695(SNode thisNode) {
    return (NullableVariableState)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getNullableState_1230540989695", PARAMETERS_1230540989695);
  }

  public static Object callSuper_eval_1213877519769(SNode thisNode, String callerConceptFqName, IModule module) {
    return (Object)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_eval_1213877519769", PARAMETERS_1213877519769, module);
  }

  public static String callSuper_getVariableExpectedName_1213877519781(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getVariableExpectedName_1213877519781", PARAMETERS_1213877519781);
  }

  public static boolean callSuper_isLValue_1213877519786(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, thisNode, callerConceptFqName, "virtual_isLValue_1213877519786", PARAMETERS_1213877519786);
  }

  public static NullableVariableState callSuper_getNullableState_1230540989695(SNode thisNode, String callerConceptFqName) {
    return (NullableVariableState)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getNullableState_1230540989695", PARAMETERS_1230540989695);
  }

}
