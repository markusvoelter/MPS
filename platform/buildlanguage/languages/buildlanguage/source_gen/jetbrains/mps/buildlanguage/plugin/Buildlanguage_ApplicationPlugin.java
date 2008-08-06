package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;

import java.util.ArrayList;
import java.util.List;

public class Buildlanguage_ApplicationPlugin extends BaseApplicationPlugin {

  public void initGroups() {
    this.addGroup(new ProjectPaneModelAddition_ActionGroup());
    this.addGroup(new ProjectPaneLanguageAddition_ActionGroup());
  }

  public void adjustGroups() {
    (this.getGroup(ProjectPaneModelAddition_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectPaneLanguageAddition_ActionGroup.ID)).adjust();
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = new ArrayList<BaseCustomApplicationPlugin>();
    return res;
  }

}
