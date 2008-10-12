package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PlusExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_PlusExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "leftPart", true), "jetbrains.mps.nanoj.helgins", "1197638406650", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406655", true), SLinkOperations.getTarget(nodeToCheck, "leftPart", true), null, "jetbrains.mps.nanoj.helgins", "1197638406648", false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "rightPart", true), "jetbrains.mps.nanoj.helgins", "1197638406659", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406664", true), SLinkOperations.getTarget(nodeToCheck, "rightPart", true), null, "jetbrains.mps.nanoj.helgins", "1197638406657", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.PlusExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
