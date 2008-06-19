package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class NodeKindCase_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_getTreePathAspect_1213877444300(SNode thisNode) {
    SNode treePathAspect = null;
    SNode switchStatement = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ypath.structure.SwitchNodeKindStatement", false, false);
    if ((switchStatement != null)) {
      treePathAspect = SLinkOperations.getTarget(SLinkOperations.getTarget(switchStatement, "nodeExpression", true), "treepathAspect", false);
    }
    return treePathAspect;
  }

}
