package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InstanceMethodCallOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_InstanceMethodCallOperation_InferenceRule() {
  }

  public void applyRule(final SNode imco) {
    if (SLinkOperations.getTarget(imco, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (!(SLinkOperations.getCount(imco, "actualArgument") == SLinkOperations.getCount(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "parameter"))) {
      {
        BaseIntentionProvider intentionProvider = null;
        intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.helgins@5_0.ChooseAppropriateMethodDeclaration_Intention", true);
        intentionProvider.putArgument("classifier", methodClassifier);
        intentionProvider.putArgument("methodCall", imco);
        TypeChecker.getInstance().reportTypeError(imco, "wrong number of parameters", "jetbrains.mps.baseLanguage.helgins@5_0", "1216203741253", intentionProvider);
      }
    }
    // ---
    final SNode instanceType_typevar_1204064731338 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(imco);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins", "1204064784351", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1204064763142");
    }
    {
      SNode _nodeToCheck_1029348928467 = imco;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), new QuotationClass_74().createNode(methodClassifier), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1204065906120", true, 0);
    }
    // --- following piece of cake is identical for any method call ---
    {
      final SNode _representatorVar2 = TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar2, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(imco, SLinkOperations.getTarget(SLinkOperations.getTarget(imco, "baseMethodDeclaration", false), "returnType", true), mmap);
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(methodClassifier, TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1204064731338), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
        }

      }, "jetbrains.mps.baseLanguage.helgins", "1204065986803");
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
