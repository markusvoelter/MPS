package jetbrains.mps.lang.quotation.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;

public class check_Antiquotation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_Antiquotation_NonTypesystemRule() {
  }

  public void applyRule(final SNode antiquotation, final TypeCheckingContext typeCheckingContext) {
    SNode annotatedNode = SNodeOperations.getParent(antiquotation);
    do {
      SNode matchedNode_0 = SNodeOperations.getParent(annotatedNode);
      {
        boolean matches_0 = false;
        {
          SNode matchingNode_0 = SNodeOperations.getParent(annotatedNode);
          if (matchingNode_0 != null) {
            matches_0 = SModelUtil_new.isAssignableConcept(matchingNode_0.getConceptFqName(), "jetbrains.mps.lang.quotation.structure.Quotation");
          }
        }
        if (matches_0) {
          if (SLinkOperations.getTarget(matchedNode_0, "quotedNode", true) == annotatedNode) {
            {
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().reportTypeError(antiquotation, "node antiquotation should not be used on a quoted node itself", "r:00000000-0000-4000-0000-011c8959034a(jetbrains.mps.lang.quotation.helgins)", "1202840754879", intentionProvider);
            }
          }
          break;
        }
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.quotation.structure.Antiquotation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
