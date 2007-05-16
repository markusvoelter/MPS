package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.RulesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_16;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_ReplaceWithAnotherOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_ReplaceWithAnotherOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    RulesUtil.checkAppliedCorrectly_generic(argument);
    SNode parameter = SLinkOperations.getTarget(argument, "parameter", true);
    if(!((parameter == null))) {
      TypeChecker.getInstance().getRuntimeSupport().check(parameter);
      if(!(!((TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter) == null)))) {
        TypeChecker.getInstance().reportTypeError(parameter, "no type");
      }
      if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter), new QuotationClass_16().createNode()))) {
        TypeChecker.getInstance().reportTypeError(parameter, "incompatible type: snode expected");
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178287490242"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
