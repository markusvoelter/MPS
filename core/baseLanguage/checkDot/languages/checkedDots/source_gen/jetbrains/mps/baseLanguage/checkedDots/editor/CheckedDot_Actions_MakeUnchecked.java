package jetbrains.mps.baseLanguage.checkedDots.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CheckedDot_Actions_MakeUnchecked {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new CheckedDot_Actions_MakeUnchecked.CheckedDot_Actions_MakeUnchecked_DELETE(node));
  }

  public static class CheckedDot_Actions_MakeUnchecked_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public CheckedDot_Actions_MakeUnchecked_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "delete question mark";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode dotExpression = SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.DotExpression");
      SLinkOperations.setTarget(dotExpression, "operand", SLinkOperations.getTarget(node, "operand", true), true);
      SLinkOperations.setTarget(dotExpression, "operation", SLinkOperations.getTarget(node, "operation", true), true);
      editorContext.selectAndSetCaret(SLinkOperations.getTarget(dotExpression, "operation", true), 0);
    }
  }
}
