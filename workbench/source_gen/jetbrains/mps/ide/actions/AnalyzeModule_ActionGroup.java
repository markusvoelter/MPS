package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class AnalyzeModule_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(AnalyzeModule_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.AnalyzeModule_ActionGroup";

  public AnalyzeModule_ActionGroup() {
    super("Analyze", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      AnalyzeModule_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AnalyzeClasspath_Action");
      AnalyzeModule_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowModuleDependencies_Action");
      AnalyzeModule_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AnalyzeDependencies_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
