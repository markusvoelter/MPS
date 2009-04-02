package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.build.packaging.plugin.GenerateBuildWizard;
import jetbrains.mps.build.packaging.plugin.BuildGeneratorImpl;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;

public class GenerateBuildForProjectAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GenerateBuildForProjectAction_Action.class);

  public MPSProject mpsProject;
  public Project project;

  public GenerateBuildForProjectAction_Action() {
    super("Build Script", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GenerateBuildForProjectAction");
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.mpsProject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsProject == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final GenerateBuildWizard wizard = new GenerateBuildWizard("Generate Build For Project", GenerateBuildForProjectAction_Action.this.project, new BuildGeneratorImpl(GenerateBuildForProjectAction_Action.this.project));
      ApplicationManager.getApplication().invokeLater(new Runnable() {

        public void run() {
          wizard.show();
        }
      }, ModalityState.NON_MODAL);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GenerateBuildForProjectAction");
    }
  }

}
