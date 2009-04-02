package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.build.packaging.plugin.GenerateTextFromBuild;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SNode;

public class GenerateMPSBuildAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GenerateMPSBuildAction_Action.class);

  public MPSProject project;
  public IOperationContext operationContext;
  public SModelDescriptor modelDescriptor;

  public GenerateMPSBuildAction_Action() {
    super("Generate Build Files", "Generate Build Files And Place Them Into Base Directory", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return GenerateTextFromBuild.getLayout(GenerateMPSBuildAction_Action.this.modelDescriptor) != null;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GenerateMPSBuildAction");
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
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    this.modelDescriptor = event.getData(MPSDataKeys.MODEL);
    if (this.modelDescriptor == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      //       calculate output path
      final SNode layout = GenerateTextFromBuild.getLayout(GenerateMPSBuildAction_Action.this.modelDescriptor);
      GenerateTextFromBuild.generate(layout, GenerateMPSBuildAction_Action.this.modelDescriptor, GenerateMPSBuildAction_Action.this.operationContext, GenerateMPSBuildAction_Action.this.project);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GenerateMPSBuildAction");
    }
  }

}
