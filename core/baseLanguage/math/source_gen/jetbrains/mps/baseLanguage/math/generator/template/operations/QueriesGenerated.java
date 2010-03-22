package jetbrains.mps.baseLanguage.math.generator.template.operations;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1237111605288(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "var", true), "jetbrains.mps.baseLanguage.math.structure.MathSymbolIndex");
  }

  public static boolean baseMappingRule_Condition_1237111638742(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "var", true), "jetbrains.mps.baseLanguage.math.structure.MathSymbolFromToIndex");
  }

  public static boolean baseMappingRule_Condition_1237112518374(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "precondition", true) != null;
  }

  public static boolean baseMappingRule_Condition_1418611629041289492(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new QueriesGenerated.QuotationClass_x583g4_a1a0a0d().createNode());
  }

  public static boolean baseMappingRule_Condition_1418611629041290683(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new QueriesGenerated.QuotationClass_x583g4_a1a0a0e().createNode());
  }

  public static Object propertyMacro_GetPropertyValue_1237191873565(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("r", null);
  }

  public static Object propertyMacro_GetPropertyValue_1237111778085(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "name"), null);
  }

  public static Object propertyMacro_GetPropertyValue_1237125700945(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "name"), null);
  }

  public static Object propertyMacro_GetPropertyValue_1237111769945(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("i", null);
  }

  public static Object propertyMacro_GetPropertyValue_1237123277207(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("v", null);
  }

  public static Object referenceMacro_GetReferent_1237125777321(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.baseLanguage.math.structure.MathSymbolFromToIndex"), "TmpLocalVar");
  }

  public static Object referenceMacro_GetReferent_1237112085618(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "var", true), "jetbrains.mps.baseLanguage.math.structure.MathSymbolFromToIndex"), "TmpLocalVar");
  }

  public static Object referenceMacro_GetReferent_1237112162700(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "var", true), "jetbrains.mps.baseLanguage.math.structure.MathSymbolFromToIndex"), "TmpLocalVar");
  }

  public static Object referenceMacro_GetReferent_1237113243060(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ForeachVar");
  }

  public static Object referenceMacro_GetReferent_1237113245188(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "LocalVar");
  }

  public static Object referenceMacro_GetReferent_1237113438439(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ResultVar");
  }

  public static Object referenceMacro_GetReferent_1237117141434(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InvokedExpression");
  }

  public static Object referenceMacro_GetReferent_1237117144781(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InvokedExpression");
  }

  public static Object referenceMacro_GetReferent_1237117195572(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InvokedExpression");
  }

  public static Object referenceMacro_GetReferent_1237117198279(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InvokedExpression");
  }

  public static boolean ifMacro_Condition_1237117033967(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.baseLanguage.math.structure.BigMaxExpression");
  }

  public static SNode sourceNodeQuery_1237191873553(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "expression", true)), "jetbrains.mps.baseLanguage.structure.Type"));
  }

  public static SNode sourceNodeQuery_1237191873573(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1237116414162(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "indexRef", false);
  }

  public static SNode sourceNodeQuery_1237192149962(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "denominator", true);
  }

  public static SNode sourceNodeQuery_1237192135875(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "numerator", true);
  }

  public static SNode sourceNodeQuery_1237112255041(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "var", true);
  }

  public static SNode sourceNodeQuery_1237111816463(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "var", true), "jetbrains.mps.baseLanguage.math.structure.MathSymbolIndex"), "iterable", true);
  }

  public static SNode sourceNodeQuery_1237125715824(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "var", true);
  }

  public static SNode sourceNodeQuery_1237112127021(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "var", true);
  }

  public static SNode sourceNodeQuery_1237112150640(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "upperBound", true);
  }

  public static SNode sourceNodeQuery_1237112602212(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "precondition", true);
  }

  public static SNode sourceNodeQuery_1418611629041289482(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "expression", true));
  }

  public static SNode sourceNodeQuery_1418611629041290673(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "expression", true));
  }

  public static SNode sourceNodeQuery_1237123277187(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "expression", true)), "jetbrains.mps.baseLanguage.structure.Type"));
  }

  public static SNode sourceNodeQuery_1237123277200(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1237192405705(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1237192427720(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static class QuotationClass_x583g4_a1a0a0d {
    public QuotationClass_x583g4_a1a0a0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.MatrixType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.BigComplexType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode_1.addChild("elementType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0e {
    public QuotationClass_x583g4_a1a0a0e() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.MatrixType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.BigComplexType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode_1.addChild("elementType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
