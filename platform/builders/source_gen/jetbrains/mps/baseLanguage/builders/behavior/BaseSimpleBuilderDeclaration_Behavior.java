package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class BaseSimpleBuilderDeclaration_Behavior {
  private static Class[] PARAMETERS_6254726786820551255 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getContextDeclaration_6254726786820551255(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration"), "virtual_getContextDeclaration_6254726786820551255", PARAMETERS_6254726786820551255);
  }

  public static SNode callSuper_getContextDeclaration_6254726786820551255(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration"), callerConceptFqName, "virtual_getContextDeclaration_6254726786820551255", PARAMETERS_6254726786820551255);
  }
}
