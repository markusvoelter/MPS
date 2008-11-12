package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.project.Solution;

import java.util.List;

import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;

public class SolutionStep extends TwoOptionsStep<IModule> {

  private final MPSProject myMpsProject;

  public SolutionStep(Project project, BuildGenerator generator, IErrorHandler handler) {
    super(project, generator, handler);
    this.myMpsProject = this.myProject.getComponent(MPSProjectHolder.class).getMPSProject();
  }

  public String getDescription() {
    return "Build would be located in new solution.";
  }

  protected void setChecked(boolean checked) {
    this.myGenerator.setCreateSolution(checked);
  }

  protected boolean getChecked() {
    return this.myGenerator.getCreateSolution();
  }

  protected String getComboBoxName() {
    return "Use existing solution:";
  }

  protected String getVariantName(final IModule module) {
    return ModelAccess.instance().runReadAction(new Computable<String>() {

      public String compute() {
        return module.toString();
      }

    });
  }

  protected String getTextFieldText() {
    return this.myGenerator.getNewSolutionName();
  }

  protected void setTextFieldText(String text) {
    this.myGenerator.setNewSolutionName(text);
  }

  protected String getCheckBoxName() {
    return "Create new solution";
  }

  protected void setVariant(IModule m) {
    this.myGenerator.setSolution((Solution) m);
  }

  protected String getTextFieldName() {
    return "New solution name:";
  }

  protected IModule[] getVariants() {
    List<IModule> solutionsList = CollectionUtil.filter(this.myMpsProject.getModules(), new Condition<IModule>() {

      public boolean met(IModule module) {
        return module instanceof Solution;
      }

    });
    return solutionsList.toArray(new IModule[solutionsList.size()]);
  }

  protected boolean isCheckBoxEnabled() {
    return true;
  }

  protected boolean isValid(String text) {
    return this.myGenerator.isValidSolutionName(text);
  }

  protected String getWarningText(String text) {
    if (text.equals("")) {
      return "Empty solution name not allowed.";
    }
    return "Module " + text + " already exists, choose another name.";
  }

}
