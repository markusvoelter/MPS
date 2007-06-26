package jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.ActionQueryMethodName;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1177330440365(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(node, "useNewActions");
  }
  public static boolean baseMappingRule_Condition_1177442255229(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(node, "useNewActions");
  }
  public static Object propertyMacro_GetPropertyValue_1172253230032(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode builder = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.nodeSubstituteActionsBuilder_Precondition(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }
  public static Object propertyMacro_GetPropertyValue_1172253315888(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode builder = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.rTransformHintSubstituteActionsBuilder_Precondition(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }
  public static Object propertyMacro_GetPropertyValue_1172253035856(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode nodeFactory = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory", false, false);
    return ActionQueryMethodName.nodeFactory_NodeSetupFunction(((NodeFactory)SNodeOperations.getAdapter(nodeFactory)));
  }
  public static Object propertyMacro_GetPropertyValue_1177328723627(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ActionQueryMethodName.nodeFactory_SubstituteActionBuilder(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(node)));
  }
  public static Object propertyMacro_GetPropertyValue_1178541129260(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }
  public static Object propertyMacro_GetPropertyValue_1177331479810(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177340188447(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177399369144(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177404507235(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177404645418(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "wrappedConcept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1181738947306(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }
  public static Object propertyMacro_GetPropertyValue_1181736567569(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "removeActionsByCondition_" + node.getId();
  }
  public static Object propertyMacro_GetPropertyValue_1177441873740(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ActionQueryMethodName.nodeFactory_RightTransformActionBuilder(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(node)));
  }
  public static Object propertyMacro_GetPropertyValue_1177499289033(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177509909274(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177527514739(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177527741008(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "baseConcept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1177530577519(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1178542556851(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "variableDeclaration", false), "name");
  }
  public static Object propertyMacro_GetPropertyValue_1180136156113(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "concept", false));
  }
  public static Object propertyMacro_GetPropertyValue_1182820930213(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(node, "concept", false));
  }
  public static SNode referenceMacro_GetReferent_1179457640879(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(node, "variable").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1181738985236(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(node, "variable").getTargetNode();
  }
  public static boolean ifMacro_Condition_1178782034640(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "commonInitializer", true) != null;
  }
  public static boolean ifMacro_Condition_1177335419476(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "canSubstitute", true) != null;
  }
  public static boolean ifMacro_Condition_1177335619232(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "canSubstitute", true) != null;
  }
  public static boolean ifMacro_Condition_1177336393312(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "descriptionText", true) != null;
  }
  public static boolean ifMacro_Condition_1177336442294(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "matchingText", true) != null;
  }
  public static boolean ifMacro_Condition_1177399369238(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "matchingText", true) != null;
  }
  public static boolean ifMacro_Condition_1177399369261(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "descriptionText", true) != null;
  }
  public static boolean ifMacro_Condition_1181738756958(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "commonInitializer", true) != null;
  }
  public static boolean ifMacro_Condition_1177499903622(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "matchingText", true) != null;
  }
  public static boolean ifMacro_Condition_1177499899976(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "descriptionText", true) != null;
  }
  public static boolean ifMacro_Condition_1177514488331(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "matchingText", true), "body", true) != null;
  }
  public static boolean ifMacro_Condition_1177514494000(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "descriptionText", true), "body", true) != null;
  }
  public static List sourceNodesQuery_1178541065624(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "variable", true);
  }
  public static List sourceNodesQuery_1179457640889(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "variable", true);
  }
  public static List sourceNodesQuery_1177330914926(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getDescendantsWhereConceptInList(node, new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart","jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart"}, false);
  }
  public static List sourceNodesQuery_1181738947315(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(node, null, false, false), "variable", true);
  }
  public static List sourceNodesQuery_1181738985246(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(node, null, false, false), "variable", true);
  }
  public static List sourceNodesQuery_1177441873770(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getDescendantsWhereConceptInList(node, new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.IncludeRightTransformForNodePart","jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart","jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransformMenuPart"}, false);
  }
  public static List sourceNodesQuery_1177530541055(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "exclude", true);
  }
  public static SNode sourceNodeQuery_1172253302099(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1172253384416(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1172253185556(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1178541085974(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1179457640853(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "initializerBlock", true), "body", true);
  }
  public static SNode sourceNodeQuery_1179457640870(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1178782016772(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "commonInitializer", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177332016999(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177331967800(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "canSubstitute", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177336383605(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "descriptionText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177336437649(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "matchingText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177353800103(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "query", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177357415115(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true);
    }
    if(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false), "type", true);
    }
    return null;
  }
  public static SNode sourceNodeQuery_1177399369165(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "query", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177399369182(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1177399369193(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1177399369215(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177399369227(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "matchingText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177399369250(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "descriptionText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177405091687(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "wrapperBlock", true), "body", true);
  }
  public static SNode sourceNodeQuery_1181738947298(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1181738985209(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "initializerBlock", true), "body", true);
  }
  public static SNode sourceNodeQuery_1181738985228(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1181738763214(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "commonInitializer", true), "body", true);
  }
  public static SNode sourceNodeQuery_1181736318685(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "condition", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177499792023(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177499861510(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "matchingText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177499864799(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "descriptionText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177510051563(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "query", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177510450110(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1177510459082(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1177510544571(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1177510684590(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177514451569(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "matchingText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177514456119(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "descriptionText", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177528022223(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
  public static SNode sourceNodeQuery_1178542510747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "variableDeclaration", false), "type", true);
  }
  public static SNode sourceNodeQuery_1180114556480(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "nodeBlock", true), "body", true);
  }
  public static SNode sourceNodeQuery_1182820930324(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "handler", true), "body", true);
  }
}
