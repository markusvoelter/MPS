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

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1210006619050(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new _Quotations.QuotationClass_1().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new _Quotations.QuotationClass_0().createNode());
  }

  public static boolean baseMappingRule_Condition_1210007827934(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new _Quotations.QuotationClass_3().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new _Quotations.QuotationClass_2().createNode());
  }

  public static boolean baseMappingRule_Condition_1210008136766(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "leftExpression", true)), new _Quotations.QuotationClass_5().createNode()) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "rightExpression", true)), new _Quotations.QuotationClass_4().createNode());
  }

  public static Object propertyMacro_GetPropertyValue_1210184675751(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode() + "Operations";
  }

  public static Object propertyMacro_GetPropertyValue_1210244688257(final IOperationContext operationContext, final PropertyMacroContext _context) {
    _context.getNode().getId();
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "row", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1210244756241(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "column", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1210244773397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "element", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1210244996600(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "it" + _context.getNode().getId();
  }

  public static Object referenceMacro_GetReferent_1210249503251(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false);
  }

  public static Object referenceMacro_GetReferent_1210250017337(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false);
  }

  public static Object referenceMacro_GetReferent_1210252600192(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "scalarType", true), "types_label");
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

  public static SNode sourceNodeQuery_1210160391619(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160425292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160829403(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160839095(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160849224(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160880307(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160890327(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160904711(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210160927282(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
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

  public static SNode sourceNodeQuery_1210244600492(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "element", true));
  }

  public static SNode sourceNodeQuery_1210244892584(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matrix", true);
  }

  public static SNode sourceNodeQuery_1210251796165(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1210252600163(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1210252600204(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "scalarType", true);
  }

  public static SNode sourceNodeQuery_1210252703573(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210253630926(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1210253814732(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1210160088643(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> possibleScalarTypes = new ArrayList<SNode>();
    for (SNode root : ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), null))) {
      for (SNode t : SNodeOperations.getDescendants(root, "jetbrains.mps.samples.matrixLanguage.structure.MatrixLiteral", false, new String[]{})) {
        ListSequence.fromList(possibleScalarTypes).addElement(SLinkOperations.getTarget(t, "scalarType", true));
      }
    }
    return possibleScalarTypes;
  }

  public static Iterable sourceNodesQuery_1210245899051(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1210252600184(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "row", true);
  }

  public static Iterable sourceNodesQuery_1210252661231(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "items", true);
  }
}
