package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.List;
import jetbrains.mps.nodeEditor.EditorMessage;
import javax.swing.JOptionPane;

public class ShowNodeMessages_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowNodeMessages_Action.class);

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
    return !(ShowNodeMessages_Action.this.editorComponent.getHighlightManager().getMessagesFor(ShowNodeMessages_Action.this.node).isEmpty());
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeMessages");
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.SNODE);
    if (this.node == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      List<EditorMessage> messages = ShowNodeMessages_Action.this.editorComponent.getHighlightManager().getMessagesFor(ShowNodeMessages_Action.this.node);
      StringBuilder sb = new StringBuilder();
      for(EditorMessage message : messages) {
        sb.append(message.getMessage());
        sb.append("; owner is ");
        sb.append(message.getOwner().toString());
        sb.append("\n");
      }
      JOptionPane.showMessageDialog(ShowNodeMessages_Action.this.editorComponent, sb, "node messages", JOptionPane.INFORMATION_MESSAGE);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeMessages");
    }
  }

}
