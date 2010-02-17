package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.BaseChooserComponent;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;
import java.util.Collections;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelStereotype;

public class ModelChooserComponent extends BaseChooserComponent {
  private List<SModelDescriptor> checkedModels = ListSequence.fromList(new ArrayList<SModelDescriptor>());

  public ModelChooserComponent() {
    super();
    this.init(new ActionListener() {
      public void actionPerformed(ActionEvent p0) {
        ModelChooserComponent.this.collectModels();
        StringBuilder result = new StringBuilder();
        SModelDescriptor modelDescriptor = CommonChoosers.showDialogModelChooser(ModelChooserComponent.this, ModelChooserComponent.this.checkedModels, Collections.EMPTY_LIST);
        if (modelDescriptor != null) {
          result.append(modelDescriptor.getLongName());
          ModelChooserComponent.this.setText(result.toString());
        }
      }
    });
  }

  private void collectModels() {
    final List<SModelDescriptor> models = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    ListSequence.fromList(this.checkedModels).clear();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (IModule module : GlobalScope.getInstance().getVisibleModules()) {
          ListSequence.fromList(models).addSequence(ListSequence.fromList(module.getOwnModelDescriptors()));
        }
        for (SModelDescriptor descriptor : models) {
          if (SModelStereotype.isStubModelStereotype(descriptor.getStereotype())) {
            continue;
          }
          if (ListSequence.fromList(TestRunUtil.getModelTests(descriptor.getSModel())).isNotEmpty()) {
            ListSequence.fromList(ModelChooserComponent.this.checkedModels).addElement(descriptor);
          }
        }
      }
    });
  }
}
