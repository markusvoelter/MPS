package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class ContinueStatement_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_getLoop_1213877346346(SNode thisNode) {
    for(SNode loop : SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)) {
      if (SPropertyOperations.getString(thisNode, "label") == null) {
        return loop;
      }
      if (SPropertyOperations.getString(thisNode, "label").equals(SPropertyOperations.getString(loop, "label"))) {
        return loop;
      }
    }
    return ContinueStatement_Behavior.call_getLoop_1213877346346(thisNode);
  }

}
