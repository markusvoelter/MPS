package jetbrains.mps.samples.readerConfigLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("089e26c5-bfc3-4a60-9953-f68169a4608a(jetbrains.mps.samples.readerConfigLanguage)");

  public Language() {

  }

  public String getNamespace() {
    return "jetbrains.mps.samples.readerConfigLanguage";
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
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "5b79f56d-c904-49ad-93b5-e535ce9a83fc(readerConfigLanguage#1129923280150)"), TemplateUtil.createInterpretedGenerator(this, "ffb71f3a-317f-4241-a93c-321d713ebf82(readerConfigLanguage#1129923281152)"));
  }
}
