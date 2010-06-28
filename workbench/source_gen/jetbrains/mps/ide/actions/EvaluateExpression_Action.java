package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.workbench.MPSDataKeys;

public class EvaluateExpression_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/debug/evaluate.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(EvaluateExpression_Action.class);

  private Project project;
  private IOperationContext operationContext;

  public EvaluateExpression_Action() {
    super("Evaluate Expression", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "alt F8";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        AbstractDebugSession debugSession = DebugActionsUtil.getDebugSession(event);
        event.getPresentation().setEnabled(debugSession != null && debugSession.isStepEnabled() && debugSession.canShowEvaluationDialog());
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "EvaluateExpression", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.operationContext = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      DebugActionsUtil.getDebugSession(event).showEvaluationDialog(EvaluateExpression_Action.this.operationContext);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "EvaluateExpression", t);
      }
    }
  }
}
