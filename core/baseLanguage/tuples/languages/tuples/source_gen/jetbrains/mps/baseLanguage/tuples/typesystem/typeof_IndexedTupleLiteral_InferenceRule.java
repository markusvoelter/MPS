package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_IndexedTupleLiteral_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IndexedTupleLiteral_InferenceRule() {
  }

  public void applyRule(final SNode tuple, final TypeCheckingContext typeCheckingContext) {
    List<SNode> memberTypes = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode mbr : SLinkOperations.getTargets(tuple, "component", true)) {
      ListSequence.fromList(memberTypes).addElement(typeCheckingContext.typeOf(mbr, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "974579920306587589", true));
    }
    {
      SNode _nodeToCheck_1029348928467 = tuple;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238854056178", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1238854050913", true), (SNode) new typeof_IndexedTupleLiteral_InferenceRule.QuotationClass_6bpfww_a0a2a0().createNode(memberTypes, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_6bpfww_a0a2a0 {
    public QuotationClass_6bpfww_a0a2a0() {
    }

    public SNode createNode(Object parameter_6bpfww_a0a0a0c0a, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6bpfww_a0a2a0 = null;
      SNode quotedNode_6bpfww_a0a0c0a = null;
      {
        quotedNode_6bpfww_a0a2a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6bpfww_a0a2a0 = quotedNode_6bpfww_a0a2a0;
        {
          List<SNode> nodes = (List<SNode>) parameter_6bpfww_a0a0a0c0a;
          for (SNode child : nodes) {
            quotedNode_6bpfww_a0a2a0.addChild("componentType", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_6bpfww_a0a2a0;
      }
      return result;
    }

    public SNode createNode(Object parameter_6bpfww_a0a0a0c0a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6bpfww_a0a2a0 = null;
      SNode quotedNode_6bpfww_a0a0c0a = null;
      {
        quotedNode_6bpfww_a0a2a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6bpfww_a0a2a0 = quotedNode_6bpfww_a0a2a0;
        {
          List<SNode> nodes = (List<SNode>) parameter_6bpfww_a0a0a0c0a;
          for (SNode child : nodes) {
            quotedNode_6bpfww_a0a2a0.addChild("componentType", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_6bpfww_a0a2a0;
      }
      return result;
    }
  }
}
