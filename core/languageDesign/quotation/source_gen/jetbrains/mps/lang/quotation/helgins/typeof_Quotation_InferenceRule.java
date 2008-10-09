package jetbrains.mps.lang.quotation.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Quotation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_Quotation_InferenceRule() {
  }

  public void applyRule(final SNode quotation, final TypeCheckingContext typeCheckingContext) {
    SNode quotationNode = quotation;
    {
      SNode _nodeToCheck_1029348928467 = quotation;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(quotationNode, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.helgins)", "1196858483112", true), new QuotationClass_0().createNode(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(quotationNode, "quotedNode", true))), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.helgins)", "1196858483110", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.quotation.structure.Quotation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
