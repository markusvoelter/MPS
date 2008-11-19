package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;

public class RevertMemoryChanges_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(RevertMemoryChanges_Action.class);
  private static final Icon ICON = null;

  public SModelDescriptor model;

  public RevertMemoryChanges_Action() {
    super("Revert Memory Changes", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RevertMemoryChanges", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL_DESCRIPTOR);
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      RevertMemoryChanges_Action.this.model.reloadFromDisk();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RevertMemoryChanges", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(RevertMemoryChanges_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
