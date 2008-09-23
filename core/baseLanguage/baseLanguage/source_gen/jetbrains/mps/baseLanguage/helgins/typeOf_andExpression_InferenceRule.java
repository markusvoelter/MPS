package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_andExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_andExpression_InferenceRule() {
  }

  public void applyRule(final SNode andExpr, final TypeCheckingContext typeCheckingContext) {
    SNode ae = andExpr;
    {
      SNode _nodeToCheck_1029348928467 = andExpr;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(ae, "leftExpression", true), "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1175495306377", true), new QuotationClass_0().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1175495304171", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = andExpr;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(ae, "rightExpression", true), "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1175495418307", true), new QuotationClass_1().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1175495418306", false, 0, intentionProvider);
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_2().createNode(), ae, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1175496779853");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AndExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
