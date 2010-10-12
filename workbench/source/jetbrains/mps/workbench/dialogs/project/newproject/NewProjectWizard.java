/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.workbench.dialogs.project.newproject;

import com.intellij.ide.IdeBundle;
import com.intellij.ide.impl.ProjectUtil;
import com.intellij.ide.wizard.AbstractWizard;
import com.intellij.ide.wizard.CommitStepException;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.library.LanguageDesign_DevKit;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.persistence.SolutionDescriptorPersistence;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.io.File;

public class NewProjectWizard extends AbstractWizard<BaseStep> {
  private ProjectStep myProjectStep;
  private LanguageStep myLanguageStep;
  private SolutionStep mySolutionStep;

  private Project myCreatedProject;
  private Language myCreatedLanguage;
  private Solution myCreatedSolution;

  private ProjectOptions myOptions = new ProjectOptions();
  private Project myProject;

  public NewProjectWizard(String title, Project project) {
    super(title, project);
    myProject = project;

    myOptions.setCreateNewLanguage(true);
    myOptions.setCreateNewSolution(true);

    myProjectStep = new ProjectStep(myOptions);
    myLanguageStep = new LanguageStep(myOptions);
    mySolutionStep = new SolutionStep(myOptions);

    addStep(myProjectStep);
    addStep(myLanguageStep);
    addStep(mySolutionStep);

    init();
  }

  protected JComponent createCenterPanel() {
    JComponent panel = super.createCenterPanel();
    assert panel != null;
    panel.doLayout();
    return panel;
  }

  protected void doNextAction() {
    final BaseStep currentStep = getCurrentStepObject();
    try {
      currentStep._check();
    }
    catch (final CommitStepException exc) {
      Frame frame = JOptionPane.getFrameForComponent(currentStep.getComponent());
      Messages.showErrorDialog(
        frame,
        exc.getMessage()
      );
      return;
    }

    super.doNextAction();
  }


  protected void updateStep() {
    super.updateStep();

    getFinishButton().setEnabled(getCurrentStep() == mySteps.size() - 1);
  }

