package jetbrains.mps.lang.quotation.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;

public class check_ListAntiquotation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_ListAntiquotation_NonTypesystemRule() {
  }

  public void applyRule(final SNode listAntiquotation, final TypeCheckingContext typeCheckingContext) {
    SNode annotatedNode = SNodeOperations.getParent(listAntiquotation);
    do {
      SNode matchedNode_1 = SNodeOperations.getParent(annotatedNode);
      {
        boolean matches_1 = false;
        {
          SNode matchingNode_1 = SNodeOperations.getParent(annotatedNode);
          if (matchingNode_1 != null) {
            matches_1 = SModelUtil_new.isAssignableConcept(matchingNode_1.getConceptFqName(), "jetbrains.mps.lang.quotation.structure.Quotation");
          }
        }
        if (matches_1) {
          if (SLinkOperations.getTarget(matchedNode_1, "quotedNode", true) == annotatedNode) {
            {
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().reportTypeError(listAntiquotation, "list antiquotation should not be used on a quoted node itself", "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.helgins)", "1202840835255", intentionProvider);
            }
          }
          break;
        }
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.quotation.structure.ListAntiquotation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
