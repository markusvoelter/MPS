package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.constraintsLanguage.helgins.QuotationClass_10;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ThisNodeExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ThisNodeExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode behaviour = SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior", true, false);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_10().createNode(SLinkOperations.getTarget(behaviour, "concept", false)), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
