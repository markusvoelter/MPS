package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_result_InferenceRule implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_result_InferenceRule() {
  }

  public void applyRule(final SNode result) {
    SNode conceptOfResult = SLinkOperations.getTarget(SNodeOperations.getAncestor(result, "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart", false, false), "concept", false);
    {
      SNode _nodeToCheck_1029348928467 = result;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(result, "jetbrains.mps.bootstrap.actionsLanguage.helgins", "1219184766217", true), new QuotationClass_1().createNode(conceptOfResult), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.actionsLanguage.helgins", "1219184766215", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_result";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
