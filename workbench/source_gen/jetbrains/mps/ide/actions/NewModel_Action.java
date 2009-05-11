package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.dialogs.project.creation.NewModelDialog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class NewModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(NewModel_Action.class);

  public Frame frame;
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
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "NewModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
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
      if (NewModel_Action.this.module.getSModelRoots().size() == 0) {
        JOptionPane.showMessageDialog(NewModel_Action.this.frame, "Can't create a model in solution with no module roots", "Can't create model", JOptionPane.ERROR);
      }
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
      SModelDescriptor result = dialog[0].getResult();
      if (result != null) {
        SModelDescriptor modelDescriptor = result;
        NewModel_Action.this.project.getComponentSafe(ProjectPane.class).selectModel(modelDescriptor);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "NewModel", t);
      }
    }
  }

  protected String getNamespace() {
    return null;
  }

}
