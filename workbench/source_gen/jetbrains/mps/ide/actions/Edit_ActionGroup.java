package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class Edit_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Edit_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Edit_ActionGroup";
  public static final String LABEL_ID_custom = ID + "custom";

  public Edit_ActionGroup() {
    super("Edit", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      Edit_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new QuickCreate_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        Edit_ActionGroup.this.addAction(oldAction);
      }
      Edit_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new CopyNodeReference_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        Edit_ActionGroup.this.addAction(oldAction);
      }
      Edit_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new AddModelImport_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        Edit_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new AddModelImportByRoot_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        Edit_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new AddLanguageImport_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        Edit_ActionGroup.this.addAction(oldAction);
      }
      Edit_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(Edit_ActionGroup.LABEL_ID_custom);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        Edit_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
