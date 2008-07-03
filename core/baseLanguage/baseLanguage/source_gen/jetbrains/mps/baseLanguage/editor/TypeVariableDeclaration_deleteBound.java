package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class TypeVariableDeclaration_deleteBound {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new TypeVariableDeclaration_deleteBound.TypeVariableDeclaration_deleteBound_DELETE(node));
  }

  public static class TypeVariableDeclaration_deleteBound_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public TypeVariableDeclaration_deleteBound_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SLinkOperations.getTargets(node, "auxBounds", true).clear();
      SLinkOperations.setTarget(node, "bound", null, true);
    }

}

}
