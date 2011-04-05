package jetbrains.mps.vcs.ui;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.options.Configurable;
import javax.swing.JCheckBox;
import com.intellij.openapi.project.Project;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import org.jetbrains.annotations.Nls;
import javax.swing.Icon;
import javax.swing.JComponent;
import com.intellij.openapi.options.ConfigurationException;
import jetbrains.mps.vcs.MPSVcsProjectConfiguration;

public class VcsGeneratedFilesConfigurable extends JPanel implements Configurable {
  private JCheckBox myIgnoreGeneratedFilesCheckBox = new JCheckBox("Ignore generated files");
  private Project myProject;

  public VcsGeneratedFilesConfigurable(Project project) {
    myProject = project;
    setLayout(new BorderLayout());
    JPanel generatedFilesPanel = new JPanel(new BorderLayout());
    generatedFilesPanel.setBorder(new TitledBorder("Generated Files"));
    generatedFilesPanel.add(myIgnoreGeneratedFilesCheckBox);
    add(generatedFilesPanel, BorderLayout.NORTH);
  }

  @Nls
  public String getDisplayName() {
    return "Generated Files";
  }

  public Icon getIcon() {
    return null;
  }

  public String getHelpTopic() {
    return "Generated_Files";
  }

  public JComponent createComponent() {
    return this;
  }

  public boolean isModified() {
    return myIgnoreGeneratedFilesCheckBox.isSelected() != getConfiguration().isIgnoreGeneratedFiles();
  }

  public void apply() throws ConfigurationException {
    getConfiguration().setIgnoreGeneratedFiles(myIgnoreGeneratedFilesCheckBox.isSelected());
  }

  public void reset() {
    myIgnoreGeneratedFilesCheckBox.setSelected(getConfiguration().isIgnoreGeneratedFiles());
  }

  public void disposeUIResources() {
  }

  private MPSVcsProjectConfiguration getConfiguration() {
    return myProject.getComponent(MPSVcsProjectConfiguration.class);
  }
}
