package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IStatementListContainer_Behavior {
  private static Class[] PARAMETERS_3262277503800835439 = {SNode.class};
  private static Class[] PARAMETERS_1230212745736 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isClosure_3262277503800835439(SNode thisNode) {
    return false;
  }

  public static boolean virtual_isExecuteSynchronous_1230212745736(SNode thisNode) {
    return false;
  }

  public static boolean call_isClosure_3262277503800835439(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"), "virtual_isClosure_3262277503800835439", PARAMETERS_3262277503800835439);
  }

  public static boolean call_isExecuteSynchronous_1230212745736(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"), "virtual_isExecuteSynchronous_1230212745736", PARAMETERS_1230212745736);
  }

  public static boolean callSuper_isClosure_3262277503800835439(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"), callerConceptFqName, "virtual_isClosure_3262277503800835439", PARAMETERS_3262277503800835439);
  }

  public static boolean callSuper_isExecuteSynchronous_1230212745736(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"), callerConceptFqName, "virtual_isExecuteSynchronous_1230212745736", PARAMETERS_1230212745736);
  }
}
