package jetbrains.mps.bootstrap.actionsLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueryFunction_ParameterizedSubstitute_Handler_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model")) {
      return false;
    }
    return ConceptFunction_Behavior.callSuper_usesParameterObjectFor_1213877374432(thisNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_Handler", parameter);
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptPart", false, false);
    SNode conceptOfNodeReturnedByHandler = SLinkOperations.getTarget(ancestor, "concept", false);
    return new QuotationClass_7().createNode(conceptOfNodeReturnedByHandler);
  }

}
