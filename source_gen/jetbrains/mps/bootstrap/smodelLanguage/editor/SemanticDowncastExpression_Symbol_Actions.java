package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS Apr 27, 2006 1:20:54 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class SemanticDowncastExpression_Symbol_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new SemanticDowncastExpression_Symbol_Actions_DELETE(node));
  }
}
