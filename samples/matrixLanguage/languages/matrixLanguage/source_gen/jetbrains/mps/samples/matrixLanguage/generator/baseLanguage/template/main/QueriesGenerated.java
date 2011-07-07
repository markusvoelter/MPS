package jetbrains.mps.samples.matrixLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1210006619050(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a0_0().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a0().createNode());
  }

  public static boolean baseMappingRule_Condition_1210007827934(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a1_0().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a1().createNode());
  }

  public static boolean baseMappingRule_Condition_1210008136766(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a2_0().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a2().createNode());
  }

  public static Object propertyMacro_GetPropertyValue_1210244996600(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "it" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1210244688257(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1210244756241(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1210244773397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8124707847641067706(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode() + "Operations";
  }

  public static Object referenceMacro_GetReferent_1210252600192(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "scalarType", true), "types_label");
  }

  public static Object referenceMacro_GetReferent_5219263681752407382(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "forEachIndex");
  }

  public static Object referenceMacro_GetReferent_5219263681752407355(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "forEachElement");
  }

  public static SNode sourceNodeQuery_1210252600204(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1210252600163(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1210252703573(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210251796165(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1209997923540(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "literal", true);
  }

  public static SNode sourceNodeQuery_1210000793912(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matrix", true);
  }

  public static SNode sourceNodeQuery_1210003775050(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210003958249(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210007708699(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210007784027(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210008612674(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210008661055(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210150847257(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210150899292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210151491544(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210151520350(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210151860876(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1210234486307(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1210243632514(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "element", true));
  }

  public static SNode sourceNodeQuery_1210244560165(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "element", true));
  }

  public static SNode sourceNodeQuery_1210244892584(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matrix", true);
  }

  public static SNode sourceNodeQuery_5219263681752403092(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "row", true);
  }

  public static SNode sourceNodeQuery_5219263681752403124(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "column", true);
  }

  public static SNode sourceNodeQuery_1210244600492(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_5219263681752360232(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "element", true);
  }

  public static SNode sourceNodeQuery_8124707847641067550(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067594(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067604(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067613(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067627(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067637(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067646(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067660(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067670(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067690(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_8124707847641067699(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1210252600184(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "row", true);
  }

  public static Iterable sourceNodesQuery_1210252661231(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "items", true);
  }

  public static Iterable sourceNodesQuery_2242344438994122563(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_8124707847641067557(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> possibleScalarTypes = new ArrayList<SNode>();
    for (SNode root : ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), null))) {
      for (SNode t : SNodeOperations.getDescendants(root, "jetbrains.mps.samples.matrixLanguage.structure.MatrixLiteral", false, new String[]{})) {
        ListSequence.fromList(possibleScalarTypes).addElement(SLinkOperations.getTarget(t, "scalarType", true));
      }
    }
    return possibleScalarTypes;
  }

  public static class QuotationClass_x583g4_a1a0a0a0 {
    public QuotationClass_x583g4_a1a0a0a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.addReference(SReference.create("classifier", quotedNode1_4, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Double")));
          quotedNode_1.addChild("scalarType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0a0_0 {
    public QuotationClass_x583g4_a1a0a0a0_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.addReference(SReference.create("classifier", quotedNode1_4, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Double")));
          quotedNode_1.addChild("scalarType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0a1 {
    public QuotationClass_x583g4_a1a0a0a1() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.addReference(SReference.create("classifier", quotedNode1_4, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Double")));
          quotedNode_1.addChild("scalarType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0a1_0 {
    public QuotationClass_x583g4_a1a0a0a1_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DoubleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0a2 {
    public QuotationClass_x583g4_a1a0a0a2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DoubleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a1a0a0a2_0 {
    public QuotationClass_x583g4_a1a0a0a2_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.addReference(SReference.create("classifier", quotedNode1_4, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Double")));
          quotedNode_1.addChild("scalarType", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
