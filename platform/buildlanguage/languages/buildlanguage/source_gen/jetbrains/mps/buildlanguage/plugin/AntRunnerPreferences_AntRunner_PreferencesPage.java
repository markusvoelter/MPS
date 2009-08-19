package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.prefs.BasePrefsPage;
import javax.swing.Icon;
import com.intellij.openapi.project.Project;
import jetbrains.mps.plugins.pluginparts.prefs.BaseProjectPrefsComponent;
import com.intellij.openapi.options.ConfigurationException;
import javax.swing.JComponent;

public class AntRunnerPreferences_AntRunner_PreferencesPage extends BasePrefsPage {
  private AntRunnerPreferencesPage myComponent;
  private Icon icon;

  public AntRunnerPreferences_AntRunner_PreferencesPage(Project project, BaseProjectPrefsComponent prefsComponent) {
    super(project, prefsComponent);
  }

  public String getDisplayName() {
    return "Ant Runner";
  }

  public Icon getIcon() {
    return this.icon;
  }

  public boolean isModified() {
    return this.isModified(this.getProject(), this.myComponent);
  }

  public void apply() throws ConfigurationException {
    if (this.myComponent != null) {
      this.commit(this.getProject(), this.myComponent);
    }
  }

  private void commit(Project project, AntRunnerPreferencesPage component) {
    ((AntRunnerPreferences_PreferencesComponent)AntRunnerPreferences_AntRunner_PreferencesPage.this.getPrefsComponent()).getStateObject().data = ((AntRunnerPreferencesPage)component).getState();
  }

  public JComponent createComponent() {
    if (this.myComponent == null) {
      this.myComponent = new AntRunnerPreferencesPage(((AntRunnerPreferences_PreferencesComponent)AntRunnerPreferences_AntRunner_PreferencesPage.this.getPrefsComponent()).getStateObject().data);
    }
    return this.myComponent;
  }

  private boolean isModified(Project project, AntRunnerPreferencesPage component) {
    return ((AntRunnerPreferencesPage)component).isModified();
  }

  public void disposeUIResources() {
    this.myComponent = null;
  }

  public void reset() {
    if (this.myComponent != null) {
      this.reset(this.getProject(), this.myComponent);
    }
  }

  private void reset(Project project, AntRunnerPreferencesPage component) {
    ((AntRunnerPreferencesPage)component).updateState(((AntRunnerPreferences_PreferencesComponent)AntRunnerPreferences_AntRunner_PreferencesPage.this.getPrefsComponent()).getStateObject().data);
  }
}
