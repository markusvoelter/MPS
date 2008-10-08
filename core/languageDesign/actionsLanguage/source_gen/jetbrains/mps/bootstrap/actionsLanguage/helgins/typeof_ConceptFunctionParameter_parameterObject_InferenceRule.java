package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_parameterObject_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_parameterObject_InferenceRule() {
  }

  public void applyRule(final SNode parameter, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true) != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true), parameter, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.bootstrap.actionsLanguage.helgins)", "1180046146642");
      return;
    }
    if (SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSideTransformMenuPart", false, false), "type", true) != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSideTransformMenuPart", false, false), "type", true), parameter, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.bootstrap.actionsLanguage.helgins)", "1180046146661");
      return;
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parameterObject";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
