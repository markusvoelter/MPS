package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixLiteral_InferenceRule implements InferenceRule_Runtime {

  public typeof_MatrixLiteral_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    /*
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210001192695", true), new QuotationClass_().createNode(SLinkOperations.getTarget(nodeToCheck, "scalarType", true)), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699388813");
      }
    */
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210167980581", true), new QuotationClass_5().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699388849");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.MatrixLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
