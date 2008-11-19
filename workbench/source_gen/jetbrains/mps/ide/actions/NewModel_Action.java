package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.dialogs.NewModelDialog;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class NewModel_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(NewModel_Action.class);
  private static final Icon ICON = null;

  public MPSProject project;
  public IOperationContext context;
  public IModule module;

  public NewModel_Action() {
    super("Model", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "NewModel", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.CONTEXT_MODULE);
    if (this.module == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final NewModelDialog[] dialog = new NewModelDialog[1];
      final IOperationContext localContext = NewModel_Action.this.context;
      final IModule localModule = (localContext.getModule() != null ?
        localContext.getModule() :
        NewModel_Action.this.module
      );
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new NewModelDialog(localModule, NewModel_Action.this.getNamespace(), localContext);
        }

      });
      dialog[0].showDialog();
      SModelDescriptor modelDescriptor = dialog[0].getResult();
      NewModel_Action.this.project.getComponentSafe(ProjectPane.class).selectModel(modelDescriptor);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "NewModel", t);
    }
  }

  protected String getNamespace() {
    return null;
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(NewModel_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
