package jetbrains.mps.bootstrap.constraintsLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRule_ParameterObject;
import jetbrains.mps.generator.template.BaseMappingRule_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacro_ParameterObject;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.constraintsLanguage.constraints.NodeDefaultSearchScope_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.constraintsLanguage.constraints.NodeReferentConstraint_Behavior;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.constraintsLanguage.constraints.NodePropertyConstraint_Behavior;
import jetbrains.mps.bootstrap.constraintsLanguage.constraints.ConceptMethodDeclaration_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.structureLanguage.constraints.DataTypeDeclaration_Behavior;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import jetbrains.mps.bootstrap.constraintsLanguage.generator.baseLanguage.template.util.QueriesUtil;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1194967181314(final IOperationContext operationContext, final CreateRootRule_ParameterObject _parameterObject) {
    return _parameterObject.getSourceModel().getLongName().endsWith(".constraints");
  }

  public static boolean baseMappingRule_Condition_1187043003325(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "propertyGetter", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043119206(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "propertySetter", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043231002(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "referentSetHandler", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043358729(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "searchScopeFactory", true) != null;
  }

  public static Object propertyMacro_GetPropertyValue_1184610547646(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeDefaultSearchScope_Behavior.call_getReferentConcept_1178193833041(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610580040(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeDefaultSearchScope_Behavior.call_getReferentConcept_1178193833041(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610822428(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String description = SPropertyOperations.getString(_parameterObject.getNode(), "description");
    if(description != null) {
      return description;
    }
    return _parameterObject.getTemplateValue();
  }

  public static Object propertyMacro_GetPropertyValue_1184609665202(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1178190078587(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609767181(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode applicableLink = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableLink", false);
    return SModelUtil_new.getGenuineLinkRole(((LinkDeclaration)SNodeOperations.getAdapter(applicableLink)));
  }

  public static Object propertyMacro_GetPropertyValue_1184609700758(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1178190078587(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609822047(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode applicableLink = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableLink", false);
    return SModelUtil_new.getGenuineLinkRole(((LinkDeclaration)SNodeOperations.getAdapter(applicableLink)));
  }

  public static Object propertyMacro_GetPropertyValue_1184609972214(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1178190078587(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610007581(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode applicableLink = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableLink", false);
    return SModelUtil_new.getGenuineLinkRole(((LinkDeclaration)SNodeOperations.getAdapter(applicableLink)));
  }

  public static Object propertyMacro_GetPropertyValue_1184609981357(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1178190078587(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610013893(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode applicableLink = SLinkOperations.getTarget(_parameterObject.getNode(), "applicableLink", false);
    return SModelUtil_new.getGenuineLinkRole(((LinkDeclaration)SNodeOperations.getAdapter(applicableLink)));
  }

  public static Object propertyMacro_GetPropertyValue_1184610250485(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    String description = SPropertyOperations.getString(_parameterObject.getNode(), "searchScopeDescription");
    if(description != null) {
      return description;
    }
    return _parameterObject.getTemplateValue();
  }

  public static Object propertyMacro_GetPropertyValue_1184608961609(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1178176331859(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609127099(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608998084(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1178176331859(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609151833(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608713100(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1178176331859(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609198140(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608867617(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1178176331859(_parameterObject.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609224170(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1194605448577(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return "PARAMETERS_" + _parameterObject.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1177677003299(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getGeneratedName_1177681178696(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1181726948102(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getCallerMethodName_1181725268250(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1181727149831(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getGeneratedName_1177681178696(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1181727126085(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1182162752919(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getGeneratedName_1177681178696(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1182162752942(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1193402330791(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getSuperCallerMethodName_1193402369204(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1193402330855(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getGeneratedName_1177681178696(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1193402330879(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1193402330913(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ConceptMethodDeclaration_Behavior.call_getGeneratedName_1177681178696(_parameterObject.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1193402330937(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1177676953415(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_1194605886822(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "parameters");
  }

  public static Object referenceMacro_GetReferent_1194605811159(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "parameters");
  }

  public static Object referenceMacro_GetReferent_1194605928349(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "parameters");
  }

  public static Object referenceMacro_GetReferent_1194605982656(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "parameters");
  }

  public static Object referenceMacro_GetReferent_1194966901464(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode snode = generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
    return SequenceOperations.getFirst(SLinkOperations.getTargets(snode, "constructor", true));
  }

  public static Object referenceMacro_GetReferent_1194967347554(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode snode = generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
    return SequenceOperations.getFirst(SLinkOperations.getTargets(snode, "constructor", true));
  }

  public static Object referenceMacro_GetReferent_1194967351492(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode snode = generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
    return SequenceOperations.getFirst(SLinkOperations.getTargets(snode, "constructor", true));
  }

  public static Object referenceMacro_GetReferent_1198586190309(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode propertyConstraint = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint", false, false);
    SNode property = SLinkOperations.getTarget(propertyConstraint, "applicableProperty", false);
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if(dataType == null) {
      return null;
    }
    SNode bltype = DataTypeDeclaration_Behavior.call_toBaseLanguageType_1182472765133(dataType);
    if(SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.IntegerType")) {
      return SLinkOperations.getTarget(new QuotationClass_().createNode(), "baseMethodDeclaration", false);
    }
    if(SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.BooleanType")) {
      return SLinkOperations.getTarget(new QuotationClass_1().createNode(), "baseMethodDeclaration", false);
    }
    return SLinkOperations.getTarget(new QuotationClass_2().createNode(), "baseMethodDeclaration", false);
  }

  public static boolean ifMacro_Condition_1184610641051(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "searchScopeCanCreate", true) != null;
  }

  public static boolean ifMacro_Condition_1184610697840(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "searchScopeCanCreate", true) == null;
  }

  public static boolean ifMacro_Condition_1184610049652(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "searchScopeCanCreate", true) != null;
  }

  public static boolean ifMacro_Condition_1184610109644(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "searchScopeCanCreate", true) == null;
  }

  public static boolean ifMacro_Condition_1177759890771(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(SPropertyOperations.getBoolean(node, "isAbstract"));
  }

  public static boolean ifMacro_Condition_1181726948109(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(node, "isVirtual");
  }

  public static boolean ifMacro_Condition_1182162768293(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"));
  }

  public static boolean ifMacro_Condition_1182162773432(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static boolean ifMacro_Condition_1193402330798(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(node, "isVirtual");
  }

  public static boolean ifMacro_Condition_1193402330896(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"));
  }

  public static boolean ifMacro_Condition_1193402330944(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static List sourceNodesQuery_1194605209301(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode n = node;
    return SLinkOperations.getTargets(n, "parameter", true);
  }

  public static List sourceNodesQuery_1194605058164(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "method", true), new zPredicate(null, null)));
  }

  public static List sourceNodesQuery_1177676783297(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1177676798785(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "method", true);
  }

  public static List sourceNodesQuery_1181726948063(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1181726948095(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "method", true);
  }

  public static List sourceNodesQuery_1181727087114(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1182162752935(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1193402330761(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1193402330784(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "method", true);
  }

  public static List sourceNodesQuery_1193402330872(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1193402330930(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }

  public static List sourceNodesQuery_1194966878188(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SModelOperations.getNodes(sourceModel, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint");
  }

  public static List sourceNodesQuery_1194966950464(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SModelOperations.getNodes(sourceModel, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint");
  }

  public static List sourceNodesQuery_1194966965000(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SModelOperations.getNodes(sourceModel, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeDefaultSearchScope");
  }

  public static SNode sourceNodeQuery_1184610732199(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "searchScopeCanCreate", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184610779284(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "searchScopeFactory", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609613810(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "referentSetHandler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184610152426(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "searchScopeCanCreate", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184610216074(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "searchScopeFactory", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609310103(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "propertyGetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609400762(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "propertySetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_1194605404279(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return Type_Behavior.call_getClassExpression_1194035415601(SLinkOperations.getTarget(node, "type", true));
  }

  public static SNode sourceNodeQuery_1177676686820(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "constructor", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177676837084(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode sourceNodeQuery_1177676892345(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }

  public static SNode sourceNodeQuery_1177676915590(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1181726948071(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode sourceNodeQuery_1181726948078(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }

  public static SNode sourceNodeQuery_1181727110484(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }

  public static SNode sourceNodeQuery_1181727002179(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(node, "returnType", true));
  }

  public static SNode sourceNodeQuery_1182162752928(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }

  public static SNode sourceNodeQuery_1193402330769(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode sourceNodeQuery_1193402330776(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }

  public static SNode sourceNodeQuery_1193402330865(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }

  public static SNode sourceNodeQuery_1193402330887(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(node, "returnType", true));
  }

  public static SNode sourceNodeQuery_1193402330923(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }

  public static SNode sourceNodeQuery_1177762503932(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode templateFragment_ContextNodeQuery_1184605541559(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_registerSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184607178268(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_unRegisterSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184607261276(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_registerSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184607289879(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_unRegisterSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184606850811(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_registerSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184606951866(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_unRegisterSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184607373557(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_registerSelf_body(mainContextNode);
  }

  public static SNode templateFragment_ContextNodeQuery_1184607409488(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    return QueriesUtil.get_unRegisterSelf_body(mainContextNode);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187042952593(SNode node, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043119199(SNode node, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043273468(SNode node, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043341571(SNode node, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(node, "class_for_concept");
  }

}
