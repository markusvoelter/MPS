package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;

public class ShowNodeInExplorer_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowNodeInExplorer_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  private MPSProject project;
  private IOperationContext context;

  public ShowNodeInExplorer_Action() {
    super("Show Node In Explorer", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return " F12";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeInExplorer", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.node = new ActionEventData(event).getNode();
      if (this.node == null) {
        return false;
      }
      this.project = new ActionEventData(event).getMPSProject();
      if (this.project == null) {
        return false;
      }
      this.context = new ActionEventData(event).getOperationContext();
      if (this.context == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      NodeExplorer_Tool tool = this.project.getPluginManager().getTool(NodeExplorer_Tool.class);
      tool.getNodeExplorer().showNode(this.node, this.project);
      tool.openToolLater(true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeInExplorer", t);
    }
  }

}
