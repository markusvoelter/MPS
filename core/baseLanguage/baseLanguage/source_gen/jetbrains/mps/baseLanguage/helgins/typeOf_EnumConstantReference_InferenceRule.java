package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_EnumConstantReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_EnumConstantReference_InferenceRule() {
  }

  public void applyRule(final SNode enumConstantRef, final TypeCheckingContext typeCheckingContext) {
    if (!((SLinkOperations.getTarget(enumConstantRef, "enumConstantDeclaration", false) != null))) {
      TypeChecker.getInstance().reportTypeError(enumConstantRef, "no constant declaration", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1176905227742");
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(typeCheckingContext.typeOf(SLinkOperations.getTarget(enumConstantRef, "enumConstantDeclaration", false), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1176905306388", true), enumConstantRef, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1176905295744");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.EnumConstantReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
