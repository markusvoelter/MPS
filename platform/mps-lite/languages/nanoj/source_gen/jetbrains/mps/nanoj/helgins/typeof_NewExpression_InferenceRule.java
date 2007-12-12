package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NewExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_NewExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode ct = SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.ClassifierType", null);
    SLinkOperations.setTarget(ct, "classifier", SLinkOperations.getTarget(argument, "classifier", false), false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197468445249", true), ct, argument, null, "jetbrains.mps.nanoj.helgins", "1197468445248");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.NewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
