package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_70;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_GetAllSubConcepts_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Concept_GetAllSubConcepts_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.getParent(argument, null, false, false), "leftExpression", true);
    SNode leftConceptType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType"), false);
    if(leftConceptType != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_70().createNode(leftConceptType), argument);
    }
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
