package jetbrains.mps.lang.refactoring.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.refactoring.typesystem._Quotations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractMoveNodesExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AbstractMoveNodesExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "whatToMove", true), "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1199620292746", true), new _Quotations.QuotationClass_6().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1199620292740", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1199621101272", true), new _Quotations.QuotationClass_7().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1199621105994", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.AbstractMoveNodesExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
