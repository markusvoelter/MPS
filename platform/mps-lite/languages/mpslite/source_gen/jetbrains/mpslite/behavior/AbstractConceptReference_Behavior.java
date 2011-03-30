package jetbrains.mpslite.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class AbstractConceptReference_Behavior {
  private static Class[] PARAMETERS_1238594571574 = {SNode.class, Map.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getConcept_1238594571574(SNode thisNode, Map<SNode, SNode> conceptsToTargets) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mpslite.structure.AbstractConceptReference"), "virtual_getConcept_1238594571574", PARAMETERS_1238594571574, conceptsToTargets);
  }

  public static SNode callSuper_getConcept_1238594571574(SNode thisNode, String callerConceptFqName, Map<SNode, SNode> conceptsToTargets) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mpslite.structure.AbstractConceptReference"), callerConceptFqName, "virtual_getConcept_1238594571574", PARAMETERS_1238594571574, conceptsToTargets);
  }
}
