package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class FieldReferenceOperation_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    String expectedName = null;
    if ((SLinkOperations.getTarget(thisNode, "fieldDeclaration", false) != null)) {
      expectedName = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "fieldDeclaration", false), "name");
    }
    return expectedName;
  }

}
