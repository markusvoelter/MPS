package jetbrains.mps.lang.script.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Script_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)");

  public static Language get() {
    return (Language)MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
