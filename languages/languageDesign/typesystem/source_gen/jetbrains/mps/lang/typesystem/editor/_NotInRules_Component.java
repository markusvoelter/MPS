package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class _NotInRules_Component extends AbstractCellProvider {
  public _NotInRules_Component(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext editorContext) {
    return this.createEditorCell(editorContext, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_rcqmfi_a(editorContext, node);
  }

  private EditorCell createCollection_rcqmfi_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_rcqmfi_a");
    editorCell.addEditorCell(this.createConstant_rcqmfi_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_rcqmfi_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_rcqmfi_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "do not use in rules");
    editorCell.setCellId("Constant_rcqmfi_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_rcqmfi_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "use in queries only");
    editorCell.setCellId("Constant_rcqmfi_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
