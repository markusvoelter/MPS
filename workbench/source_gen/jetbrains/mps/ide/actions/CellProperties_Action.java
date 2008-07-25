package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.nodeEditor.cellExplorer.CellPropertiesWindow;

public class CellProperties_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CellProperties_Action.class);
  public static final Icon ICON = null;

  private EditorCell cell;
  private Frame frame;

  public CellProperties_Action() {
    super("Cell Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CellProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.cell = new ActionEventData(event).getEditorCell();
      if (this.cell == null) {
        return false;
      }
      this.frame = new ActionEventData(event).getFrame();
      if (this.frame == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      new CellPropertiesWindow(this.cell, this.frame);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CellProperties", t);
    }
  }

}
