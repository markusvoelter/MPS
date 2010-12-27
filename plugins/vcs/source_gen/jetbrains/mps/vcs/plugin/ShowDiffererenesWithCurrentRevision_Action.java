package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.FileStatus;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;

public class ShowDiffererenesWithCurrentRevision_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/diff.png", "jetbrains.mps.vcs"), true);
  protected static Log log = LogFactory.getLog(ShowDiffererenesWithCurrentRevision_Action.class);

  public ShowDiffererenesWithCurrentRevision_Action() {
    super("Compare with the Same Repository Revision", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    IconUtil.useIcon(ShowDiffererenesWithCurrentRevision_Action.this, event.getPresentation(), "icons/diff.png");
    if (!(((SModelDescriptor) MapSequence.fromMap(_params).get("model")) instanceof EditableSModelDescriptor)) {
      return false;
    }
    VirtualFile virtualFile = VirtualFileUtils.getVirtualFile(((EditableSModelDescriptor) ((SModelDescriptor) MapSequence.fromMap(_params).get("model"))).getModelFile());
    if (((SNode) MapSequence.fromMap(_params).get("node")).isRoot() && ProjectLevelVcsManager.getInstance(((Project) MapSequence.fromMap(_params).get("project"))).getVcsFor(virtualFile) != null) {
      FileStatus fileStatus = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(VcsFileStatusProvider.class).getFileStatus(virtualFile);
      return FileStatus.ADDED != fileStatus && FileStatus.UNKNOWN != fileStatus;
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
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowDiffererenesWithCurrentRevision", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("node", event.getData(MPSDataKeys.NODE));
    if (MapSequence.fromMap(_params).get("node") == null) {
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
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.CONTEXT_MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      VcsActionsHelper.showRootDifference(((Frame) MapSequence.fromMap(_params).get("frame")), ((IOperationContext) MapSequence.fromMap(_params).get("context")), ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getSModel(), ((SNode) MapSequence.fromMap(_params).get("node")), ((Project) MapSequence.fromMap(_params).get("project")));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowDiffererenesWithCurrentRevision", t);
      }
    }
  }
}
