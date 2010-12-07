package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.project.Project;
import java.awt.Frame;
import jetbrains.mps.ide.actions.StratergyAddMethodDialog;
import jetbrains.mps.ide.actions.AddClassMethodStrategy;
import jetbrains.mps.ide.actions.MethodsToImplementStrategy;
import jetbrains.mps.ide.actions.ImplementMethodStrategy;

public class ImplementMethod_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ImplementMethod_Action.class);

  private SNode selectedNode;
  private EditorContext editorContext;
  private IOperationContext operationContext;

  public ImplementMethod_Action() {
    super("Implement Method...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
    this.setMnemonic("I".charAt(0));
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl I";
  }

  public boolean isApplicable(AnActionEvent event) {
    return !(ImplementMethod_Action.this.editorContext.isInspector()) && (SNodeOperations.getAncestor(ImplementMethod_Action.this.selectedNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false) != null);
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ImplementMethod", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.selectedNode = node;
    }
    if (this.selectedNode == null) {
      return false;
    }
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.selectedNode = null;
    this.editorContext = null;
    this.operationContext = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Project project = ImplementMethod_Action.this.operationContext.getProject();
      Frame frame = ImplementMethod_Action.this.editorContext.getMainFrame();
      new StratergyAddMethodDialog(ImplementMethod_Action.this.editorContext, frame, new AddClassMethodStrategy(ImplementMethod_Action.this.selectedNode), new MethodsToImplementStrategy(), new ImplementMethodStrategy(project)).showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ImplementMethod", t);
    }
  }
}
