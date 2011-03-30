package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IGeneratorParameter_Behavior {
  private static Class[] PARAMETERS_650531548511609559 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getUniqueId_650531548511609559(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.IGeneratorParameter"), "virtual_getUniqueId_650531548511609559", PARAMETERS_650531548511609559);
  }

  public static String callSuper_getUniqueId_650531548511609559(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.IGeneratorParameter"), callerConceptFqName, "virtual_getUniqueId_650531548511609559", PARAMETERS_650531548511609559);
  }
}
