package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class ReplacementQueryActionWithNode_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ReplacementQueryActionWithNode_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  public IOperationContext context;
  public IModule langModule;

  public ReplacementQueryActionWithNode_Action() {
    super("Replace Instances", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ReplacementQueryActionWithNode", t);
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
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"))) {
          node = null;
        }
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
    this.langModule = event.getData(MPSDataKeys.MODULE);
    if (this.langModule == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ReplaceDialog dialog = new ReplaceDialog(new FindInstancesContext(ReplacementQueryActionWithNode_Action.this.context), (Language) ReplacementQueryActionWithNode_Action.this.langModule);
      dialog.setConceptDeclaration(ReplacementQueryActionWithNode_Action.this.node);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ReplacementQueryActionWithNode", t);
    }
  }

}
