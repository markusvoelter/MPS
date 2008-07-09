package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.project.NewSolutionAction;
import jetbrains.mps.ide.actions.project.NewLanguageAction;
import jetbrains.mps.ide.actions.project.NewDevKitAction;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class ProjectNewActions_ActionGroup extends BaseGroup {
  public static Logger LOG = Logger.getLogger(ProjectNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectNewActions";

  public ProjectNewActions_ActionGroup() {
    super("New", ID, true, false, null);
    this.setPopup(true);
    try {
      this.add(new NewSolutionAction());
      this.add(new NewLanguageAction());
      this.add(new NewDevKitAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ProjectNewActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = ProjectActions_ActionGroup.LABEL_ID_projectNew;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
