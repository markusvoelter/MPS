package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.Tools_ActionGroup;

public class Migration_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ide.migration");

  public Migration_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new UpgradeModelPersistenceGlobally_Action());
    addAction(new UpgradeModulePersistenceGlobally_Action());
    // groups 
    addGroup(new Upgrade_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(Upgrade_ActionGroup.ID, Tools_ActionGroup.ID, Tools_ActionGroup.LABEL_ID_internal);
  }
}
