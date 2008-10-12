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

public class typeof_ActionDataParameterReferenceOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ActionDataParameterReferenceOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(operation, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.helgins)", "1217252585374", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(operation, "member", false), "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.helgins)", "1217252600934", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.helgins)", "1217252597084", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.ActionDataParameterReferenceOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
