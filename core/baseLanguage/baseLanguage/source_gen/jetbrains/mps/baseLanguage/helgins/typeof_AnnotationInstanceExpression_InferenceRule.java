package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AnnotationInstanceExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_AnnotationInstanceExpression_InferenceRule() {
  }

  public void applyRule(final SNode annotationInstanceExpression) {
    SNode annotation = SLinkOperations.getTarget(SLinkOperations.getTarget(annotationInstanceExpression, "annotationInstance", true), "annotation", false);
    {
      SNode _nodeToCheck_1029348928467 = annotationInstanceExpression;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(annotationInstanceExpression, "jetbrains.mps.baseLanguage.helgins", "1188221584618", true), new QuotationClass_67().createNode(annotation), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1188221689320", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnnotationInstanceExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
