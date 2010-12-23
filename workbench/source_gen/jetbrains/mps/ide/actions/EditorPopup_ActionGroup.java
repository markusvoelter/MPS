package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.ide.actions.SelectInAction;

public class EditorPopup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorPopup_ActionGroup";
  public static final String LABEL_ID_goByRef = ID + "goByRef";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_folding = ID + "folding";
  public static final String LABEL_ID_generateModel = ID + "generateModel";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public EditorPopup_ActionGroup() {
    super("EditorPopup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_goByRef);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      {
        GeneratedAction newAction = new GoByCurrentReference_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new SelectInActionAdapter_Action(new SelectInAction());
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowInProject_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowNodeInExplorer_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowNodeInInspector_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowClassInHierarchy_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowConceptInHierarchy_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowImplementations_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_structure);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new PasteAsJavaStatements_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new PasteAsJavaMethods_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
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
        GeneratedAction newAction = new GoToConceptDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToEditorDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToRules_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_generateModel);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      {
        GeneratedAction newAction = new GoToUsageInMappingConfig_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowGenerationTrace_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowGenerationTraceback_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new FindSpecificNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new FastFindNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_find_instances);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new CloneRoot_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowParameters_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowNodeInfo_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ModelPropertiesWOShortcut_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        EditorPopup_ActionGroup.this.addAction(oldAction);
      }
      EditorPopup_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(EditorPopup_ActionGroup.LABEL_ID_vcs);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorPopup_ActionGroup.this.addAction(action);
      }
      EditorPopup_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
