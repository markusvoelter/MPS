package jetbrains.mps.lang.editor.editorTest.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class ReferenceAnnotataion_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6697_0(context, node);
  }

  public EditorCell createCollection_6697_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_6697_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_6697_0(context, node, "<ref"));
    editorCell.addEditorCell(this.createAttributedLinkCell_6697_0(context, node));
    editorCell.addEditorCell(this.createConstant_6697_1(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant_6697_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6697_0(editorCell, node, context);
    setupLabel_Constant_6697_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6697_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6697_1(editorCell, node, context);
    setupLabel_Constant_6697_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedLinkCell_6697_0(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedLinkCell();
    setupBasic_AttributedLinkCell_6697_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Collection_6697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6697_0");
  }

  private static void setupBasic_Constant_6697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6697_0");
  }

  private static void setupBasic_Constant_6697_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6697_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_AttributedLinkCell_6697_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6697_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6697_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
