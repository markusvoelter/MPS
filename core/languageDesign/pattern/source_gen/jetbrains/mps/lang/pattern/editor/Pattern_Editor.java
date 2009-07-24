package jetbrains.mps.lang.pattern.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;

public class Pattern_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError_3948_0(context, node);
  }

  public EditorCell createError_3948_0(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "<undefined pattern>");
    setupBasic_Error_3948_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_3948_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_3948_0");
  }

}
