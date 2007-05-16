package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_74;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_GetIndexInParentOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_GetIndexInParentOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument), new QuotationClass_74().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetIndexInParentOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1179168261461"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
