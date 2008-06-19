package jetbrains.mps.bootstrap.smodelLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class SNodeOperation_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_getLeftExpression_1213877508894(SNode thisNode) {
    SNode parent = SNodeOperations.getParent(thisNode, null, false, false);
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      return SLinkOperations.getTarget(parent, "leftExpression", true);
    }
    // new: DotExpression everywhere
    return SLinkOperations.getTarget(parent, "operand", true);
  }

  public static SNode call_getLeftExpressionLeftExpression_1213877508920(SNode thisNode) {
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(thisNode);
    if (SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      return SLinkOperations.getTarget(leftExpression, "leftExpression", true);
    }
    // new: DotExpression everywhere
    return SLinkOperations.getTarget(leftExpression, "operand", true);
  }

  public static SNode call_getLeftExpressionOperation_1213877508946(SNode thisNode) {
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(thisNode);
    if (SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      return SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
    }
    // new: DotExpression everywhere
    return SLinkOperations.getTarget(leftExpression, "operation", true);
  }

  public static SNode call_getParameter_1213877508972(SNode thisNode, final SNode parameterConcept) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, NameUtil.nodeFQName(parameterConcept));
      }

    }).first();
  }

  public static String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    String variableExpectedName = NameUtil.toValidCamelIdentifier(SConceptPropertyOperations.getString(thisNode, "alias"));
    return variableExpectedName;
  }

  public static SNode getLeftNodeConcept_1213877508847(SNode parent) {
    SNode operand = SLinkOperations.getTarget(parent, "operand", true);
    SNode operandType = TypeChecker.getInstance().getTypeOf(operand);
    if (SNodeOperations.isInstanceOf(operandType, "jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT")) {
      return SLinkOperations.getTarget(operandType, "targetConcept", false);
    } else
    {
      SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(operandType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
      if (nodeType != null) {
        return SLinkOperations.getTarget(nodeType, "concept", false);
      }
    }
    return SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
  }

}
