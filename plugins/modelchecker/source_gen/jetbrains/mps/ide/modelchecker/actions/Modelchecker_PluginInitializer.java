package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.plugins.PluginUtil;
import jetbrains.mps.plugins.PluginContributor;
import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class Modelchecker_PluginInitializer implements ApplicationComponent {
  public Modelchecker_PluginInitializer() {
    PluginUtil.addPluginContributor(new PluginContributor() {
      public BaseApplicationPlugin createApplicationPlugin() {
        return new Modelchecker_ApplicationPlugin();
      }

      public BaseProjectPlugin createProjectPlugin() {
        return new Modelchecker_ProjectPlugin();
      }
    });
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return this.getClass().getSimpleName();
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }
}
