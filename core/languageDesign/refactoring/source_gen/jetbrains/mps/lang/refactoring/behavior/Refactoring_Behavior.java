package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Refactoring_Behavior {
  private static Class[] PARAMETERS_4205271146524200392 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345979536 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "target", true), "jetbrains.mps.lang.refactoring.structure.NodeTarget"))) {
      return null;
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "target", true), "jetbrains.mps.lang.refactoring.structure.NodeTarget"), "concept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SNode nodeTarget = SConceptOperations.createNewNode("jetbrains.mps.lang.refactoring.structure.NodeTarget", null);
    SLinkOperations.setTarget(nodeTarget, "concept", baseConcept, false);
    SLinkOperations.setTarget(thisNode, "target", nodeTarget, true);
  }

  public static boolean call_isLoggable_1347577327951509202(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "updateModelBlock", true) != null);
  }

  public static SNode call_getBaseConcept_4205271146524200392(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_4205271146524200392);
  }

  public static void call_setBaseConcept_6261424444345979536(SNode thisNode, SNode baseConcept) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345979536, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_4205271146524200392(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_4205271146524200392);
  }

  public static void callSuper_setBaseConcept_6261424444345979536(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345979536, baseConcept);
  }
}
