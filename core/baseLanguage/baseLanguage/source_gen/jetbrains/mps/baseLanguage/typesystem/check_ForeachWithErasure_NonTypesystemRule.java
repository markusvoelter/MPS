package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class check_ForeachWithErasure_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  private static SNodePointer SNODE_POINTER_aftnu9_a0a0a0a0b0c0a0a0a0a0c0a = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Iterable");

  public check_ForeachWithErasure_NonTypesystemRule() {
  }

  public void applyRule(final SNode foreachStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode iterableType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(foreachStatement, "iterable", true));
    if (SNodeOperations.isInstanceOf(iterableType, "jetbrains.mps.baseLanguage.structure.ArrayType")) {
      return;
    }
    {
      GeneratedMatchingPattern pattern_gn1qzs_c0 = new check_ForeachWithErasure_NonTypesystemRule.Pattern_aftnu9_a0a0a2a0();
      SNode coercedNode_gn1qzs_c0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(iterableType, pattern_gn1qzs_c0);
      if (coercedNode_gn1qzs_c0 != null) {
      } else {
        // not an iterable or an erasure 
        if (!(MatchingUtil.matchNodes(SLinkOperations.getTarget(SLinkOperations.getTarget(foreachStatement, "variable", true), "type", true), new check_ForeachWithErasure_NonTypesystemRule.QuotationClass_aftnu9_a0a0b0a2a2a0().createNode(typeCheckingContext)))) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(SLinkOperations.getTarget(foreachStatement, "variable", true), "type", true), "java.lang.Object expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4312449433287189198", null, errorTarget);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
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

  public static class Pattern_aftnu9_a0a0a2a0 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_p;

    public Pattern_aftnu9_a0a0a2a0() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_gn1qzs_a0a2a;
        nodeToMatch_gn1qzs_a0a2a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_gn1qzs_a0a2a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_aftnu9_a0a0a0a0b0c0a0a0a0a0c0a;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_gn1qzs_a0a2a.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_check_ForeachWithErasure_gn1qzs_ = "parameter";
          if (nodeToMatch_gn1qzs_a0a2a.getChildCount(childRole_check_ForeachWithErasure_gn1qzs_) != 1) {
            return false;
          }
          {
            SNode childVar_gn1qzs_a0a0c0 = nodeToMatch_gn1qzs_a0a2a.getChildren(childRole_check_ForeachWithErasure_gn1qzs_).get(0);
            this.patternVar_p = childVar_gn1qzs_a0a0c0;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_p = (SNode) pattern.getFieldValue("patternVar_p");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_p".equals(fieldName)) {
        return patternVar_p;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  public static class QuotationClass_aftnu9_a0a0b0a2a2a0 {
    public QuotationClass_aftnu9_a0a0b0a2a2a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
