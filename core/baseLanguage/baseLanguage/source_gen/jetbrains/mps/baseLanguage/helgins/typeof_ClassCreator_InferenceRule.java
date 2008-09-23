package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ClassCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ClassCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(creator, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(creator, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (!(SLinkOperations.getCount(creator, "typeParameter") == 0 || SLinkOperations.getCount(creator, "typeParameter") == SLinkOperations.getCount(SNodeOperations.getAncestor(SLinkOperations.getTarget(creator, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "typeVariableDeclaration"))) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(creator, "wrong number of type parameters", "r:1222183538981(jetbrains.mps.baseLanguage.helgins@3_0)", "1222183887797", intentionProvider);
      }
    }
    for(SNode parameter : SLinkOperations.getTargets(creator, "typeParameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parameter, SLinkOperations.getTarget(new QuotationClass_92().createNode(), "descriptor", false), false, false)))) {
        TypeChecker.getInstance().reportTypeError(parameter, "primitive type not allowed", "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1212781606006");
      }
    }
    // ---
    SNode constructedType = new QuotationClass_93().createNode(SLinkOperations.getTargets(creator, "typeParameter", true), methodClassifier);
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(creator, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1212781606043", true), constructedType, _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1212781606039", intentionProvider);
    }
    final SNode instanceType_typevar_1212781606045 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1212781606045), constructedType, _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1212781606046", intentionProvider);
    }
    // --- following piece of cake is identical for any method call ---
    {
      final SNode _representatorVar2 = TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1212781606045);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar2, new Runnable() {

        public void run() {
          Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
          RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(creator, null, mmap);
          RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(methodClassifier, TypeChecker.getInstance().getEquationManager().getRepresentator(instanceType_typevar_1212781606045), mmap);
          RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
        }

      }, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1212781606052");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
