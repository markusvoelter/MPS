package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.awt.Frame;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.persistence.ui.PersistenceUpdater;

public class UpgradeModelPersistenceInModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(UpgradeModelPersistenceInModel_Action.class);

  private Frame mainFrame;
  private SModelDescriptor modelDescriptor;

  public UpgradeModelPersistenceInModel_Action() {
    super("Upgrade Model Persistence", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
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
        log.error("User's action doUpdate method failed. Action:" + "UpgradeModelPersistenceInModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.mainFrame = event.getData(MPSDataKeys.FRAME);
    if (this.mainFrame == null) {
      return false;
    }
    this.modelDescriptor = event.getData(MPSDataKeys.MODEL);
    if (this.modelDescriptor == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.mainFrame = null;
    this.modelDescriptor = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      PersistenceUpdater persistenceUpdater = new PersistenceUpdater();
      persistenceUpdater.upgradePersistenceInModel(UpgradeModelPersistenceInModel_Action.this.modelDescriptor, UpgradeModelPersistenceInModel_Action.this.mainFrame);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "UpgradeModelPersistenceInModel", t);
      }
    }
  }
}
