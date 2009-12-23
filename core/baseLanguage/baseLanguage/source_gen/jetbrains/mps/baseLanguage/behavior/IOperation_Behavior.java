package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.dataFlow.runtime.NullableVariableState;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IOperation_Behavior {
  private static Class[] PARAMETERS_1213877410080 = {SNode.class};
  private static Class[] PARAMETERS_1213877410087 = {SNode.class};
  private static Class[] PARAMETERS_1230555106620 = {SNode.class};
  private static Class[] PARAMETERS_1239212437413 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getOperand_1213877410070(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
  }

  public static SNode call_getDotExpression_1224687669172(SNode thisNode) {
    return SNodeOperations.as(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.DotExpression");
  }

  public static boolean virtual_isLValue_1213877410080(SNode thisNode) {
    return SConceptPropertyOperations.getBoolean(thisNode, "lvalue");
  }

  public static String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    return null;
  }

  public static NullableVariableState virtual_getNullableState_1230555106620(SNode thisNode) {
    return NullableVariableState.UNKNOWN;
  }

  public static boolean virtual_isDotExpressionLegalAsStatement_1239212437413(SNode thisNode) {
    return true;
  }

  public static boolean call_isLValue_1213877410080(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), "virtual_isLValue_1213877410080", PARAMETERS_1213877410080);
  }

  public static String call_getVariableExpectedName_1213877410087(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), "virtual_getVariableExpectedName_1213877410087", PARAMETERS_1213877410087);
  }

  public static NullableVariableState call_getNullableState_1230555106620(SNode thisNode) {
    return (NullableVariableState) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), "virtual_getNullableState_1230555106620", PARAMETERS_1230555106620);
  }

  public static boolean call_isDotExpressionLegalAsStatement_1239212437413(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), "virtual_isDotExpressionLegalAsStatement_1239212437413", PARAMETERS_1239212437413);
  }

  public static boolean callSuper_isLValue_1213877410080(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), callerConceptFqName, "virtual_isLValue_1213877410080", PARAMETERS_1213877410080);
  }

  public static String callSuper_getVariableExpectedName_1213877410087(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), callerConceptFqName, "virtual_getVariableExpectedName_1213877410087", PARAMETERS_1213877410087);
  }

  public static NullableVariableState callSuper_getNullableState_1230555106620(SNode thisNode, String callerConceptFqName) {
    return (NullableVariableState) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), callerConceptFqName, "virtual_getNullableState_1230555106620", PARAMETERS_1230555106620);
  }

  public static boolean callSuper_isDotExpressionLegalAsStatement_1239212437413(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IOperation"), callerConceptFqName, "virtual_isDotExpressionLegalAsStatement_1239212437413", PARAMETERS_1239212437413);
  }
}
