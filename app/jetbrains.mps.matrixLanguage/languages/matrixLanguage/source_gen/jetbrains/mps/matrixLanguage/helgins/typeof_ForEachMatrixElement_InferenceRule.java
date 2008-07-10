package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ForEachMatrixElement_InferenceRule implements InferenceRule_Runtime {

  public typeof_ForEachMatrixElement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      final SNode matrix = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "matrix", true), "jetbrains.mps.matrixLanguage.helgins", "1210240202730", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(matrix, new Runnable() {

        public void run() {
          if (!(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(matrix), "jetbrains.mps.matrixLanguage.structure.MatrixType"))) {
            {
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().reportTypeError(nodeToCheck, "Should be matrix, but " + SNodeOperations.getConceptDeclaration(TypeChecker.getInstance().getEquationManager().getRepresentator(matrix)), "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389951", intentionProvider);
            }
          }
          SNode t = ((SNode)TypeChecker.getInstance().getEquationManager().getRepresentator(matrix));
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "element", true);
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210241241539", true), SLinkOperations.getTarget(t, "scalarType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389966");
          }
        }

      }, "jetbrains.mps.matrixLanguage.helgins", "1210240199916");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.ForEachMatrixElement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
