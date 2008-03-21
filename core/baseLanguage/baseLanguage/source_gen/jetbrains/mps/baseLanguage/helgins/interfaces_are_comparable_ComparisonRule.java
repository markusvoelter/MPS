package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class interfaces_are_comparable_ComparisonRule extends ComparisonRule_Runtime {

  public  interfaces_are_comparable_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node1, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node2, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface")) {
      return true;
    } else
    {
      return false;
    }
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicable1(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
  }

  public boolean isApplicable2(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName2());
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

}
