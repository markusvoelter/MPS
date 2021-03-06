package jetbrains.mps.lang.intentions.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import java.util.List;
import jetbrains.mps.workbench.action.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Intentions_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.intentions");

  public Intentions_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new ShowGenerationIntentions_Action());
    addAction(new ShowSurroundWithIntentions_Action());
    // groups 
    addGroup(new GenerationIntentions_ActionGroup());
    addGroup(new SpecificIntentions_ActionGroup());
    addGroup(new SurroundWithIntentions_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(SpecificIntentions_ActionGroup.ID, EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_intentions);
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    ListSequence.fromList(res).addElement(new Mac_KeymapChanges());
    return res;
  }
}
