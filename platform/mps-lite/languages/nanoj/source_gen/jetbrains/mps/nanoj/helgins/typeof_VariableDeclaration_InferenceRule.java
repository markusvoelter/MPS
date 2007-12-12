package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_VariableDeclaration_InferenceRule implements InferenceRule_Runtime {

  public  typeof_VariableDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197452471037", true), SLinkOperations.getTarget(argument, "type", true), argument, null, "jetbrains.mps.nanoj.helgins", "1197452471036");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "initializer", true), "jetbrains.mps.nanoj.helgins", "1197452471044", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197452471049", true), SLinkOperations.getTarget(argument, "initializer", true), null, "jetbrains.mps.nanoj.helgins", "1197452471042");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.VariableDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
