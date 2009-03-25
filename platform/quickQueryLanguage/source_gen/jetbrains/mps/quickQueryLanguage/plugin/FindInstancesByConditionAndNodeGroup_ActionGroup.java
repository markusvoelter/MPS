package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class FindInstancesByConditionAndNodeGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(FindInstancesByConditionAndNodeGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNodeGroup";

  public FindInstancesByConditionAndNodeGroup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNode_Action", "jetbrains.mps.quickQueryLanguage");
      this.addAction("jetbrains.mps.quickQueryLanguage.plugin.ReplacementQueryActionWithNode_Action", "jetbrains.mps.quickQueryLanguage");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, NodeActions_ActionGroup.LABEL_ID_find_instances);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_find_instances);
  }

}
