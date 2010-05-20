package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.MPSModuleRepository;

public class UpgradeModulePersistenceGlobally_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(UpgradeModulePersistenceGlobally_Action.class);

  public UpgradeModulePersistenceGlobally_Action() {
    super("Upgrade Modules Persistence", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "UpgradeModulePersistenceGlobally", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      for (IModule module : ListSequence.fromList(MPSModuleRepository.getInstance().getAllModules())) {
        if (module.isPackaged()) {
          continue;
        }
        module.save();
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "UpgradeModulePersistenceGlobally", t);
      }
    }
  }
}
