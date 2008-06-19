package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ConceptFunction_Behavior {
  public static Class[] PARAMETERS_1213877374432 = {SNode.class ,SNode.class};
  public static Class[] PARAMETERS_1213877374441 = {SNode.class};
  public static Class[] PARAMETERS_1213877374450 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return SConceptPropertyOperations.getBoolean(thisNode, "usesParameterObject");
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "conceptFunctionReturnType")).first();
  }

  public static List<SNode> virtual_getParameters_1213877374450(SNode thisNode) {
    if (thisNode == null) {
      return ListSequence.<SNode>fromArray();
    }
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "conceptFunctionParameter")));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(thisNode, "applicableConceptFunctionParameter")));
    return (List<SNode>)result;
  }

  public static boolean call_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return (Boolean)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_usesParameterObjectFor_1213877374432", PARAMETERS_1213877374432, parameter);
  }

  public static SNode call_getExpectedReturnType_1213877374441(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_1213877374441);
  }

  public static List<SNode> call_getParameters_1213877374450(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getParameters_1213877374450", PARAMETERS_1213877374450);
  }

  public static boolean callSuper_usesParameterObjectFor_1213877374432(SNode thisNode, String callerConceptFqName, SNode parameter) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_usesParameterObjectFor_1213877374432", PARAMETERS_1213877374432, parameter);
  }

  public static SNode callSuper_getExpectedReturnType_1213877374441(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_1213877374441);
  }

  public static List<SNode> callSuper_getParameters_1213877374450(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getParameters_1213877374450", PARAMETERS_1213877374450);
  }

}
