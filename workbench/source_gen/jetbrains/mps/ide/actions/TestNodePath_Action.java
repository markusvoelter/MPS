package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class TestNodePath_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(TestNodePath_Action.class);
  public static final Icon ICON = null;

  private SNode node;

  public TestNodePath_Action() {
    super("Test Node Path", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "TestNodePath", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      {
        SNode node = event.getData(MPSDataKeys.SNODE);
        if (node != null) {
        }
        this.node = node;
      }
      if (this.node == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode root = SNodeOperations.getContainingRoot(TestNodePath_Action.this.node);
      if (TestNodePath_Action.this.node != root.findChildByPath(root.getNodePath(TestNodePath_Action.this.node))) {
        Logger.getLogger("TestNode_Action").error("find child by path works improperly");
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "TestNodePath", t);
    }
  }

}
