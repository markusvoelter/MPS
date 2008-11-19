package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class ShowInProject_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ShowInProject_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}\\icons\\project.png", "jetbrains.mps.ide"), true);

  public IOperationContext context;
  public SNode node;

  public ShowInProject_Action() {
    super("Show Node In Project", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt F2";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowInProject", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.SNODE);
    if (this.node == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ProjectPane pane = ShowInProject_Action.this.context.getComponent(ProjectPane.class);
      pane.selectNode(ShowInProject_Action.this.node, ShowInProject_Action.this.context);
      pane.getTree().requestFocus();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowInProject", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(ShowInProject_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
