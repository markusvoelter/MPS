package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueryFunction_ParameterizedSideTransform_Query_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode hostMenuPart = SNodeOperations.getParent(thisNode);
    SNode parameterType = SLinkOperations.getTarget(hostMenuPart, "type", true);
    if (parameterType != null) {
      return new _Quotations.QuotationClass_8().createNode(parameterType);
    }
    return new _Quotations.QuotationClass_9().createNode();
  }

}
