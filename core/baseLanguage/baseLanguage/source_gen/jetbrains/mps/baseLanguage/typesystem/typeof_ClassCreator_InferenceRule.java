package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.EquationInfo;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_ClassCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ClassCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(creator, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(creator, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (!(ListSequence.fromList(SLinkOperations.getTargets(creator, "typeParameter", true)).count() == 0 || ListSequence.fromList(SLinkOperations.getTargets(creator, "typeParameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(SLinkOperations.getTarget(creator, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "typeVariableDeclaration", true)).count())) {
      {
        BaseQuickFixProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(creator, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1216200944338", intentionProvider, errorTarget);
      }
    }
    for (SNode parameter : SLinkOperations.getTargets(creator, "typeParameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parameter, SLinkOperations.getTarget(new typeof_ClassCreator_InferenceRule.QuotationClass_4w0o2k_a0b0a0a0d0a().createNode(typeCheckingContext), "descriptor", false), false)))) {
        BaseQuickFixProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parameter, "primitive type not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606006", intentionProvider, errorTarget);
      }
    }
    // --- 
    SNode constructedType = new typeof_ClassCreator_InferenceRule.QuotationClass_4w0o2k_a0a5a0().createNode(SLinkOperations.getTargets(creator, "typeParameter", true), methodClassifier, typeCheckingContext);
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606039", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606043", true), (SNode) constructedType, _info_12389875345);
    }
    final SNode instanceType_typevar_1212781606045 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1212781606046", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1212781606045), (SNode) constructedType, _info_12389875345);
    }
    // --- following piece of cake is identical for any method call --- 
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, creator, null, mmap);
    RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, methodClassifier, typeCheckingContext.getEquationManager().getRepresentator(instanceType_typevar_1212781606045), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassCreator";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_4w0o2k_a0b0a0a0d0a {
    public QuotationClass_4w0o2k_a0b0a0a0d0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("descriptor", quotedNode1_2, SModelReference.fromString("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), SNodeId.fromString("1196683941620")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("descriptor", quotedNode1_2, SModelReference.fromString("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), SNodeId.fromString("1196683941620")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4w0o2k_a0a5a0 {
    public QuotationClass_4w0o2k_a0a5a0() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
