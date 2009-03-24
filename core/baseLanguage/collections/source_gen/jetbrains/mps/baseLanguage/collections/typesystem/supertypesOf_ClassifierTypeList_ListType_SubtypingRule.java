package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.baseLanguage.collections.typesystem._Patterns;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.collections.typesystem._Quotations;

public class supertypesOf_ClassifierTypeList_ListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_0 myMatchingPattern;

  public supertypesOf_ClassifierTypeList_ListType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode node) {
    return new _Quotations.QuotationClass_37().createNode(this.myMatchingPattern.PatternVar0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_0();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

}
