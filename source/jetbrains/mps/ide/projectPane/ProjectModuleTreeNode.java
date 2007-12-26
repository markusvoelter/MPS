package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.generationTypes.FileGenerationUtil;

public abstract class ProjectModuleTreeNode extends MPSTreeNode {

  public static ProjectModuleTreeNode createFor(MPSProject project, IModule module) {
    return createFor(project, module, false);
  }


  public static ProjectModuleTreeNode createFor(MPSProject project, IModule module, boolean shortNameOnly) {
    if (module instanceof Language) {
      return new ProjectLanguageTreeNode((Language) module, project, shortNameOnly);
    }

    if (module instanceof Solution) {
      return new ProjectSolutionTreeNode((Solution) module, project, shortNameOnly);
    }

    if (module instanceof DevKit) {
      return new ProjectDevKitTreeNode((DevKit) module, project);
    }

    return null;
  }

  protected ProjectModuleTreeNode(IOperationContext operationContext) {
    super(operationContext);
  }

  protected abstract String getModulePresentation();

  public String toString() {
    if (isUpToDate()) {
      return getModulePresentation();
    } else {
      return getModulePresentation() + " (generation required)";
    }
  }

  public boolean isUpToDate() {
    for (SModelDescriptor sm : getModule().getOwnModelDescriptors()) {
      if (FileGenerationUtil.generationRequired(sm)) {
        return false;
      }
    }

    return true;
  }

  public abstract IModule getModule();
}
