package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_GetAllSubConcepts_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Concept_GetAllSubConcepts_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.getParent(argument, null, false, false), "leftExpression", true);
    final SNode C_typevar_1186061759037 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061764227", true), new QuotationClass_71().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186061759037)), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061769012");
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_72().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186061759037)), argument, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061823788");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_GetAllSubConcepts";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
