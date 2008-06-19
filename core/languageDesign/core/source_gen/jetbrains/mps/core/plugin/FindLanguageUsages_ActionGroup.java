package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;

public class FindLanguageUsages_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(FindLanguageUsages_ActionGroup.class);
  public static final String ID = "jetbrains.mps.core.plugin.FindLanguageUsages";

  public FindLanguageUsages_ActionGroup(Project project) {
    super("", ID, true, false, null, project);
    this.setPopup(false);
    try {
      this.add(new FindLanguageUsages_Action(project));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gTo = ActionUtils.getGroup(LanguageActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(FindLanguageUsages_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat);
    }
  }

}
