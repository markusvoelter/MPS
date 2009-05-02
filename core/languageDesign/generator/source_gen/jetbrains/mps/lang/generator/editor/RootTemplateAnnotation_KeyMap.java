package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.BootstrapLanguages;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class RootTemplateAnnotation_KeyMap extends EditorCellKeyMap {

  public RootTemplateAnnotation_KeyMap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    action = new RootTemplateAnnotation_KeyMap.RootTemplateAnnotation_KeyMap_Action0();
    this.putAction("ctrl+shift", "VK_H", action);
  }
  public static class RootTemplateAnnotation_KeyMap_Action0 extends EditorCellKeyMapAction {

    public RootTemplateAnnotation_KeyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "add root template annotation";
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
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      if (ListSequence.fromList(selectedNodes).count() != 1) {
        return false;
      }
      SNode applyToNode = SNodeOperations.getContainingRoot(node);
      Language language = applyToNode.getNodeLanguage();
      if (language == BootstrapLanguages.generatorLanguage()) {
        return false;
      }
      return SLinkOperations.getTarget(applyToNode, AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true) == null;
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SLinkOperations.setNewChild(SNodeOperations.getContainingRoot(node), AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), "jetbrains.mps.lang.generator.structure.RootTemplateAnnotation");
    }

    public String getKeyStroke() {
      return "ctrl shift H";
    }

}

}
