package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ParameterWrapper_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Object call_getParameterValue_1213877312166(SNode thisNode) {
    Object parameter = SLinkOperations.getTarget(thisNode, "paramRef", false);
    if (parameter == null) {
      parameter = SPropertyOperations.getString(thisNode, "paramValue");
    }
    return parameter;
  }
}
