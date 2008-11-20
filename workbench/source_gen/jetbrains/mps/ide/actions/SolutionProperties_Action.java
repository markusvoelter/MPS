package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Solution;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.dialogs.SolutionPropertiesDialog;
import jetbrains.mps.smodel.ModelAccess;

public class SolutionProperties_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(SolutionProperties_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}\\icons\\solutionProperties.png", "jetbrains.mps.ide"), true);

  public IOperationContext context;

  public SolutionProperties_Action() {
    super("Solution Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt ENTER";
  }

  public boolean isApplicable(AnActionEvent event) {
    IModule module = SolutionProperties_Action.this.context.getModule();
    return module instanceof Solution;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    if (ActionPlaces.PROJECT_VIEW_POPUP.equals(event.getPlace()) && isApplicable(event)) {
      enable(event.getPresentation());
    } else {
      disable(event.getPresentation());
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
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final IOperationContext localContext = SolutionProperties_Action.this.context;
      final Solution solution = (Solution)SolutionProperties_Action.this.context.getModule();
      final SolutionPropertiesDialog[] dialog = new SolutionPropertiesDialog[1];
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new SolutionPropertiesDialog(solution, localContext);
        }

      });
      dialog[0].showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "SolutionProperties", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(SolutionProperties_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
