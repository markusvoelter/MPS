package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class CloneRoot_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CloneRoot_Action.class);
  public static final Icon ICON = null;

  private MPSProject project;
  private SNode node;

  public CloneRoot_Action() {
    super("Clone Root", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "shift F5";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CloneRoot", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.project = new ActionEventData(event).getMPSProject();
      if (this.project == null) {
        return false;
      }
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode root = SNodeOperations.getContainingRoot(this.node);
      SNode copy = SNodeOperations.copyNode(root);
      SModelOperations.addRootNode(SNodeOperations.getModel(root), copy);
      this.project.getComponentSafe(MPSEditorOpener.class).openNode(copy);
      this.project.getComponentSafe(ProjectPane.class).selectNode(copy);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CloneRoot", t);
    }
  }

}
