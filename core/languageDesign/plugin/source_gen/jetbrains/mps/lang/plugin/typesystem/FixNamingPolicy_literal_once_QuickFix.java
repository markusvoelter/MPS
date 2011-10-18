package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;

public class FixNamingPolicy_literal_once_QuickFix extends QuickFix_Runtime {
  public FixNamingPolicy_literal_once_QuickFix() {
  }

  public String getDescription(SNode node) {
    return ((String) FixNamingPolicy_literal_once_QuickFix.this.getField("caption")[0]);
  }

  public void execute(SNode node) {
    SPropertyOperations.set(((SNode) FixNamingPolicy_literal_once_QuickFix.this.getField("literal")[0]), "value", NameUtil.captionPartWithNamingPolicy(SPropertyOperations.getString(((SNode) FixNamingPolicy_literal_once_QuickFix.this.getField("literal")[0]), "value")));
  }
}
