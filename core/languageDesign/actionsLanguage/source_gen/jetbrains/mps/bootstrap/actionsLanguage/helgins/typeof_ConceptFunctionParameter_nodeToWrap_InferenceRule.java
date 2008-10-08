package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_nodeToWrap_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_nodeToWrap_InferenceRule() {
  }

  public void applyRule(final SNode nodeToWrap, final TypeCheckingContext typeCheckingContext) {
    SNode menu = SNodeOperations.getAncestor(nodeToWrap, "jetbrains.mps.bootstrap.actionsLanguage.structure.WrapperSubstituteMenuPart", false, false);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_0().createNode(SLinkOperations.getTarget(menu, "wrappedConcept", false)), nodeToWrap, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.bootstrap.actionsLanguage.helgins)", "1180046146686");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_nodeToWrap";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
