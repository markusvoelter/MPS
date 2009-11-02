package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
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
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(creator, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1216200944338", intentionProvider, errorTarget);
      }
    }
    for (SNode parameter : SLinkOperations.getTargets(creator, "typeParameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parameter, SLinkOperations.getTarget(new _Quotations.QuotationClass_72().createNode(typeCheckingContext), "descriptor", false), false)))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parameter, "primitive type not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606006", intentionProvider, errorTarget);
      }
    }
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    SNode constructedType = new _Quotations.QuotationClass_73().createNode(SLinkOperations.getTargets(creator, "typeParameter", true), methodClassifier, typeCheckingContext);
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606039", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606043", true), (SNode)constructedType, _info_12389875345);
    }
    final SNode instanceType_typevar_1212781606045 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606046", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1212781606045), (SNode)constructedType, _info_12389875345);
    }
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, creator, null, mmap);
    RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, methodClassifier, typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1212781606045), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
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
