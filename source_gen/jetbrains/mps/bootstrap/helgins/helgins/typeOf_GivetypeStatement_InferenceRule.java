package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.helgins.helgins.QuotationClass_6;
import jetbrains.mps.bootstrap.helgins.helgins.QuotationClass_7;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_GivetypeStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_GivetypeStatement_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "typeExpression", true)), new QuotationClass_6().createNode(), SLinkOperations.getTarget(argument, "typeExpression", true), null);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "termExpression", true)), new QuotationClass_7().createNode(), SLinkOperations.getTarget(argument, "termExpression", true), null);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.GivetypeStatement";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
