package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.project.NewSolutionAction;
import jetbrains.mps.ide.actions.project.NewLanguageAction;
import jetbrains.mps.ide.actions.project.NewDevKitAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class ProjectNewActions_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.ProjectNewActions";

  public  ProjectNewActions_ActionGroup(MPSProject project) {
    super("New", ProjectNewActions_ActionGroup.ID);
    this.setInternal(false);
    this.add(new NewSolutionAction(), this);
    this.add(new NewLanguageAction(), this);
    this.add(new NewDevKitAction(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(ProjectActions_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(ProjectNewActions_ActionGroup.ID);
      if(gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = ProjectActions_ActionGroup.LABEL_ID_projectNew;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
