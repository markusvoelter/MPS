package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;

public class short_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */Pattern_7 myMatchingPattern;

  public short_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode shortType) {
    return new QuotationClass_65().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new Pattern_7();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

}
