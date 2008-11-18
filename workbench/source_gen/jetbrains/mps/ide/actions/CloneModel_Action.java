package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.dialogs.CloneModelDialog;

public class CloneModel_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(CloneModel_Action.class);
  private static final Icon ICON = null;

  public SModelDescriptor model;
  public IOperationContext context;

  public CloneModel_Action() {
    super("Clone Model", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "shift F5";
  }

  public boolean isApplicable(AnActionEvent event) {
    if (!(new ActionEventData(event).hasOneSelectedItem())) {
      return false;
    }
    IModule module = CloneModel_Action.this.model.getModule();
    if (module instanceof Language) {
      Language language = (Language)module;
      return language.getAspectForModel(CloneModel_Action.this.model) == null;
    } else
    {
      return true;
    }
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CloneModel", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL_DESCRIPTOR);
    if (this.model == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      CloneModelDialog dialog = new CloneModelDialog(CloneModel_Action.this.model, CloneModel_Action.this.context);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CloneModel", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(CloneModel_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
