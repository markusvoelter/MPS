package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;

public class FindInstancesByConditionGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(FindInstancesByConditionGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionGroup";

  public FindInstancesByConditionGroup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByCondition_Action", "jetbrains.mps.quickQueryLanguage");
      this.addAction("jetbrains.mps.quickQueryLanguage.plugin.ReplacementQueryAction_Action", "jetbrains.mps.quickQueryLanguage");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_find_instances);
  }

}
