package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS 16.10.2006 16:02:01 */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class NotExpression_Parens_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new NotExpression_Parens_Actions_DELETE(node));
  }
}
