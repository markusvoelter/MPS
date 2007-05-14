package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.Pattern_;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_24;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;

public class supertypesOf_ClassifierTypeList_ListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */Pattern_ myMatchingPattern;

  public  supertypesOf_ClassifierTypeList_ListType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new QuotationClass_24().createNode(this.myMatchingPattern.PatternVar);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.ext.collections.lang.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178725705727"));
  }
  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new Pattern_();
    return this.myMatchingPattern.match(argument);
  }
  public boolean isSupertyping() {
    return false;
  }
  public boolean isWeak() {
    return false;
  }
}
