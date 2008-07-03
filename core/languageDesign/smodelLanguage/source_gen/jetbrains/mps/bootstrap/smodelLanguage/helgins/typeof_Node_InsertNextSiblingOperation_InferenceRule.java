package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertNextSiblingOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_Node_InsertNextSiblingOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode parameter = SLinkOperations.getTarget(op, "insertedNode", true);
    if (!((parameter == null))) {
      {
        SNode _nodeToCheck_1029348928467 = parameter;
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057239248", true), new QuotationClass_13().createNode(), _nodeToCheck_1029348928467, "incompatible type: snode expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057239246", false, 0);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
