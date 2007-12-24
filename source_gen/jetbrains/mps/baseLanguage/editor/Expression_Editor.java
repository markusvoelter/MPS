package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import java.awt.Color;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.CaretPosition;

public class Expression_Editor extends DefaultNodeEditor {

  public static Color _QueryFunction_Color_1198492287183(SNode node, EditorContext editorContext) {
    return new Color(255, 127, 127, 50);
  }

  private static void setupBasic_CellModel_ModelAccess(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1198491420655");
    if(true) {
    }
  }

  private static void setupLabel_CellModel_ModelAccess(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(Color.red);
    editorCell.getTextLine().setTextBackgroundColor(Expression_Editor._QueryFunction_Color_1198492287183(node, context));
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellModel_ModelAccess(context, node);
  }

  public EditorCell createCellModel_ModelAccess(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1198491420655(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    Expression_Editor.setupBasic_CellModel_ModelAccess(editorCell, node, context);
    Expression_Editor.setupLabel_CellModel_ModelAccess(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setDefaultCaretPosition(CaretPosition.FIRST);
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1198491420655(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        return "<" + node.getRole_() + ">";
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return false;
      }

    };
  }

}
