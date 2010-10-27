package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_CustomContainerCreator_elementType_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_CustomContainerCreator_elementType_NonTypesystemRule() {
  }

  public void applyRule(final SNode ccc, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SLinkOperations.getTarget(ccc, "elementType", true);
    if (!(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(ccc, "containerDeclaration", false), "typeVariableDeclaration", true)).count() <= 1 && ((ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(ccc, "containerDeclaration", false), "typeVariableDeclaration", true)).count() == 1) == (SLinkOperations.getTarget(ccc, "elementType", true) != null)))) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(ccc, "Invalid type parameter", "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5192033827214196979", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.CustomContainerCreator";
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
