package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Math_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("3304fc6e-7c6b-401e-a016-b944934bb21f(jetbrains.mps.baseLanguage.math)");

  public static Language get() {
    return (Language)MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }

}
