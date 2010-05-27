package jetbrains.mps.ide.properties;

/*Generated by MPS */

import jetbrains.mps.workbench.dialogs.project.BasePropertiesDialog;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Set;
import jetbrains.mps.project.structure.modules.ModuleReference;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.smodel.SNode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import jetbrains.mps.workbench.action.ActionFactory;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.ide.DataManager;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.workbench.MPSDataKeys;

public class ModelPropertiesDialog extends BasePropertiesDialog {
  public ModelProperties myPresenter;
  public SModelDescriptor myModel;

  /*package*/ ModelPropertiesDialog(final SModelDescriptor sm, final IOperationContext context) {
    super("Model Properties for " + sm.getSModelFqName(), context);
    this.myModel = sm;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ModelPropertiesDialog.this.myPresenter = new ModelProperties(sm, context);
      }
    });
  }

  public Condition<SModelReference> getImportedModelsRemoveCondition() {
    final Wrappers._T<Set<SModelReference>> models = new Wrappers._T<Set<SModelReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        models.value = ModelPropertiesDialog.this.myPresenter.getModelDescriptor().getSModel().getUsedImportedModels();
      }
    });
    return new ModelPropertiesDialog.ModelsCondition(models.value);
  }

  public Condition<ModuleReference> getUsedLanguageRemoveCondition() {
    final Wrappers._T<Set<ModuleReference>> usedLanguages = new Wrappers._T<Set<ModuleReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        usedLanguages.value = ModelPropertiesDialog.this.myPresenter.getModelDescriptor().getSModel().getUsedLanguages();
      }
    });
    return new ModelPropertiesDialog.LanguagesCondition(usedLanguages.value);
  }

  public JPanel createNamePanel() {
    String stereotype = (this.myModel.getStereotype().equals("") ?
      "" :
      " (" + this.myModel.getStereotype() + ")"
    );
    String initText = this.myModel.getLongName() + stereotype;
    return this.createFieldPanel("Model UID:", initText);
  }

  private JPanel createFieldPanel(String label, String initText) {
    JPanel result = new JPanel(new BorderLayout());
    result.setBorder(new EmptyBorder(5, 3, 5, 3));
    result.add(new JLabel(label), BorderLayout.WEST);
    JTextField nameField = new JTextField(initText);
    nameField.setEditable(false);
    result.add(nameField, BorderLayout.CENTER);
    return result;
  }

  public JComponent createDoNotGenerateCheckBox() {
    final JCheckBox checkBox = new JCheckBox("Do Not Generate");
    checkBox.getModel().setSelected(this.myPresenter.isDoNotGenerate());
    checkBox.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ModelPropertiesDialog.this.myPresenter.setDoNotGenerate(checkBox.getModel().isSelected());
      }
    });
    return checkBox;
  }

  public JComponent createInfoComponent() {
    final StringBuilder messageText = new StringBuilder();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        int nodes = 0;
        int references = 0;
        int properties = 0;
        messageText.append("<html>");
        for (SNode node : ModelPropertiesDialog.this.myModel.getSModel().allNodes()) {
          nodes++;
          references += node.getReferences().size();
          properties += node.getPropertyNames().size();
        }
        messageText.append("Roots : ").append(ModelPropertiesDialog.this.myModel.getSModel().getRoots().size()).append("<br>");
        messageText.append("Nodes : ").append(nodes).append("<br>");
        messageText.append("References : ").append(references).append("<br>");
        messageText.append("Properties : ").append(properties).append("<br>");
      }
    });
    return new JLabel(messageText.toString(), SwingConstants.CENTER);
  }

  public JComponent createAdditionalButtonsComponent() {
    JButton bShowMissRef = new JButton(new AbstractAction("Show Missing References") {
      public void actionPerformed(ActionEvent e) {
        ModelPropertiesDialog.this.dispose();
        ModelPropertiesDialog.this.performActionInContext(new ModelPropertiesDialog.MyDataContext(), ActionFactory.getInstance().acquireRegisteredAction("jetbrains.mps.ide.actions.ShowReferencesToMissingStuff_Action", "jetbrains.mps.ide"));
      }
    });
    JButton bShowModelUsages = new JButton(new AbstractAction("Show Model Usages") {
      public void actionPerformed(ActionEvent e) {
        ModelPropertiesDialog.this.dispose();
        ModelPropertiesDialog.this.performActionInContext(new ModelPropertiesDialog.MyDataContext(), ActionFactory.getInstance().acquireRegisteredAction("jetbrains.mps.lang.core.plugin.FindModelUsages_Action", "jetbrains.mps.lang.core"));
      }
    });
    JPanel result = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1;
    result.add(new JPanel(), c);
    c.gridx = 1;
    c.weightx = 0;
    result.add(bShowModelUsages, c);
    c.gridx = 2;
    result.add(bShowMissRef, c);
    return result;
  }

  protected boolean doSaveChanges() {
    this.myPresenter.saveChanges();
    return true;
  }

  private void performActionInContext(DataContext dc, AnAction action) {
    AnActionEvent event = ActionUtils.createEvent(ActionPlaces.UNKNOWN, dc);
    ActionUtils.updateAndPerformAction(action, event);
  }

  private class MyDataContext implements DataContext {
    private DataContext myRealContext = DataManager.getInstance().getDataContext();

    private MyDataContext() {
    }

    @Nullable
    public Object getData(@NonNls String dataId) {
      if (dataId.equals(MPSDataKeys.OPERATION_CONTEXT.getName())) {
        return ModelPropertiesDialog.this.getOperationContext();
      }
      if (dataId.equals(MPSDataKeys.MODEL.getName())) {
        return ModelPropertiesDialog.this.myPresenter.getModelDescriptor();
      } else
      return this.myRealContext.getData(dataId);
    }
  }

  private class ModelsCondition implements Condition<SModelReference> {
    private final Set<SModelReference> myModels;

    public ModelsCondition(Set<SModelReference> models) {
      this.myModels = models;
    }

    public boolean met(final SModelReference object) {
      return !(this.myModels.contains(object));
    }
  }

  private class LanguagesCondition implements Condition<ModuleReference> {
    private final Set<ModuleReference> myUsedLanguages;

    public LanguagesCondition(Set<ModuleReference> usedLanguages) {
      this.myUsedLanguages = usedLanguages;
    }

    public boolean met(final ModuleReference object) {
      return !(this.myUsedLanguages.contains(object));
    }
  }
}
