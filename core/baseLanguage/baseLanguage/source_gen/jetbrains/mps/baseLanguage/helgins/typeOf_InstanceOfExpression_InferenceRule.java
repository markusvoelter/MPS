package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_InstanceOfExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_InstanceOfExpression_InferenceRule() {
  }

  public void applyRule(final SNode instanceOfExpression) {
    TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(instanceOfExpression, "leftExpression", true), "jetbrains.mps.baseLanguage.helgins", "1176907625382", true), SLinkOperations.getTarget(instanceOfExpression, "classType", true), instanceOfExpression, null, "jetbrains.mps.baseLanguage.helgins", "1176907635591");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(instanceOfExpression, "jetbrains.mps.baseLanguage.helgins", "1179744201892", true), new QuotationClass_46().createNode(), instanceOfExpression, null, "jetbrains.mps.baseLanguage.helgins", "1179744208448");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.InstanceOfExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
