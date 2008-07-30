package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.newDevkitDialog.NewDevKitDialog;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.awt.Frame;

public class NewDevKit_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(NewDevKit_Action.class);
  public static final Icon ICON = null;

  public Frame frame;
  public MPSProject project;

  public NewDevKit_Action() {
    super("New DevKit", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "NewDevKit", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.frame = event.getData(MPSDataKeys.FRAME);
      if (this.frame == null) {
        return false;
      }
      this.project = event.getData(MPSDataKeys.MPS_PROJECT);
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      NewDevKitDialog dialog = new NewDevKitDialog(this.frame);
      dialog.setProject(this.project);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "NewDevKit", t);
    }
  }

}
