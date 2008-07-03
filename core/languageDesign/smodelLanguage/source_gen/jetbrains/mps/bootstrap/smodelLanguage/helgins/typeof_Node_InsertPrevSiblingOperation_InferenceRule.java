package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertPrevSiblingOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_Node_InsertPrevSiblingOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode parameter = SLinkOperations.getTarget(op, "parameter", true);
    if (!((parameter == null))) {
      {
        SNode _nodeToCheck_1029348928467 = parameter;
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057110415", true), new QuotationClass_14().createNode(), _nodeToCheck_1029348928467, "incompatible type: snode expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057110413", false, 0);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
