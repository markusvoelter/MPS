package jetbrains.mps.uiLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class GridRow_Behavior {

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getRowComponents_1213877252264(SNode thisNode) {
    int columnCount = Grid_Behavior.call_getColumnsCount_1213877333391(SNodeOperations.getParent(thisNode, null, false, false));
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true)));
    for(int i = 0 ; i < columnCount - ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true)).count() ; i = i + 1) {
      ListSequence.fromList(result).addElement(new QuotationClass_().createNode());
    }
    return result;
  }

}
