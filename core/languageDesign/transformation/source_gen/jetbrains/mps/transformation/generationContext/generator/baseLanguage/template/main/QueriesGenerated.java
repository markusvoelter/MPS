package jetbrains.mps.transformation.generationContext.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1216862267898(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_Base");
  }

  public static Object propertyMacro_GetPropertyValue_1216862267927(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1216862267963(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object referenceMacro_GetReferent_1216862267882(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    // method parameter
    return "_context";
  }

  public static SNode sourceNodeQuery_1216862267891(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    // delegate reduction to operation
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_1216862267915(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "operand", true);
  }

  public static SNode sourceNodeQuery_1216862267943(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "operand", true);
  }

  public static SNode sourceNodeQuery_1216862267955(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputNode", true);
  }

}
