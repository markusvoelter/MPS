package jetbrains.mps.ui.modeling.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ExpressionWithUnit_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ExpressionWithUnit_InferenceRule() {
  }

  public void applyRule(final SNode ewu, final TypeCheckingContext typeCheckingContext) {
    SNode ut = SConceptOperations.createNewNode("jetbrains.mps.ui.modeling.structure.UnitType", null);
    SPropertyOperations.set(ut, "unit", SPropertyOperations.getString_def(ewu, "unit", "PIXEL"));
    {
      SNode _nodeToCheck_1029348928467 = ewu;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:a301270c-6f4f-43ab-84f3-d9145aa32bc7(jetbrains.mps.ui.modeling.typesystem)", "2663453265348162539", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:a301270c-6f4f-43ab-84f3-d9145aa32bc7(jetbrains.mps.ui.modeling.typesystem)", "2663453265348162536", true), (SNode) ut, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ui.modeling.structure.ExpressionWithUnit";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
