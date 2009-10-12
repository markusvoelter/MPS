package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SModelLanguageUtil {
  private SModelLanguageUtil() {
  }

  public static SNode getDatatypeFromLeft_SPropertyAccess(SNode operation) {
    SNode property = getPropertyDeclarationFromLeft_SPropertyAccess(operation);
    if ((property != null)) {
      return SLinkOperations.getTarget(property, "dataType", false);
    }
    return null;
  }

  private static SNode getPropertyDeclarationFromLeft_SPropertyAccess(SNode operation) {
    SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(operation), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
    SNode leftOp = SLinkOperations.getTarget(SNodeOperations.cast(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
    if (SNodeOperations.isInstanceOf(leftOp, "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(leftOp, "jetbrains.mps.lang.smodel.structure.SPropertyAccess"), "property", false);
    }
    return null;
  }

  public static SNode getConcept(SNode expression) {
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operation = SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
      if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.lang.smodel.structure.ILinkAccess")) {
        return ILinkAccess_Behavior.call_getTargetConcept_4024382256428848859(SNodeOperations.cast(operation, "jetbrains.mps.lang.smodel.structure.ILinkAccess"));
      }
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
      SNode type = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false), "type", true);
      if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
        return SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false);
      }
    }
    return null;
  }
}
