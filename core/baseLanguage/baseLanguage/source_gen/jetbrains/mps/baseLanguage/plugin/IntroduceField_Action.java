package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.IntroduceFieldRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.IntroduceFieldDialog;
import java.awt.Frame;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JOptionPane;

public class IntroduceField_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(IntroduceField_Action.class);

  public IntroduceField_Action() {
    super("Introduce Field...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return IntroduceFieldRefactoring.isApplicable(((SNode) MapSequence.fromMap(_params).get("node"))) && !(((EditorComponent) MapSequence.fromMap(_params).get("component")).isReadOnly());
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "IntroduceField", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
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
    MapSequence.fromMap(_params).put("component", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("component") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final IntroduceFieldRefactoring introducer = new IntroduceFieldRefactoring();
      final Wrappers._T<String> error = new Wrappers._T<String>();
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          error.value = introducer.init(((SNode) MapSequence.fromMap(_params).get("node")), ((EditorComponent) MapSequence.fromMap(_params).get("component")));
        }
      });
      if (error.value == null) {
        IntroduceFieldDialog dialog = new IntroduceFieldDialog(((Frame) MapSequence.fromMap(_params).get("frame")), introducer, ((EditorContext) MapSequence.fromMap(_params).get("context")));
        dialog.showDialog();
      } else {
        JOptionPane.showMessageDialog(((EditorComponent) MapSequence.fromMap(_params).get("component")), error.value, "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "IntroduceField", t);
    }
  }
}
