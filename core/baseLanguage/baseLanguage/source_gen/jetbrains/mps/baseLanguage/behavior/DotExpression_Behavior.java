package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.lang.reflect.Method;
import jetbrains.mps.reloading.ReflectionUtil;

public class DotExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isLValue_1213877519786(SNode thisNode) {
    return IOperation_Behavior.call_isLValue_1213877410080(SLinkOperations.getTarget(thisNode, "operation", true));
  }

  public static SNode call_getClassifier_1213877410697(SNode thisNode) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "operand", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false), "classifier", false);
  }

  public static String virtual_getVariableExpectedName_1213877519781(SNode thisNode) {
    return IOperation_Behavior.call_getVariableExpectedName_1213877410087(SLinkOperations.getTarget(thisNode, "operation", true));
  }

  public static Object virtual_eval_1213877519769(SNode thisNode, IModule module) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "operation", true), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation")) {
      Object instance = Expression_Behavior.call_eval_1213877519769(SLinkOperations.getTarget(thisNode, "operand", true), module);
      SNode methodCall = SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "operation", true), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation");
      Method method = BaseMethodDeclaration_Behavior.call_getMethod_1213877350393(SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false), module);
      Object[] actualArguments = IMethodCall_Behavior.call_getActualArguments_1219275428261(methodCall, module);
      return ReflectionUtil.invoke(method, instance, actualArguments);
    }
    return Expression_Behavior.callSuper_eval_1213877519769(thisNode, "jetbrains.mps.baseLanguage.structure.DotExpression", module);
  }

  public static boolean virtual_isLegalAsStatement_1239211900844(SNode thisNode) {
    return IOperation_Behavior.call_isDotExpressionLegalAsStatement_1239212437413(SLinkOperations.getTarget(thisNode, "operation", true));
  }
}
