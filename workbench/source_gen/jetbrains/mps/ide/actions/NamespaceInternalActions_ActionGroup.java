package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.ide.DataManager;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.tree.TreeNode;
import jetbrains.mps.ide.projectPane.NamespaceTextNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.jetbrains.annotations.Nullable;

public class NamespaceInternalActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NamespaceInternalActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NamespaceInternalActions";

  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = SetSequence.fromSet(new HashSet<Pair<ActionPlace, Condition<BaseAction>>>());
  private List<AnAction> myAllActions;

  public NamespaceInternalActions_ActionGroup() {
    super("NamespaceInternalActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      NamespaceInternalActions_ActionGroup.this.removeAll();
      DataContext dataContext = DataManager.getInstance().getDataContext();
      Project project = MPSDataKeys.PROJECT.getData(dataContext);
      List<TreeNode> selectedNodes = MPSDataKeys.LOGICAL_VIEW_NODES.getData(dataContext);
      for (TreeNode selectedNode : selectedNodes) {
        if (!(selectedNode instanceof NamespaceTextNode)) {
          return;
        }
      }
      if (ListSequence.fromList(selectedNodes).count() == 1) {
        NamespaceTextNode node = (NamespaceTextNode) ListSequence.fromList(selectedNodes).first();
        DefaultActionGroup newGroup = node.createNewGroup();
        if (newGroup != null) {
          NamespaceInternalActions_ActionGroup.this.add(newGroup);
          NamespaceInternalActions_ActionGroup.this.addSeparator();
        }
      }
      NamespaceInternalActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateFiles_Action", "jetbrains.mps.ide");
      if (ListSequence.fromList(selectedNodes).count() == 1) {
        NamespaceInternalActions_ActionGroup.this.addSeparator();
        NamespaceInternalActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RenameNamespace_Action", "jetbrains.mps.ide");
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
    for (Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      this.addPlace(p.first, p.second);
    }
  }

  public void addPlace(ActionPlace place, @Nullable Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
  }

  public void adjust() {
    this.insertGroupIntoAnother(NamespaceActions_ActionGroup.ID, NamespaceActions_ActionGroup.LABEL_ID_namespaceInternal);
  }
}
