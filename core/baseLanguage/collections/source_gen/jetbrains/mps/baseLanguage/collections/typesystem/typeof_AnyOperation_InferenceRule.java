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

public class typeof_AnyOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AnyOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1235566732268 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(operation), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732277", true), (SNode)new _Quotations.QuotationClass_120().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235566732268), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732269", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(operation, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732285", true), (SNode)new _Quotations.QuotationClass_121().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732281", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(operation, "closure", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732297", true), (SNode)new _Quotations.QuotationClass_122().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1235566732268), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1235566732288", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.AnyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
