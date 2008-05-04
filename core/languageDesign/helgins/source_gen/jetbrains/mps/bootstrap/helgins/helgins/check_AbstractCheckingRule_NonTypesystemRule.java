package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.constraints.StatementList_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_AbstractCheckingRule_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_AbstractCheckingRule_NonTypesystemRule() {
  }

  public void applyRule(final SNode abstractCheckingRule) {
    StatementList_Behavior.call_checkDataFlow_1206985459773(SLinkOperations.getTarget(abstractCheckingRule, "body", true));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.AbstractCheckingRule";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
