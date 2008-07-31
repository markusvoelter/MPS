package jetbrains.mps.core.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.util.List;

public class ShowNodeMessages_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowNodeMessages_Action.class);
  public static final Icon ICON = null;

  public SNode node;
  public EditorComponent editorComponent;

  public ShowNodeMessages_Action() {
    super("Show Node Messages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt shift M";
  }

  public boolean isApplicable(AnActionEvent event) {
    return !(this.editorComponent.getHighlightManager().getMessagesFor(this.node).isEmpty());
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeMessages", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.node = event.getData(MPSDataKeys.SNODE);
      if (this.node == null) {
        return false;
      }
      this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
      if (this.editorComponent == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      List<EditorMessage> messages = this.editorComponent.getHighlightManager().getMessagesFor(this.node);
      StringBuilder sb = new StringBuilder();
      for (EditorMessage message : messages) {
        sb.append(message.getMessage());
        sb.append("; owner is ");
        sb.append(message.getOwner().toString());
        sb.append("\n");
      }
      JOptionPane.showMessageDialog(this.editorComponent, sb, "node messages", JOptionPane.INFORMATION_MESSAGE);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeMessages", t);
    }
  }

}
