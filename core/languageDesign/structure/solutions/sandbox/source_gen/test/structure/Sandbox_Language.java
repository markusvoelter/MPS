package test.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Sandbox_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("a484d5c4-ad73-4c68-9a06-12d9b1d92437(structure.sandbox)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
