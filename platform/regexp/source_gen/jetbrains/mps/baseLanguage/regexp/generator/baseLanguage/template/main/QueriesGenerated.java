package jetbrains.mps.baseLanguage.regexp.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.regexp.generator.baseLanguage.template.util.GeneratorUtil;
import jetbrains.mps.baseLanguage.regexp.generator.baseLanguage.template.util.Flags;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.baseLanguage.regexp.behavior.Regexp_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.regex.Pattern;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.regexp.behavior.ReplaceRegexpOperation_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_2588298302277788537(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode ruc = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false, false);
    return SNodeOperations.isInstanceOf(ruc, "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpExpression") || SNodeOperations.isInstanceOf(ruc, "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_1222259398301(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.SplitOperation");
  }

  public static boolean baseMappingRule_Condition_1222261187751(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_1222261663847(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_3796137614137205667(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_4276824325038550474(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return GeneratorUtil.getRegexpIfContainer(_context.getNode()) != null;
  }

  public static boolean baseMappingRule_Condition_7048923897763033470(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    boolean result = Flags.ADD_VARS.isFlagged(_context.getNode());
    if (result) {
      Flags.ADD_VARS.clear(_context.getNode());
    }
    return result;
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049700876(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Regexp_Behavior.call_toString_1213877429451(SLinkOperations.getTarget(_context.getNode(), "regexp", true));
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049700886(final IOperationContext operationContext, final PropertyMacroContext _context) {
    int result = 0;
    if (SPropertyOperations.getBoolean(_context.getNode(), "multiLine")) {
      result = result + Pattern.MULTILINE;
    }
    if (SPropertyOperations.getBoolean(_context.getNode(), "dotAll")) {
      result = result + Pattern.DOTALL;
    }
    if (SPropertyOperations.getBoolean(_context.getNode(), "caseInsensitive")) {
      result = result + Pattern.CASE_INSENSITIVE;
    }
    return result;
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049700929(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("REGEXP", null);
  }

  public static Object propertyMacro_GetPropertyValue_1174655313358(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1174655168104(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1174658262046(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("_Replacer", null);
  }

  public static Object propertyMacro_GetPropertyValue_1174659618559(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<SNode> parensList = new ArrayList<SNode>();
    Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(c, "regexp", true), "jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression"), "regexp", true), parensList);
    return 1 + ListSequence.fromList(parensList).indexOf(parens);
  }

  public static Object propertyMacro_GetPropertyValue_1175155526348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175155558088(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175169642723(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175169648262(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175170026397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<SNode> parensList = new ArrayList<SNode>();
    Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(c, "regexp", true), "jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression"), "regexp", true), parensList);
    return 1 + ListSequence.fromList(parensList).indexOf(parens);
  }

  public static Object propertyMacro_GetPropertyValue_7048923897763036419(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("_matcher_", SNodeOperations.getParent(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049792853(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Regexp_Behavior.call_toString_1213877429451(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation"), "search", true));
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049792866(final IOperationContext operationContext, final PropertyMacroContext _context) {
    int result = 0;
    SNode rro = SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation");
    if (SPropertyOperations.getBoolean(rro, "multiLine")) {
      result = result + Pattern.MULTILINE;
    }
    if (SPropertyOperations.getBoolean(rro, "dotAll")) {
      result = result + Pattern.DOTALL;
    }
    if (SPropertyOperations.getBoolean(rro, "caseInsensitive")) {
      result = result + Pattern.CASE_INSENSITIVE;
    }
    return result;
  }

  public static Object propertyMacro_GetPropertyValue_6717546899049792921(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("REPLREGEXP", null);
  }

  public static Object propertyMacro_GetPropertyValue_3796137614137206989(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ReplaceRegexpOperation_Behavior.call_getReplacementString_3796137614137207007(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation"));
  }

  public static Object referenceMacro_GetReferent_1175170026388(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode()), "matcher");
  }

  public static Object referenceMacro_GetReferent_2512254891788090401(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "matcher");
  }

  public static Object referenceMacro_GetReferent_3796137614137206957(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SPropertyOperations.getBoolean(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation"), "globalReplace") ?
      "replaceAll" :
      "replaceFirst"
    );
  }

  public static SNode sourceNodeQuery_1174512824855(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174512909652(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1174512937325(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1174659183903(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_6717546899049826137(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174659237673(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "replaceBlock", true);
  }

  public static SNode sourceNodeQuery_1174658308251(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1175155573909(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175155635929(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175155725139(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1175164955452(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175164958475(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169696431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169704904(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175169838691(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1179358309388(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1179358364442(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputExpression", true);
  }

  public static SNode sourceNodeQuery_1222257141471(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1222257141479(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.SplitOperation"), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222418938523(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1222418914656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if ((SLinkOperations.getTarget(_context.getNode(), "operation", true) == null) || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation"))) {
      return null;
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation"), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222261273767(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if ((SLinkOperations.getTarget(_context.getNode(), "operation", true) == null) || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation"))) {
      return null;
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpOperation"), "replaceBlock", true);
  }

  public static SNode sourceNodeQuery_1222261743052(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation"), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222261743061(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_6129327962763257360(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_6129327962763258610(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputExpression", true);
  }

  public static SNode sourceNodeQuery_4276824325038550656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_4276824325038550665(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputExpression", true);
  }

  public static SNode sourceNodeQuery_3796137614137206943(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static Iterable sourceNodesQuery_7048923897763033580(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Flags.REGEXP_NEED_VAR.isFlagged(it);
      }
    });
  }

  public static Iterable sourceNodesQuery_7048923897763033509(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "statement", true);
  }

  public static void mappingScript_CodeBlock_7048923897762709815(final IOperationContext operationContext, final MappingScriptContext _context) {
    for (SNode expr : SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression")) {
      SNode container = GeneratorUtil.getRegexpIfContainer(expr);
      if (container != null) {
        Flags.ADD_VARS.flag(SNodeOperations.getParent(container));
        Flags.REGEXP_NEED_VAR.flag(expr);
      }
    }
  }
}
