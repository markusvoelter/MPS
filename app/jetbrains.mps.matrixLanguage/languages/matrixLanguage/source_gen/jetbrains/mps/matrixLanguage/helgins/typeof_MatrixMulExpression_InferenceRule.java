package jetbrains.mps.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixMulExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_MatrixMulExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      final SNode left = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "leftExpression", true), "jetbrains.mps.matrixLanguage.helgins", "1210005562793", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(left, new Runnable() {

        public void run() {
          {
            final SNode right = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "rightExpression", true), "jetbrains.mps.matrixLanguage.helgins", "1210005567145", true);
            TypeChecker.getInstance().getRuntimeSupport().whenConcrete(right, new Runnable() {

              public void run() {
                boolean done = false;
                if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(left), new QuotationClass_6().createNode())) {
                  {
                    IMatchingPattern pattern_ = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.matrixLanguage.structure.MatrixType");
                    SNode coercedNode_ = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(right), pattern_);
                    if (coercedNode_ != null) {
                      {
                        SNode _nodeToCheck_1029348928467 = nodeToCheck;
                        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210171765363", true), new QuotationClass_7().createNode(SLinkOperations.getTarget(coercedNode_, "scalarType", true)), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389141");
                      }
                      done = true;
                    }
                  }
                  if (!(done)) {
                    {
                      BaseIntentionProvider intentionProvider = null;
                      TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(nodeToCheck, "rightExpression", true), "Type must be Matrix but " + SNodeOperations.getConceptDeclaration(TypeChecker.getInstance().getEquationManager().getRepresentator(right)), "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389152", intentionProvider);
                    }
                  }
                } else
                if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(right), new QuotationClass_9().createNode())) {
                  {
                    IMatchingPattern pattern_1 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.matrixLanguage.structure.MatrixType");
                    SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(left), pattern_1);
                    if (coercedNode_1 != null) {
                      {
                        SNode _nodeToCheck_1029348928467 = nodeToCheck;
                        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210174269273", true), new QuotationClass_8().createNode(SLinkOperations.getTarget(coercedNode_1, "scalarType", true)), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389164");
                      }
                      done = true;
                    }
                  }
                  if (!(done)) {
                    {
                      BaseIntentionProvider intentionProvider = null;
                      TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(nodeToCheck, "leftExpression", true), "Type must be Matrix but " + SNodeOperations.getConceptDeclaration(TypeChecker.getInstance().getEquationManager().getRepresentator(left)), "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389191", intentionProvider);
                    }
                  }
                } else
                {
                  final SNode v_typevar_1210174591724 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
                  {
                    SNode _nodeToCheck_1029348928467 = nodeToCheck;
                    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210174591729", true), TypeChecker.getInstance().getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389202");
                  }
                  {
                    SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "leftExpression", true);
                    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210174591735", true), TypeChecker.getInstance().getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389205");
                  }
                  {
                    SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "rightExpression", true);
                    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.matrixLanguage.helgins", "1210174591743", true), TypeChecker.getInstance().getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "jetbrains.mps.matrixLanguage.helgins@22_0", "1215699389210");
                  }
                  done = true;
                }
              }

            }, "jetbrains.mps.matrixLanguage.helgins", "1210004912543");
          }
        }

      }, "jetbrains.mps.matrixLanguage.helgins", "1210004689795");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.matrixLanguage.structure.MatrixMultExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
