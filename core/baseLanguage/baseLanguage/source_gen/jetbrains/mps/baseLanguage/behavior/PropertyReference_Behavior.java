package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.Property_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class PropertyReference_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isLValue_1213877410080(SNode thisNode) {
    return Property_Behavior.call_hasSetter_1213877383224(SLinkOperations.getTarget(thisNode, "property", false));
  }

}
