package jetbrains.mps.lang.textGen.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.textGen.behavior.SimpleTextGenOperation_Behavior;
import jetbrains.mps.lang.textGen.behavior.BaseTextGenOperation_Behavior;
import jetbrains.mps.lang.textGen.behavior.AbstractTextGenParameter_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.textGen.behavior.WithIndentOperation_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1234790397321(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.textGen.structure.BaseTextGenOperation")) && !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.textGen.structure.AppendOperation")) && !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1234793527695(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return BaseTextGenOperation_Behavior.call_isBaseGenerate_1235575536755(_context.getNode()) && !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1234876313955(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.textGen.structure.NodeParameter")) && !(AbstractTextGenParameter_Behavior.call_inLangConcept_1236168601263(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1234879670664(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.textGen.structure.BaseTextGenOperation")) && !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.textGen.structure.AppendOperation")) && SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1234879955162(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return AbstractTextGenParameter_Behavior.call_inLangConcept_1236168601263(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1234880094612(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return BaseTextGenOperation_Behavior.call_isBaseGenerate_1235575536755(_context.getNode()) && SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1234881146620(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf((SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration", false, false)), "jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration");
  }

  public static boolean baseMappingRule_Condition_1234881149429(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf((SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration", false, false)), "jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration");
  }

  public static boolean baseMappingRule_Condition_1235572192248(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(AbstractTextGenParameter_Behavior.call_inLangConcept_1236168601263(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1236017804038(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1236017872773(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1236184352354(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new _Quotations.QuotationClass_0().createNode()) && SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(SNodeOperations.getParent(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1236184488045(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new _Quotations.QuotationClass_1().createNode())) && SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(SNodeOperations.getParent(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_1236184986714(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new _Quotations.QuotationClass_2().createNode()) && !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(SNodeOperations.getParent(_context.getNode())));
  }

  public static boolean baseMappingRule_Condition_1236185000864(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new _Quotations.QuotationClass_3().createNode())) && !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(SNodeOperations.getParent(_context.getNode())));
  }

  public static boolean baseMappingRule_Condition_1236188801690(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return WithIndentOperation_Behavior.call_inLangConcept_1236188788769(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1236188817234(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(WithIndentOperation_Behavior.call_inLangConcept_1236188788769(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_1233679994384(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1233930145391(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1234790549495(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1234804322215(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1236017278372(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ((SNode)SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", true), "operation", true)).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1236017401737(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ((SNode)(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", true), "operation", true))).toString();
  }

  public static Object propertyMacro_GetPropertyValue_1236192469895(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "separator");
  }

  public static Object propertyMacro_GetPropertyValue_1236192493530(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "separator");
  }

  public static Object referenceMacro_GetReferent_1234197240096(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "conceptDeclaration", false);
  }

  public static Object referenceMacro_GetReferent_1234369414981(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "baseTextGen", false), "name");
  }

  public static Object referenceMacro_GetReferent_1234806117539(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "function", false), "name");
  }

  public static Object referenceMacro_GetReferent_1234806117548(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString((SNodeOperations.getAncestor(SLinkOperations.getTarget(_context.getNode(), "function", false), "jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration", false, false)), "name");
  }

  public static Object referenceMacro_GetReferent_1234807694263(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "function", false), "name");
  }

  public static Object referenceMacro_GetReferent_1234874573403(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_getMethodName_1234789420862(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234874812166(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_getMethodName_1234789420862(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234875781465(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return AbstractTextGenParameter_Behavior.call_getGetterName_1234885318469(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234879202765(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_getMethodName_1234789420862(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234879337184(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return AbstractTextGenParameter_Behavior.call_getGetterName_1234885318469(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234879458785(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_getMethodName_1234789420862(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_1234881048987(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "function", false), "name");
  }

  public static Object referenceMacro_GetReferent_1234881048996(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString((SNodeOperations.getAncestor(SLinkOperations.getTarget(_context.getNode(), "function", false), "jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration", false, false)), "name");
  }

  public static boolean ifMacro_Condition_1234793938421(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "baseTextGen", false) != null);
  }

  public static boolean ifMacro_Condition_1236192306962(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode()));
  }

  public static boolean ifMacro_Condition_1236192316373(final IOperationContext operationContext, final IfMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode());
  }

  public static boolean ifMacro_Condition_1236192506119(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode()));
  }

  public static boolean ifMacro_Condition_1236192512577(final IOperationContext operationContext, final IfMacroContext _context) {
    return SimpleTextGenOperation_Behavior.call_inLangConcept_1236168713983(_context.getNode());
  }

  public static SNode sourceNodeQuery_1234792857556(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1234804310603(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "returnType", true);
  }

  public static SNode sourceNodeQuery_1234874792781(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1234879202758(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1234880828413(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1236017318240(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", true), "operand", true);
  }

  public static SNode sourceNodeQuery_1236017425231(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", true), "operand", true);
  }

  public static SNode sourceNodeQuery_1236186566776(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1236186605656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1236191750420(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1236191784636(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1236192385174(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static Iterable sourceNodesQuery_1234195537158(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "textGenBlock", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1234790532953(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "operation", true);
  }

  public static Iterable sourceNodesQuery_1234790593537(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1234790611365(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1234804342939(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "function", true);
  }

  public static Iterable sourceNodesQuery_1234804362278(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1234804405497(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1234806117531(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1234807715167(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1234881048979(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1236187481161(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

  public static Iterable sourceNodesQuery_1236348444985(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "list", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1236348455212(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "list", true), "statement", true);
  }

}
