package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS 22.10.2006 20:43:16 */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class CastExpression_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new CastExpression_Actions_DELETE(node));
  }
}
