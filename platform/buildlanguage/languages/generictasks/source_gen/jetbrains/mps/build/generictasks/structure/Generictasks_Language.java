package jetbrains.mps.build.generictasks.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Generictasks_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("fba399db-f591-45dc-a279-e2a2a986e262(jetbrains.mps.build.generictasks)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
