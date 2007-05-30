package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.RulesUtil;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_51;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_52;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Model_RootsIncludingImportedOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Model_RootsIncludingImportedOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    RulesUtil.checkAppliedCorrectly_generic(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_51().createNode(SLinkOperations.getTarget(argument, "concept", false)), argument);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "scope", true)), new QuotationClass_52().createNode(), SLinkOperations.getTarget(argument, "scope", true), null);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_RootsIncludingImportedOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
