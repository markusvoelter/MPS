package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class EditorTabActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorTabActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorTabActions_ActionGroup";
  public static final String LABEL_ID_gotoConceptAspects = ID + "gotoConceptAspects";
  public static final String LABEL_ID_showIn = ID + "showIn";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_diff = ID + "diff";

  public EditorTabActions_ActionGroup() {
    super("EditorTabActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      EditorTabActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteNode_Action");
      EditorTabActions_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_gotoConceptAspects);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_showIn);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      EditorTabActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.FindSpecificNodeUsages_Action");
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_find_instances);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      EditorTabActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action");
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_structure);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_diff);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      EditorTabActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowErrorMessage_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
