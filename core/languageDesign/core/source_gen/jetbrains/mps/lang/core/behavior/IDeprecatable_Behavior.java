package jetbrains.mps.lang.core.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IDeprecatable_Behavior {
  private static Class[] PARAMETERS_1224609060727 = {SNode.class};
  private static Class[] PARAMETERS_1225207468592 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isDeprecated_1224609060727(SNode thisNode) {
    return false;
  }

  public static String virtual_getMessage_1225207468592(SNode thisNode) {
    return null;
  }

  public static boolean call_isDeprecated_1224609060727(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.IDeprecatable"), "virtual_isDeprecated_1224609060727", PARAMETERS_1224609060727);
  }

  public static String call_getMessage_1225207468592(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.IDeprecatable"), "virtual_getMessage_1225207468592", PARAMETERS_1225207468592);
  }

  public static boolean callSuper_isDeprecated_1224609060727(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.IDeprecatable"), callerConceptFqName, "virtual_isDeprecated_1224609060727", PARAMETERS_1224609060727);
  }

  public static String callSuper_getMessage_1225207468592(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.IDeprecatable"), callerConceptFqName, "virtual_getMessage_1225207468592", PARAMETERS_1225207468592);
  }
}
