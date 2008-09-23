package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
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
    final SNode instanceType_typevar_1204064731338 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = imco;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), TypeChecker.getInstance().getRuntimeSupport().typeOf(IOperation_Behavior.call_getOperand_1213877410070(imco), "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1204064784351", false), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1204064763142", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = imco;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), new QuotationClass_69().createNode(methodClassifier), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1204065906120", true, 0, intentionProvider);
    }
    // --- following piece of cake is identical for any method call ---
    {
      final SNode _representatorVar1 = TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar1, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(imco, SLinkOperations.getTarget(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "returnType", true), mmap);
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(methodClassifier, TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
        }

      }, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1204065986803");
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
