package jetbrains.mps.samples.secretCompartmentLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("6986543d-8218-4ebf-a2e9-565e5049c1ce(jetbrains.mps.samples.secretCompartmentLanguage)");

  public Language() {

  }

  public String getNamespace() {
    return "jetbrains.mps.samples.secretCompartmentLanguage";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "b77e1ec6-a025-4317-a254-45c93d6d6fbb(secretCompartmentLanguage#1197167152697)"));
  }
}
