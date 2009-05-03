package jetbrains.mps.calculator.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;

public class NodeActionsAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeActionsAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.calculator.plugin.NodeActionsAddition";

  public NodeActionsAddition_ActionGroup() {
    super("NodeActionsAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.calculator.plugin.ExecuteCalculator_Action", "jetbrains.mps.calculator");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, null);
  }

}
