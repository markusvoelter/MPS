package jetbrains.mps.lang.textGen.typesystem;

/*Generated by MPS*/

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractTextGenParameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AbstractTextGenParameter_InferenceRule(){
  }

  public void applyRule(final SNode parameter, final TypeCheckingContext typeCheckingContext) {
    SNode textGen = SNodeOperations.getAncestor(parameter, "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration", false, false);
    if ((textGen == null)) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(parameter, "not applicable in this context", "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "1236687971019", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.textGen.structure.AbstractTextGenParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
