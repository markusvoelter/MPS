package jetbrains.mps.ui.internal.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Internal_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("b648a171-98f9-494b-b822-c3147ae7d330(jetbrains.mps.ui.internal)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
