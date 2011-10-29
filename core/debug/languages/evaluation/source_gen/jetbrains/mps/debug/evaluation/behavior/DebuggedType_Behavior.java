package jetbrains.mps.debug.evaluation.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DebuggedType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getHighClassifierType_4544608336420723238(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "highType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      return SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "highType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType");
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "lowType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      return SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "lowType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType");
    }
    return null;
  }

  public static SNode call_getLowClassifierType_4544608336420723302(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "lowType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      return SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "lowType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType");
    }
    return null;
  }
}
