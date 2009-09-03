package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class RemoveExcessTypeCast_QuickFix extends QuickFix_Runtime {
  public RemoveExcessTypeCast_QuickFix() {
  }

  public String getDescription() {
    return "Remove Excess Typecast";
  }

  public void execute(SNode node) {
    SNodeOperations.replaceWithAnother(((SNode)RemoveExcessTypeCast_QuickFix.this.getField("castExpr")[0]), SLinkOperations.getTarget(((SNode)RemoveExcessTypeCast_QuickFix.this.getField("castExpr")[0]), "expression", true));
  }
}
