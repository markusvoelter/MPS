package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Node_TypeOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_NotInRules_Component4604_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant_4604_0(context, node, "type");
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent_4604_0(context, node);
  }

  public EditorCell createComponent_4604_0(EditorContext context, SNode node) {
    if (this.my_NotInRules_Component4604_0 == null) {
      this.my_NotInRules_Component4604_0 = new _NotInRules_Component(node);
    }
    EditorCell editorCell = this.my_NotInRules_Component4604_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_4604_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4604_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

}
