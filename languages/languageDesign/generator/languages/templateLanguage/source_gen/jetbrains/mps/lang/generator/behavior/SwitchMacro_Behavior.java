package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class SwitchMacro_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    {
      GeneratedMatchingPattern pattern_i6m7ss_a0a = new SwitchMacro_Behavior.Pattern_i6m7ss_a0a0a0a1();
      SNode coercedNode_i6m7ss_a0a = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodeQuery", true)), pattern_i6m7ss_a0a);
      if (coercedNode_i6m7ss_a0a != null) {
        return ((SNode) pattern_i6m7ss_a0a.getFieldValue("patternVar_concept"));
      } else {
      }
    }
    return NodeMacro_Behavior.callSuper_getInputNodeTypeInsideOfMacro_1213877290799(thisNode, "jetbrains.mps.lang.generator.structure.SwitchMacro");
  }

  public static class Pattern_i6m7ss_a0a0a0a1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_concept;

    public Pattern_i6m7ss_a0a0a0a1() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_i6m7ss_a0a0a0;
        nodeToMatch_i6m7ss_a0a0a0 = nodeToMatch;
        if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_i6m7ss_a0a0a0.getConceptFqName()))) {
          return false;
        }
        patternVar_concept = nodeToMatch_i6m7ss_a0a0a0.getReferent("concept");
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_concept = (SNode) pattern.getFieldValue("patternVar_concept");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_concept".equals(fieldName)) {
        return patternVar_concept;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
