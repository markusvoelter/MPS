package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AllAttributesQualifier_InferenceRule implements InferenceRule_Runtime {

  public typeof_AllAttributesQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    // assign type
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205357746693", true), new QuotationClass_66().createNode(), nodeToCheck, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205357746691");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.AllAttributesQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
