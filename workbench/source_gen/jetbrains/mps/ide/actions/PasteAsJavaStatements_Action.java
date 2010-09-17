package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.datatransfer.JavaPaster;
import jetbrains.mps.javaParser.FeatureKind;

public class PasteAsJavaStatements_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(PasteAsJavaStatements_Action.class);

  private IOperationContext operationContext;
  private SNode anchorNode;

  public PasteAsJavaStatements_Action() {
    super("Paste As Java Statements", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "PasteAsJavaStatements", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    this.anchorNode = event.getData(MPSDataKeys.NODE);
    if (this.anchorNode == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.operationContext = null;
    this.anchorNode = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      new JavaPaster().pasteJava(PasteAsJavaStatements_Action.this.anchorNode, PasteAsJavaStatements_Action.this.operationContext, FeatureKind.STATEMENTS);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "PasteAsJavaStatements", t);
      }
    }
  }
}
