package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.intellij.openapi.util.Computable;

public class GenerateMPSBuildAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GenerateMPSBuildAction_Action.class);

  private Project project;
  private IOperationContext operationContext;
  private SModelDescriptor modelDescriptor;

  public GenerateMPSBuildAction_Action() {
    super("Generate Build Files", "Generate Build Files And Place Them Into Base Directory", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return GenerateMPSBuildAction_Action.this.getMPSLayout() != null && GenerateMPSBuildAction_Action.this.modelDescriptor instanceof EditableSModelDescriptor;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GenerateMPSBuildAction", t);
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
    this.modelDescriptor = event.getData(MPSDataKeys.MODEL);
    if (this.modelDescriptor == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.operationContext = null;
    this.modelDescriptor = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      // calculate output path 
      final SNode layout = GenerateMPSBuildAction_Action.this.getMPSLayout();
      final Wrappers._T<SNode> configuration = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          configuration.value = ListSequence.fromList(SLinkOperations.getTargets(layout, "configuration", true)).first();
        }
      });
      GenerateTextFromBuild.generate(configuration.value, ((EditableSModelDescriptor) GenerateMPSBuildAction_Action.this.modelDescriptor), GenerateMPSBuildAction_Action.this.operationContext, GenerateMPSBuildAction_Action.this.project, true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GenerateMPSBuildAction", t);
    }
  }

  private SNode getMPSLayout() {
    return ModelAccess.instance().runReadAction(new Computable<SNode>() {
      public SNode compute() {
        return GenerateTextFromBuild.getLayout(GenerateMPSBuildAction_Action.this.modelDescriptor);
      }
    });
  }
}
