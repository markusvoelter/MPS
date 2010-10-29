package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_IndexedTupleMemberAccessExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IndexedTupleMemberAccessExpression_InferenceRule() {
  }

  public void applyRule(final SNode mae, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(Expression_Behavior.call_isCompileTimeConstant_1238860258777(SLinkOperations.getTarget(mae, "index", true)))) {
      BaseQuickFixProvider intentionProvider = null;
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(mae, "index", true), "Tuple index must be a constant expression", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238859427576", intentionProvider, errorTarget);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(mae, "index", true);
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238857999186", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238857984180", true), (SNode) new typeof_IndexedTupleMemberAccessExpression_InferenceRule.QuotationClass_290su0_a0a1a0().createNode(typeCheckingContext), false, _info_12389875345);
    }
    if (Expression_Behavior.call_isCompileTimeConstant_1238860258777(SLinkOperations.getTarget(mae, "index", true))) {
      Object idxValue = Expression_Behavior.call_getCompileTimeConstantValue_1238860310638(SLinkOperations.getTarget(mae, "index", true), SNodeOperations.getModel(SLinkOperations.getTarget(mae, "index", true)).getModelDescriptor().getModule());
      final int index = (idxValue instanceof Integer ?
        ((Integer) idxValue).intValue() :
        -1
      );
      {
        final SNode tupleType = typeCheckingContext.typeOf(SLinkOperations.getTarget(mae, "tuple", true), "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238864035483", true);
        typeCheckingContext.whenConcrete(tupleType, new Runnable() {
          public void run() {
            if (!(index >= 0 && index < ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(typeCheckingContext.getEquationManager().getRepresentator(tupleType), "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType"), "componentType", true)).count())) {
              BaseQuickFixProvider intentionProvider = null;
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(mae, "index", true), "Index value out of range", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238864218062", intentionProvider, errorTarget);
            }
            if (index >= 0 && index < ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(typeCheckingContext.getEquationManager().getRepresentator(tupleType), "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType"), "componentType", true)).count()) {
              List<SNode> mtypes = SLinkOperations.getTargets(SNodeOperations.as(typeCheckingContext.getEquationManager().getRepresentator(tupleType), "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType"), "componentType", true);
              {
                SNode _nodeToCheck_1029348928467 = mae;
                BaseQuickFixProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238864299354", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238864289746", true), (SNode) ListSequence.fromList(mtypes).getElement(index), _info_12389875345);
              }
            }
          }
        }, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238864005360", false, false);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleMemberAccessExpression";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_290su0_a0a1a0 {
    public QuotationClass_290su0_a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
