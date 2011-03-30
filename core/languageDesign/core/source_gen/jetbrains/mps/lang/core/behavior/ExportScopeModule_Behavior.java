package jetbrains.mps.lang.core.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ExportScopeModule_Behavior {
  private static Class[] PARAMETERS_402007580867586263 = {SNode.class, String.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_checkExport_2565736246230026584(SNode thisNode, String sourceNamespace, SNode targetNode) {
    return sourceNamespace.equals(ExportScope_Behavior.getNamespace_2565736246230026649(targetNode));
  }

  public static boolean call_checkExport_402007580867586263(SNode thisNode, String sourceNamespace, SNode targetNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    if (descriptor instanceof ExportScopeModule_BehaviorDescriptor) {
      ExportScopeModule_BehaviorDescriptor casted = (ExportScopeModule_BehaviorDescriptor) descriptor;
      return casted.virtual_checkExport_2565736246230026584(thisNode, sourceNamespace, targetNode);
    }
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.ExportScopeModule"), "virtual_checkExport_2565736246230026584", PARAMETERS_402007580867586263, sourceNamespace, targetNode);
  }

  public static boolean callSuper_checkExport_402007580867586263(SNode thisNode, String callerConceptFqName, String sourceNamespace, SNode targetNode) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.ExportScopeModule"), callerConceptFqName, "virtual_checkExport_2565736246230026584", PARAMETERS_402007580867586263, sourceNamespace, targetNode);
  }
}
