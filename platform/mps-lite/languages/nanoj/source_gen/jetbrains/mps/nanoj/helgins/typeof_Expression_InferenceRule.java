package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Expression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Expression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197634364394", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "operation", true), "jetbrains.mps.nanoj.helgins", "1197634364397", true), argument, null, "jetbrains.mps.nanoj.helgins", "1197634364392");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.DotExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
