package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ProjectAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.custommps.plugin.ProjectAddition_ActionGroup";

  public ProjectAddition_ActionGroup() {
    super("ProjectAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ProjectAddition_ActionGroup.this.addAction("jetbrains.mps.build.custommps.plugin.GenerateCustomMPSBuildForProjectAction_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
