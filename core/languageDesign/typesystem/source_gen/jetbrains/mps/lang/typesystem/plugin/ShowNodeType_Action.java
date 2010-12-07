package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.JOptionPane;
import jetbrains.mps.typesystem.uiActions.MyBaseNodeDialog;
import jetbrains.mps.errors.IErrorReporter;

public class ShowNodeType_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${language_descriptor}/icons/types.png", "jetbrains.mps.lang.typesystem"), true);
  private static Logger LOG = Logger.getLogger(ShowNodeType_Action.class);

  private IOperationContext context;
  private Frame frame;
  private SNode node;
  private EditorComponent editorComponent;

  public ShowNodeType_Action() {
    super("Show Type", "Show node's HELGINS type", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl shift T";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeType", t);
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
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.context = null;
    this.frame = null;
    this.node = null;
    this.editorComponent = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<TypeCheckingContext> typeCheckingContext = new Wrappers._T<TypeCheckingContext>();
      final Wrappers._T<SNode> type = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          typeCheckingContext.value = ShowNodeType_Action.this.editorComponent.getTypeCheckingContext();
          type.value = typeCheckingContext.value.getTypeDontCheck(ShowNodeType_Action.this.node);
        }
      });
      if (type.value == null) {
        JOptionPane.showMessageDialog(ShowNodeType_Action.this.frame, "no type");
        return;
      }
      MyBaseNodeDialog dialog;
      final Wrappers._T<IErrorReporter> reporter = new Wrappers._T<IErrorReporter>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          reporter.value = typeCheckingContext.value.getTypeMessageDontCheck(ShowNodeType_Action.this.node);
        }
      });
      dialog = new MyBaseNodeDialog(ShowNodeType_Action.this.context, ShowNodeType_Action.this.node, type.value, reporter.value);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeType", t);
    }
  }
}
