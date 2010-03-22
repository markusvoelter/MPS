package jetbrains.mps.lang.constraints.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.constraints.behavior.NodeDefaultSearchScope_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.constraints.behavior.NodeReferentConstraint_Behavior;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.constraints.behavior.NodePropertyConstraint_Behavior;
import jetbrains.mps.smodel.behaviour.BehaviorConstants;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.TemplateFragmentContext;
import jetbrains.mps.lang.constraints.generator.baseLanguage.template.util.QueriesUtil;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_1194967181314(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return SModelOperations.getModelName(_context.getInputModel()).endsWith(".constraints");
  }

  public static boolean baseMappingRule_Condition_1187043003325(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043119206(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "propertySetter", true) != null;
  }

  public static boolean baseMappingRule_Condition_1212104879930(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043231002(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true) != null;
  }

  public static boolean baseMappingRule_Condition_1187043358729(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true) != null) || (SLinkOperations.getTarget(_context.getNode(), "presentation", true) != null);
  }

  public static boolean baseMappingRule_Condition_1213107427185(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null) || (SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null) || (SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null) || (SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false) != null) || (SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true) != null);
  }

  public static Object propertyMacro_GetPropertyValue_1184610547646(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeDefaultSearchScope_Behavior.call_getReferentConcept_1213877261403(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610580040(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeDefaultSearchScope_Behavior.call_getReferentConcept_1213877261403(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1215720598098(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(NodeDefaultSearchScope_Behavior.call_getReferentConcept_1213877261403(_context.getNode()), "name") + "_DefaultSearchScope";
  }

  public static Object propertyMacro_GetPropertyValue_1184609665202(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609767181(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_1184609700758(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609822047(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_1184609972214(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610007581(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_1184609981357(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184610013893(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_1215722058730(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getNode()), "name") + "_" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false), "role") + "_ReferentConstraint";
  }

  public static Object propertyMacro_GetPropertyValue_1215721466114(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()), "name") + "_" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name") + "_PropertyConstraint";
  }

  public static Object propertyMacro_GetPropertyValue_1184608961609(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609127099(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608998084(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609151833(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608713100(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609198140(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1184608867617(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1184609224170(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1212101471483(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1212101471492(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1212101471520(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1212101471529(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1213106242798(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1213106765283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_CHILD_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1213106765314(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_PARENT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1227085912913(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_ROOT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1382946559831735873(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.GET_ALTERNATIVE_ICON_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1213107130438(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1213107130456(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.GET_DEFAULT_CONCRETE_CONCEPT_FQ_NAME;
  }

  public static Object referenceMacro_GetReferent_1239021689555(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode snode = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
    return ListSequence.fromList(SLinkOperations.getTargets(snode, "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1239021689212(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode snode = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
    return ListSequence.fromList(SLinkOperations.getTargets(snode, "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1239021689364(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode snode = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
    return ListSequence.fromList(SLinkOperations.getTargets(snode, "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1198586190309(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode propertyConstraint = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.constraints.structure.NodePropertyConstraint", false, false);
    SNode property = SLinkOperations.getTarget(propertyConstraint, "applicableProperty", false);
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (dataType == null) {
      return null;
    }
    SNode bltype = DataTypeDeclaration_Behavior.call_toBaseLanguageType_1213877229718(dataType);
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.IntegerType")) {
      return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a5a24().createNode(), "baseMethodDeclaration", false);
    }
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.BooleanType")) {
      return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a6a24().createNode(), "baseMethodDeclaration", false);
    }
    return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a7a24().createNode(), "baseMethodDeclaration", false);
  }

  public static boolean ifMacro_Condition_3216033926780887577(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "presentation", true) != null);
  }

  public static boolean ifMacro_Condition_3906442776579708832(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "presentation", true) != null);
  }

  public static boolean ifMacro_Condition_8196338484606509724(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true) != null);
  }

  public static boolean ifMacro_Condition_3216033926780887598(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "presentation", true) != null);
  }

  public static boolean ifMacro_Condition_3906442776579908117(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "presentation", true) != null);
  }

  public static boolean ifMacro_Condition_1213106765274(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null;
  }

  public static boolean ifMacro_Condition_1213106765305(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null;
  }

  public static boolean ifMacro_Condition_1227085790509(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null);
  }

  public static boolean ifMacro_Condition_1382946559831657773(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true) != null);
  }

  public static boolean ifMacro_Condition_1213107130447(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false) != null);
  }

  public static SNode sourceNodeQuery_1238150662130(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true), "body", true);
  }

  public static SNode sourceNodeQuery_3906442776579708815(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "presentation", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609613810(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1217540492463(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true), "body", true);
  }

  public static SNode sourceNodeQuery_3906442776579908108(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "presentation", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609310103(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_1184609400762(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertySetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_1212101471559(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true), "body", true);
  }

  public static SNode sourceNodeQuery_1213106765261(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeChild", true), "body", true);
  }

  public static SNode sourceNodeQuery_1213106765292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeParent", true), "body", true);
  }

  public static SNode sourceNodeQuery_1227085938282(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true), "body", true);
  }

  public static SNode sourceNodeQuery_1382946559831657791(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true), "body", true);
  }

  public static Iterable sourceNodesQuery_1194966878188(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.constraints.structure.NodePropertyConstraint");
  }

  public static Iterable sourceNodesQuery_1194966950464(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.constraints.structure.NodeReferentConstraint");
  }

  public static Iterable sourceNodesQuery_1194966965000(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.constraints.structure.NodeDefaultSearchScope");
  }

  public static SNode templateFragment_ContextNodeQuery_1184605541559(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_registerSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184607178268(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_unRegisterSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184607261276(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_registerSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184607289879(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_unRegisterSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184606850811(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_registerSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184606951866(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_unRegisterSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184607373557(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_registerSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1184607409488(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_unRegisterSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1212101471502(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_registerSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode templateFragment_ContextNodeQuery_1212101471538(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return QueriesUtil.get_unRegisterSelf_body(SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187042952593(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043119199(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1212104879922(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043273468(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1187043341571(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "class_for_concept");
  }

  public static class QuotationClass_x583g4_a0a0a5a24 {
    public QuotationClass_x583g4_a0a0a5a24() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getInteger(java.lang.String):int")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a6a24 {
    public QuotationClass_x583g4_a0a0a6a24() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getBoolean(java.lang.String):boolean")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a7a24 {
    public QuotationClass_x583g4_a0a7a24() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getString(java.lang.String):java.lang.String")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
