package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import com.intellij.openapi.project.Project;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.smodel.IOperationContext;

public class ShowTypeSystemTraceIncremental_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowTypeSystemTraceIncremental_Action.class);

  public ShowTypeSystemTraceIncremental_Action() {
    super("Show Incremental Typesystem Trace", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowTypeSystemTraceIncremental", t);
      }
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
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      TypeCheckingContext typeCheckingContext;
      typeCheckingContext = ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).getTypeCheckingContext();
      if (typeCheckingContext instanceof TypeCheckingContextNew) {
        TypeCheckingContextNew tcc = (TypeCheckingContextNew) typeCheckingContext;
        TraceTool_Tool tool = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(ProjectPluginManager.class).getTool(TraceTool_Tool.class);
        tool.buildTrace(tcc, ((IOperationContext) MapSequence.fromMap(_params).get("context")), ((SNode) MapSequence.fromMap(_params).get("node")), ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")), false);
        tool.openToolLater(true);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowTypeSystemTraceIncremental", t);
      }
    }
  }
}
