package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptSubstitutePart_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_ConceptSubstitutePart_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode builder = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false);
    SNode substituteConcept = SLinkOperations.getTarget(builder, "applicableConcept", false);
    SNode conceptToAdd = SLinkOperations.getTarget(nodeToCheck, "concept", false);
    if (!(SConceptOperations.isSubConceptOf(conceptToAdd, NameUtil.nodeFQName(substituteConcept)))) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(nodeToCheck, "Wrong concept to add. Use subtype of " + SPropertyOperations.getString(substituteConcept, "name"), "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.bootstrap.actionsLanguage.helgins)", "1197896061431", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
