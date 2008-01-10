package jetbrains.mps.ide.scriptLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacro_ParameterObject;
import jetbrains.mps.ide.scriptLanguage.util.ScriptNameUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;

public class QueriesGenerated {

  public static Object propertyMacro_GetPropertyValue_1172274241857(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ScriptNameUtil.getClassName(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1172315115191(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "conceptDeclaration", false));
  }

  public static Object propertyMacro_GetPropertyValue_1172354478331(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String caption = SPropertyOperations.getString(_parameterObject.getNode(), "caption");
    return (caption == null ?
      "<no name>" :
      caption
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177464819480(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "title");
  }

  public static Object propertyMacro_GetPropertyValue_1177555396906(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String title = SPropertyOperations.getString(_parameterObject.getNode(), "description");
    return (title != null ?
      title :
      ""
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177555562762(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String title = SPropertyOperations.getString(_parameterObject.getNode(), "description");
    return (title != null ?
      title :
      ""
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177465342820(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode affectedConcept = SLinkOperations.getTarget(_parameterObject.getNode(), "affectedInstanceConcept", false);
    return NameUtil.nodeFQName(affectedConcept);
  }

  public static Object propertyMacro_GetPropertyValue_1177464650516(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ScriptNameUtil.getMigrationScriptClassName(_parameterObject.getNode());
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

  public static SNode sourceNodeQuery_1179444592655(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "oldNode", true);
  }

  public static SNode sourceNodeQuery_1179444604084(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "newNode", true);
  }

}
