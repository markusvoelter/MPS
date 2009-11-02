package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;

public class any_type_subtypeof_wildcard_type_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public any_type_subtypeof_wildcard_type_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.WildCardType";
  }
}
