package jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.util.QueriesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.SModelLanguageUtil;
import jetbrains.mps.bootstrap.smodelLanguage.SNodeOperation;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.SConceptPropertyAccess;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1168911272662(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "creator", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator");
  }
  public static boolean baseMappingRule_Condition_1168983652971(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b = false;
    b = b || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess");
    b = b || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess");
    b = b || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation");
    b = b || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation");
    b = b || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_DeleteChildOperation");
    if(b) {
      System.out.println("reduce SNodeOperationExpression with new reduction rule");
      return true;
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1168976445524(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isPropertyAccess_simple(node);
  }
  public static boolean baseMappingRule_Condition_1168976854559(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isPropertyAccess_enum_notNullDefaultValue(node);
  }
  public static boolean baseMappingRule_Condition_1168977178297(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isPropertyAccess_enum_nullDefaultValue(node);
  }
  public static boolean baseMappingRule_Condition_1168977521292(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.get(SLinkOperations.getTarget(node, "enumMember", false), "internalValue") != null;
  }
  public static boolean baseMappingRule_Condition_1168977610522(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.get(SLinkOperations.getTarget(node, "enumMember", false), "internalValue") == null;
  }
  public static boolean baseMappingRule_Condition_1168978381110(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isProperty_set_stringValue(node, generator);
  }
  public static boolean baseMappingRule_Condition_1168978822549(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isProperty_set_notStringValue(node, generator);
  }
  public static boolean baseMappingRule_Condition_1168979017065(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Simple");
  }
  public static boolean baseMappingRule_Condition_1168979597371(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isProperty_hasValueEnum_notNullDefaultValue(node, generator);
  }
  public static boolean baseMappingRule_Condition_1168979716443(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.isProperty_hasValueEnum_nullDefaultValue(node, generator);
  }
  public static String propertyMacro_GetPropertyValue_1168981884180(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.get(SLinkOperations.getTarget(node, "enumMember", false), "internalValue");
  }
  public static SNode sourceNodeQuery_1168986247382(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }
  public static String propertyMacro_GetPropertyValue_1168986363721(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode link = SLinkOperations.getTarget(node, "link", false);
    return SModelUtil.getGenuineLinkRole((LinkDeclaration)link);
  }
  public static String propertyMacro_GetPropertyValue_1168986509277(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode link = SLinkOperations.getTarget(node, "link", false);
    link = SModelUtil.getGenuineLinkDeclaration((LinkDeclaration)link);
    if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
      return "true";
    }
    return "false";
  }
  public static SNode sourceNodeQuery_1169051323267(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // <expr-to-copy> . link-access . set-new-child-op
    SNode lexpr1 = SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
    return SLinkOperations.getTarget(lexpr1, "leftExpression", true);
  }
  public static String propertyMacro_GetPropertyValue_1169054268385(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode genuineLink = QueriesUtil.linkOperationExpression_genuineLink(SNodeOperations.getParent(node, null, false, false));
    return SPropertyOperations.get(genuineLink, "role");
  }
  public static String propertyMacro_GetPropertyValue_1169054430478(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parmConcept = SLinkOperations.getTarget(node, "concept", false);
    if(parmConcept == null) {
      parmConcept = SModelLanguageUtil.getLinkTargetConceptForLinkOperation((SNodeOperation)node);
    }
    return NameUtil.nodeFQName(parmConcept);
  }
  public static boolean baseMappingRule_Condition_1168967899174(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation")) {
      return QueriesUtil.opGetParent_reduceDeafult(SLinkOperations.getTarget(node, "nodeOperation", true));
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1168969238044(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation")) {
      return QueriesUtil.opGetParent_reduceWhereConceptInList(SLinkOperations.getTarget(node, "nodeOperation", true));
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1168970436747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation");
  }
  public static boolean baseMappingRule_Condition_1168970493768(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation");
  }
  public static boolean baseMappingRule_Condition_1168970552484(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168972231414(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168972310368(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168972310377(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168972373078(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAllSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168974937161(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168974991010(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975137862(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975137871(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975302411(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation");
  }
  public static boolean baseMappingRule_Condition_1168975330485(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation");
  }
  public static boolean baseMappingRule_Condition_1168975651079(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation");
  }
  public static boolean baseMappingRule_Condition_1168975694600(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation");
  }
  public static boolean baseMappingRule_Condition_1168975717549(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation");
  }
  public static SNode sourceNodeQuery_1169056377509(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // <expr-to-copy> . link-access . delete-op
    SNode lexpr1 = SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
    return SLinkOperations.getTarget(lexpr1, "leftExpression", true);
  }
  public static String propertyMacro_GetPropertyValue_1169056436910(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode genuineLink = QueriesUtil.linkOperationExpression_genuineLink(SNodeOperations.getParent(node, null, false, false));
    return SPropertyOperations.get(genuineLink, "role");
  }
  public static SNode sourceNodeQuery_1169055764567(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // <expr-to-copy> . link-access . set-target-op
    SNode lexpr1 = SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
    return SLinkOperations.getTarget(lexpr1, "leftExpression", true);
  }
  public static String propertyMacro_GetPropertyValue_1169055820374(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode genuineLink = QueriesUtil.linkOperationExpression_genuineLink(SNodeOperations.getParent(node, null, false, false));
    return SPropertyOperations.get(genuineLink, "role");
  }
  public static SNode sourceNodeQuery_1169055881310(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "parameter", true);
  }
  public static String propertyMacro_GetPropertyValue_1169055966769(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode genuineLink = QueriesUtil.linkOperationExpression_genuineLink(SNodeOperations.getParent(node, null, false, false));
    if(SPropertyOperations.hasValue(genuineLink, "metaClass", "aggregation", null)) {
      return "true";
    }
    return "false";
  }
  public static boolean baseMappingRule_Condition_1168911621338(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation");
  }
  public static boolean baseMappingRule_Condition_1168912288225(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewRootNodeOperation");
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
  public static boolean baseMappingRule_Condition_1168908168827(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess");
  }
  public static boolean baseMappingRule_Condition_1168908199454(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168908597278(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168908658477(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_InsertChildFirstOperation");
  }
  public static boolean baseMappingRule_Condition_1168908707817(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation");
  }
  public static SNode sourceNodeQuery_1168983597964(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "nodeOperation", true);
  }
  public static SNode sourceNodeQuery_1168985092391(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }
  public static String propertyMacro_GetPropertyValue_1168985327635(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.get(SLinkOperations.getTarget(node, "conceptProperty", false), "name");
  }
  public static SNode referenceMacro_GetReferent_1168984233974(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.get_SConceptPropertyAccess_GetMethod((SConceptPropertyAccess)node, scope);
  }
}
