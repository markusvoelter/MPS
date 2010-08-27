package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import jetbrains.mps.project.IModule;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vcs.changes.ui.IgnoreUnversionedDialog;

public class IgnoreInVcs_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(IgnoreInVcs_Action.class);

  private List<IModule> modules;
  private Project project;

  public IgnoreInVcs_Action() {
    super("Ignore...", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "IgnoreInVcs", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.modules = event.getData(MPSDataKeys.MODULES);
    if (this.modules == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.modules = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      List<VirtualFile> unversionedFiles =null; //VcsActionsHelper.getUnversionedFilesForModules(IgnoreInVcs_Action.this.project, IgnoreInVcs_Action.this.modules);
      if (ListSequence.fromList(unversionedFiles).isEmpty()) {
        Messages.showInfoMessage(IgnoreInVcs_Action.this.project, "Nothing to ignore", "Ignore..");
        return;
      }
      IgnoreUnversionedDialog.ignoreSelectedFiles(IgnoreInVcs_Action.this.project, unversionedFiles);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "IgnoreInVcs", t);
      }
    }
  }
}
