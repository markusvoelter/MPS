package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.RulesFunctions_Collections;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_DistinctOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_DistinctOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode inputElementType = RulesFunctions_Collections.get_inputSequenceType(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(RulesFunctions_Collections.get_inputSequenceType(argument), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.DistinctOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.ext.collections.lang.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178899814695"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
