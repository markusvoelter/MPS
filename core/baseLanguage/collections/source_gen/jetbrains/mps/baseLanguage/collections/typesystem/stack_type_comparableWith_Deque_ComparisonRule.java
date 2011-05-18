package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;

public class stack_type_comparableWith_Deque_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER_2rsa22_a0a0a0a0b0c0a0a0a0a0a0d = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Deque");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public stack_type_comparableWith_Deque_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2, IsApplicable2Status status) {
    return true;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableFirst(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSecond(SNode node) {
    {
      GeneratedMatchingPattern pattern = new stack_type_comparableWith_Deque_ComparisonRule.Pattern_2rsa22_a0a0a0a3();
      this.myMatchingPattern2 = pattern;
      boolean b = pattern.match(node);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.StackType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_2rsa22_a0a0a0a3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_ELEMENT_TYPE;

    public Pattern_2rsa22_a0a0a0a3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_h34l93_a0a;
        nodeToMatch_h34l93_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_h34l93_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_2rsa22_a0a0a0a0b0c0a0a0a0a0a0d;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_h34l93_a0a.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_stack_type_comparableWith_Deque_h34l93_ = "parameter";
          if (nodeToMatch_h34l93_a0a.getChildCount(childRole_stack_type_comparableWith_Deque_h34l93_) != 1) {
            return false;
          }
          {
            SNode childVar_h34l93_a0a0 = nodeToMatch_h34l93_a0a.getChildren(childRole_stack_type_comparableWith_Deque_h34l93_).get(0);
            this.patternVar_ELEMENT_TYPE = childVar_h34l93_a0a0;
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
        patternVar_ELEMENT_TYPE = (SNode) pattern.getFieldValue("patternVar_ELEMENT_TYPE");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_ELEMENT_TYPE".equals(fieldName)) {
        return patternVar_ELEMENT_TYPE;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
