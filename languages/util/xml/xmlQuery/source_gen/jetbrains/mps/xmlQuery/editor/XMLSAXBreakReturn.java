package jetbrains.mps.xmlQuery.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class XMLSAXBreakReturn extends EditorCellKeyMap {
  public XMLSAXBreakReturn() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new XMLSAXBreakReturn.XMLSAXBreakReturn_Action0();
    this.putAction("any", "VK_SPACE", action);
  }

  public static class XMLSAXBreakReturn_Action0 extends EditorCellKeyMapAction {
    public XMLSAXBreakReturn_Action0() {
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.xmlQuery.structure.XMLSAXBreakStatement")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SLinkOperations.getTarget(node, "result", true) == null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      if ((SLinkOperations.getTarget(node, "result", true) == null)) {
        SNodeFactoryOperations.setNewChild(node, "result", "jetbrains.mps.baseLanguage.structure.Expression");
      }
    }

    public String getKeyStroke() {
      return " SPACE";
    }
  }
}
