package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.Build_ActionGroup;

public class InternalChecks_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(InternalChecks_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.custommps.plugin.InternalChecks";

  public InternalChecks_ActionGroup() {
    super("Checks", ID);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
      InternalChecks_ActionGroup.this.addAction("jetbrains.mps.build.custommps.plugin.CheckSamples_Action", "jetbrains.mps.build.custommps");
      InternalChecks_ActionGroup.this.addAction("jetbrains.mps.build.custommps.plugin.CheckCoreRuntimeDeps_Action", "jetbrains.mps.build.custommps");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(Build_ActionGroup.ID, null);
  }
}
