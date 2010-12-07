package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.typesystem.inference.TypeChecker;
import javax.swing.JOptionPane;
import jetbrains.mps.typesystem.uiActions.MyBaseNodeDialog;

public class ShowInferredNodeType_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowInferredNodeType_Action.class);

  private IOperationContext context;
  private Frame frame;
  private SNode node;

  public ShowInferredNodeType_Action() {
    super("Show Inferred Type", "Show type inferred using check only inequations, too", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowInferredNodeType", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.NODE);
    if (this.node == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.context = null;
    this.frame = null;
    this.node = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<SNode> type = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          type.value = TypeChecker.getInstance().getInferredTypeOf(ShowInferredNodeType_Action.this.node);
        }
      });
      if (type.value == null) {
        JOptionPane.showMessageDialog(ShowInferredNodeType_Action.this.frame, "no type");
        return;
      }
      MyBaseNodeDialog dialog;
      dialog = new MyBaseNodeDialog(ShowInferredNodeType_Action.this.context, ShowInferredNodeType_Action.this.node, type.value, null);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowInferredNodeType", t);
    }
  }
}
