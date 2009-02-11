package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class NodeReachable_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant_7119_0(context, node, "reachable");
  }

  public EditorCell createConstant_7119_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7119_0(editorCell, node, context);
    setupLabel_Constant_7119_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_7119_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7119_0");
    transformationTest_StyleSheet.getNodeProperty(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_7119_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
