package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_RemoveAllSetElementsOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_RemoveAllSetElementsOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1226594108923 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(operation), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108932", true), new _Quotations.QuotationClass_106().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1226594108923), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108924", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(operation, "argument", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108944", true), new _Quotations.QuotationClass_107().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1226594108923), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108936", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(operation, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108954", true), new _Quotations.QuotationClass_108().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1226594108949", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.RemoveAllSetElementsOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
