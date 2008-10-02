package jetbrains.mps.samples.complex.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1196427940914(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196428156151(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QuotationClass_0().createNode()) && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196428673012(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QuotationClass_1().createNode()) && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196428788645(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QuotationClass_2().createNode());
  }

  public static boolean baseMappingRule_Condition_1196428954076(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QuotationClass_3().createNode());
  }

  public static boolean baseMappingRule_Condition_1196428960673(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196429812089(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196429812124(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QuotationClass_4().createNode());
  }

  public static boolean baseMappingRule_Condition_1196429812142(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QuotationClass_5().createNode()) && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196429868936(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType") && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static boolean baseMappingRule_Condition_1196429868971(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(_context.getNode()), "jetbrains.mps.samples.complex.structure.ComplexType") && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QuotationClass_6().createNode());
  }

  public static boolean baseMappingRule_Condition_1196429868989(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QuotationClass_7().createNode()) && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), "jetbrains.mps.samples.complex.structure.ComplexType");
  }

  public static SNode sourceNodeQuery_1196266594304(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196266618974(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196269927259(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196270748443(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196420114842(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196422335332(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "complexExpression", true);
  }

  public static SNode sourceNodeQuery_1196422353779(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "degree", true);
  }

  public static SNode sourceNodeQuery_1196428086675(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196428118311(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196428555198(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196428575541(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196428709173(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196428728720(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196428818669(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196428818678(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429085342(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429085350(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429105759(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429169279(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429269011(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429269020(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429269044(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429269053(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429328964(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429328973(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429328997(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429329006(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429812109(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429812117(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1196429868956(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1196429868964(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

}
