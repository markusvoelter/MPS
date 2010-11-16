package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;
import javax.swing.Icon;
import javax.swing.JComponent;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.application.ApplicationManager;

@State(name = "TypeSystemSettings", storages = {@Storage(id = "other", file = "$APP_CONFIG$/typeSystemSettings.xml")
})
public class TypeSystemSettings implements PersistentStateComponent<TypeSystemSettings.MyState>, ApplicationComponent, SearchableConfigurable {
  private TypeSystemSettings.MyState myState = new TypeSystemSettings.MyState();
  private TypeSystemPreferencesPage myPreferences;

  public TypeSystemSettings() {
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "TypeSystem Settings";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  public TypeSystemSettings.MyState getState() {
    return myState;
  }

  public void loadState(TypeSystemSettings.MyState state) {
    myState = state;
  }

  public boolean useNewTypeSystem() {
    return myState.useNewTypeSystem();
  }

  public void setUseNewTypeSystem(boolean useNewTypeSystem) {
    myState.myUseNewTypeSystem = useNewTypeSystem;
  }


  @Nls
  public String getDisplayName() {
    return "TypeSystem";
  }

  @Nullable
  public Icon getIcon() {
    return null;
  }

  @Nullable
  @NonNls
  public String getHelpTopic() {
    return null;
  }

  private TypeSystemPreferencesPage getPreferences() {
    if (myPreferences == null) {
      myPreferences = new TypeSystemPreferencesPage(this);
    }
    return myPreferences;
  }

  public JComponent createComponent() {
    return getPreferences().getComponent();
  }

  public boolean isModified() {
    return getPreferences().isModified();
  }

  public void apply() throws ConfigurationException {
    getPreferences().commit();
  }

  public void reset() {
  }

  public void disposeUIResources() {
  }

  public String getId() {
    return "typeSystem";
  }

  public Runnable enableSearch(String option) {
    return null;
  }

  public static ModelCheckerSettings getInstance() {
    return ApplicationManager.getApplication().getComponent(ModelCheckerSettings.class);
  }

   public static class MyState {
    private boolean myUseNewTypeSystem = true;

    public MyState() {
    }

    public boolean useNewTypeSystem() {
      return myUseNewTypeSystem;
    }

    public void setUseNewTypeSystem(boolean useNewTypeSystem) {
      myUseNewTypeSystem = useNewTypeSystem;
    }
  }
}
