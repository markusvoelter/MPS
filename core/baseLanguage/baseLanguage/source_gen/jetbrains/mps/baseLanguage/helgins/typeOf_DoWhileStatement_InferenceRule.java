package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_DoWhileStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_DoWhileStatement_InferenceRule() {
  }

  public void applyRule(final SNode doWhileStatement) {
    {
      SNode _nodeToCheck_1029348928467 = doWhileStatement;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(doWhileStatement, "condition", true), "jetbrains.mps.baseLanguage.helgins", "1177667395190", true), new QuotationClass_64().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1177667395187", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.DoWhileStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
