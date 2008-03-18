package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.bootstrap.editorLanguage.structure.EditorCellModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class _OpenTag extends AbstractCellProvider {

  public  _OpenTag(SNode node) {
    super(node);
  }

  public static Color _QueryFunction_Color_1177490702142(SNode node, EditorContext editorContext) {
    return _EditorUtil.grayIfNotSelectable(node);
  }

  private static void setupBasic_CellModel_ModelAccess(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176716878596");
    editorCell.setDrawBorder(true);
    editorCell.setCellBackgroundColor(_OpenTag._QueryFunction_Color_1177490702142(node, context));
  }

  private static void setupLabel_CellModel_ModelAccess(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
  }


  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellModel_ModelAccess(context, node);
  }

  public EditorCell createCellModel_ModelAccess(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1176716878596(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    _OpenTag.setupBasic_CellModel_ModelAccess(editorCell, node, context);
    _OpenTag.setupLabel_CellModel_ModelAccess(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1176716878596(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        return EditorCellTags.getOpeningText((((EditorCellModel)SNodeOperations.getAdapter(node))));
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

}
