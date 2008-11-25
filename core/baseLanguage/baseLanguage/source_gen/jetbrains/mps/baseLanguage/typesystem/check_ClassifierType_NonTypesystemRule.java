package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ClassifierType_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_ClassifierType_NonTypesystemRule() {
  }

  public void applyRule(final SNode classifierType, final TypeCheckingContext typeCheckingContext) {
    if (!(SLinkOperations.getCount(classifierType, "parameter") == 0 || SLinkOperations.getCount(classifierType, "parameter") == SLinkOperations.getCount(SLinkOperations.getTarget(classifierType, "classifier", false), "typeVariableDeclaration"))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(classifierType, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1195494591081", intentionProvider, errorTarget);
    }
    for(SNode typeParameter : SLinkOperations.getTargets(classifierType, "parameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(typeParameter, SLinkOperations.getTarget(new _Quotations.QuotationClass_76().createNode(typeCheckingContext), "descriptor", false), false)))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(typeParameter, "primitive types not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1195494591112", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
