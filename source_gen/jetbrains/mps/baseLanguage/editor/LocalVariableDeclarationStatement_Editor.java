package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class LocalVariableDeclarationStatement_Editor extends SemanticNodeEditor {
  public static String PRESENTATION_NAME = "variable declaration";

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createStatementBox(editorContext, node);
  }
  public EditorCell createStatementBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createLocalVariableDeclarationCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, ";"));
    return editorCell;
  }
  public EditorCell createLocalVariableDeclarationCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode localVariableDeclaration = node.getChild("localVariableDeclaration");
    EditorCell editorCell = null;
    if(localVariableDeclaration != null) {
      editorCell = editorContext.createNodeCell(localVariableDeclaration);
      editorCell.setSelectable(false);
    } else 
    {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    }
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
}
