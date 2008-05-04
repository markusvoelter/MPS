package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class SNodeTypeCastExpression_Concept_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new SNodeTypeCastExpression_Concept_Actions.SNodeTypeCastExpression_Concept_Actions_DELETE(node));
  }

  public static class SNodeTypeCastExpression_Concept_Actions_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public SNodeTypeCastExpression_Concept_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "replace type case with left expression";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, "leftExpression", true));
    }

}

}
