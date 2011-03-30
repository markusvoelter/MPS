package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class PasteWrappers_Behavior {
  private static Class[] PARAMETERS_5270353093116089917 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345978527 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode nodeFactory : SLinkOperations.getTargets(thisNode, "wrapper", true)) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(nodeFactory, "sourceConcept", false));
    }
    return result;
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SNode pasteWrapper = SConceptOperations.createNewNode("jetbrains.mps.lang.actions.structure.PasteWrapper", null);
    SLinkOperations.setTarget(pasteWrapper, "sourceConcept", baseConcept, false);
    ListSequence.fromList(SLinkOperations.getTargets(thisNode, "wrapper", true)).addElement(pasteWrapper);
  }

  public static List<SNode> call_getBaseConceptCollection_5270353093116089917(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116089917);
  }

  public static void call_setBaseConcept_6261424444345978527(SNode thisNode, SNode baseConcept) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978527, baseConcept);
  }

  public static List<SNode> callSuper_getBaseConceptCollection_5270353093116089917(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), callerConceptFqName, "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116089917);
  }

  public static void callSuper_setBaseConcept_6261424444345978527(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345978527, baseConcept);
  }
}
