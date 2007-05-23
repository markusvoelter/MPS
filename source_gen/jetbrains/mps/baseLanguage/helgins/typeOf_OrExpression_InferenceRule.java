package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_40;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_41;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_42;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_OrExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_OrExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftExpression", true)), new QuotationClass_40().createNode(), SLinkOperations.getTarget(argument, "leftExpression", true));
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "rightExpression", true)), new QuotationClass_41().createNode(), SLinkOperations.getTarget(argument, "rightExpression", true));
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_42().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.OrExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
