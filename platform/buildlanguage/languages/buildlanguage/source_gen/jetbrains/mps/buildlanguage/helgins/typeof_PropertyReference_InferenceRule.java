package jetbrains.mps.buildlanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyReference_InferenceRule implements InferenceRule_Runtime {

  public  typeof_PropertyReference_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.buildlanguage.helgins", "1196871332366", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "propertyDeclaration", false), "jetbrains.mps.buildlanguage.helgins", "1196871369284", true), argument, null, "jetbrains.mps.buildlanguage.helgins", "1196871348598");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.buildlanguage.structure.PropertyReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
