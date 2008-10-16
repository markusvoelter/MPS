package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InstanceMethodCallOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InstanceMethodCallOperation_InferenceRule() {
  }

  public void applyRule(final SNode imco, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(imco, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    // ---
    final SNode instanceType_typevar_1204064731338 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = imco;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1204064731338), typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(imco), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204064784351", false), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204064763142", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = imco;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1204064731338), new QuotationClass_69().createNode(methodClassifier, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204065906120", true, 0, intentionProvider);
    }
    // --- following piece of cake is identical for any method call ---
    {
      final SNode _representatorVar1 = typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1204064731338);
      typeCheckingContext.whenConcrete(_representatorVar1, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, imco, SLinkOperations.getTarget(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "returnType", true), mmap);
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, methodClassifier, typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1204064731338), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
        }

      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1204065986803");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
