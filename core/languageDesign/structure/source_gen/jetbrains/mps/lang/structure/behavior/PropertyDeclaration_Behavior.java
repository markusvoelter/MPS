package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class PropertyDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getCellId_1216822951265(SNode thisNode) {
    return "property_" + SPropertyOperations.getString(thisNode, "name");
  }

  public static boolean virtual_canJavaDoc_1224609519989(SNode thisNode) {
    return false;
  }

  public static boolean virtual_isDeprecated_1224609060727(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, AttributesRolesUtil.childRoleFromAttributeRole("deprecatedNode"), true) != null);
  }

}
