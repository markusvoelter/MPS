package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.closures.typesystem._Quotations;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InvokeFunctionOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InvokeFunctionOperation_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    List<SNode> ptypes = ListSequence.<SNode>fromArray();
    List<SNode> ptypes2 = ListSequence.<SNode>fromArray();
    for(SNode p : SLinkOperations.getTargets(invoke, "parameter", true)) {
      ListSequence.fromList(ptypes).addElement(typeCheckingContext.typeOf(p, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237042863792", true));
      ListSequence.fromList(ptypes2).addElement(typeCheckingContext.typeOf(p, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237042864597", true));
    }
    final SNode ret_typevar_1225797542595 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode ret2_typevar_1230048995510 = typeCheckingContext.createNewRuntimeTypesVariable();
    /*
      {
        SNode _nodeToCheck_1029348928467 = invoke;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(invoke, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374021867", true), new _Quotations.QuotationClass_13().createNode(typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225797542595), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374021865", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = invoke;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(new _Quotations.QuotationClass_14().createNode(typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225797542595), typeCheckingContext), typeCheckingContext.typeOf(invoke, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374026565", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374026556", false, 0, intentionProvider);
      }
    */
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(invoke, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374276263", true), typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225797542595), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237374285371", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(invoke), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1230048905737", true), new _Quotations.QuotationClass_15().createNode(ptypes, typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225797542595), ptypes2, typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_1225797542595), typeCheckingContext.getEquationManager().getRepresentator(ret2_typevar_1230048995510), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1230048793938", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
