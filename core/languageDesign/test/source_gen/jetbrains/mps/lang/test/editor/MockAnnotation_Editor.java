package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class MockAnnotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3037_0(context, node);
  }

  public EditorCell createCollection_3037_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3037_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3037_0(context, node, "<mock"));
    editorCell.addEditorCell(this.createAttributedNodeCell_3037_0(context, node));
    editorCell.addEditorCell(this.createConstant_3037_1(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant_3037_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3037_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3037_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3037_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedNodeCell_3037_0(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_3037_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Collection_3037_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3037_0");
  }

  private static void setupBasic_Constant_3037_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3037_0");
  }

  private static void setupBasic_AttributedNodeCell_3037_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3037_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3037_1");
  }

}
