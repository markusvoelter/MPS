package jetbrains.mps.bootstrap.editorLanguage.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.structureLanguage.behavior.LinkDeclaration_Behavior;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.AbstractEditorComponent;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class CopyThisDown_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CopyThisDown_Action.class);
  public static final Icon ICON = null;

  private SNode inputNode;
  public AbstractEditorComponent editor;

  public CopyThisDown_Action() {
    super("Duplicate Node", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl D";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CopyThisDown", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      {
        SNode node = event.getData(MPSDataKeys.SNODE);
        if (node != null) {
        }
        this.inputNode = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.inputNode == null) {
        return false;
      }
      this.editor = event.getData(MPSDataKeys.EDITOR_COMPONENT);
      if (this.editor == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode nodeToCopy = this.inputNode;
      while (SNodeOperations.getParent(nodeToCopy, null, false, false) != null) {
        SNode parent = SNodeOperations.getParent(nodeToCopy, null, false, false);
        String role = nodeToCopy.getRole_();
        SNode link = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
        if (link == null) {
          return;
        }
        if (!(LinkDeclaration_Behavior.call_isSingular_1213877254557(link))) {
          SNode copy = SNodeOperations.copyNode(nodeToCopy);
          parent.insertChild(nodeToCopy, role, copy);
          this.editor.getEditorContext().selectWRTFocusPolicy(copy);
          return;
        }
        nodeToCopy = parent;
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CopyThisDown", t);
    }
  }

}
