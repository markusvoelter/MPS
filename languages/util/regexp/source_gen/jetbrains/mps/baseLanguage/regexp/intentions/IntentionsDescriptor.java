package jetbrains.mps.baseLanguage.regexp.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.baseLanguage.regexp", "daafa647-f1f7-4b0b-b096-69cd7c8408c0"), SModelReference.fromString("r:5c2005a8-261b-4759-9059-c2decf025b8a(jetbrains.mps.baseLanguage.regexp.intentions)"));
  }

  public void init() {
    add(new convertToNamed_Intention(), "305848682816615072");
  }
}
