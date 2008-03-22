package jetbrains.mps.baseLanguage.generator.java.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.baseLanguage.constraints.Property_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1201386765715(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(_context.getNode(), "operation", true)), "jetbrains.mps.baseLanguage.structure.PropertyReference");
  }

  public static boolean baseMappingRule_Condition_1202097921504(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode lValue = SLinkOperations.getTarget(_context.getNode(), "lValue", true);
    return SNodeOperations.isInstanceOf(lValue, "jetbrains.mps.baseLanguage.structure.DotExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(lValue, "operation", true), "jetbrains.mps.baseLanguage.structure.PropertyReference");
  }

  public static Object propertyMacro_GetPropertyValue_1201570306027(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "_p_get_" + Property_Behavior.call_getPropertyNameWithId_1202008955205(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1201571350771(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "my" + NameUtil.capitalize(SPropertyOperations.getString(_context.getNode(), "propertyName"));
  }

  public static Object propertyMacro_GetPropertyValue_1202008885748(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "_p_set_" + Property_Behavior.call_getPropertyNameWithId_1202008955205(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1201387048833(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode node = SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "operation", true), "property", false);
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(node, "mn_property_getter");
  }

  public static Object referenceMacro_GetReferent_1202097765258(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode inputNode = SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "operation", true), "property", false);
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(inputNode, "mn_property_setter");
  }

  public static boolean ifMacro_Condition_1201570447832(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isCustomImplementation_1202009265236(_context.getNode());
  }

  public static boolean ifMacro_Condition_1201570983175(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1201571498897(_context.getNode());
  }

  public static boolean ifMacro_Condition_1201571423789(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1201571498897(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202008840753(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_hasSetter_1202595424897(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202009182092(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1201571498897(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202009232386(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isCustomImplementation_1202009265236(_context.getNode());
  }

  public static SNode sourceNodeQuery_1201386890759(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1201570279414(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201570293393(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "visibility", true);
  }

  public static SNode sourceNodeQuery_1201571340778(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1202008874192(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Property_Behavior.call_getSetterVisibility_1202090653454(_context.getNode());
  }

  public static SNode sourceNodeQuery_1202009151075(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1202097741114(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "operand", true);
  }

  public static SNode sourceNodeQuery_1202097755093(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rValue", true);
  }

  public static List sourceNodesQuery_1201570443454(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(Property_Behavior.call_getCustomPropertyImplementation_1202009493962(_context.getNode()), "getAccessor", true), "statementList", true), "statement", true);
  }

  public static List sourceNodesQuery_1202009237531(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(Property_Behavior.call_getCustomPropertyImplementation_1202009493962(_context.getNode()), "setAccessor", true), "statementList", true), "statement", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201570605396(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getGenerator().findCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

}
