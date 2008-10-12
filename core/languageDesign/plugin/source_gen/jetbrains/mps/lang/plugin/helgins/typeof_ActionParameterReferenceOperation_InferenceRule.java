package jetbrains.mps.lang.plugin.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ActionParameterReferenceOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ActionParameterReferenceOperation_InferenceRule() {
  }

  public void applyRule(final SNode parameterReferenceOperation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = parameterReferenceOperation;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameterReferenceOperation, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.helgins)", "1206093151683", true), SLinkOperations.getTarget(SLinkOperations.getTarget(parameterReferenceOperation, "member", false), "type", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.helgins)", "1206093159061", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.ActionParameterReferenceOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
