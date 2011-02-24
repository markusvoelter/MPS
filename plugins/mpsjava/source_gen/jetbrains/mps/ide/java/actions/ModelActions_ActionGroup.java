package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ModelActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.java.actions.ModelActions_ActionGroup";

  public ModelActions_ActionGroup() {
    super("ModelActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.java.actions.PasteAsJavaClass_Action");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.java.actions.GetModelContentsFromSource_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
