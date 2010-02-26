package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class namedTupleDeclaration_ClassifierType_supertypeOf_namedTupleType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public namedTupleDeclaration_ClassifierType_supertypeOf_namedTupleType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode ntt, TypeCheckingContext typeCheckingContext) {
    return new namedTupleDeclaration_ClassifierType_supertypeOf_namedTupleType_SubtypingRule.QuotationClass_uyx4ls_a0a0a().createNode(ListSequence.fromList(SLinkOperations.getTargets(ntt, "parameter", true)).toListSequence(), SLinkOperations.getTarget(ntt, "classifier", false), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_uyx4ls_a0a0a {
    public QuotationClass_uyx4ls_a0a0a() {
    }

    public SNode createNode(Object parameter_uyx4ls_a0a0a0a0, Object parameter_uyx4ls_a0a0a0a, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_uyx4ls_a0a0a = null;
      SNode quotedNode_uyx4ls_a0a0a0 = null;
      {
        quotedNode_uyx4ls_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_uyx4ls_a0a0a = quotedNode_uyx4ls_a0a0a;
        quotedNode1_uyx4ls_a0a0a.setReferent("classifier", (SNode) parameter_uyx4ls_a0a0a0a);
        {
          List<SNode> nodes = (List<SNode>) parameter_uyx4ls_a0a0a0a0;
          for (SNode child : nodes) {
            quotedNode_uyx4ls_a0a0a.addChild("parameter", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_uyx4ls_a0a0a;
      }
      return result;
    }

    public SNode createNode(Object parameter_uyx4ls_a0a0a0a0, Object parameter_uyx4ls_a0a0a0a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_uyx4ls_a0a0a = null;
      SNode quotedNode_uyx4ls_a0a0a0 = null;
      {
        quotedNode_uyx4ls_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_uyx4ls_a0a0a = quotedNode_uyx4ls_a0a0a;
        quotedNode1_uyx4ls_a0a0a.setReferent("classifier", (SNode) parameter_uyx4ls_a0a0a0a);
        {
          List<SNode> nodes = (List<SNode>) parameter_uyx4ls_a0a0a0a0;
          for (SNode child : nodes) {
            quotedNode_uyx4ls_a0a0a.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_uyx4ls_a0a0a;
      }
      return result;
    }
  }
}
