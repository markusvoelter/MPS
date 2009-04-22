package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class DefaultGetAccessor_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2800_0(context, node);
  }

  public EditorCell createCollection_2800_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_2800_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_2800_0(context, node, "get"));
    editorCell.addEditorCell(this.createConstant_2800_1(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant_2800_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2800_0(editorCell, node, context);
    setupLabel_Constant_2800_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2800_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2800_1(editorCell, node, context);
    setupLabel_Constant_2800_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_2800_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2800_0");
  }

  private static void setupBasic_Constant_2800_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2800_0");
  }

  private static void setupBasic_Constant_2800_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2800_1");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_2800_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_2800_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
