package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.Solution;
import jetbrains.mps.workbench.actions.model.OptimizeImportsHelper;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.reloading.ClassLoaderManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.ide.dialogs.ScrollingMessageDialog;

public class OptimizeModuleImports_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(OptimizeModuleImports_Action.class);

  private IOperationContext context;
  private IModule module;
  private Frame frame;

  public OptimizeModuleImports_Action() {
    super("Optimize Imports", "", ICON);
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
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "OptimizeModuleImports", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<String> report = new Wrappers._T<String>("");
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          if (OptimizeModuleImports_Action.this.module instanceof Solution) {
            report.value = OptimizeImportsHelper.optimizeSolutionImports(OptimizeModuleImports_Action.this.context, ((Solution)OptimizeModuleImports_Action.this.module));
          } else if (OptimizeModuleImports_Action.this.module instanceof Language) {
            report.value = OptimizeImportsHelper.optimizeLanguageImports(OptimizeModuleImports_Action.this.context, ((Language)OptimizeModuleImports_Action.this.module));
          }
        }
      });
      ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
      new ScrollingMessageDialog(OptimizeModuleImports_Action.this.frame, report.value).showDialog();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "OptimizeModuleImports", t);
      }
    }
  }
}
