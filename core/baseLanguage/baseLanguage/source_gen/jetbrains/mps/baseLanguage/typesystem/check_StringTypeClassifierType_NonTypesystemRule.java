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
import jetbrains.mps.smodel.SModelUtil_new;

public class check_StringTypeClassifierType_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_StringTypeClassifierType_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(node, "classifier", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_103().createNode(typeCheckingContext), "classifier", false)) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportInfo(node, "It's recommended to use string type", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1225197259595", intentionProvider, errorTarget);
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
