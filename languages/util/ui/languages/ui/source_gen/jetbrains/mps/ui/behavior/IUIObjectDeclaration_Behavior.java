package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IUIObjectDeclaration_Behavior {
  private static Class[] PARAMETERS_6410919744913609596 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getType_6410919744913609596(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.IUIObjectDeclaration"), "virtual_getType_6410919744913609596", PARAMETERS_6410919744913609596);
  }

  public static SNode callSuper_getType_6410919744913609596(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.IUIObjectDeclaration"), callerConceptFqName, "virtual_getType_6410919744913609596", PARAMETERS_6410919744913609596);
  }
}
