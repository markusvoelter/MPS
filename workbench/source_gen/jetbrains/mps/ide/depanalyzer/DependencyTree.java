package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.ui.TextMPSTreeNode;
import javax.swing.JPopupMenu;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.actions.ModuleProperties_Action;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;

public class DependencyTree extends MPSTree {
  private Project myProject;
  private List<IModule> myModules;
  private boolean myShowRuntime;
  private boolean myShowUsedLanguage = true;

  public DependencyTree(Project project) {
    myProject = project;
  }

  public void setModules(List<IModule> modules) {
    myModules = modules;
  }

  public void setShowRuntime(boolean showRuntime) {
    myShowRuntime = showRuntime;
  }

  public boolean isShowRuntime() {
    return myShowRuntime;
  }

  public boolean isShowUsedLanguage() {
    return myShowUsedLanguage;
  }

  public void setShowUsedLanguage(boolean showUsedLanguage) {
    myShowUsedLanguage = showUsedLanguage;
  }

  protected MPSTreeNode rebuild() {
    if (myModules == null || ListSequence.fromList(myModules).isEmpty()) {
      return new TextMPSTreeNode("No Content", null);
    }
    MPSTreeNode root = new ModuleDependencyNode(myModules, null);
    expandRoot();
    return root;
  }

  @Override
  protected JPopupMenu createPopupMenu(MPSTreeNode treeNode) {
    DefaultActionGroup group = new DefaultActionGroup();
    String id = new ModuleProperties_Action().getActionId();
    if (id == null) {
      return null;
    }
    AnAction action = ActionManager.getInstance().getAction(id);
    if (action == null) {
      return null;
    }
    group.add(action);
    return ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, group).getComponent();
  }
}
