package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArrayLiteral_InferenceRule implements InferenceRule_Runtime {

  public typeof_ArrayLiteral_InferenceRule() {
  }

  public void applyRule(final SNode arrayLiteral) {
    final SNode elementType_typevar_1188221443596 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    for(SNode item : SLinkOperations.getTargets(arrayLiteral, "item", true)) {
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596), TypeChecker.getInstance().getRuntimeSupport().typeOf(item, "jetbrains.mps.baseLanguage.helgins", "1188221461717", true), item, null, "jetbrains.mps.baseLanguage.helgins", "1188221461712", false);
    }
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(arrayLiteral, "jetbrains.mps.baseLanguage.helgins", "1188221454647", true), new QuotationClass_70().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596)), arrayLiteral, null, "jetbrains.mps.baseLanguage.helgins", "1188221467376");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
