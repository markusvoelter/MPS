package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DefaultClassifierMethodDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "visibility", true);
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return true;
  }
}
