package jetbrains.mps.regexp.editor;

/*Generated by MPS  */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class UnaryRegexp_Regexp_actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new UnaryRegexp_Regexp_actions_DELETE(node));
  }
}
