package jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.SNodeOperation;
import jetbrains.mps.util.NameUtil;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1168905308455(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess");
  }
  public static SNode sourceNodeQuery_1168292579606(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static List sourceNodesQuery_1168293467222(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (List<SNode>)_QueriesUtil.getNodeOperation_ConceptList_concepts((SNodeOperation)(SLinkOperations.getTarget(node, "nodeOperation", true)));
  }
  public static String propertyMacro_GetPropertyValue_1168294031937(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(node);
  }
}
