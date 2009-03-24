package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.IMemberContainer_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class EnumClass_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_findConstantByName_1213877267258(SNode thisNode, String name) {
    for(SNode constant : SLinkOperations.getTargets(thisNode, "enumConstant", true)) {
      if (name.equalsIgnoreCase(SPropertyOperations.getString(constant, "name"))) {
        return constant;
      }
    }
    return null;
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = IMemberContainer_Behavior.callSuper_getMembers_1213877531970(thisNode, "jetbrains.mps.baseLanguage.structure.EnumClass");
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "enumConstant", true)));
    return members;
  }

  public static boolean virtual_hasStaticMemebers_1214840444586(SNode thisNode) {
    //     enums always have static operations: valueOf and values
    return true;
  }

}
