package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SequenceCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SequenceCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext) {
    SNode elementType = SLinkOperations.getTarget(creator, "elementType", true);
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1224414558830", true), (SNode)new _Quotations.QuotationClass_57().createNode(elementType, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1224414570410", intentionProvider);
    }
    if ((SLinkOperations.getTarget(creator, "initializer", true) != null)) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(creator, "initializer", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1224414629838", true), (SNode)new _Quotations.QuotationClass_58().createNode(elementType, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1224414640119", false, 0, intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SequenceCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
