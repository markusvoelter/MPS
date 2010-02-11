package jetbrains.mps.samples.lambdaCalculus.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class StringType_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_3439_0(editorContext, node);
  }

  private EditorCell createCollection_3439_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_3439_0");
    editorCell.addEditorCell(this.createConstant_3439_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_3439_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "string");
    editorCell.setCellId("Constant_3439_0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
