package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConstructorInvocationStatementHasConstructor_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ConstructorInvocationStatementHasConstructor_NonTypesystemRule() {
  }

  public void applyRule(final SNode constructorInvocation, final TypeCheckingContext typeCheckingContext) {
    if ((SLinkOperations.getTarget(constructorInvocation, "baseMethodDeclaration", false) == null)) {
      SNode referent = constructorInvocation.getReferent("constructorDeclaration");
      if (SNodeOperations.isInstanceOf(referent, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.typesystem.SetConstructorDeclaration_QuickFix", true);
          intentionProvider.putArgument("constructorInvocation", constructorInvocation);
          intentionProvider.putArgument("constructorDeclaration", SNodeOperations.cast(referent, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"));
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(constructorInvocation, "no reference to constructor", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1241543946857", intentionProvider, errorTarget);
        }
      } else {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(constructorInvocation, "no reference to constructor", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1241543921898", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConstructorInvocationStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
