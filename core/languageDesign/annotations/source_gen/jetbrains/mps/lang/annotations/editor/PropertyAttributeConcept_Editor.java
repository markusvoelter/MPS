package jetbrains.mps.lang.annotations.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class PropertyAttributeConcept_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6ejrtx_a(editorContext, node);
  }

  private EditorCell createCollection_6ejrtx_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6ejrtx_a");
    editorCell.addEditorCell(this.createConstant_6ejrtx_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6ejrtx_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6ejrtx_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_6ejrtx_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "$(");
    editorCell.setCellId("Constant_6ejrtx_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6ejrtx_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "property attribute concept");
    editorCell.setCellId("Constant_6ejrtx_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6ejrtx_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")$");
    editorCell.setCellId("Constant_6ejrtx_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
