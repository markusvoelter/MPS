package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ForEachStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ForEachStatement_InferenceRule() {
  }

  public void applyRule(final SNode forEachStatement, final TypeCheckingContext typeCheckingContext) {
    SNode variable = SLinkOperations.getTarget(forEachStatement, "variable", true);
    SNode inputSequence = SLinkOperations.getTarget(forEachStatement, "inputSequence", true);
    if ((inputSequence != null) && (variable != null)) {
      final SNode elementType_typevar_1184771826645 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = forEachStatement;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation(new _Quotations.QuotationClass_19().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184771826645), typeCheckingContext), typeCheckingContext.typeOf(inputSequence, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772149783", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772149777", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = forEachStatement;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(typeCheckingContext.typeOf(variable, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184771942551", true), typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184771826645), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184772002733", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
