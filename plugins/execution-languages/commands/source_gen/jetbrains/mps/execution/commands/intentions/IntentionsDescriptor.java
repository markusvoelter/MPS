package jetbrains.mps.execution.commands.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.execution.commands", "f3347d8a-0e79-4f35-8ac9-1574f25c986f"), SModelReference.fromString("r:611f7e3f-ffc4-4896-a805-c9fe694989ca(jetbrains.mps.execution.commands.intentions)"));
  }

  public void init() {
    add(new ConvertToItems_Intention(), "2168104298250372811");
    add(new ConvertToList_Intention(), "2168104298250389155");
  }
}
