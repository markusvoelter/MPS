package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ScopeExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_ScopeExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:1222075024150(jetbrains.mps.logging.refactoring.helgins)", "1215084575791", true), new QuotationClass_23().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024150(jetbrains.mps.logging.refactoring.helgins)", "1215084584419", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "r:1222075024153(jetbrains.mps.logging.refactoring.structure).ScopeExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
