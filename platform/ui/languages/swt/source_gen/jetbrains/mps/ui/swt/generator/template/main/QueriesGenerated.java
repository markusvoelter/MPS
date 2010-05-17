package jetbrains.mps.ui.swt.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ui.multiplexing.VariantsUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.ui.modeling.behavior.ApplyConstraintStatement_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.ui.swt.generator.template.helper.SWTTransientValues;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import jetbrains.mps.generator.template.MapSrcMacroPostProcContext;
import jetbrains.mps.ui.modeling.behavior.HasTemplate_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1251509410704075107(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "template", false) == null) && VariantsUtil.isWithinVariant(_context.getNode(), "SWT");
  }

  public static boolean baseMappingRule_Condition_6991444902044111408(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.baseLanguage.structure.Type");
  }

  public static boolean baseMappingRule_Condition_6991444902044111444(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public static boolean baseMappingRule_Condition_6991444902044111480(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.baseLanguage.structure.Statement");
  }

  public static boolean baseMappingRule_Condition_6030013275785846801(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return VariantsUtil.isWithinVariant(_context.getNode(), "SWT");
  }

  public static boolean baseMappingRule_Condition_873604604380655247(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "left", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "width", true) != null);
  }

  public static boolean baseMappingRule_Condition_873604604381093179(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "left", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "right", true) != null);
  }

  public static boolean baseMappingRule_Condition_873604604381093287(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "right", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "width", true) != null);
  }

  public static boolean baseMappingRule_Condition_873604604380664371(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "PERCENT".equals(SPropertyOperations.getString_def(_context.getNode(), "unit", "PIXEL"));
  }

  public static boolean baseMappingRule_Condition_873604604381084868(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "PERCENT".equals(SPropertyOperations.getString_def(SNodeOperations.as(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true), "jetbrains.mps.ui.modeling.structure.ExpressionWithUnit"), "unit", "PIXEL")) && "PERCENT".equals(SPropertyOperations.getString_def(SNodeOperations.as(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true), "jetbrains.mps.ui.modeling.structure.ExpressionWithUnit"), "unit", "PIXEL"));
  }

  public static boolean baseMappingRule_Condition_873604604381093571(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "top", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "height", true) != null);
  }

  public static boolean baseMappingRule_Condition_873604604381093645(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "top", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "bottom", true) != null);
  }

  public static boolean baseMappingRule_Condition_873604604381093734(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "bottom", true) != null) && (SLinkOperations.getTarget(_context.getNode(), "height", true) != null);
  }

  public static boolean baseMappingRule_Condition_6991444902043988841(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "LEFT".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "LEFT"));
  }

  public static boolean baseMappingRule_Condition_6991444902043988851(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "CENTER".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "LEFT"));
  }

  public static boolean baseMappingRule_Condition_6991444902043988863(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "RIGHT".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "LEFT"));
  }

  public static boolean baseMappingRule_Condition_6991444902043988875(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "FILL".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "LEFT"));
  }

  public static boolean baseMappingRule_Condition_6991444902043990851(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "TOP".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "TOP"));
  }

  public static boolean baseMappingRule_Condition_6991444902043990861(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "MIDDLE".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "TOP"));
  }

  public static boolean baseMappingRule_Condition_6991444902043990873(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "BOTTOM".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "TOP"));
  }

  public static boolean baseMappingRule_Condition_6991444902043990885(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return "FILL".equals(SPropertyOperations.getString_def(_context.getNode(), "value", "TOP"));
  }

  public static Object propertyMacro_GetPropertyValue_873604604380680410(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("fd", null);
  }

  public static Object propertyMacro_GetPropertyValue_8508807536212497659(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("data", null);
  }

  public static Object referenceMacro_GetReferent_6196826443637336762(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282171955950(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124220(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124254(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124268(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124282(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124296(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124323(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124337(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124351(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124365(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124379(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_1917449282172124393(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", false, false), "applyConstraints_FormData");
  }

  public static Object referenceMacro_GetReferent_8508807536212519029(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "applyConstraints_GridData");
  }

  public static boolean ifMacro_Condition_6991444902044355352(final IOperationContext operationContext, final IfMacroContext _context) {
    return ApplyConstraintStatement_Behavior.call_hasConstraint_6030013275785838176(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint"));
  }

  public static boolean ifMacro_Condition_6991444902044355362(final IOperationContext operationContext, final IfMacroContext _context) {
    return ApplyConstraintStatement_Behavior.call_hasConstraint_6030013275785838176(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"));
  }

  public static boolean ifMacro_Condition_6991444902044355372(final IOperationContext operationContext, final IfMacroContext _context) {
    return ApplyConstraintStatement_Behavior.call_hasConstraint_6030013275785838176(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint"));
  }

  public static boolean ifMacro_Condition_873604604380664539(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_6991444902044439262(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint"), "hConstraint", true) != null);
  }

  public static boolean ifMacro_Condition_6991444902044439323(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint"), "vConstraint", true) != null);
  }

  public static boolean ifMacro_Condition_1917449282171955944(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1917449282172124237(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1917449282172124247(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1917449282172124153(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1917449282172124163(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1917449282172124173(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_8508807536212497651(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_8508807536212519056(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "columnConstraint", true), "spanCols", true) != null);
  }

  public static boolean ifMacro_Condition_8508807536212520473(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "rowConstraint", true), "spanRows", true) != null);
  }

  public static boolean ifMacro_Condition_6991444902043990912(final IOperationContext operationContext, final IfMacroContext _context) {
    return ApplyConstraintStatement_Behavior.call_hasConstraint_6030013275785838176(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint"));
  }

  public static boolean ifMacro_Condition_6991444902043990961(final IOperationContext operationContext, final IfMacroContext _context) {
    return ApplyConstraintStatement_Behavior.call_hasConstraint_6030013275785838176(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint"));
  }

  public static SNode sourceNodeQuery_6196826443637336766(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "widget", true);
  }

  public static SNode sourceNodeQuery_6991444902044439267(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode hc = SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint"), "hConstraint", true);
    SWTTransientValues.ITEM.put(_context, hc, SLinkOperations.getTarget(_context.getNode(), "widget", true));
    SWTTransientValues.THIS.put(_context, hc, SLinkOperations.getTarget(_context.getNode(), "container", true));
    return hc;
  }

  public static SNode sourceNodeQuery_6991444902044439338(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode vc = SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint"), "vConstraint", true);
    SWTTransientValues.ITEM.put(_context, vc, SLinkOperations.getTarget(_context.getNode(), "widget", true));
    SWTTransientValues.THIS.put(_context, vc, SLinkOperations.getTarget(_context.getNode(), "container", true));
    return vc;
  }

  public static SNode sourceNodeQuery_873604604380664413(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_873604604380879005(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0gc().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "width", true)), SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "left", true)));
  }

  public static SNode sourceNodeQuery_873604604381093114(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_873604604381093201(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_873604604381093474(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0jc().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "width", true)), SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "right", true)));
  }

  public static SNode sourceNodeQuery_873604604381093263(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_873604604380664402(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_873604604381093042(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true), "jetbrains.mps.ui.modeling.structure.ExpressionWithUnit"), "expression", true);
  }

  public static SNode sourceNodeQuery_873604604381093038(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true), "jetbrains.mps.ui.modeling.structure.ExpressionWithUnit"), "expression", true);
  }

  public static SNode sourceNodeQuery_873604604381093506(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "top", true);
  }

  public static SNode sourceNodeQuery_873604604381093534(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0pc().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "height", true)), SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "top", true)));
  }

  public static SNode sourceNodeQuery_873604604381093593(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "top", true);
  }

  public static SNode sourceNodeQuery_873604604381093621(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "bottom", true);
  }

  public static SNode sourceNodeQuery_873604604381093685(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0sc().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "top", true)), SNodeOperations.copyNode(SLinkOperations.getTarget(_context.getNode(), "bottom", true)));
  }

  public static SNode sourceNodeQuery_873604604381093710(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "bottom", true);
  }

  public static SNode sourceNodeQuery_8508807536212497686(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "widget", true);
  }

  public static SNode sourceNodeQuery_8508807536212520434(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "columnConstraint", true), "spanCols", true);
  }

  public static SNode sourceNodeQuery_8508807536212520454(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "rowConstraint", true), "spanRows", true);
  }

  public static SNode sourceNodeQuery_6991444902044400813(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint"), "hAlignment", true);
  }

  public static SNode sourceNodeQuery_6991444902044400825(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint"), "vAlignment", true);
  }

  public static SNode sourceNodeQuery_6107522156818956450(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "widget", true);
  }

  public static SNode sourceNodeQuery_6107522156818970145(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "columnConstraint", true), "col", true);
  }

  public static SNode sourceNodeQuery_6107522156818970150(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(ApplyConstraintStatement_Behavior.call_getConstraint_6030013275785842517(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint")), "jetbrains.mps.ui.modeling.structure.CellLayoutConstraint"), "rowConstraint", true), "row", true);
  }

  public static SNode mapSrcMacro_mapper_6991444902044111439(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static SNode mapSrcMacro_mapper_6991444902044111454(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static SNode mapSrcMacro_mapper_6991444902044111490(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static void mapSrcMacro_post_mapper_6991444902044111418(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setTarget(SNodeOperations.cast(_context.getOutputNode(), "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub"), "template", HasTemplate_Behavior.call_findTemplate_3939571372331676060(SLinkOperations.getTarget(_context.getNode(), "hasTemplate", false), SNodeOperations.getModel(_context.getTemplateNode()), _context.getScope()), false);
  }

  public static void mapSrcMacro_post_mapper_6991444902044111458(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setTarget(SNodeOperations.cast(_context.getOutputNode(), "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub"), "template", HasTemplate_Behavior.call_findTemplate_3939571372331676060(SLinkOperations.getTarget(_context.getNode(), "hasTemplate", false), SNodeOperations.getModel(_context.getTemplateNode()), _context.getScope()), false);
  }

  public static void mapSrcMacro_post_mapper_6991444902044111494(final IOperationContext operationContext, final MapSrcMacroPostProcContext _context) {
    SLinkOperations.setTarget(SNodeOperations.cast(_context.getOutputNode(), "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub"), "template", HasTemplate_Behavior.call_findTemplate_3939571372331676060(SLinkOperations.getTarget(_context.getNode(), "hasTemplate", false), SNodeOperations.getModel(_context.getTemplateNode()), _context.getScope()), false);
  }

  public static class QuotationClass_x583g4_a0a0gc {
    public QuotationClass_x583g4_a0a0gc() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0jc {
    public QuotationClass_x583g4_a0a0jc() {
    }

    public SNode createNode(Object parameter_11, Object parameter_12) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.UnaryMinus", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_4;
            {
              quotedNode_5 = (SNode) parameter_11;
              SNode quotedNode1_9;
              if (_parameterValues_129834374.contains(quotedNode_5)) {
                quotedNode1_9 = CopyUtil.copy(quotedNode_5);
              } else {
                _parameterValues_129834374.add(quotedNode_5);
                quotedNode1_9 = quotedNode_5;
              }
              if (quotedNode1_9 != null) {
                quotedNode_4.addChild("expression", HUtil.copyIfNecessary(quotedNode1_9));
              }
            }
            quotedNode_2.addChild("expression", quotedNode1_8);
          }
          quotedNode_1.addChild("rightExpression", quotedNode1_7);
        }
        {
          quotedNode_3 = (SNode) parameter_12;
          SNode quotedNode1_10;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_10 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_10 = quotedNode_3;
          }
          if (quotedNode1_10 != null) {
            quotedNode_1.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_10));
          }
        }
        result = quotedNode1_6;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0pc {
    public QuotationClass_x583g4_a0a0pc() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0sc {
    public QuotationClass_x583g4_a0a0sc() {
    }

    public SNode createNode(Object parameter_11, Object parameter_12) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.UnaryMinus", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_4;
            {
              quotedNode_5 = (SNode) parameter_11;
              SNode quotedNode1_9;
              if (_parameterValues_129834374.contains(quotedNode_5)) {
                quotedNode1_9 = CopyUtil.copy(quotedNode_5);
              } else {
                _parameterValues_129834374.add(quotedNode_5);
                quotedNode1_9 = quotedNode_5;
              }
              if (quotedNode1_9 != null) {
                quotedNode_4.addChild("expression", HUtil.copyIfNecessary(quotedNode1_9));
              }
            }
            quotedNode_2.addChild("expression", quotedNode1_8);
          }
          quotedNode_1.addChild("rightExpression", quotedNode1_7);
        }
        {
          quotedNode_3 = (SNode) parameter_12;
          SNode quotedNode1_10;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_10 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_10 = quotedNode_3;
          }
          if (quotedNode1_10 != null) {
            quotedNode_1.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_10));
          }
        }
        result = quotedNode1_6;
      }
      return result;
    }
  }
}
