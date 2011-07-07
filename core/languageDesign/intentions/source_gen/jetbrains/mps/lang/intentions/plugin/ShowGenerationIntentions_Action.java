package jetbrains.mps.lang.intentions.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.actionSystem.ActionGroup;
import jetbrains.mps.workbench.action.BaseGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.ui.popup.ListPopup;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.awt.RelativePoint;
import java.awt.Point;

public class ShowGenerationIntentions_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowGenerationIntentions_Action.class);

  public ShowGenerationIntentions_Action() {
    super("Generate...", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    ActionGroup group = ((BaseGroup) ActionManager.getInstance().getAction("jetbrains.mps.lang.intentions.plugin.GenerationIntentions_ActionGroup"));
    group.update(event);
    return group.getChildren(event).length != 0;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowGenerationIntentions", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorContext", event.getData(MPSDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("editorContext") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final EditorCell selectedCell = ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getSelectedCell();
      int x = selectedCell.getX();
      int y = selectedCell.getY();
      if (selectedCell instanceof EditorCell_Label) {
        y += ((EditorCell_Label) selectedCell).getHeight();
      }
      final Wrappers._T<ListPopup> popup = new Wrappers._T<ListPopup>(null);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          ActionGroup group = ((BaseGroup) ActionManager.getInstance().getAction("jetbrains.mps.lang.intentions.plugin.GenerationIntentions_ActionGroup"));
          group.update(event);
          if (group.getChildren(event).length == 0) {
            return;
          }
          popup.value = JBPopupFactory.getInstance().createActionGroupPopup("Generate", group, event.getDataContext(), JBPopupFactory.ActionSelectionAid.NUMBERING, false);
        }
      });
      if (popup.value == null) {
        return;
      }

      RelativePoint relativePoint = new RelativePoint(((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getNodeEditorComponent(), new Point(x, y));
      popup.value.show(relativePoint);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowGenerationIntentions", t);
    }
  }
}
