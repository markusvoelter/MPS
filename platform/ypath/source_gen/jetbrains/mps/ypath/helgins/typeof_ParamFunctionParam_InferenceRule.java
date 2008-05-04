package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ParamFunctionParam_InferenceRule implements InferenceRule_Runtime {

  public typeof_ParamFunctionParam_InferenceRule() {
  }

  public void applyRule(final SNode param) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(SNodeOperations.getAncestor(param, "jetbrains.mps.ypath.structure.IParamFeature", false, false), "parameterType", true), param, "jetbrains.mps.ypath.helgins", "1184674431409");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.ParamFunctionParam";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
