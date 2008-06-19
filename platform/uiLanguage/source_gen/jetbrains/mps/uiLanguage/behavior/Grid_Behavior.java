package jetbrains.mps.uiLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class Grid_Behavior {

  public static void init(SNode thisNode) {
  }

  public static int call_getRowCount_1213877333382(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "row", true)).count();
  }

  public static int call_getColumnsCount_1213877333391(SNode thisNode) {
    int columnsCount = 0;
    for(SNode row : SLinkOperations.getTargets(thisNode, "row", true)) {
      columnsCount = Math.max(columnsCount, ListSequence.fromList(SLinkOperations.getTargets(row, "component", true)).count());
    }
    return columnsCount;
  }

}
