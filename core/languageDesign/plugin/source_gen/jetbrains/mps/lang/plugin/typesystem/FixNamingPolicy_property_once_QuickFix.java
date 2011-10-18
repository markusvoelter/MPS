package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.util.NameUtil;

public class FixNamingPolicy_property_once_QuickFix extends QuickFix_Runtime {
  public FixNamingPolicy_property_once_QuickFix() {
  }

  public String getDescription(SNode node) {
    return ((String) FixNamingPolicy_property_once_QuickFix.this.getField("caption")[0]);
  }

  public void execute(SNode node) {
    ((PropertyReference) FixNamingPolicy_property_once_QuickFix.this.getField("property")[0]).setValue(NameUtil.captionWithNamingPolicy(((PropertyReference) FixNamingPolicy_property_once_QuickFix.this.getField("property")[0]).getValue()));
  }
}
