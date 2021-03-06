package jetbrains.mps.debugger.api.ui.breakpoints;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorMessageIconRenderer;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;
import java.awt.Component;
import javax.swing.Icon;
import jetbrains.mps.debugger.api.ui.DebugActionsUtil;
import com.intellij.ide.DataManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Cursor;
import com.intellij.openapi.actionSystem.AnAction;
import javax.swing.JPopupMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import jetbrains.mps.debug.api.BreakpointManagerComponent;
import javax.swing.JSeparator;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.CellFinders;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.api.breakpoints.IBreakpoint;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.debugger.api.ui.icons.Icons;
import jetbrains.mps.debug.api.breakpoints.IBreakpointsProvider;
import jetbrains.mps.debug.api.breakpoints.BreakpointProvidersManager;

/*package*/ class BreakpointIconRenderer implements EditorMessageIconRenderer {
  public static final EditorMessageIconRenderer.IconRendererType TYPE = new EditorMessageIconRenderer.IconRendererType(4);

  private final ILocationBreakpoint myBreakpoint;
  private final Component myComponent;

  public BreakpointIconRenderer(ILocationBreakpoint breakpoint, Component component) {
    myBreakpoint = breakpoint;
    myComponent = component;
  }

  @Override
  public Icon getIcon() {
    return BreakpointIconRenderer.getIconFor(myBreakpoint, DebugActionsUtil.getDebugSession(DataManager.getInstance().getDataContext(myComponent)));
  }

  @Override
  public String getTooltipText() {
    return null;
  }

  @Override
  public SNode getNode() {
    return myBreakpoint.getLocation().getSNode();
  }

  @Override
  public EditorMessageIconRenderer.IconRendererType getType() {
    return TYPE;
  }

  @Override
  public EditorCell getAnchorCell(EditorCell bigCell) {
    return BreakpointIconRenderer.getBreakpointIconAnchorCell(bigCell);
  }

  @Override
  public Cursor getMouseOverCursor() {
    return null;
  }

  @Override
  public AnAction getClickAction() {
    return null;
  }

  @Override
  public JPopupMenu getPopupMenu() {
    if (!(myBreakpoint.isValid())) {
      return null;
    }
    if (!(myBreakpoint.getKind().supportsDisable())) {
      return null;
    }
    JPopupMenu menu = new JPopupMenu();
    menu.add(new AbstractAction((myBreakpoint.isEnabled() ?
      "Disable" :
      "Enable"
    )) {
      @Override
      public void actionPerformed(ActionEvent e) {
        myBreakpoint.setEnabled(!(myBreakpoint.isEnabled()));
      }
    });
    menu.add(new AbstractAction("Remove") {
      @Override
      public void actionPerformed(ActionEvent e) {
        BreakpointManagerComponent.getInstance(myBreakpoint.getProject()).removeBreakpoint(myBreakpoint);
      }
    });
    menu.add(new JSeparator());
    menu.add(new AbstractAction("Properties") {
      @Override
      public void actionPerformed(ActionEvent e) {
        BreakpointsUiComponent.getInstance(myBreakpoint.getProject()).editBreakpointProperties(myBreakpoint);
      }
    });
    return menu;
  }

  public static EditorCell getBreakpointIconAnchorCell(EditorCell bigCell) {
    if (bigCell instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) bigCell;
      return collection.findChild(CellFinders.byClass(EditorCell_Label.class, true));
    }
    return bigCell;
  }

  public static Icon getIconFor(@NotNull IBreakpoint breakpoint) {
    return BreakpointIconRenderer.getIconFor(breakpoint, null);
  }

  private static Icon getIconFor(@NotNull IBreakpoint breakpoint, @Nullable AbstractDebugSession session) {
    if (session != null && session.isMute()) {
      return Icons.MUTED_BREAKPOINT;
    }
    IBreakpointsProvider provider = BreakpointProvidersManager.getInstance().getProvider(breakpoint.getKind());
    if (provider != null) {
      Icon icon = provider.getIcon(breakpoint, null);
      if (icon != null) {
        return icon;
      }
    }
    return (breakpoint.isValid() ?
      ((breakpoint.isEnabled() ?
        Icons.BREAKPOINT :
        Icons.DISABLED_BREAKPOINT
      )) :
      Icons.INV_BREAKPOINT
    );
  }
}
