package jetbrains.mps.ide.devkit.newLanguageDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import javax.swing.JCheckBox;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Language;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import java.awt.GridLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import jetbrains.mps.ide.newSolutionDialog.NewModuleUtil;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModelCommandExecutor;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.library.LanguageDesign_DevKit;
import java.io.File;

public class NewLanguageDialogContentPane extends JPanel {
  public NewLanguageDialogContentPane myThis;
  private JLabel myComponent_b0;
  private JTextField myName_c0;
  private JLabel myComponent_d0;
  private PathField myPath_e0;
  private JCheckBox myNeedRuntime_f0;
  private JCheckBox myNeedSandbox_g0;
  private String myLanguageNamespace;
  private String myLanguagePath;
  private MPSProject myProject;
  private Language myResult;
  private NewLanguageDialog myDialog;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public NewLanguageDialogContentPane() {
    this.myThis = this;
    NewLanguageDialogContentPane component = this;
    component.setLayout(new GridLayout(6, 1));
    component.add(this.createComponent_b0());
    component.add(this.createComponent_c0());
    component.add(this.createComponent_d0());
    component.add(this.createComponent_e0());
    component.add(this.createComponent_f0());
    component.add(this.createComponent_g0());
    this.myEvents.initialize();
    myThis.setLanguageNamespace("");
    myThis.setLanguagePath("");
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
      Property sourceProperty = BeanProperty.create("languageNamespace");
      Object targetObject = this.myName_c0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("languagePath");
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
    component.setText("Language Namespace:");
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
    component.setText("Language Path:");
    return component;
  }

  private PathField createComponent_e0() {
    PathField component = new PathField();
    this.myPath_e0 = component;
    return component;
  }

  private JCheckBox createComponent_f0() {
    JCheckBox component = new JCheckBox();
    this.myNeedRuntime_f0 = component;
    component.setText("Create Runtime Solution");
    return component;
  }

  private JCheckBox createComponent_g0() {
    JCheckBox component = new JCheckBox();
    this.myNeedSandbox_g0 = component;
    component.setText("Create Sandbox Solution");
    return component;
  }

  public String getLanguageNamespace() {
    return this.myLanguageNamespace;
  }

  public String getLanguagePath() {
    return this.myLanguagePath;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public Language getResult() {
    return this.myResult;
  }

  public NewLanguageDialog getDialog() {
    return this.myDialog;
  }

  public void setLanguageNamespace(String newValue) {
    String oldValue = this.myLanguageNamespace;
    this.myLanguageNamespace = newValue;
    this.firePropertyChange("languageNamespace", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setLanguagePath(String newValue) {
    String oldValue = this.myLanguagePath;
    this.myLanguagePath = newValue;
    this.firePropertyChange("languagePath", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setResult(Language newValue) {
    Language oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewLanguageDialog newValue) {
    NewLanguageDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /*package*/ void onOk() {
    String message = NewModuleUtil.check(MPSExtentions.DOT_LANGUAGE, myThis.getLanguageNamespace(), myThis.getLanguagePath());
    if (message != null) {
      myThis.getDialog().setErrorText(message);
      return;
    }

    myThis.getDialog().dispose();
    final Wrappers._T<Language> language = new Wrappers._T<Language>(null);
    Project project = myThis.getProject();
    ModelAccess.instance().runWriteActionWithProgressSynchronously(new ModelCommandExecutor.RunnableWithProgress() {
      public void run(ProgressMonitor monitor) {
        language.value = myThis.createNewLanguage();
      }
    }, "Creating", false, project);
    ModelAccess.instance().runWriteActionInCommandAsync(new Runnable() {
      public void run() {
        if (!(language.value.getSModelRoots().isEmpty())) {
          LanguageAspect.STRUCTURE.createNew(language.value, false);
          LanguageAspect.EDITOR.createNew(language.value, false);
          LanguageAspect.CONSTRAINTS.createNew(language.value, false);
          LanguageAspect.BEHAVIOR.createNew(language.value, false);
          LanguageAspect.TYPESYSTEM.createNew(language.value, false);
        }
        if (myThis.myNeedRuntime_f0.isSelected()) {
          Solution runtime = myThis.createRuntimeSolution();
          runtime.createModel(SModelFqName.fromString(myThis.getLanguageNamespace() + ".runtime"), runtime.getSModelRoots().get(0), null);
        }
        if (myThis.myNeedSandbox_g0.isSelected()) {
          Solution sandbox = myThis.createSandboxSolution();
          SModel createdModel = sandbox.createModel(SModelFqName.fromString(myThis.getLanguageNamespace() + ".sandbox"), sandbox.getSModelRoots().get(0), null).getSModel();
          createdModel.addLanguage(myThis.getResult().getModuleReference());
          for (Language extendedLanguage : myThis.getResult().getExtendedLanguages()) {
            createdModel.addLanguage(extendedLanguage.getModuleReference());
          }
          for (ModuleReference addedLanguage : createdModel.importedLanguages()) {
            if (sandbox.getScope().getLanguage(addedLanguage) == null) {
              sandbox.addUsedLanguage(addedLanguage);
            }
          }
        }
      }
    }, project);
  }

  /*package*/ void onCancel() {
    myThis.getDialog().dispose();
  }

  /*package*/ String getLanguageName() {
    return NameUtil.shortNameFromLongName(myThis.getLanguageNamespace());
  }

  /*package*/ Language createNewLanguage() {
    myThis.setResult(NewModuleUtil.createModule(MPSExtentions.DOT_LANGUAGE, myThis.getLanguageNamespace(), myThis.getLanguagePath(), myThis.getProject(), new _FunctionTypes._return_P3_E0<Language, String, IFile, MPSProject>() {
      public Language invoke(String s, IFile f, MPSProject p) {
        return Language.createLanguage(s, f, p);
      }
    }, new _FunctionTypes._void_P1_E0<ModuleDescriptor>() {
      public void invoke(ModuleDescriptor d) {
        ModuleReference devkitRef = LanguageDesign_DevKit.MODULE_REFERENCE;
        d.getUsedDevkits().add(devkitRef);
      }
    }));
    return myThis.getResult();
  }

  /*package*/ Solution createRuntimeSolution() {
    String basePath = myThis.getLanguagePath() + File.separator + "runtime";
    String namespace = myThis.getLanguageNamespace() + ".runtime";
    Solution solution = NewModuleUtil.createSolution(namespace, basePath, myThis.getProject());
    return solution;
  }

  /*package*/ Solution createSandboxSolution() {
    String basePath = myThis.getLanguagePath() + File.separator + "sandbox";
    String namespace = myThis.getLanguageNamespace() + ".sandbox";
    Solution solution = NewModuleUtil.createSolution(namespace, basePath, myThis.getProject());
    return solution;
  }

  /*package*/ void updateLanguagePath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = myThis.getProject().getProjectFile().getParentFile().getAbsolutePath();
    String prefix = path + File.separator + "languages" + File.separator;
    if (myThis.getLanguagePath().length() == 0 || myThis.getLanguagePath().startsWith(prefix)) {
      myThis.setLanguagePath(prefix + NameUtil.shortNameFromLongName(myThis.getLanguageNamespace()));
    }
  }
}
