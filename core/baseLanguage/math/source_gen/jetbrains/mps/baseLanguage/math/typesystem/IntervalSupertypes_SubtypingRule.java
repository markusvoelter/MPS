package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class IntervalSupertypes_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public IntervalSupertypes_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode intervalType, TypeCheckingContext typeCheckingContext) {
    return new IntervalSupertypes_SubtypingRule.QuotationClass_7ws3t7_a0a0a().createNode(SLinkOperations.getTarget(intervalType, "elementType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.IntervalType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_7ws3t7_a0a0a {
    public QuotationClass_7ws3t7_a0a0a() {
    }

    public SNode createNode(Object parameter_7ws3t7_a0a0a0a0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7ws3t7_a0a0a = null;
      SNode quotedNode_7ws3t7_a0a0a0 = null;
      {
        quotedNode_7ws3t7_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7ws3t7_a0a0a = quotedNode_7ws3t7_a0a0a;
        quotedNode1_7ws3t7_a0a0a.addReference(SReference.create("classifier", quotedNode1_7ws3t7_a0a0a, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Iterable")));
        {
          quotedNode_7ws3t7_a0a0a0 = (SNode) parameter_7ws3t7_a0a0a0a0;
          SNode quotedNode1_7ws3t7_a0a0a0;
          if (_parameterValues_129834374.contains(quotedNode_7ws3t7_a0a0a0)) {
            quotedNode1_7ws3t7_a0a0a0 = CopyUtil.copy(quotedNode_7ws3t7_a0a0a0);
          } else {
            _parameterValues_129834374.add(quotedNode_7ws3t7_a0a0a0);
            quotedNode1_7ws3t7_a0a0a0 = quotedNode_7ws3t7_a0a0a0;
          }
          if (quotedNode1_7ws3t7_a0a0a0 != null) {
            quotedNode_7ws3t7_a0a0a.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_7ws3t7_a0a0a0, typeCheckingContext));
          }
        }
        result = quotedNode1_7ws3t7_a0a0a;
      }
      return result;
    }

    public SNode createNode(Object parameter_7ws3t7_a0a0a0a0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7ws3t7_a0a0a = null;
      SNode quotedNode_7ws3t7_a0a0a0 = null;
      {
        quotedNode_7ws3t7_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7ws3t7_a0a0a = quotedNode_7ws3t7_a0a0a;
        quotedNode1_7ws3t7_a0a0a.addReference(SReference.create("classifier", quotedNode1_7ws3t7_a0a0a, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Iterable")));
        {
          quotedNode_7ws3t7_a0a0a0 = (SNode) parameter_7ws3t7_a0a0a0a0;
          SNode quotedNode1_7ws3t7_a0a0a0;
          if (_parameterValues_129834374.contains(quotedNode_7ws3t7_a0a0a0)) {
            quotedNode1_7ws3t7_a0a0a0 = CopyUtil.copy(quotedNode_7ws3t7_a0a0a0);
          } else {
            _parameterValues_129834374.add(quotedNode_7ws3t7_a0a0a0);
            quotedNode1_7ws3t7_a0a0a0 = quotedNode_7ws3t7_a0a0a0;
          }
          if (quotedNode1_7ws3t7_a0a0a0 != null) {
            quotedNode_7ws3t7_a0a0a.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_7ws3t7_a0a0a0));
          }
        }
        result = quotedNode1_7ws3t7_a0a0a;
      }
      return result;
    }
  }
}
