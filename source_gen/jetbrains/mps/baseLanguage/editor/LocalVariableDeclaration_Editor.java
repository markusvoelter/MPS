package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/

public class LocalVariableDeclaration_Editor extends jetbrains.mps.nodeEditor.SemanticNodeEditor {

  public void setSemanticNode(jetbrains.mps.semanticModel.SemanticNode node) {
    super.setSemanticNode(node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createEditorCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    return this.createDeclarationBox(editorContext, node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createDeclarationBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createTypeCell(editorContext, node));
    editorCell.addEditorCell(this.createNameCell(editorContext, node));
    if(jetbrains.mps.baseLanguage.editor.LocalVariableDeclaration_Actions.isTrue_HasInitializer(node)) {
      editorCell.addEditorCell(this.createInitializerArea(editorContext, node));
    }
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createTypeCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode type = node.getReferent("type", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(type != null) {
      editorCell = this.nodeCell(editorContext, type);
    } else {
      editorCell = jetbrains.mps.baseLanguage.editor.LocalVariableDeclaration_Actions.createCustomCell_NullTypeCell(editorContext, node);
    }
    jetbrains.mps.baseLanguage.editor.LocalVariableDeclaration_Actions.setCellActions_TypeActions(editorCell, node);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createNameCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.ModelAccessor modelAccessor = new jetbrains.mps.nodeEditor.PropertyAccessor(node, "name", "?", true);
    jetbrains.mps.nodeEditor.EditorCell_Property editorCell = jetbrains.mps.nodeEditor.EditorCell_Property.create(editorContext, modelAccessor, node);
    jetbrains.mps.baseLanguage.editor.LocalVariableDeclaration_Actions.setCellActions_NameActions(editorCell, node);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createInitializerArea(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "="));
    editorCell.addEditorCell(this.createInitializerCell(editorContext, node));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createInitializerCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode initializer = node.getReferent("initializer", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(initializer != null) {
      editorCell = this.nodeCell(editorContext, initializer);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    jetbrains.mps.baseLanguage.editor.LocalVariableDeclaration_Actions.setCellActions_InitializerActions(editorCell, node);
    return editorCell;
  }
}
