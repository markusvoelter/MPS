package jetbrains.mps.generator.dependencies;

import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.generator.fileGenerator.AllCaches;
import jetbrains.mps.generator.fileGenerator.CacheGenerationContext;
import jetbrains.mps.generator.fileGenerator.FileGenerationManager;
import jetbrains.mps.generator.fileGenerator.XmlBasedModelCache;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Evgeny Gryaznov, May 14, 2010
 */
public class GenerationDependenciesCache extends XmlBasedModelCache<GenerationDependencies> {
  public GenerationDependenciesCache(FileGenerationManager fileGeneratorManager, AllCaches allCaches) {
    super(fileGeneratorManager, allCaches);
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Generation Dependencies Cache";
  }

  protected String getCacheFileName() {
    return ".generated";
  }

  protected Element toXml(GenerationDependencies dependencies) {
    return dependencies.toXml();
  }

  protected GenerationDependencies fromXml(Element e) {
    return GenerationDependencies.fromXml(e);
  }

  protected GenerationDependencies generateCache(CacheGenerationContext ctx) {
    return ctx.getDependencies();
  }

  public static GenerationDependenciesCache getInstance() {
    return ApplicationManager.getApplication().getComponent(GenerationDependenciesCache.class);
  }
}
