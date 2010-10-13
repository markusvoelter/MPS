package jetbrains.mps.analyzers.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.analyzers.behavior.Analyzer_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.analyzers.behavior.Rule_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_4943044633102120866(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition");
  }

  public static boolean baseMappingRule_Condition_7986066585199098223(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.PatternCondition");
  }

  public static boolean baseMappingRule_Condition_4943044633102130531(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.analyzers.structure.Rule", false, false), "condition", true), "jetbrains.mps.analyzers.structure.PatternCondition");
  }

  public static boolean baseMappingRule_Condition_4943044633102130536(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.analyzers.structure.Rule", false, false), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition");
  }

  public static Object propertyMacro_GetPropertyValue_9177062368042363996(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "Analyzer";
  }

  public static Object propertyMacro_GetPropertyValue_9177062368042364010(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Analyzer_Behavior.call_getAnalyzerRunnerName_178770917832626025(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_2156297836851612469(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8656002014371078210(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "my" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6776100086565973154(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7985661997283748696(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8656002014371078289(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8656002014371075963(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "Instruction";
  }

  public static Object propertyMacro_GetPropertyValue_6776100086565965466(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "get" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7962250936070468062(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternVar_" + SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(_context.getOriginalCopiedInputNode(_context.getNode())), "jetbrains.mps.lang.pattern.structure.ActionAsPattern"), "varName");
  }

  public static Object propertyMacro_GetPropertyValue_1420906503568751825(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "PatternVar_" + SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(_context.getOriginalCopiedInputNode(_context.getNode())), "jetbrains.mps.lang.pattern.structure.ActionAsPattern"), "varName");
  }

  public static Object propertyMacro_GetPropertyValue_178770917832625999(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Analyzer_Behavior.call_getAnalyzerRunnerFqName_178770917832652115(SLinkOperations.getTarget(_context.getNode(), "analyzer", false));
  }

  public static Object propertyMacro_GetPropertyValue_178770917832661922(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "jetbrains.mps.analyzers.runtime.framework.CustomAnalyzerRunner";
  }

  public static Object propertyMacro_GetPropertyValue_4943044633102149636(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition"), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_5195954419991159423(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4352355327610857137(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Rule_Behavior.call_getFqName_8716397433969716516(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_4352355327610857148(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition")) {
      return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition"), "concept", false));
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(_context.getOriginalCopiedInputNode(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.PatternCondition"), "pattern", true)), "jetbrains.mps.lang.pattern.structure.PatternExpression"), "patternNode", true).getConceptFqName();
  }

  public static Object propertyMacro_GetPropertyValue_4352355327610883660(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Rule_Behavior.call_getFqName_8716397433969716516(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_4352355327610854507(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "AnalyzerRules";
  }

  public static Object referenceMacro_GetReferent_4352355327610910112(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "rules");
  }

  public static Object referenceMacro_GetReferent_8656002014371081884(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "param");
  }

  public static Object referenceMacro_GetReferent_7985661997283748687(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "param");
  }

  public static Object referenceMacro_GetReferent_7801926404027365343(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "param");
  }

  public static Object referenceMacro_GetReferent_6776100086565956027(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "param");
  }

  public static Object referenceMacro_GetReferent_6776100086565965496(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "field");
  }

  public static Object referenceMacro_GetReferent_1420906503568700591(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "instructionRef", true), "instruction", false), "instructionConstructor");
  }

  public static Object referenceMacro_GetReferent_7985661997283753105(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "instruction", false), "instructionClassifier");
  }

  public static Object referenceMacro_GetReferent_7962250936070467999(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "instructionRef", true), "instruction", false), "instructionConstructor");
  }

  public static Object referenceMacro_GetReferent_4943044633102141062(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode rule = SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "applicableNode", false)), "jetbrains.mps.analyzers.structure.Rule");
    SNode method = _context.getOutputNodeByInputNodeAndMappingLabel(rule, "perform");
    return ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).toListSequence()).getElement(1);
  }

  public static Object referenceMacro_GetReferent_4444769741952754168(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "funcParam");
  }

  public static boolean ifMacro_Condition_8656002014371080657(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_7962250936070468118(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.pattern.structure.ActionAsPattern", false, false), "position", true), "jetbrains.mps.lang.pattern.structure.InsertBeforePosition");
  }

  public static boolean ifMacro_Condition_7962250936070467960(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "position", true), "jetbrains.mps.lang.pattern.structure.InsertBeforePosition");
  }

  public static boolean ifMacro_Condition_4352355327610857216(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.PatternCondition");
  }

  public static boolean ifMacro_Condition_4352355327610883676(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition");
  }

  public static SNode sourceNodeQuery_430844094082167075(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initialFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_430844094082167065(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_9177062368042363930(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_430844094082167086(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "mergeFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_430844094082167097(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_9177062368042363961(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_430844094082167117(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "funFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_430844094082167107(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_9177062368042363988(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "direction", true);
  }

  public static SNode sourceNodeQuery_7685333756920161578(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_7685333756920161551(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1213877337320(SLinkOperations.getTarget(_context.getNode(), "latticeElementType", true));
  }

  public static SNode sourceNodeQuery_8656002014371045594(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "condition", true), "jetbrains.mps.analyzers.structure.PatternCondition"), "pattern", true);
  }

  public static SNode sourceNodeQuery_8656002014371078227(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_8656002014371078273(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_6776100086565965446(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1420906503568700586(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_178770917832626066(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "nodeToCheck", true);
  }

  public static SNode sourceNodeQuery_7985661997283753112(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_4943044633102120858(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "actions", true);
  }

  public static SNode sourceNodeQuery_7962250936070467861(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if (SLinkOperations.getTarget(_context.getNode(), "target", true) != null) {
      return SLinkOperations.getTarget(_context.getNode(), "target", true);
    }
    SNode reference = SConceptOperations.createNewNode("jetbrains.mps.analyzers.structure.ApplicableNodeReference", null);
    SLinkOperations.setTarget(reference, "applicableNode", SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.analyzers.structure.Rule", false, false), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition"), false);
    return reference;
  }

  public static SNode sourceNodeQuery_7962250936070467925(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if (SLinkOperations.getTarget(_context.getNode(), "target", true) != null) {
      return SLinkOperations.getTarget(_context.getNode(), "target", true);
    }
    SNode reference = SConceptOperations.createNewNode("jetbrains.mps.analyzers.structure.ApplicableNodeReference", null);
    SLinkOperations.setTarget(reference, "applicableNode", SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.analyzers.structure.Rule", false, false), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition"), false);
    return reference;
  }

  public static SNode sourceNodeQuery_7962250936070467994(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_7962250936070468016(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode reference = SConceptOperations.createNewNode("jetbrains.mps.analyzers.structure.ApplicableNodeReference", null);
    SLinkOperations.setTarget(reference, "applicableNode", SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.analyzers.structure.Rule", false, false), "condition", true), "jetbrains.mps.analyzers.structure.ConceptCondition"), false);
    return reference;
  }

  public static Iterable sourceNodesQuery_8656002014371078217(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_8656002014371081874(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_7985661997283748672(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_7801926404027365331(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_6776100086565956005(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_8656002014371078262(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_6776100086565965431(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_1420906503568700577(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "instructionRef", true), "argument", true);
  }

  public static Iterable sourceNodesQuery_7962250936070467985(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "instructionRef", true), "argument", true);
  }

  public static Iterable sourceNodesQuery_4352355327610857207(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "ruleReference", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "rule", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "rule", false);
      }
    });
  }

  public static Iterable sourceNodesQuery_4352355327610883667(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "ruleReference", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "rule", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "rule", false);
      }
    });
  }
}
