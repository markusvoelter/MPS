package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class CastExpression_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createRowCell(editorContext, node);
  }
  public EditorCell createRowCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    editorCell.addEditorCell(this.createTypeCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ")"));
    editorCell.addEditorCell(this.createExpressionCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode type = node.getReferent("type", (SemanticNode)null);
    EditorCell editorCell = null;
    if(type != null) {
      editorCell = this.nodeCell(editorContext, type);
      CastExpression_CastTypeActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      CastExpression_CastTypeActions.setCellActions(editorCell, node);
      _DefErrorActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createExpressionCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode expression = node.getReferent("expression", (SemanticNode)null);
    EditorCell editorCell = null;
    if(expression != null) {
      editorCell = this.nodeCell(editorContext, expression);
      CastExpression_CastExpressionActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      CastExpression_CastExpressionActions.setCellActions(editorCell, node);
      _DefErrorActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
}
