package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class LineEndRegexp_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_9140_0(context, node);
  }

  public EditorCell createCollection_9140_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_9140_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_9140_0(context, node, "$"));
    return editorCell;
  }

  public EditorCell createConstant_9140_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9140_0(editorCell, node, context);
    setupLabel_Constant_9140_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_9140_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9140_0");
  }

  private static void setupBasic_Constant_9140_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9140_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_9140_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
