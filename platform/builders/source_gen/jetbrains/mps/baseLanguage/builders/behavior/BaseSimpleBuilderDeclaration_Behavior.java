package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BaseSimpleBuilderDeclaration_Behavior {
  private static Class[] PARAMETERS_6254726786820551255 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getContextDeclaration_6254726786820551255(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration"), "virtual_getContextDeclaration_6254726786820551255", PARAMETERS_6254726786820551255);
  }

  public static SNode callSuper_getContextDeclaration_6254726786820551255(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration"), callerConceptFqName, "virtual_getContextDeclaration_6254726786820551255", PARAMETERS_6254726786820551255);
  }
}
