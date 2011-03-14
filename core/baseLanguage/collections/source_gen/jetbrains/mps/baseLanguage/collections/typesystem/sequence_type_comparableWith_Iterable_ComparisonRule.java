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

public class sequence_type_comparableWith_Iterable_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER_sh3asd_a0a0a0a0b0c0a0a0a0a0a0d = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Iterable");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public sequence_type_comparableWith_Iterable_ComparisonRule() {
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
      GeneratedMatchingPattern pattern = new sequence_type_comparableWith_Iterable_ComparisonRule.Pattern_sh3asd_a0a0a0a3();
      this.myMatchingPattern2 = pattern;
      boolean b = pattern.match(node);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.SequenceType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_sh3asd_a0a0a0a3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_ELEMENT;

    public Pattern_sh3asd_a0a0a0a3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_wnlwmt_a0a;
        nodeToMatch_wnlwmt_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_wnlwmt_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_sh3asd_a0a0a0a0b0c0a0a0a0a0a0d;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_wnlwmt_a0a.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_wnlwmt_ = "parameter";
          if (nodeToMatch_wnlwmt_a0a.getChildCount(childRole_wnlwmt_) != 1) {
            return false;
          }
          {
            SNode childVar_wnlwmt_a0a0 = nodeToMatch_wnlwmt_a0a.getChildren(childRole_wnlwmt_).get(0);
            this.patternVar_ELEMENT = childVar_wnlwmt_a0a0;
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
        patternVar_ELEMENT = (SNode) pattern.getFieldValue("patternVar_ELEMENT");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_ELEMENT".equals(fieldName)) {
        return patternVar_ELEMENT;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
