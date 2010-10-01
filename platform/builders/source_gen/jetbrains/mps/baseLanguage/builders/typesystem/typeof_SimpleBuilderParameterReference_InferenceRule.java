package jetbrains.mps.baseLanguage.builders.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SimpleBuilderParameterReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SimpleBuilderParameterReference_InferenceRule() {
  }

  public void applyRule(final SNode reference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = reference;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "901357770590752903", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "901357770590752900", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(reference, "parameter", false), "r:35ef73a5-9726-4c66-9d79-f51c95cc08d6(jetbrains.mps.baseLanguage.builders.typesystem)", "901357770590752908", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameterReference";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
