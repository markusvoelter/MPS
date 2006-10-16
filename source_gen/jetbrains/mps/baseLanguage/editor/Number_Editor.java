package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS 16.10.2006 16:01:54 */

import jetbrains.mps.nodeEditor.*;
import jetbrains.mps.smodel.SNode;

import java.awt.Color;

public class Number_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstantCell(context, node, "number");
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, "1157103836672");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
}
