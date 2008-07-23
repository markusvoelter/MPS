package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;

public class CellMenuPart_Abstract_Editor extends DefaultNodeEditor {

  private static void setupBasic_Error_11648414107651164841410765(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Error_1164841410765");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Error_1164841410765_1164841410765(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1164841410765(context, node);
  }

  public EditorCell createError1164841410765(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "<choose menu part>");
    setupBasic_Error_11648414107651164841410765(editorCell, node, context);
    setupLabel_Error_1164841410765_1164841410765(editorCell, node, context);
    return editorCell;
  }

}
