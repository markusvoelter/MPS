package jetbrains.mps.bootstrap.editorLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.Edit_ActionGroup;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class EditorActions_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(EditorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.bootstrap.editorLanguage.plugin.EditorActions";

  public EditorActions_ActionGroup(Project project) {
    super("", ID, true, false, null, project);
    this.setPopup(false);
    try {
      this.add(new CopyThisDown_Action(project));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gTo = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(EditorActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat);
    }
    {
      BaseGroup gTo = ActionUtils.getGroup(Edit_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(EditorActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = Edit_ActionGroup.LABEL_ID_custom;
        gTo.add(gWhat, new Constraints(Anchor.AFTER, labelName));
      }
    }
  }

}
