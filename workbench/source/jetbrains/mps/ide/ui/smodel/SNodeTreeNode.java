package jetbrains.mps.ide.ui.smodel;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.ui.MPSTreeNodeEx;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.ActionUtils;

import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class SNodeTreeNode extends MPSTreeNodeEx {
  protected boolean myInitialized = false;
  private SNode myNode;
  private String myRole;
  private Condition<SNode> myCondition = Condition.TRUE_CONDITION;

  public SNodeTreeNode(SNode node, IOperationContext operationContext) {
    this(node, null, operationContext);
  }

  public SNodeTreeNode(SNode node, String role, IOperationContext operationContext) {
    this(node, role, operationContext, Condition.TRUE_CONDITION);
  }

  public SNodeTreeNode(SNode node, String role, IOperationContext operationContext, Condition<SNode> condition) {
    super(operationContext);
    myNode = node;
    myRole = role;
    myCondition = condition;
    updatePresentation();
  }

  protected final void updatePresentation() {
    if (getSModelModelTreeNode() != null) {
      getSModelModelTreeNode().getDependencyRecorder().rebuild(this, new Runnable() {
        public void run() {
          doUpdatePresentation();
        }
      });
    } else {
      doUpdatePresentation();
    }
  }

  protected void onAdd() {
    super.onAdd();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        updatePresentation();
      }
    });
  }

  protected void onRemove() {
    if (getSModelModelTreeNode() != null) {
      getSModelModelTreeNode().getDependencyRecorder().remove(this);
    }
    super.onRemove();
  }

  protected void doUpdatePresentation() {
    if (hasErrors()) {
      setColor(Color.RED);
    } else {
      setColor(Color.BLACK);
    }

    if (myNode != null) {
      setIcon(IconManager.getIconFor(myNode));
    }

    if (getSNode() == null) {
      setNodeIdentifier("null");
    } else {
      setNodeIdentifier(getSNode().getId());
    }

    setText(caclulateNodeTextPresentation());
    setAutoExpandable(!myNode.isRoot());
  }

  public SModelTreeNode getSModelModelTreeNode() {
    if (getParent() instanceof SModelTreeNode) {
      return (SModelTreeNode) getParent();
    }

    if (getParent() instanceof SNodeTreeNode) {
      return ((SNodeTreeNode) getParent()).getSModelModelTreeNode();
    }

    if (getParent() instanceof SNodeGroupTreeNode) {
      TreeNode node = getParent();
      while (!(node instanceof SModelTreeNode)) {
        node = node.getParent();
      }
      return (SModelTreeNode) node;
    }

    return null;
  }

  public JPopupMenu getPopupMenu() {
    return ActionUtils.createPopup(ProjectPane.PROJECT_PANE_NODE_ACTIONS);
  }

  public Object getUserObject() {
    return myNode;
  }

  public int getToggleClickCount() {
    return -1;
  }

  public SNode getSNode() {
    return myNode;
  }

  protected void doUpdate() {
    this.removeAllChildren();
    myInitialized = false;
  }

  public boolean isInitialized() {
    return myInitialized;
  }

  protected void doInit() {
    this.removeAllChildren();
    SNode n = getSNode();
    if (n == null) return;

    if (showPropertiesAndReferences()) {
      add(new PropertiesTreeNode(getOperationContext(), n));
      add(new ReferencesTreeNode(getOperationContext(), n));
    }

    List<SNode> children = n.getChildren();
    List<SNode> filteredChildren = CollectionUtil.filter(children, myCondition);
    for (SNode childNode : filteredChildren) {
      add(getSModelModelTreeNode().createSNodeTreeNode(childNode, childNode.getRole_(), getOperationContext()));
    }

    DefaultTreeModel treeModel = (DefaultTreeModel) getTree().getModel();
    treeModel.nodeStructureChanged(this);
    myInitialized = true;
  }

  private boolean showPropertiesAndReferences() {
    return getTree() instanceof ProjectPane.MyTree &&
      getOperationContext().getComponent(ProjectPane.class).isShowPropertiesAndReferences();
  }

  public void doubleClick() {
    if (getTree() instanceof ProjectPane.MyTree) {
      ((ProjectPane.MyTree) getTree()).editNode(myNode, getOperationContext());
    }
  }

  private String caclulateNodeTextPresentation() {
    StringBuffer output = new StringBuffer();

    if (myRole != null) {
      output.append(myRole).append(" : ");
    }

    SNode node = getSNode();
    if (node != null) {
      String nodeString = node.getPresentation();
      output.append(nodeString);
      if (myRole != null) {
        String presentation = node.getPresentation();
        if (presentation != null && !presentation.equals(nodeString)) {
          output.append(" [").append(presentation).append("]");
        }
      }
    }

    return output.toString();
  }

  public boolean hasErrors() {
    return false;
  }
}
