package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class PropertyImplementation_Behavior {
  public static Class[] PARAMETERS_1213877430658 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_hasSetter_1213877430658(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_hasSetter_1213877430658", PARAMETERS_1213877430658);
  }

  public static boolean callSuper_hasSetter_1213877430658(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_hasSetter_1213877430658", PARAMETERS_1213877430658);
  }

}
