package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Apr 19, 2006 9:06:13 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class BinaryOperation_Symbol_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new BinaryOperation_Symbol_Actions_DELETE(node));
  }
}
