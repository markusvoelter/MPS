package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_LambdaMethodParameter_InferenceRule implements InferenceRule_Runtime {

  public typeOf_LambdaMethodParameter_InferenceRule() {
  }

  public void applyRule(final SNode parameter) {
    final SNode T_typevar_1178551166899 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(new QuotationClass_2().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1178551166899)), TypeChecker.getInstance().getRuntimeSupport().typeOf(SNodeOperations.getParent(SNodeOperations.getParent(parameter, null, false, false), null, false, false), "jetbrains.mps.ypath.helgins", "1179327748294", true), SNodeOperations.getParent(SNodeOperations.getParent(parameter, null, false, false), null, false, false), null, "jetbrains.mps.ypath.helgins", "1179327739073");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.ypath.helgins", "1179326834794", true), TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1178551166899), parameter, null, "jetbrains.mps.ypath.helgins", "1179326842470");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.LambdaMethodParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
