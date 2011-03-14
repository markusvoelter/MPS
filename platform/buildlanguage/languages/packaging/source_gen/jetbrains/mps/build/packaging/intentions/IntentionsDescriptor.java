package jetbrains.mps.build.packaging.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.build.packaging", "4e6c5313-7662-4c44-9bc7-b488cec17508"), SModelReference.fromString("r:e0c736f5-141d-492a-8ea5-d9cfc3978a00(jetbrains.mps.build.packaging.intentions)"));
  }

  public void init() {
    add(new CreateNewBuildLanguageProject_Intention(), "1228398444440");
    add(new CreateNewTarget_Intention(), "1228400780252");
  }
}
