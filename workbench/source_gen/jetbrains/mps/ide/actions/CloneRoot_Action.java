package jetbrains.mps.ide.actions;

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
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.navigation.NavigationSupport;
import jetbrains.mps.smodel.IOperationContext;

public class CloneRoot_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(CloneRoot_Action.class);

  public CloneRoot_Action() {
    super("Clone Root", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
    this.addPlace(null);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CloneRoot", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("ideaProject", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("ideaProject") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSCommonDataKeys.NODES);
      boolean error = false;
      if (nodes != null) {
      }
      if (error || nodes == null) {
        MapSequence.fromMap(_params).put("nodes", null);
      } else {
        MapSequence.fromMap(_params).put("nodes", ListSequence.fromListWithValues(new ArrayList<SNode>(), nodes));
      }
    }
    if (MapSequence.fromMap(_params).get("nodes") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      for (SNode node : ListSequence.fromList(((List<SNode>) MapSequence.fromMap(_params).get("nodes")))) {
        SNode root = SNodeOperations.getContainingRoot(node);
        final SNode copy = SNodeOperations.copyNode(root);
        SModelOperations.addRootNode(SNodeOperations.getModel(root), copy);
        ModelAccess.instance().runReadInEDT(new Runnable() {
          public void run() {
            NavigationSupport.getInstance().openNode(((IOperationContext) MapSequence.fromMap(_params).get("context")), copy, true, true);
            NavigationSupport.getInstance().selectInTree(((IOperationContext) MapSequence.fromMap(_params).get("context")), copy, false);
          }
        });
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CloneRoot", t);
      }
    }
  }
}
