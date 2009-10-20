package jetbrains.mps.samples.matrixLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixDivExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MatrixDivExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    final SNode v_typevar_1210172745581 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210172745582", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210172745586", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(v_typevar_1210172745581), info);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210172745588", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210172745592", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(v_typevar_1210172745581), info);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "rightExpression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210152315156", 0, intentionProvider);
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.typesystem)", "1210152315158", true), (SNode)new _Quotations.QuotationClass_3().createNode(typeCheckingContext), false, info);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.samples.matrixLanguage.structure.MatrixDivExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
