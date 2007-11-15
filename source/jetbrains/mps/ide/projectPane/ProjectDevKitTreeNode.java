package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.vfs.IFile;

import javax.swing.Icon;
import javax.swing.JPopupMenu;


class ProjectDevKitTreeNode extends ProjectModuleTreeNode {
  private DevKit myDevKit;

  public ProjectDevKitTreeNode(DevKit devkit, MPSProject project) {
    super(new ModuleContext(devkit, project));
    myDevKit = devkit;
    populate();
  }

  public IModule getModule() {
    return myDevKit;
  }

  public DevKit getDevKit() {
    return myDevKit;
  }

  public String getNodeIdentifier() {
    IFile descriptorFile = myDevKit.getDescriptorFile();
    assert descriptorFile != null;
    return descriptorFile.getAbsolutePath();
  }

  public JPopupMenu getPopupMenu() {
    JPopupMenu result = new JPopupMenu();
    DevKit devKit = getDevKit();
    ActionContext context = new ActionContext(getOperationContext());
    context.put(DevKit.class, devKit);
    ActionManager.instance().getGroup(ProjectPane.PROJECT_PANE_DEVKIT_ACTIONS).add(result, context);
    return result;
  }

  public String toString() {
    String name = myDevKit.getModuleDescriptor().getName();
    if(name != null) {
      return name;
    }
    return "devKit";
  }

  private void populate() {

    TextTreeNode exportedLangs = new TextTreeNode("Exported Languages");
    for (Language l : myDevKit.getExportedLanguages()) {
      exportedLangs.add(ProjectModuleTreeNode.createFor(getOperationContext().getProject(), l));
    }
    add(exportedLangs);

    TextTreeNode exportedModels = new TextTreeNode("Exported Models");
    for (SModelDescriptor sm : myDevKit.getExportedModelDescriptors()) {
      exportedModels.add(new SModelTreeNode(sm, null, getOperationContext()));
    }
    add(exportedModels);

    TextTreeNode generationOnly = new TextTreeNode("Generation only languages");
    add(generationOnly);

    for (IModule l : myDevKit.getGenerationOnlyLanuages()) {
      generationOnly.add(ProjectModuleTreeNode.createFor(getOperationContext().getProject(), l));
    }
  }

  public Icon getIcon(boolean expanded) {
    return Icons.DEVKIT_ICON;
  }
}
