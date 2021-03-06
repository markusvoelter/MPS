package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NodeFactory_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getQueryMethodName_1220279061997(SNode thisNode) {
    String conceptName = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "applicableConcept", false), "name");
    SNode setupFunction = SLinkOperations.getTarget(thisNode, "setupFunction", true);
    return "nodeFactory_NodeSetup_" + conceptName + "_" + setupFunction.getId();
  }
}
