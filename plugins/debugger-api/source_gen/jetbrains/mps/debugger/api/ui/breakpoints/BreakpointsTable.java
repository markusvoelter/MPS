package jetbrains.mps.debugger.api.ui.breakpoints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.debug.api.BreakpointManagerComponent;

/*package*/ class BreakpointsTable extends AbstractBreakpointsTree {
  public BreakpointsTable(IOperationContext context, BreakpointManagerComponent breakpointsManager) {
    super(breakpointsManager, context);
    myModelKind.setVisible(false);
    myModuleKind.setVisible(false);
    myRootKind.setVisible(false);
    myTree.rebuildLater();
  }

  @Override
  public String getTitle() {
    return "Table View";
  }
}
