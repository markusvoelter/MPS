package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.behavior.SNodeOperation_Behavior;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_GetAllSubConcepts_InferenceRule implements InferenceRule_Runtime {

  public typeOf_Concept_GetAllSubConcepts_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    if (SLinkOperations.getTarget(node, "scope", true) != null) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(node, "scope", true);
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683977998", true), new QuotationClass_93().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683977996", false, 0);
      }
    }
    if (SLinkOperations.getTarget(node, "smodel", true) != null) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(node, "smodel", true);
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683989240", true), new QuotationClass_94().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683989238", false, 0);
      }
    }
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(node);
    {
      final SNode LeftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683978022", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(LeftType, new Runnable() {

        public void run() {
          {
            IMatchingPattern pattern_1 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType");
            SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), pattern_1);
            if (coercedNode_1 != null) {
              {
                SNode _nodeToCheck_1029348928467 = node;
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207685633873", true), new QuotationClass_95().createNode(SLinkOperations.getTarget(coercedNode_1, "conceptDeclaraton", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207685633871");
              }
            }
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207683978011");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_GetAllSubConcepts";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
