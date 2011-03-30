package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ILinkAccess_Behavior {
  private static Class[] PARAMETERS_4024382256428848847 = {SNode.class};
  private static Class[] PARAMETERS_4024382256428848854 = {SNode.class};
  private static Class[] PARAMETERS_4024382256428848859 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_isSingularCardinality_4024382256428848847(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), "virtual_isSingularCardinality_4024382256428848847", PARAMETERS_4024382256428848847);
  }

  public static boolean call_isAggregation_4024382256428848854(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), "virtual_isAggregation_4024382256428848854", PARAMETERS_4024382256428848854);
  }

  public static SNode call_getTargetConcept_4024382256428848859(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), "virtual_getTargetConcept_4024382256428848859", PARAMETERS_4024382256428848859);
  }

  public static boolean callSuper_isSingularCardinality_4024382256428848847(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), callerConceptFqName, "virtual_isSingularCardinality_4024382256428848847", PARAMETERS_4024382256428848847);
  }

  public static boolean callSuper_isAggregation_4024382256428848854(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), callerConceptFqName, "virtual_isAggregation_4024382256428848854", PARAMETERS_4024382256428848854);
  }

  public static SNode callSuper_getTargetConcept_4024382256428848859(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.ILinkAccess"), callerConceptFqName, "virtual_getTargetConcept_4024382256428848859", PARAMETERS_4024382256428848859);
  }
}
