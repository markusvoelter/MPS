package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ConceptRefExpression_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ConceptRefExpression_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711929818", true), new QuotationClass_34().createNode(SLinkOperations.getTarget(node, "conceptDeclaration", false)), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711929816");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptRefExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
