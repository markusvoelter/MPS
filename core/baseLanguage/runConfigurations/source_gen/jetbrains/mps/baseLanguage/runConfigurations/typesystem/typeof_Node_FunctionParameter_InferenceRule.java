package jetbrains.mps.baseLanguage.runConfigurations.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_FunctionParameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Node_FunctionParameter_InferenceRule() {
  }

  public void applyRule(final SNode node_FunctionParameter, final TypeCheckingContext typeCheckingContext) {
    SNode runConfig = SNodeOperations.getAncestor(node_FunctionParameter, "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeRunConfiguration", false, true);
    SNode nodeType = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SNodeType", null);
    if ((runConfig != null)) {
      SLinkOperations.setTarget(nodeType, "concept", SLinkOperations.getTarget(runConfig, "conceptDeclaration", false), false);
      {
        SNode _nodeToCheck_1029348928467 = node_FunctionParameter;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:3d1d89d4-ed40-464f-804b-a59886f41d55(jetbrains.mps.baseLanguage.runConfigurations.typesystem)", "2486271045794925918", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:3d1d89d4-ed40-464f-804b-a59886f41d55(jetbrains.mps.baseLanguage.runConfigurations.typesystem)", "2486271045794925915", true), (SNode) nodeType, _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = node_FunctionParameter;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:3d1d89d4-ed40-464f-804b-a59886f41d55(jetbrains.mps.baseLanguage.runConfigurations.typesystem)", "2486271045794925964", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:3d1d89d4-ed40-464f-804b-a59886f41d55(jetbrains.mps.baseLanguage.runConfigurations.typesystem)", "2486271045794925961", true), (SNode) nodeType, _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.runConfigurations.structure.Node_FunctionParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }
}
