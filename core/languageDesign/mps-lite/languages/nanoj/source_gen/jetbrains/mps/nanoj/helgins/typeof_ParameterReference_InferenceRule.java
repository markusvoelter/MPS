package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ParameterReference_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ParameterReference_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406417", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "parameter", false), "jetbrains.mps.nanoj.helgins", "1197638406419", true), nodeToCheck, null, "jetbrains.mps.nanoj.helgins", "1197638406416");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.ParameterReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
