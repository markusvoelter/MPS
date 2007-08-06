package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_NotExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_NotExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_39().createNode(), argument, "jetbrains.mps.baseLanguage.helgins", "1176900899744");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1176900878654"), new QuotationClass_40().createNode(), SLinkOperations.getTarget(argument, "expression", true), null, "jetbrains.mps.baseLanguage.helgins", "1176900889144");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.NotExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
