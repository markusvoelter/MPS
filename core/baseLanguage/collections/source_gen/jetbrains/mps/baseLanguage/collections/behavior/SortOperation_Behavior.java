package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SortOperation_Behavior {
  private static Class[] PARAMETERS_3185788474596486344 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isDotExpressionLegalAsStatement_1239212437413(SNode thisNode) {
    return false;
  }

  public static boolean call_isDotExpressionLegalAsStatement_3185788474596486344(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SortOperation"), "virtual_isDotExpressionLegalAsStatement_1239212437413", PARAMETERS_3185788474596486344);
  }

  public static boolean callSuper_isDotExpressionLegalAsStatement_3185788474596486344(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SortOperation"), callerConceptFqName, "virtual_isDotExpressionLegalAsStatement_1239212437413", PARAMETERS_3185788474596486344);
  }
}
