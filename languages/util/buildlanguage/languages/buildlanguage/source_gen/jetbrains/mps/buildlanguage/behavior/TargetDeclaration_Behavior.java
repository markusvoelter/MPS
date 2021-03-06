package jetbrains.mps.buildlanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;

public class TargetDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getDependanceString_1213877231974(SNode thisNode) {
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "depends", true)).isEmpty()) {
      return "";
    }
    StringBuffer buffer = new StringBuffer();
    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(thisNode, "depends", true)).count(); i++) {
      buffer.append(SPropertyOperations.getString(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "depends", true)).getElement(i), "targetDeclaration", false), "name"));
      if (i < ListSequence.fromList(SLinkOperations.getTargets(thisNode, "depends", true)).count() - 1) {
        buffer.append(",");
      }
    }
    return buffer.toString();
  }

  public static List<SNode> virtual_getProperties_1213877375726(SNode thisNode) {
    return SLinkOperations.getTargets(thisNode, "propertyList", true);
  }
}
