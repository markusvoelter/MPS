package jetbrains.mps.lang.editor.tableTests.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class TableTests_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("48c3e946-6e2c-44cd-9882-eada7feeac68(jetbrains.mps.lang.editor.tableTests)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
