package jetbrains.mps.lang.test.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class EditorInternalAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorInternalAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.test.plugin.EditorInternalAddition_ActionGroup";

  public EditorInternalAddition_ActionGroup() {
    super("EditorInternalAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      EditorInternalAddition_ActionGroup.this.addAction("jetbrains.mps.lang.test.plugin.RunTestInMPS_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
