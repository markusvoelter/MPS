package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetTargetOperation_InferenceRule implements InferenceRule_Runtime {

  public typeOf_Link_SetTargetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode parameter = SLinkOperations.getTarget(op, "parameter", true);
    if ((parameter != null)) {
      final SNode ExpectedType_typevar_1206101371703 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
      RulesUtil.equate_inputNodeType(op, TypeChecker.getInstance().getEquationManager().getRepresentator(ExpectedType_typevar_1206101371703));
      SNode parmType = TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060393994", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(parmType, TypeChecker.getInstance().getEquationManager().getRepresentator(ExpectedType_typevar_1206101371703), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060404653", false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
