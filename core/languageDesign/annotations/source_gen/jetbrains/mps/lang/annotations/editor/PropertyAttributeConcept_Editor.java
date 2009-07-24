package jetbrains.mps.lang.annotations.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class PropertyAttributeConcept_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_8427_0(context, node);
  }

  public EditorCell createCollection_8427_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8427_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8427_0(context, node, "$("));
    editorCell.addEditorCell(this.createConstant_8427_2(context, node, "property attribute concept"));
    editorCell.addEditorCell(this.createConstant_8427_1(context, node, ")$"));
    return editorCell;
  }

  public EditorCell createConstant_8427_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8427_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8427_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8427_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8427_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8427_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_8427_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8427_0");
  }

  private static void setupBasic_Constant_8427_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8427_0");
  }

  private static void setupBasic_Constant_8427_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8427_1");
  }

  private static void setupBasic_Constant_8427_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8427_2");
  }

}
