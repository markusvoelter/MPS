package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ActionReference_Behavior {
  private static Class[] PARAMETERS_1101347953350122762 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getActionId_1101347953350122762(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.test.structure.ActionReference"), "virtual_getActionId_1101347953350122762", PARAMETERS_1101347953350122762);
  }

  public static String callSuper_getActionId_1101347953350122762(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.test.structure.ActionReference"), callerConceptFqName, "virtual_getActionId_1101347953350122762", PARAMETERS_1101347953350122762);
  }
}
