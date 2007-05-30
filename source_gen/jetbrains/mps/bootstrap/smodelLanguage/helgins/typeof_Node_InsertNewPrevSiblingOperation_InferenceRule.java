package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.RulesUtil;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_14;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertNewPrevSiblingOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_InsertNewPrevSiblingOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    RulesUtil.checkAppliedCorrectly_generic(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_14().createNode(SLinkOperations.getTarget(argument, "concept", false)), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
