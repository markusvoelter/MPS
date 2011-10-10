package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ProjectNewActionsEx_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectNewActionsEx_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.devkit.actions.ProjectNewActionsEx_ActionGroup";

  public ProjectNewActionsEx_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ProjectNewActionsEx_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.NewLanguage_Action");
      ProjectNewActionsEx_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.NewDevKit_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
