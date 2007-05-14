package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.RulesFunctions_Collections;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_8;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_9;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ToListOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ToListOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode inputElementType = RulesFunctions_Collections.get_inputSequenceType_elementType(argument);
    if(inputElementType == null) {
      TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(SNodeOperations.getParent(argument, null, false, false), "leftExpression", true), "Can't compute input sequence element type");
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_8().createNode(), argument);
    } else 
    {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_9().createNode(inputElementType), argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToListOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.ext.collections.lang.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178725704677"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
