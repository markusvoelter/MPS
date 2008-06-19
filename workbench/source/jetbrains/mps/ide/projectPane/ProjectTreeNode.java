package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.workbench.action.ActionUtils;

import javax.swing.JPopupMenu;

class ProjectTreeNode extends MPSTreeNode {

  ProjectTreeNode(MPSProject project) {
    super(new ProjectOperationContext(project));

    setIcon(Icons.PROJECT_ICON);
    setNodeIdentifier("Project");
  }

  public JPopupMenu getQuickCreatePopupMenu() {
    return ActionUtils.createPopup(ProjectPane.PROJECT_NEW_ACTIONS);
  }

  public JPopupMenu getPopupMenu() {
    return ActionUtils.createPopup(ProjectPane.PROJECT_PANE_PROJECT_ACTIONS);
  }
}
