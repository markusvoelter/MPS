package jetbrains.mps.bootstrap.editorLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class CellModel_Component_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getCellId_1216737839993(SNode thisNode) {
    return "component_" + SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "editorComponent", false), "name");
  }

}
