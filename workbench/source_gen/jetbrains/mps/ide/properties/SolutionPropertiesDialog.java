package jetbrains.mps.ide.properties;

/*Generated by MPS */

import jetbrains.mps.workbench.dialogs.project.BasePropertiesDialog;
import jetbrains.mps.project.Solution;
import com.intellij.openapi.Disposable;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JPanel;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.structure.modules.SolutionKind;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import com.intellij.openapi.util.Disposer;

public class SolutionPropertiesDialog extends BasePropertiesDialog {
  public Solution mySolution;
  public SolutionProperties myProperties;
  public Disposable myDisposable = new Disposable() {
    public void dispose() {
    }
  };

  /*package*/ SolutionPropertiesDialog(Solution solution, IOperationContext operationContext) {
    super("Solution Properties", operationContext);
    mySolution = solution;
    collectSolutionProperties();
  }

  public JPanel createCheckboxPanel() {
    List<StandardComponents.CheckboxDescriptor> list = new ArrayList<StandardComponents.CheckboxDescriptor>();
    list.add(new StandardComponents.CheckboxDescriptor(myProperties, ModuleProperties.COMPILE_IN_MPS, "Compile in MPS"));
    return StandardComponents.createCheckboxPanel(this, list);
  }

  public JPanel createSolutionKindPanel() {
    List<String> values = Sequence.fromIterable(Sequence.fromArray(SolutionKind.values())).select(new ISelector<SolutionKind, String>() {
      public String select(SolutionKind it) {
        return it.name();
      }
    }).toListSequence();
    return StandardComponents.createComboSelection(this, "Solution Kind", values, myProperties, SolutionProperties.KIND);
  }

  private void collectSolutionProperties() {
    myProperties = new SolutionProperties();
    myProperties.loadFrom(mySolution.getModuleDescriptor());
  }

  protected boolean doSaveChanges() {
    if (!(checkValidity())) {
      return false;
    }
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SolutionDescriptor solutionDescriptor = mySolution.getModuleDescriptor();
        myProperties.saveTo(solutionDescriptor);
        mySolution.setSolutionDescriptor(solutionDescriptor, true);
        mySolution.save();
      }
    }, getOperationContext().getProject());
    return true;
  }

  protected String getErrorString() {
    return checkStubModels(myProperties.getStubModels());
  }

  public void dispose() {
    super.dispose();
    Disposer.dispose(myDisposable);
  }
}
