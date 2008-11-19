package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class GoToConceptDeclaration_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(GoToConceptDeclaration_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}\\icons\\structure.png", "jetbrains.mps.ide"), true);

  private SNode node;
  public IOperationContext context;

  public GoToConceptDeclaration_Action() {
    super("Go To Concept Declaration", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift S";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToConceptDeclaration", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
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
      SNode concept = SNodeOperations.getConceptDeclaration(GoToConceptDeclaration_Action.this.node);
      GoToConceptDeclaration_Action.this.context.getComponent(MPSEditorOpener.class).openNode(concept);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToConceptDeclaration", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(GoToConceptDeclaration_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
