package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AnonymousClass_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AnonymousClass_InferenceRule() {
  }

  public void applyRule(final SNode anonymousClass, final TypeCheckingContext typeCheckingContext) {
    SNode constructedType = new _Quotations.QuotationClass_110().createNode(SLinkOperations.getTargets(anonymousClass, "typeParameter", true), SLinkOperations.getTarget(anonymousClass, "classifier", false), typeCheckingContext);
    {
      SNode _nodeToCheck_1029348928467 = anonymousClass;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296920", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296924", true), (SNode) constructedType, _info_12389875345);
    }
    if (SLinkOperations.getTarget(anonymousClass, "baseMethodDeclaration", false) == null || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(anonymousClass, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.cast(SLinkOperations.getTarget(anonymousClass, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    if (!(SLinkOperations.getCount(anonymousClass, "typeParameter") == 0 || SLinkOperations.getCount(anonymousClass, "typeParameter") == SLinkOperations.getCount(SNodeOperations.getAncestor(SLinkOperations.getTarget(anonymousClass, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "typeVariableDeclaration"))) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(anonymousClass, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296749", intentionProvider, errorTarget);
      }
    }
    for (SNode parameter : SLinkOperations.getTargets(anonymousClass, "typeParameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parameter, SLinkOperations.getTarget(new _Quotations.QuotationClass_109().createNode(typeCheckingContext), "descriptor", false), false)))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parameter, "primitive type not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296785", intentionProvider, errorTarget);
      }
    }
    // --- 
    final SNode instanceType_typevar_2925336694746296814 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = anonymousClass;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296815", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_2925336694746296814), (SNode) constructedType, _info_12389875345);
    }
    // --- following piece of cake is identical for any method call --- 
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, anonymousClass, null, mmap);
    RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, methodClassifier, typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_2925336694746296814), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }
}
