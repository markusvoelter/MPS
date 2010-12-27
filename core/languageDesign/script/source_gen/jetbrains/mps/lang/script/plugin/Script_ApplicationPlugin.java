package jetbrains.mps.lang.script.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.ModelActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.GeneratorActions_ActionGroup;
import jetbrains.mps.ide.actions.SolutionActions_ActionGroup;
import jetbrains.mps.ide.actions.Tools_ActionGroup;

public class Script_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.script");

  public Script_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    // groups 
    addGroup(new ScriptsForSelection_ActionGroup());
    addGroup(new ScriptsGlobally_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(ScriptsForSelection_ActionGroup.ID, ModelActions_ActionGroup.ID, ModelActions_ActionGroup.LABEL_ID_scripts);
    insertGroupIntoAnother(ScriptsForSelection_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_scripts);
    insertGroupIntoAnother(ScriptsForSelection_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_scripts);
    insertGroupIntoAnother(ScriptsForSelection_ActionGroup.ID, SolutionActions_ActionGroup.ID, SolutionActions_ActionGroup.LABEL_ID_scripts);
    insertGroupIntoAnother(ScriptsGlobally_ActionGroup.ID, Tools_ActionGroup.ID, null);
  }
}
