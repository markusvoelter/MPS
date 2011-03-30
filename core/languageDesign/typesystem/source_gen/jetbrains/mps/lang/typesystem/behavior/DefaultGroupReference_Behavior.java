package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class DefaultGroupReference_Behavior {
  private static Class[] PARAMETERS_7342618720440051599 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_createGeneratedNodeId_7342618720440051599(SNode thisNode) {
    return "default";
  }

  public static String call_createGeneratedNodeId_7342618720440051599(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.DefaultGroupReference"), "virtual_createGeneratedNodeId_7342618720440051599", PARAMETERS_7342618720440051599);
  }

  public static String callSuper_createGeneratedNodeId_7342618720440051599(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.DefaultGroupReference"), callerConceptFqName, "virtual_createGeneratedNodeId_7342618720440051599", PARAMETERS_7342618720440051599);
  }
}
