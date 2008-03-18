package jetbrains.mps.ide.newSolutionDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import java.util.ArrayList;
import java.awt.GridLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import jetbrains.mps.smodel.MPSModuleRepository;
import java.io.File;
import jetbrains.mps.util.DirectoryUtil;
import java.awt.Frame;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.projectLanguage.DescriptorsPersistence;
import jetbrains.mps.projectLanguage.structure.SolutionDescriptor;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.FileUtil;

public class NewSolutionDialogContentPane extends JPanel {

  public NewSolutionDialogContentPane myThis;
  private JLabel myComponent;
  private JTextField myComponent1;
  private JLabel myComponent2;
  private PathField myComponent3;
  private String mySolutionName;
  private String mySolutionPath;
  private boolean myCompileInMPS;
  private MPSProject myProject;
  private Solution myResult;
  private NewSolutionDialog myDialog;
  public List<AutoBinding> myBindings = new ArrayList<AutoBinding>();

  public  NewSolutionDialogContentPane() {
    this.myThis = this;
    myThis.setSolutionPath("");
    myThis.setSolutionName("NewSolution");
    NewSolutionDialogContentPane component = this;
    component.setLayout(new GridLayout(4, 1));
    component.add(this.createComponent());
    component.add(this.createComponent1());
    component.add(this.createComponent2());
    component.add(this.createComponent3());
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
      Object targetObject = this.myComponent1;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("solutionPath");
      Object targetObject = this.myComponent3;
      Property targetProperty = BeanProperty.create("path");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
  }

  private void unbind() {
    for(AutoBinding binding : this.myBindings) {
      if(binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent() {
    JLabel component = new JLabel();
    this.myComponent = component;
    component.setText("Name:");
    return component;
  }

  private JTextField createComponent1() {
    JTextField component = new JTextField();
    this.myComponent1 = component;
    return component;
  }

  private JLabel createComponent2() {
    JLabel component = new JLabel();
    this.myComponent2 = component;
    component.setText("Solution Path:");
    return component;
  }

  private PathField createComponent3() {
    PathField component = new PathField();
    this.myComponent3 = component;
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

  /* package */void onOk() {
    if(myThis.getSolutionPath().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution directory");
      return;
    }
    if(myThis.getSolutionName().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution name");
      return;
    }
    if(MPSModuleRepository.getInstance().getModuleByUID(myThis.getSolutionName()) != null) {
      myThis.getDialog().setErrorText("Duplicate solution name");
      return;
    }
    String descriptorPath = myThis.getSolutionPath() + File.separator + myThis.getSolutionName() + ".msd";
    File file = new File(descriptorPath);
    if(file.exists()) {
      myThis.getDialog().setErrorText("Solution file already exists");
      return;
    }
    File dir = file.getParentFile();
    if(!(dir.isAbsolute())) {
      myThis.getDialog().setErrorText("Path should be absolute");
      return;
    }
    if(!(dir.exists())) {
      if(!(DirectoryUtil.askToCreateNewDirectory((Frame)myThis.getDialog().getOwner(), dir))) {
        myThis.getDialog().setErrorText("Enter correct path");
        return;
      }
    }
    final File descriptorFile = myThis.prepareToCreateNewSolutionDescriptorFile(descriptorPath);
    if(descriptorFile == null) {
      myThis.getDialog().setErrorText("Can't create " + descriptorPath);
      return;
    }
    myThis.getDialog().dispose();
    CommandProcessor.instance().executeCommand(new Runnable() {

      public void run() {
        myThis.setResult(myThis.createNewSolution(myThis.getSolutionName(), FileSystem.getFile(descriptorFile)));
      }

    });
  }

  /* package */void onCancel() {
    myThis.getDialog().dispose();
  }

  /* package */File prepareToCreateNewSolutionDescriptorFile(String path) {
    File solutionDescriptorFile = new File(path);
    File dir = solutionDescriptorFile.getParentFile();
    if(!(dir.exists())) {
      dir.mkdirs();
    }
    return solutionDescriptorFile;
  }

  /* package */Solution createNewSolution(String solutionName, IFile solutionDescriptorFile) {
    SNode solutionDescriptor = SConceptOperations.createNewNode("jetbrains.mps.projectLanguage.structure.SolutionDescriptor", null);
    SPropertyOperations.set(solutionDescriptor, "externallyVisible", "" + (true));
    SPropertyOperations.set(solutionDescriptor, "compileInMPS", "" + (myThis.getCompileInMPS()));
    String fileName = solutionDescriptorFile.getName();
    SPropertyOperations.set(solutionDescriptor, "name", fileName.substring(0, fileName.length() - 4));
    SNode modelRoot = SConceptOperations.createNewNode("jetbrains.mps.projectLanguage.structure.ModelRoot", null);
    SPropertyOperations.set(modelRoot, "prefix", "");
    SPropertyOperations.set(modelRoot, "path", solutionDescriptorFile.getParent().getAbsolutePath());
    SLinkOperations.addChild(solutionDescriptor, "modelRoot", modelRoot);
    DescriptorsPersistence.saveSolutionDescriptor(solutionDescriptorFile, ((SolutionDescriptor)SNodeOperations.getAdapter(solutionDescriptor)));
    return myThis.getProject().addProjectSolution(solutionDescriptorFile.toFile());
  }

  /* package */void updateSolutionPath() {
    if(myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "solutions" + File.separator;
    if(myThis.getSolutionPath().length() == 0 || myThis.getSolutionPath().startsWith(prefix)) {
      myThis.setSolutionPath(prefix + myThis.getSolutionName());
    }
  }

}
