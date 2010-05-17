package jetbrains.mps.ui.gwt.generator.template.variants;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.ui.multiplexing.VariantsUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_8590671622324562829(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return VariantsUtil.hasGenerateVariants(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8590671622324565531(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String sfx = "_" + VariantsUtil.withinVariant(_context.getNode());
    String res = SPropertyOperations.getString(_context.getNode(), "name");
    if (res.endsWith(sfx)) {
      res = res.substring(0, res.length() - sfx.length());
    }
    return res + "_" + Sequence.fromIterable(VariantsUtil.generateVariants(_context.getNode())).first();
  }

  public static Object propertyMacro_GetPropertyValue_3210848622155446195(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Sequence.fromIterable(VariantsUtil.generateVariants(_context.getNode())).first();
  }

  public static boolean ifMacro_Condition_3210848622155419503(final IOperationContext operationContext, final IfMacroContext _context) {
    return Sequence.fromIterable(VariantsUtil.generateVariants(_context.getNode())).count() > 1;
  }

  public static SNode sourceNodeQuery_8590671622324574676(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "superclass", true);
  }

  public static SNode sourceNodeQuery_8590671622324726319(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "staticInitializer", true);
  }

  public static SNode sourceNodeQuery_8590671622324726367(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "instanceInitializer", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726443(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticMethod", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726428(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "method", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726399(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726381(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "field", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726332(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticInnerClassifiers", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726295(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticField", true);
  }

  public static Iterable sourceNodesQuery_8590671622324574692(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "implementedInterface", true);
  }

  public static Iterable sourceNodesQuery_8590671622324726410(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "constructor", true);
  }

  public static Iterable sourceNodesQuery_3210848622155446051(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return Sequence.fromIterable(VariantsUtil.generateVariants(_context.getNode())).skip(1).select(new ISelector<String, SNode>() {
      public SNode select(String it) {
        return new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a51().createNode(it);
      }
    });
  }

  public static Iterable sourceNodesQuery_8590671622325199201(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "annotation", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode ann) {
        return !(VariantsUtil.isGenerateVariantsAnn(ann) || VariantsUtil.isVariantAnn(ann));
      }
    });
  }

  public static Iterable sourceNodesQuery_8590671622324728512(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeVariableDeclaration", true);
  }

  public static SNode mapSrcMacro_mapper_3210848622155567822(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return _context.getNode();
  }

  public static class QuotationClass_x583g4_a0a0a0a0a51 {
    public QuotationClass_x583g4_a0a0a0a0a51() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("value", (String) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
