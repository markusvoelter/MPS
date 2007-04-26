package jetbrains.mps.ide.scriptLanguage.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.scriptLanguage.util.ScriptNameUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;

public class QueriesGenerated {

  public static String propertyMacro_GetPropertyValue_1172274241857(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ScriptNameUtil.getClassName(node);
  }
  public static String propertyMacro_GetPropertyValue_1172315115191(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "conceptDeclaration", false));
  }
  public static String propertyMacro_GetPropertyValue_1172354478331(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String caption = SPropertyOperations.getString(node, "caption");
    return (caption == null ?
      "<no name>" :
      caption
    );
  }
  public static String propertyMacro_GetPropertyValue_1177464819480(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "title");
  }
  public static String propertyMacro_GetPropertyValue_1177555396906(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String title = SPropertyOperations.getString(node, "description");
    return (title != null ?
      title :
      ""
    );
  }
  public static String propertyMacro_GetPropertyValue_1177555562762(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String title = SPropertyOperations.getString(node, "description");
    return (title != null ?
      title :
      ""
    );
  }
  public static String propertyMacro_GetPropertyValue_1177465342820(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode affectedConcept = SLinkOperations.getTarget(node, "affectedInstanceConcept", false);
    return NameUtil.nodeFQName(affectedConcept);
  }
  public static String propertyMacro_GetPropertyValue_1177464650516(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ScriptNameUtil.getMigrationScriptClassName(node);
  }
  public static List sourceNodesQuery_1177464931683(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "part", true);
  }
  public static SNode sourceNodeQuery_1172287555052(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "statementList", true);
  }
  public static SNode sourceNodeQuery_1172333760299(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "nodeList", true);
  }
  public static SNode sourceNodeQuery_1177001853600(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "nodeExpression", true);
  }
  public static SNode sourceNodeQuery_1177466395402(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "affectedInstancePredicate", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177466489905(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "affectedInstanceUpdater", true), "body", true);
  }
}
