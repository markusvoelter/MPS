package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class ConstructorDeclaration_Editor extends SemanticNodeEditor {

  private EditorCellListHandler myParameterListHandler;

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
    myParameterListHandler = new ConstructorDeclaration_Editor_ParameterListHandler(node, "parameter", "aggregation");
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createMethodBox(editorContext, node);
  }
  public EditorCell createMethodBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    ConstructorDeclaration_NodeBoxActions.setCellActions(editorCell, node);
    editorCell.addEditorCell(this.createHeaderRow(editorContext, node));
    editorCell.addEditorCell(this.createBodyArea(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "}"));
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstructorName(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    editorCell.addEditorCell(this.createParametersList(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ")"));
    return editorCell;
  }
  public EditorCell createConstructorName(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = Aspects.createModelAccessor_ConstructorDeclarationName(node);
    EditorCell editorCell = null;
    if(modelAccessor != null) {
      editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
      editorCell.setSelectable(true);
      ((EditorCell_Label)editorCell).setEditable(false);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public EditorCell createParametersList(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection cellCollection = myParameterListHandler.createCells_Horizontal(editorContext);
    cellCollection.setGridLayout(false);
    return cellCollection;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public EditorCell createBodyArea(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell(editorContext, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createIndentCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode body = node.getReferent("body", (SemanticNode)null);
    EditorCell editorCell = null;
    if(body != null) {
      editorCell = this.nodeCell(editorContext, body);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
}
