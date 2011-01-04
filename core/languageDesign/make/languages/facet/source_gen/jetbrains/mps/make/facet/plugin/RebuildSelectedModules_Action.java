package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.List;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;

public class RebuildSelectedModules_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(RebuildSelectedModules_Action.class);

  public RebuildSelectedModules_Action() {
    super("Rebuild Module", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    String text = new MakeActionParameters(((IOperationContext) MapSequence.fromMap(_params).get("context")), null, null, ((List<IModule>) MapSequence.fromMap(_params).get("modules")), ((IModule) MapSequence.fromMap(_params).get("cmodule"))).actionText(true);
    if (text != null) {
      event.getPresentation().setText(text);
      return true;
    }
    return false;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RebuildSelectedModules", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("modules", event.getData(MPSDataKeys.MODULES));
    MapSequence.fromMap(_params).put("cmodule", event.getData(MPSDataKeys.CONTEXT_MODULE));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      new MakeActionImpl(((IOperationContext) MapSequence.fromMap(_params).get("context")), new MakeActionParameters(((IOperationContext) MapSequence.fromMap(_params).get("context")), null, null, ((List<IModule>) MapSequence.fromMap(_params).get("modules")), ((IModule) MapSequence.fromMap(_params).get("cmodule"))), true).executeAction();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RebuildSelectedModules", t);
    }
  }
}
