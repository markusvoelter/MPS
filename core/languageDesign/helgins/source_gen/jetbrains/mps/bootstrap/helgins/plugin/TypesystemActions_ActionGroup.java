package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.nodes.ShowNodeTypeAction;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class TypesystemActions_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(TypesystemActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.bootstrap.helgins.plugin.TypesystemActions";

  public TypesystemActions_ActionGroup(Project project) {
    super("Type System", ID, true, false, null, project);
    this.setPopup(true);
    try {
      this.add(new ShowNodeTypeAction());
      this.add(new GoToTypeErrorRule_Action(project));
      this.add(new ShowRulesWhichAffectNodeType_Action(project));
      this.add(new GoToNodeThisDependsOn_Action(project));
      this.add(new ShowSupertypes_Action(project));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gTo = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(TypesystemActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat);
    }
  }

}
