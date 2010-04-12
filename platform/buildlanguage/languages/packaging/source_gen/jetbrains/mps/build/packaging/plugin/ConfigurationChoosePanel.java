package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import jetbrains.mps.baseLanguage.util.plugin.run.LayoutUtil;
import javax.swing.JComboBox;
import jetbrains.mps.build.packaging.plugin.run.ui.ReadComboBoxRenderrer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.ArrayList;

public class ConfigurationChoosePanel extends JPanel {
  @Nullable
  private SNode myNode;
  @Nullable
  private SNode myConfiguration;
  private final ConfigurationChoosePanel.MyComboBoxModel myComboBoxModel = new ConfigurationChoosePanel.MyComboBoxModel();

  public ConfigurationChoosePanel() {
    super(new GridBagLayout());

    this.add(new JLabel("Configuration"), LayoutUtil.createLabelConstraints(0));
    JComboBox comboBox = new JComboBox(this.myComboBoxModel);
    comboBox.setRenderer(new ReadComboBoxRenderrer());
    this.add(comboBox, LayoutUtil.createFieldConstraints(1));
  }

  public void nodeChanged(@Nullable final SNode node) {
    if (node == null) {
      this.reset(null, null);
    } else {
      final Wrappers._T<String> config = new Wrappers._T<String>(null);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          if (ListSequence.fromList(SLinkOperations.getTargets(node, "configuration", true)).isNotEmpty()) {
            config.value = ListSequence.fromList(SLinkOperations.getTargets(node, "configuration", true)).first().getId();
          }
        }
      });
      this.reset(node, config.value);
    }
  }

  public void reset(@Nullable SNode node, @Nullable final String configurationNodeId) {
    this.myNode = node;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ConfigurationChoosePanel.this.selectConfiguration(configurationNodeId);
      }
    });
    this.myComboBoxModel.nodeChanged();
  }

  private void selectConfiguration(@Nullable String configurationNodeId) {
    if (StringUtils.isEmpty(configurationNodeId) || (this.myNode == null)) {
      this.myConfiguration = null;
      return;
    }
    this.myConfiguration = SNodeOperations.cast(SNodeOperations.getModel(this.myNode).getNodeById(configurationNodeId), "jetbrains.mps.build.packaging.structure.Configuration");
  }

  @Nullable
  public String getConfigurationId() {
    if ((this.myConfiguration == null)) {
      return null;
    }
    final Wrappers._T<String> id = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        id.value = ConfigurationChoosePanel.this.myConfiguration.getId();
      }
    });
    return id.value;
  }

  public class MyComboBoxModel extends AbstractListModel implements ComboBoxModel {
    public MyComboBoxModel() {
    }

    public void setSelectedItem(Object object) {
      ConfigurationChoosePanel.this.myConfiguration = (SNode) object;
    }

    public int getSize() {
      return ListSequence.fromList(this.getConfigurations()).count();
    }

    public Object getSelectedItem() {
      return ConfigurationChoosePanel.this.myConfiguration;
    }

    public Object getElementAt(int i) {
      return ListSequence.fromList(this.getConfigurations()).getElement(i);
    }

    @NotNull
    public List<SNode> getConfigurations() {
      final Wrappers._T<List<SNode>> configs = new Wrappers._T<List<SNode>>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          if ((ConfigurationChoosePanel.this.myNode != null)) {
            configs.value = SLinkOperations.getTargets(ConfigurationChoosePanel.this.myNode, "configuration", true);
          } else {
            configs.value = new ArrayList<SNode>();
          }
        }
      });
      return configs.value;
    }

    public void nodeChanged() {
      this.fireContentsChanged(this, -1, this.getSize());
    }
  }
}
