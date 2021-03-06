package jetbrains.mps.baseLanguage.javadoc.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;

public class TextCommentLinePart_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_x1gmbt_a(editorContext, node);
  }

  private EditorCell createCollection_x1gmbt_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_x1gmbt_a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.addEditorCell(this.createModelAccess_x1gmbt_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createModelAccess_x1gmbt_a0(final EditorContext editorContext, final SNode node) {
    ModelAccessor modelAccessor = new ModelAccessor() {
      public String getText() {
        return SPropertyOperations.getString(node, "text");
      }

      public void setText(String text) {
        SPropertyOperations.set(node, "text", text);
        TextCommentPartUtil.processCellText(editorContext, node, text);
      }

      public boolean isValidText(String text) {
        return true;
      }
    };
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ModelAccess_x1gmbt_a0");
    editorCell.addKeyMap(new TextCommentLinePart_KeyMap());
    editorCell.setDefaultText("");
    return editorCell;
  }
}
