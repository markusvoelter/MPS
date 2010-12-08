package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TryStatement_FinallyBlock_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new TryStatement_FinallyBlock_Actions.TryStatement_FinallyBlock_Actions_DELETE(node));
  }

  public static class TryStatement_FinallyBlock_Actions_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public TryStatement_FinallyBlock_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "remove finally ";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "catchClause", true)).isNotEmpty()) {
        SNode tryCatchStatement = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.TryCatchStatement");
        SLinkOperations.setTarget(tryCatchStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
        ListSequence.fromList(SLinkOperations.getTargets(tryCatchStatement, "catchClause", true)).clear();
        ListSequence.fromList(SLinkOperations.getTargets(tryCatchStatement, "catchClause", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "catchClause", true)));
        SNodeOperations.deleteNode(node);
      }
    }
  }
}
