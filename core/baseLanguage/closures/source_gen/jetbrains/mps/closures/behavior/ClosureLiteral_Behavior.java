package jetbrains.mps.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

public class ClosureLiteral_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder sb = new StringBuilder("{");
    String sep = " ";
    for(SNode pd : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(pd));
      sep = ", ";
    }
    return sb.append(" => <body> }").toString();
  }

  public static String call_getFunctionInterfaceName_1213877338544(SNode thisNode) {
    return "_function_" + ((SNode)thisNode).getId();
  }

}
