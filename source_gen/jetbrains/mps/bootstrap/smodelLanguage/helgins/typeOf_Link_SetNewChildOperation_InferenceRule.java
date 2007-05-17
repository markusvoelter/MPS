package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.RulesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_52;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetNewChildOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Link_SetNewChildOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode resultConcept = null;
    if(RulesUtil.checkAppliedTo_LinkAccess_aggregation(argument)) {
      SNode expectedConcept = RulesUtil.get_inputNodeConcept(argument);
      SNode parameterConcept = SLinkOperations.getTarget(argument, "concept", false);
      if(parameterConcept == null) {
        resultConcept = expectedConcept;
      } else 
      {
        resultConcept = parameterConcept;
        RulesUtil.checkAssignableConcept(parameterConcept, expectedConcept, argument, "incompatibel parameter concept");
      }
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_52().createNode(resultConcept), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178287490339"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
