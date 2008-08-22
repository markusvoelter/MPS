package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.dialogs.NewGeneratorDialog;
import jetbrains.mps.smodel.ModelAccess;

public class NewGenerator_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(NewGenerator_Action.class);
  public static final Icon ICON = null;

  public Frame frame;

  public NewGenerator_Action() {
    super("New Generator", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    ActionEventData data = new ActionEventData(event);
    IModule module = data.getModule();
    return module != null && module instanceof Language;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "NewGenerator", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.frame = event.getData(MPSDataKeys.FRAME);
      if (this.frame == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ActionEventData data = new ActionEventData(event);
      final Language language = (Language)data.getModule();
      final Frame localFrame = NewGenerator_Action.this.frame;
      final NewGeneratorDialog[] dialog = new NewGeneratorDialog[1];
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new NewGeneratorDialog(localFrame, language);
        }

      });
      dialog[0].showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "NewGenerator", t);
    }
  }

}
