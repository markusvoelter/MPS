package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class comparable_SEnumMemberType__node_EnumerationMemberDeclaration_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER3 = new SNodePointer("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "1083171877298");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public comparable_SEnumMemberType__node_EnumerationMemberDeclaration_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2) {
    return true;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicable1(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
  }

  public boolean isApplicable2(SNode node) {
    this.myMatchingPattern2 = new comparable_SEnumMemberType__node_EnumerationMemberDeclaration_ComparisonRule.Pattern_4();
    return this.myMatchingPattern2.match(node);
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.lang.smodel.structure.SEnumMemberType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.lang.smodel.structure.SNodeType";
  }

  public static class Pattern_4 extends GeneratedMatchingPattern implements IMatchingPattern {
    public Pattern_4() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_8893_0;
        nodeToMatch_8893_0 = nodeToMatch;
        if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_8893_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER3.getNode();
          if (nodeToMatch_8893_0.getReferent("concept") != referent) {
            return false;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
    }

    public Object getFieldValue(String fieldName) {
      return null;
    }
  }
}
