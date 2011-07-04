package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.ide.actions.SelectInAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;

public class EditorPopup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorPopup_ActionGroup";
  public static final String LABEL_ID_showIn = ID + "showIn";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_paste = ID + "paste";
  public static final String LABEL_ID_folding = ID + "folding";
  public static final String LABEL_ID_goto = ID + "goto";
  public static final String LABEL_ID_gentrace = ID + "gentrace";
  public static final String LABEL_ID_find = ID + "find";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public EditorPopup_ActionGroup() {
    super("EditorPopup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      EditorPopup_ActionGroup.this.addParameterizedAction(new SelectInActionAdapter_Action(new SelectInAction()), PluginId.getId("jetbrains.mps.ide"), new SelectInAction());
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowInProject_Action");
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_showIn);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowNodeInInspector_Action");
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowClassInHierarchy_Action");
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action");
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowImplementations_Action");
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_structure);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_paste);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_folding);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_goto);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_gentrace);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_find);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CreateAspect_Action");
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowParameters_Action");
      EditorPopup_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowNodeInfo_Action");
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_vcs);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
