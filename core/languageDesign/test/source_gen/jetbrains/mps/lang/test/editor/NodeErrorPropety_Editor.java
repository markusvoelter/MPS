package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class NodeErrorPropety_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant_5493_0(context, node, "has error");
  }

  public EditorCell createConstant_5493_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5493_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_5493_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5493_0");
    transformationTest_StyleSheet.getNodeProperty(editorCell).apply(editorCell);
  }

}
