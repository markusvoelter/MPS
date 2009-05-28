package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;

public class Boolean_extends_boolean_2_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  /* package */_Patterns.Pattern_0 myMatchingPattern;

  public Boolean_extends_boolean_2_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode boolType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_7().createNode(typeCheckingContext);
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
