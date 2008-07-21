package jetbrains.mps.bootstrap.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class DFAActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(DFAActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.bootstrap.dataFlow.plugin.DFAActions";

  public DFAActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new PrintDFAResult_Action());
      this.add(new PrintInitializationInformation_Action());
      this.add(new PrintReachingDefinintionsInformation_Action());
      this.add(new ShowDFA_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorInternal_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(DFAActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
