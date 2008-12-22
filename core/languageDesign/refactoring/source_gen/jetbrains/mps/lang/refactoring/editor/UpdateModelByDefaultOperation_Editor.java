package jetbrains.mps.lang.refactoring.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class UpdateModelByDefaultOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6465_0(context, node);
  }

  public EditorCell createCollection_6465_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6465_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_6465_0(context, node, "updateModelByDefault"));
    editorCell.addEditorCell(this.createConstant_6465_1(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant_6465_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6465_0(editorCell, node, context);
    setupLabel_Constant_6465_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6465_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6465_1(editorCell, node, context);
    setupLabel_Constant_6465_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_6465_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6465_0");
  }

  private static void setupBasic_Constant_6465_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6465_0");
  }

  private static void setupBasic_Constant_6465_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6465_1");
  }

  private static void setupLabel_Constant_6465_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6465_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
