package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;

public class supertypesOf_IEnumerator_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ _Patterns.Pattern_7 myMatchingPattern;

  public supertypesOf_IEnumerator_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode enumerator, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_110().createNode(this.myMatchingPattern.PatternVar8, typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_7();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }
}
