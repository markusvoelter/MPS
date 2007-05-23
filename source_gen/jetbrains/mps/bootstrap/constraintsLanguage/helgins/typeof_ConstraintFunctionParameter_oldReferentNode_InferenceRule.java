package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.constraintsLanguage.helgins.QuotationClass_6;
import jetbrains.mps.bootstrap.constraintsLanguage.helgins.QuotationClass_7;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConstraintFunctionParameter_oldReferentNode_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ConstraintFunctionParameter_oldReferentNode_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    Object targetConcept = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint", false, false), "applicableLink", false), "target", false);
    if((targetConcept == null)) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_6().createNode(), argument);
    } else
    {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_7().createNode(targetConcept), argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_oldReferentNode";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
