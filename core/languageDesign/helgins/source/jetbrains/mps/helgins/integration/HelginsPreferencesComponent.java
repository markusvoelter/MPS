package jetbrains.mps.helgins.integration;

import jetbrains.mps.helgins.inference.NodeTypesComponentsRepository;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.helgins.integration.HelginsPreferencesComponent.MyState;
import jetbrains.mps.util.CollectionUtil;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.util.List;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.PersistentStateComponent;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;


@State(
  name = "HelginsPreferences",
  storages = {
    @Storage(
      id ="other",
      file = "$APP_CONFIG$/helgins.xml"
    )}
)
public class HelginsPreferencesComponent implements Configurable, PersistentStateComponent<MyState> {
  private MyState myState = new MyState();

  private MyPreferencesPage myPreferencesPage = new MyPreferencesPage();

  public static HelginsPreferencesComponent getInstance() {
    return ApplicationManager.getApplication().getComponent(HelginsPreferencesComponent.class);
  }

  public boolean isUsesDebugHighlighting() {
    return myState.isUsesDebugHighlighting();
  }

  public boolean isGenerationOptimizationEnabled() {
    return myState.isGenerationOptimizationEnabled();
  }

  public int getHelginsTimeoutSeconds() {
    return myState.getHelginsTimeout();
  }


  @Nls
  public String getDisplayName() {
    return "Helgins Preferences";
  }

  @Nullable
  public Icon getIcon() {
    return myPreferencesPage.getIcon();
  }

  @Nullable
  @NonNls
  public String getHelpTopic() {
    return null;
  }

  public JComponent createComponent() {
    return myPreferencesPage.getComponent();
  }

  public boolean isModified() {
    return true;
  }

  public void apply() throws ConfigurationException {
    myPreferencesPage.commit();
  }

  public void reset() {
  }

  public void disposeUIResources() {
  }

  private class MyPreferencesPage {
    //  private JCheckBox myIncrementalCheckBox = new JCheckBox("Use incremental algorithm");
    private JCheckBox myHighlightingCheckBox = new JCheckBox("Use debug highlighting");
    private JCheckBox myGeneratorOptimizationCheckBox = new JCheckBox("Use optimization for generation");
    private JTextField myHelginsTimeoutField = new JTextField();
    private JPanel myComponent = new JPanel(new BorderLayout());

    public MyPreferencesPage() {
      JPanel panel = new JPanel(new GridLayout(3, 1));
      //   myIncrementalCheckBox.setSelected(myUsesIncrementalAlgorithm);
      myHighlightingCheckBox.setSelected(myState.isUsesDebugHighlighting());
      myGeneratorOptimizationCheckBox.setSelected(myState.isGenerationOptimizationEnabled());
      myHelginsTimeoutField.setText(myState.getHelginsTimeout() + "");
      //   panel.add(myIncrementalCheckBox);
      panel.add(myHighlightingCheckBox);
      panel.add(myGeneratorOptimizationCheckBox);
      JPanel timeoutPanel = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.gridy = 0;
      constraints.gridx = 0;
      constraints.weightx = 0;
      timeoutPanel.add(new JLabel("typechecker timeout"), constraints);
      constraints.gridx = 1;
      timeoutPanel.add(myHelginsTimeoutField, constraints);
      constraints.gridx = 2;
      constraints.weightx = 1;
      timeoutPanel.add(new JPanel(), constraints);
      panel.add(timeoutPanel);
      myComponent.add(panel, BorderLayout.NORTH);
    }

    public String getName() {
      return "HELGINS preferences";
    }

    public Icon getIcon() {
      return null;
    }

    public boolean validate() {
      return true;
    }

    public void commit() {
      //    boolean selectedIncremental = myIncrementalCheckBox.isSelected();
      //    boolean changedIncremental = (myUsesIncrementalAlgorithm != selectedIncremental);
      boolean selectedHighlighting = myHighlightingCheckBox.isSelected();
      boolean changedHighlighting = (myState.isUsesDebugHighlighting() != selectedHighlighting);
      if (changedHighlighting) {
        myState.setUsesDebugHighlighting(selectedHighlighting);
      }
      boolean selectedOptimization = myGeneratorOptimizationCheckBox.isSelected();
      boolean changedOptimization = (myState.isGenerationOptimizationEnabled() != selectedOptimization);
      if (changedOptimization) {
        myState.setGenerationOptimizationEnabled(selectedOptimization);
      }
      try {
        int timeout = Integer.parseInt(myHelginsTimeoutField.getText());
        if (timeout != myState.getHelginsTimeout()) {
          myState.setHelginsTimeout(timeout);
        }
      } catch (NumberFormatException ex) {

      }
      /* if (changedIncremental) {
        myUsesIncrementalAlgorithm = selectedIncremental;
        NodeTypesComponentsRepository.getInstance().clear();
        TypeChecker.getInstance().clearForReload();
      }*/
    }

    public JComponent getComponent() {
      return myComponent;
    }
  }

  public MyState getState() {
    return myState;
  }

  public void loadState(MyState state) {
    myState = state;
  }

  public static class MyState {
    private boolean myUsesDebugHighlighting = false;
    private boolean myGenerationOptimizationEnabled = true;
    private int myHelginsTimeout = -1;


    public boolean isUsesDebugHighlighting() {
      return myUsesDebugHighlighting;
    }

    public void setUsesDebugHighlighting(boolean usesDebugHighlighting) {
      myUsesDebugHighlighting = usesDebugHighlighting;
    }

    public boolean isGenerationOptimizationEnabled() {
      return myGenerationOptimizationEnabled;
    }

    public void setGenerationOptimizationEnabled(boolean generationOptimizationEnabled) {
      myGenerationOptimizationEnabled = generationOptimizationEnabled;
    }

    public int getHelginsTimeout() {
      return myHelginsTimeout;
    }

    public void setHelginsTimeout(int timeout) {
      myHelginsTimeout = timeout;
    }
  }
}
