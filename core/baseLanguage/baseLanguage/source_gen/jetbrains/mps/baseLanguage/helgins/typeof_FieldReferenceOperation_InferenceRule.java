package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.constraints.IOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_FieldReferenceOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_FieldReferenceOperation_InferenceRule() {
  }

  public void applyRule(final SNode fieldReference) {
    final SNode fieldDeclaration = SLinkOperations.getTarget(fieldReference, "fieldDeclaration", false);
    if ((fieldDeclaration == null)) {
      return;
    }
    final SNode InstanceType_typevar_1206554174334 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(IOperation_Behavior.call_getOperand_1197028596169(fieldReference), "jetbrains.mps.baseLanguage.helgins", "1206554174339", true), TypeChecker.getInstance().getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), IOperation_Behavior.call_getOperand_1197028596169(fieldReference), null, "jetbrains.mps.baseLanguage.helgins", "1206554174335");
    final SNode fieldClassifier = SNodeOperations.getAncestor(fieldDeclaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), new QuotationClass_88().createNode(fieldClassifier), fieldReference, null, "jetbrains.mps.baseLanguage.helgins", "1206554174350", false);
    {
      final SNode IT = TypeChecker.getInstance().getEquationManager().getRepresentator(InstanceType_typevar_1206554174334);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(IT, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          Pair<SNode, Map<SNode, List<SNode>>> pair;
          SNode matchedType = RulesFunctions_BaseLanguage.inference_matchTypeWithTypeVariables(SLinkOperations.getTarget(fieldDeclaration, "type", true), mmap);
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(fieldReference, "jetbrains.mps.baseLanguage.helgins", "1206554174385", true), matchedType, fieldReference, null, "jetbrains.mps.baseLanguage.helgins", "1206554174383");
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(fieldClassifier, TypeChecker.getInstance().getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
        }

      }, "jetbrains.mps.baseLanguage.helgins", "1206554174358");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
