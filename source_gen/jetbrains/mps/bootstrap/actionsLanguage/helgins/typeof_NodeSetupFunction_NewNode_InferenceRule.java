package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NodeSetupFunction_NewNode_InferenceRule implements InferenceRule_Runtime {

  public  typeof_NodeSetupFunction_NewNode_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode hostFactory = SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory", false, false);
    SNode applicableConcept = SLinkOperations.getTarget(hostFactory, "applicableConcept", false);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_4().createNode(applicableConcept), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
