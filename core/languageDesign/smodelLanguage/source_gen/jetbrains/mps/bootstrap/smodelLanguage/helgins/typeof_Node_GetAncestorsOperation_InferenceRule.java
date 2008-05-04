package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_GetAncestorsOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_Node_GetAncestorsOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    RulesUtil.checkOpParameters_generic(op);
    final SNode ConceptFromOpParm_typevar_1207354069912 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    RulesUtil.equate_conceptFromOpParm(op, TypeChecker.getInstance().getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207354069912));
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207354069919", true), new QuotationClass_89().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207354069912)), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207354069917");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
