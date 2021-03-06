package jetbrains.mps.buildlanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ISource_Behavior {
  private static Class[] PARAMETERS_1213877276955 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<String> call_getPaths_1213877276955(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<String>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.buildlanguage.structure.ISource"), "virtual_getPaths_1213877276955", PARAMETERS_1213877276955);
  }

  public static List<String> callSuper_getPaths_1213877276955(SNode thisNode, String callerConceptFqName) {
    return (List<String>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.buildlanguage.structure.ISource"), callerConceptFqName, "virtual_getPaths_1213877276955", PARAMETERS_1213877276955);
  }
}
