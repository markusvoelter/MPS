package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CellMenuPart_ReplaceChild_Group_Create_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    if (thisNode == null) {
      return null;
    }
    SNode hostMenuPart = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract", false, false);
    SNode editedLink = CellMenuPart_Abstract_Behavior.call_getEditedLink_1219409839992(hostMenuPart);
    SNode conceptOfChild = SLinkOperations.getTarget(editedLink, "target", false);
    return new _Quotations.QuotationClass_0().createNode(conceptOfChild);
  }

}
