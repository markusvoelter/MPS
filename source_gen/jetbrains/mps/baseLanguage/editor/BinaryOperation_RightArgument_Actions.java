package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jul 26, 2006 6:25:13 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class BinaryOperation_RightArgument_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new BinaryOperation_RightArgument_Actions_DELETE(node));
  }
}
