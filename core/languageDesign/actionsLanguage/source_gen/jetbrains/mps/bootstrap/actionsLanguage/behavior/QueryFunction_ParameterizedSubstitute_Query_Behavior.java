package jetbrains.mps.bootstrap.actionsLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueryFunction_ParameterizedSubstitute_Query_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestorWhereConceptInList(thisNode, new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart","jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart"}, false, false);
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart")) {
      return new QuotationClass_4().createNode(SLinkOperations.getTarget(ancestor, "concept", false));
    }
    SNode expectedType = null;
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart")) {
      expectedType = SLinkOperations.getTarget(ancestor, "type", true);
    }
    // ==========
    if (expectedType == null) {
      return new QuotationClass_5().createNode();
    }
    return new QuotationClass_6().createNode(expectedType);
  }

}
