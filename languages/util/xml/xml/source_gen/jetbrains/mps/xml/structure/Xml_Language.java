package jetbrains.mps.xml.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Xml_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("2c55c7ac-60c3-4eea-b9db-0d627bd2dcb9(jetbrains.mps.xml)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
