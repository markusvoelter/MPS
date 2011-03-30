package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class InequationReplacementRule_Behavior {
  private static Class[] PARAMETERS_4484478261143622410 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getSecondNodeCondition_4484478261143583672(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "supertypeNode", true);
  }

  public static SNode call_getSecondNodeCondition_4484478261143622410(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.InequationReplacementRule"), "virtual_getSecondNodeCondition_4484478261143583672", PARAMETERS_4484478261143622410);
  }

  public static SNode callSuper_getSecondNodeCondition_4484478261143622410(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.InequationReplacementRule"), callerConceptFqName, "virtual_getSecondNodeCondition_4484478261143583672", PARAMETERS_4484478261143622410);
  }
}
