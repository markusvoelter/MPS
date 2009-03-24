package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.baseLanguage.typesystem._Patterns;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.typesystem._Quotations;

public class double_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_2 myMatchingPattern;

  public double_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode doubleType) {
    return new _Quotations.QuotationClass_62().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_2();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

}
