package jetbrains.mps.ide.dependency;

import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.ide.IDEProjectFrame;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.MPSModuleRepository;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DependencyTree extends MPSTree {
  private MPSProject myProject;

  public DependencyTree(MPSProject project) {
    myProject = project;
  }

  protected MPSTreeNode rebuild() {
    MPSTreeNode root = new TextTreeNode("Modules");

    List<IModule> modules = new ArrayList<IModule>();
    modules.addAll(MPSModuleRepository.getInstance().getAllModules());

    Collections.sort(modules, new ModulesComparator());

    for (IModule m : modules) {
      root.add(new ModuleTreeNode(myProject, m));
    }

    return root;
  }

}
