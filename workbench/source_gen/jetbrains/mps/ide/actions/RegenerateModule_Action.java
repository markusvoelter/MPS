package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnAction;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class RegenerateModule_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RegenerateModule_Action.class);

  private AnAction action;

  public RegenerateModule_Action(AnAction action_par) {
    super("Regenerate Module", "", ICON);
    this.action = action_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
    this.addPlace(null);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      RegenerateModule_Action.this.action.update(event);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RegenerateModule", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      RegenerateModule_Action.this.action.actionPerformed(event);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RegenerateModule", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(RegenerateModule_Action.class.getName());
    res.append("#");
    res.append(action_State((AnAction)this.action));
    res.append("!");
    return res.toString();
  }

  public static String action_State(AnAction object) {
    return "";
  }
}
