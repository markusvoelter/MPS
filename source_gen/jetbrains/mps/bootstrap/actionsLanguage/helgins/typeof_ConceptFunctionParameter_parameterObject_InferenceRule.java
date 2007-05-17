package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_parameterObject_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ConceptFunctionParameter_parameterObject_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    if(SLinkOperations.getTarget(SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true) != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true), argument);
      return;
    }
    if(SLinkOperations.getTarget(SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false), "type", true) != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(SNodeOperations.getAncestor(argument, "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false), "type", true), argument);
      return;
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parameterObject";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.actionsLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1177339802623"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
