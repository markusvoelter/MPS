package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class InstanceOfExpression_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createExpressionBox(editorContext, node);
  }
  public EditorCell createExpressionBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    InstanceOfExpression_NodeBoxActions.setCellActions(editorCell, node);
    if(Aspects.semanticNodeCondition_ParentIsExpression(node)) {
      editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    }
    editorCell.addEditorCell(this.createLeftExpressionCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, "instanceof"));
    editorCell.addEditorCell(this.createJavaClassTypeCell(editorContext, node));
    if(Aspects.semanticNodeCondition_ParentIsExpression(node)) {
      editorCell.addEditorCell(this.createConstantCell2(editorContext, node, ")"));
    }
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public EditorCell createLeftExpressionCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode leftExpression = node.getReferent("leftExpression", (SemanticNode)null);
    EditorCell editorCell = null;
    if(leftExpression != null) {
      editorCell = this.nodeCell(editorContext, leftExpression);
      editorCell.setSelectable(true);
      InstanceOfExpression_LeftExpressionsActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      InstanceOfExpression_LeftExpressionsActions.setCellActions(editorCell, node);
      _DefErrorActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createJavaClassTypeCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode javaClassType = node.getReferent("javaClassType", (SemanticNode)null);
    EditorCell editorCell = null;
    if(javaClassType != null) {
      editorCell = this.nodeCell(editorContext, javaClassType);
      editorCell.setSelectable(true);
      InstanceOfExpression_InstanceOfTypes.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      InstanceOfExpression_InstanceOfTypes.setCellActions(editorCell, node);
      _DefErrorActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
}
