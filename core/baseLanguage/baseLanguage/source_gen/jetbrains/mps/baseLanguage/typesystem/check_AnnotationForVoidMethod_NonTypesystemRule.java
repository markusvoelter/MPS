package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_AnnotationForVoidMethod_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_AnnotationForVoidMethod_NonTypesystemRule() {
  }

  public void applyRule(final SNode annotationInstance, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(annotationInstance), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(annotationInstance), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) {
      SNode annotation = SLinkOperations.getTarget(annotationInstance, "annotation", false);
      if (annotation == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~Nullable") || annotation == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~NotNull")) {
        {
          BaseQuickFixProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(annotationInstance, "This annotation is not applicable for void method", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4016718966623950802", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnnotationInstance";
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
