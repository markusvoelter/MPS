package jetbrains.mps.ide.newSolutionDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import java.util.List;

import jetbrains.mps.vfs.FileSystem;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import java.awt.GridLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import jetbrains.mps.smodel.MPSModuleRepository;
import java.io.File;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.ide.NewModuleCheckUtil;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.FileUtil;

public class NewSolutionDialogContentPane extends JPanel {
  public NewSolutionDialogContentPane myThis;
  private JLabel myComponent_b0;
  private JTextField myName_c0;
  private JLabel myComponent_d0;
  private PathField myPath_e0;
  private String mySolutionName;
  private String mySolutionPath;
  private boolean myCompileInMPS = true;
  private MPSProject myProject;
  private Solution myResult;
  private NewSolutionDialog myDialog;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public NewSolutionDialogContentPane() {
    this.myThis = this;
    NewSolutionDialogContentPane component = this;
    component.setLayout(new GridLayout(4, 1));
    component.add(this.createComponent_b0());
    component.add(this.createComponent_c0());
    component.add(this.createComponent_d0());
    component.add(this.createComponent_e0());
    this.myEvents.initialize();
    myThis.setSolutionPath("");
    myThis.setSolutionName("NewSolution");
    myThis.myName_c0.setName("Name");
    myThis.myPath_e0.setName("Path");
  }

  public Events getEvents() {
    return this.myEvents;
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("solutionName");
      Object targetObject = this.myName_c0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("solutionPath");
      Object targetObject = this.myPath_e0;
      Property targetProperty = BeanProperty.create("path");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent_b0() {
    JLabel component = new JLabel();
    this.myComponent_b0 = component;
    component.setText("Name:");
    return component;
  }

  private JTextField createComponent_c0() {
    JTextField component = new JTextField();
    this.myName_c0 = component;
    return component;
  }

  private JLabel createComponent_d0() {
    JLabel component = new JLabel();
    this.myComponent_d0 = component;
    component.setText("Solution Path:");
    return component;
  }

  private PathField createComponent_e0() {
    PathField component = new PathField();
    this.myPath_e0 = component;
    return component;
  }

  public String getSolutionName() {
    return this.mySolutionName;
  }

  public String getSolutionPath() {
    return this.mySolutionPath;
  }

  public boolean getCompileInMPS() {
    return this.myCompileInMPS;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public Solution getResult() {
    return this.myResult;
  }

  public NewSolutionDialog getDialog() {
    return this.myDialog;
  }

  public void setSolutionName(String newValue) {
    String oldValue = this.mySolutionName;
    this.mySolutionName = newValue;
    this.firePropertyChange("solutionName", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setSolutionPath(String newValue) {
    String oldValue = this.mySolutionPath;
    this.mySolutionPath = newValue;
    this.firePropertyChange("solutionPath", oldValue, newValue);
  }

  public void setCompileInMPS(boolean newValue) {
    boolean oldValue = this.myCompileInMPS;
    this.myCompileInMPS = newValue;
    this.firePropertyChange("compileInMPS", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setResult(Solution newValue) {
    Solution oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewSolutionDialog newValue) {
    NewSolutionDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /*package*/ void onOk() {
    if (myThis.getSolutionPath().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution directory");
      return;
    }
    if (myThis.getSolutionName().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution name");
      return;
    }
    if (MPSModuleRepository.getInstance().getModuleByUID(myThis.getSolutionName()) != null) {
      myThis.getDialog().setErrorText("Duplicate solution name");
      return;
    }
    String descriptorPath = myThis.getSolutionPath() + File.separator + myThis.getSolutionName() + MPSExtentions.DOT_SOLUTION;
    final File file = new File(descriptorPath);
    File dir = file.getParentFile();
    String message = NewModuleCheckUtil.checkModuleDirectory(dir, MPSExtentions.DOT_SOLUTION, "Solution");
    if (message != null) {
      myThis.getDialog().setErrorText(message);
      return;
    }
    if (file == null) {
      myThis.getDialog().setErrorText("Can't create " + file);
      return;
    }
    myThis.getDialog().dispose();
    ProgressManager.getInstance().run(new Task.Modal(myThis.getProject().getProject(), "Creating", false) {
      public void run(@NotNull ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        ModelAccess.instance().runWriteAction(new Runnable() {
          public void run() {
            myThis.setResult(myThis.createNewSolution(FileSystem.getInstance().getFileByPath(file.getAbsolutePath())));
          }
        });
      }
    });
  }

  /*package*/ void onCancel() {
    myThis.getDialog().dispose();
  }

  /*package*/ Solution createNewSolution(final IFile solutionDescriptorFile) {
    Solution solution = NewModuleUtil.createNewSolution(solutionDescriptorFile, myThis.getProject());
    solution.getModuleDescriptor().setCompileInMPS(myThis.getCompileInMPS());
    return solution;
  }

  /*package*/ void updateSolutionPath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "solutions" + File.separator;
    if (myThis.getSolutionPath().length() == 0 || myThis.getSolutionPath().startsWith(prefix)) {
      myThis.setSolutionPath(prefix + myThis.getSolutionName());
    }
  }
}
