package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ConceptConstraints_Behavior {
  private static Class[] PARAMETERS_8952337903384645670 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345978682 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "concept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "concept", baseConcept, false);
  }

  public static SNode call_getBaseConcept_8952337903384645670(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384645670);
  }

  public static void call_setBaseConcept_6261424444345978682(SNode thisNode, SNode baseConcept) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978682, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_8952337903384645670(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384645670);
  }

  public static void callSuper_setBaseConcept_6261424444345978682(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978682, baseConcept);
  }
}
