package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;

public class typeof_ContainsOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_ContainsOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    do {
      SNode matchedNode_1178725705169 = parent;
      {
        boolean matches_1205249543839 = false;
        matches_1205249543839 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression");
        if (matches_1205249543839) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_60().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1205249554164");
          break;
        }
      }
      {
        boolean matches_1178725705171 = false;
        matches_1178725705171 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.DotExpression");
        if (matches_1178725705171) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_14().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1178725705174");
          break;
        }
      }
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(op, "not expected here", "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1178725705180", intentionProvider);
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
