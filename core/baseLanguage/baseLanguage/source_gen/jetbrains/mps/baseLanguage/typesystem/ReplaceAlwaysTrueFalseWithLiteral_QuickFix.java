package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReplaceAlwaysTrueFalseWithLiteral_QuickFix extends QuickFix_Runtime {
  public ReplaceAlwaysTrueFalseWithLiteral_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Simplify expression to " + ((Boolean) ReplaceAlwaysTrueFalseWithLiteral_QuickFix.this.getField("value")[0]);
  }

  public void execute(SNode node) {
    SNodeOperations.replaceWithAnother(node, new ReplaceAlwaysTrueFalseWithLiteral_QuickFix.QuotationClass_7hp7vs_a0a0a0a().createNode(((Boolean) ReplaceAlwaysTrueFalseWithLiteral_QuickFix.this.getField("value")[0]).toString()));
  }

  public static class QuotationClass_7hp7vs_a0a0a0a {
    public QuotationClass_7hp7vs_a0a0a0a() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("value", (String) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
