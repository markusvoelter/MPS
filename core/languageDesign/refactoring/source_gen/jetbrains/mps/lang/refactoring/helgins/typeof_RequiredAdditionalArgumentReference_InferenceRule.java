package jetbrains.mps.lang.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_RequiredAdditionalArgumentReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_RequiredAdditionalArgumentReference_InferenceRule() {
  }

  public void applyRule(final SNode requiredAdditionalArgumentReference, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = requiredAdditionalArgumentReference;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(requiredAdditionalArgumentReference, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1190728598662", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(requiredAdditionalArgumentReference, "argument", false), "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1190728606544", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1190728604337", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.RequiredAdditionalArgumentReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
