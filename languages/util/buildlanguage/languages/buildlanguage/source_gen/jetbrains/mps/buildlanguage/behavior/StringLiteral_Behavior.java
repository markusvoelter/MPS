package jetbrains.mps.buildlanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class StringLiteral_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "value", "");
  }

  public static String virtual_toString_1213877472569(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "value");
  }

  public static String virtual_getActualValue_1213877472572(SNode thisNode) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(thisNode);
  }
}
