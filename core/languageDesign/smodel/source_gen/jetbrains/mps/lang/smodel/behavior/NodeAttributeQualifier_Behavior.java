package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NodeAttributeQualifier_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getTargetConcept_6407023681583066586(SNode thisNode) {
    return (SNode) SLinkOperations.getTarget(thisNode, "attributeConcept", false);
  }
}
