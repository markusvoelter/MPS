package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.refactoring.inlineMethod.InlineMethodRefactoringAnalyzer;
import jetbrains.mps.baseLanguage.refactoring.inlineMethod.InlineMethodDialog;

public class InlineMethod_Action extends CurrentProjectAction {
  public static final Logger LOG = Logger.getLogger(InlineMethod_Action.class);
  public static final Icon ICON = null;

  private SNode node;

  public InlineMethod_Action(Project project) {
    super(project, "Inline method", "", ICON, true, false, true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt N";
  }

  public void dodoUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        final SNode node = new ActionEventData(event).getNode();
        final Wrappers._T<Boolean> b = new Wrappers._T<Boolean>(false);
        ModelAccess.instance().runReadAction(new Runnable() {

          public void run() {
            b.value = InlineMethodRefactoringAnalyzer.isMethodNode(node);
          }

        });
        this.setVisible(event.getPresentation(), b.value);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "InlineMethod", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean fillFieldsIfNecessary(AnActionEvent event) {
    try {
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      InlineMethodDialog dialog = new InlineMethodDialog(new ActionEventData(event));
      dialog.tryToShow();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "InlineMethod", t);
    }
  }

}
