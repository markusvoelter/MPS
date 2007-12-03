package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Model_NodesIncludingImportedOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Model_NodesIncludingImportedOperation_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    RulesUtil.checkAppliedCorrectly_generic(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_76().createNode(SLinkOperations.getTarget(argument, "concept", false)), argument, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1182512146602");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "scope", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1182512146613", true), new QuotationClass_77().createNode(), SLinkOperations.getTarget(argument, "scope", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1182512146610");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesIncludingImportedOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
