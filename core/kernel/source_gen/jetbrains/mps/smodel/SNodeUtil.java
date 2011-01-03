package jetbrains.mps.smodel;

/*Generated by MPS */

import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SNodeUtil {
  public SNodeUtil() {
  }

  public static String getPresentation(SNode node) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class});
  }

  public static String getDetailedPresentation(SNode node) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getDetailedPresentation_2354269628709769373", new Class[]{SNode.class});
  }
}
