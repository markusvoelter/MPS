package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ProjectOperationContext;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Aug 25, 2005
 * Time: 5:18:23 PM
 * To change this template use File | Settings | File Templates.
 */
class ProjectTreeNode extends MPSTreeNode {

  ProjectTreeNode(MPSProject project) {
    super(new ProjectOperationContext(project));

    setIcon(Icons.PROJECT_ICON);
    setNodeIdentifier("Project");
  }

  public JPopupMenu getQuickCreatePopupMenu() {
    JPopupMenu result = new JPopupMenu();
    ActionManager.instance().getGroup(ProjectPane.PROJECT_NEW).add(result, new ActionContext(getOperationContext()));
    return result;
  }

  public JPopupMenu getPopupMenu() {
    JPopupMenu result = new JPopupMenu();
    ActionManager.instance().getGroup(ProjectPane.PROJECT_PANE_PROJECT_ACTIONS).add(result, new ActionContext(getOperationContext()));
    return result;
  }
}
