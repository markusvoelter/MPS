package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.nodeEditor.cellExplorer.CellExplorerView;

public class ShowCellInExplorer_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowCellInExplorer_Action.class);
  public static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}\\workbench\\source\\jetbrains\\mps\\ide\\projectPane\\nodes\\cellExplorer.png", "jetbrains.mps.ide"), true);

  private EditorCell cell;
  private IOperationContext context;

  public ShowCellInExplorer_Action() {
    super("Show Cell In Explorer", "", ICON);
    this.setIsAlwaysVisible(false);
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
      LOG.error("User's action doUpdate method failed. Action:" + "ShowCellInExplorer", t);
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
      this.context = new ActionEventData(event).getOperationContext();
      if (this.context == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      this.context.getComponent(CellExplorerView.class).showCell(this.cell);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowCellInExplorer", t);
    }
  }

}
