package jetbrains.mps.lang.script.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;

public class Script_ApplicationPlugin extends BaseApplicationPlugin {
  public Script_ApplicationPlugin() {
  }

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = ListSequence.fromList(new ArrayList<BaseGroup>());
    String moduleName = "jetbrains.mps.lang.script";
    this.addGroup(groups, moduleName, "jetbrains.mps.lang.script.plugin.ScriptsForSelection_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.lang.script.plugin.ScriptsGlobally_ActionGroup");
    return groups;
  }

  private void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      ListSequence.fromList(groups).addElement(group);
    }
  }
}
