package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixInverseOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MatrixInverseOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "expression", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042596837", 0, intentionProvider);
      typeCheckingContext.createLessThanInequation((SNode)MathTypeUtil.qMatrix(MathTypeUtil.qFloat), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042596843", true), false, info);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042596852", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042596849", true), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "expression", true), "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042596857", true), info);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.MatrixInverseOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
