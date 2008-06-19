package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ConceptFunctionParameter_Behavior {
  public static Class[] PARAMETERS_1213877522908 = {SNode.class};
  public static Class[] PARAMETERS_1213877522926 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_getFromParameterObject_1213877522908(SNode thisNode) {
    if (!(ConceptFunctionParameter_Behavior.call_isParameterObjectUsed_1213877522926(thisNode))) {
      return false;
    }
    return ConceptFunction_Behavior.call_usesParameterObjectFor_1213877374432(ConceptFunctionParameter_Behavior.call_findConceptFunction_1213877522934(thisNode), thisNode);
  }

  public static boolean virtual_isParameterObjectUsed_1213877522926(SNode thisNode) {
    return !(SConceptPropertyOperations.getBoolean(thisNode, "dontUseParameterObject"));
  }

  public static SNode call_findConceptFunction_1213877522934(SNode thisNode) {
    List<SNode> functions = SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false);
    final SNode ourConcept = SNodeOperations.getConceptDeclaration(thisNode);
    return ListSequence.fromList(functions).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getConceptLinkTargets(it, "conceptFunctionParameter")).contains(ourConcept) || ListSequence.fromList(SLinkOperations.getConceptLinkTargets(it, "applicableConceptFunctionParameter")).contains(ourConcept);
      }

    }).first();
  }

  public static boolean call_getFromParameterObject_1213877522908(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getFromParameterObject_1213877522908", PARAMETERS_1213877522908);
  }

  public static boolean call_isParameterObjectUsed_1213877522926(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_isParameterObjectUsed_1213877522926", PARAMETERS_1213877522926);
  }

  public static boolean callSuper_getFromParameterObject_1213877522908(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getFromParameterObject_1213877522908", PARAMETERS_1213877522908);
  }

  public static boolean callSuper_isParameterObjectUsed_1213877522926(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_isParameterObjectUsed_1213877522926", PARAMETERS_1213877522926);
  }

}
