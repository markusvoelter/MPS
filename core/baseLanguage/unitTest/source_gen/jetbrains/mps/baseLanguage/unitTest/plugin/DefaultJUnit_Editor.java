package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.baseLanguage.plugin.JavaConfigOptions;
import java.awt.GridBagLayout;
import jetbrains.mps.baseLanguage.util.plugin.run.LayoutUtil;

public class DefaultJUnit_Editor extends JPanel {
  private JavaConfigOptions myJavaConfigurationOptions = new JavaConfigOptions();
  private JUnitConfigEditor myUsersComponent = new JUnitConfigEditor();

  public DefaultJUnit_Editor() {
    super(new GridBagLayout());

    this.add(this.myUsersComponent, LayoutUtil.createPanelConstraints(1));
    this.add(this.myJavaConfigurationOptions, LayoutUtil.createPanelConstraints(2));
  }

  public void apply(DefaultJUnit_Configuration configuration) {
    this.myJavaConfigurationOptions.apply(configuration.getStateObject().myJavaRunParameters);
  }

  public void reset(DefaultJUnit_Configuration configuration) {
    this.myJavaConfigurationOptions.reset(configuration.getStateObject().myJavaRunParameters);
  }

  public void dispose() {
    this.myJavaConfigurationOptions.dispose();
  }

  public JUnitConfigEditor getUsersComponent() {
    return this.myUsersComponent;
  }
}
