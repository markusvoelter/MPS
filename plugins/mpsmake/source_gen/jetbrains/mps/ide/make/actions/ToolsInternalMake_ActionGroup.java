package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ToolsInternalMake_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ToolsInternalMake_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.make.actions.ToolsInternalMake_ActionGroup";

  public ToolsInternalMake_ActionGroup() {
    super("ToolsInternalMake", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ToolsInternalMake_ActionGroup.this.addAction("jetbrains.mps.ide.make.actions.BuildAllLanguageDescriptors_Action");
      ToolsInternalMake_ActionGroup.this.addAction("jetbrains.mps.ide.make.actions.BuildAllGenerators_Action");
      ToolsInternalMake_ActionGroup.this.addAction("jetbrains.mps.ide.make.actions.BuildAllStructures_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
