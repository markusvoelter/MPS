package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ClassifierClassExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_ClassifierClassExpression_InferenceRule() {
  }

  public void applyRule(final SNode classExpr, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = classExpr;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223981485120", true), (SNode)new _Quotations.QuotationClass_21().createNode(SLinkOperations.getTarget(classExpr, "classifier", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223981485115", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierClassExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
