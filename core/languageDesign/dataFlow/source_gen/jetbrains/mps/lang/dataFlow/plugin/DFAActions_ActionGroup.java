package jetbrains.mps.lang.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class DFAActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DFAActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.dataFlow.plugin.DFAActions";

  public DFAActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.lang.dataFlow.plugin.PrintDFAResult_Action", "jetbrains.mps.lang.dataFlow");
      this.addAction("jetbrains.mps.lang.dataFlow.plugin.PrintInitializationInformation_Action", "jetbrains.mps.lang.dataFlow");
      this.addAction("jetbrains.mps.lang.dataFlow.plugin.PrintReachingDefinintionsInformation_Action", "jetbrains.mps.lang.dataFlow");
      this.addAction("jetbrains.mps.lang.dataFlow.plugin.ShowDFA_Action", "jetbrains.mps.lang.dataFlow");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorInternal_ActionGroup.ID, null);
  }

}
