package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.baseLanguage.typesystem._Patterns;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.typesystem._Quotations;

public class java_lang_String_extends_string_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_10 myMatchingPattern;

  public java_lang_String_extends_string_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode stringClassType) {
    return new _Quotations.QuotationClass_98().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_10();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return false;
  }

}