  protected void doOKAction() {
    super.doOKAction();
    if (myProject != null) {
      int exitCode = Messages.showDialog(IdeBundle.message("prompt.open.project.in.new.frame"), IdeBundle.message("title.open.project"),
        new String[]{IdeBundle.message("button.newframe"), IdeBundle.message("button.existingframe")}, 1, Messages.getQuestionIcon());
      if (exitCode == 1) {
        ProjectUtil.closeProject(myProject);
      }
    }

    //invoke later is for plugins to be ready
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        doCreate();
      }
    });
  }

  private void doCreate() {
    final String[] error = new String[]{null};
    ProgressManager.getInstance().run(new Task.Modal(myProject, "Creating", false) {
      public void run(@NotNull() ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        error[0] = createDirs();
        if (error[0] != null) return;
        myCreatedProject = ProjectManagerEx.getInstanceEx().newProject(myOptions.getProjectName(), myOptions.getProjectPath() + File.separator + myOptions.getProjectName() + MPSExtentions.DOT_MPS_PROJECT, true, false);
      }
    });

    if (error[0] != null) {
      Messages.showErrorDialog(getContentPane(), error[0]);
      return;
    }

    myCreatedProject.save();

    //noinspection ConstantConditions
    final MPSProject mpsProject = myCreatedProject.getComponent(MPSProject.class);

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        if (myOptions.getCreateNewLanguage()) {
          myCreatedLanguage = createNewLanguage(mpsProject);
          mpsProject.addProjectLanguage(myCreatedLanguage);
          myCreatedLanguage.save();
        }

        if (myOptions.getCreateNewSolution()) {
          IFile solutionDescriptorFile = createNewSolution();
          myCreatedSolution = mpsProject.addProjectSolution(solutionDescriptorFile);
          myCreatedSolution.save();
        }

        if (myCreatedSolution != null && myCreatedLanguage != null) {
          myCreatedSolution.addUsedLanguage(myCreatedLanguage.getModuleReference());
          myCreatedSolution.save();

          if (myOptions.getCreateModel()) {
            EditableSModelDescriptor model = myCreatedSolution.createModel(SModelFqName.fromString(myCreatedSolution.getModuleReference().getModuleFqName() + ".sandbox"), myCreatedSolution.getSModelRoots().get(0));
            SModelOperations.addLanguage(model.getSModel(), myCreatedLanguage.getModuleReference());
            model.save();
          }
        }
      }
    });

    ProjectManagerEx projectManager = ProjectManagerEx.getInstanceEx();
    boolean opened = projectManager.openProject(myCreatedProject);

    if (!opened) return;

    StartupManager.getInstance(myCreatedProject).runWhenProjectIsInitialized(new Runnable() {
      public void run() {
        ProjectPane.getInstance(myCreatedProject).activate();
      }
    });
  }

  @Nullable
  private String createDirs() {
    File projectDirFile = new File(myOptions.getProjectPath());
    if (!(projectDirFile.exists())) {
      if (!projectDirFile.mkdirs()) return "Project directory creation failed";
    }

    if (myOptions.getCreateNewLanguage()) {
      File languageDirFile = new File(myOptions.getLanguagePath());
      if (!(languageDirFile.exists())) {
        if (!languageDirFile.mkdirs()) return "Language directory creation failed";
      }
    }

    if (myOptions.getCreateNewSolution()) {
      String path = getSolutionFileName();
      File solutionDescriptorFile = new File(path);
      File dir = solutionDescriptorFile.getParentFile();
      if (!(dir.exists())) {
        if (!dir.mkdirs()) return "Solution directory creation failed";
      }
    }

    return null;
  }

  private Language createNewLanguage(MPSProject mpsProject) {
    String descriptorFileName = NameUtil.shortNameFromLongName(myOptions.getLanguageNamespace());
    File descriptorFile = new File(myOptions.getLanguagePath(), descriptorFileName + MPSExtentions.DOT_LANGUAGE);
    File dir = descriptorFile.getParentFile();
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    Language language = Language.createLanguage(myOptions.getLanguageNamespace(), FileSystem.getInstance().getFileByPath(descriptorFile.getAbsolutePath()), mpsProject);
    LanguageDescriptor languageDescriptor = language.getModuleDescriptor();
    ModuleReference ref = LanguageDesign_DevKit.MODULE_REFERENCE;
    languageDescriptor.getUsedDevkits().add(ref);
    LanguageAspect.STRUCTURE.createNew(language, false);
    LanguageAspect.EDITOR.createNew(language, false);
    LanguageAspect.CONSTRAINTS.createNew(language, false);
    LanguageAspect.TYPESYSTEM.createNew(language, false);
    language.setLanguageDescriptor(languageDescriptor, false);

    return language;
  }

  private IFile createNewSolution() {
    IFile solutionFile = FileSystem.getInstance().getFileByPath(getSolutionFileName());
    String fileName = solutionFile.getName();

    SolutionDescriptor solutionDescriptor = new SolutionDescriptor();
    solutionDescriptor.setExternallyVisible(true);
    String name = fileName.substring(0, fileName.length() - 4);
    solutionDescriptor.setNamespace(name);

    ModelRoot modelRoot = new ModelRoot();
    modelRoot.setPrefix("");
    modelRoot.setPath(solutionFile.getParent().getAbsolutePath());

    solutionDescriptor.getModelRoots().add(modelRoot);
    SolutionDescriptorPersistence.saveSolutionDescriptor(solutionFile, solutionDescriptor);

    return solutionFile;
  }

  private String getSolutionFileName() {
    return myOptions.getSolutionPath() + File.separator + myOptions.getSolutionNamespace() + MPSExtentions.DOT_SOLUTION;
  }


  protected String getHelpID() {
    return null;
  }
}
