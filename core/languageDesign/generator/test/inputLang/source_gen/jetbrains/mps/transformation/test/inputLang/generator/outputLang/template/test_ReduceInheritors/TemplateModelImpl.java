package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;
import java.util.UUID;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNodeId;

public class TemplateModelImpl implements TemplateModel {
  private static SModelReference modelRef_wo91o7_a0a1 = new SModelReference(new SModelFqName("jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors", "generator"), SModelId.regular(new UUID(16384L, 1222075024889L)));

  private final Collection<TemplateMappingConfiguration> mappings;
  private final Collection<TemplateSwitchMapping> switches;
  private final TemplateModule templateModule;

  public TemplateModelImpl(TemplateModule module) {
    mappings = TemplateUtil.<TemplateMappingConfiguration>asCollection(new Mappingmain(this));
    switches = TemplateUtil.<TemplateSwitchMapping>asCollection();
    templateModule = module;
  }

  public String getLongName() {
    return "jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors";
  }

  public SModelReference getSModelReference() {
    return modelRef_wo91o7_a0a1;
  }

  public Collection<TemplateMappingConfiguration> getConfigurations() {
    return mappings;
  }

  public Collection<TemplateSwitchMapping> getSwitches() {
    return switches;
  }

  public TemplateDeclaration loadTemplate(SNodePointer template, Object... arguments) {
    if (!(modelRef_wo91o7_a0a1.equals(template.getModelReference()))) {
      return null;
    }
    SNodeId id = template.getNodeId();
    if (id instanceof SNodeId.Regular) {
      long idValue = ((SNodeId.Regular) id).getId();
      if (idValue == 1206460153890L) {
        if (arguments.length != 0) {
          // TODO report `wrong arguments count` 
          return null;
        }
        return new TemplateOutputRoot();
      }
    }
    return null;
  }

  public TemplateModule getModule() {
    return templateModule;
  }
}
