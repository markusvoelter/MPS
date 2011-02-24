package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ShowNodeIn_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ShowNodeIn_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.devkit.actions.ShowNodeIn_ActionGroup";

  public ShowNodeIn_ActionGroup() {
    super("ShowNodeIn", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ShowNodeIn_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.ShowNodeInExplorer_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
