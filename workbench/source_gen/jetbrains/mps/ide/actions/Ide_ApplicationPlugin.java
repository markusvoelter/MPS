package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;
import jetbrains.mps.workbench.action.BaseKeymapChanges;

public class Ide_ApplicationPlugin extends BaseApplicationPlugin {
  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = ListSequence.fromList(new ArrayList<BaseGroup>());
    String moduleName = "jetbrains.mps.ide";
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NodeActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ProjectActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.DevkitActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GeneratorNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GeneratorActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.TransientModulesActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.EditorPopup_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.EditorInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Edit_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Generate_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Goto_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Tools_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NodeActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageNewCustomPartActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Build_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.AbstractFileActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.FileActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.FolderActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModuleActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.PackageActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NamespaceActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NamespaceInternalActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ReferenceNodeActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.PropertyNodeActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Bookmarks_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.CreateRootNode_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GenerateModule_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GenerateModels_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SaveTransientModels_ActionGroup");
    return groups;
  }

  private void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      ListSequence.fromList(groups).addElement(group);
    }
  }

  public void adjustInterfaceGroups() {
    this.insertGroupIntoAnother(ModelActions_ActionGroup.ID, "VcsGroup", ModelActions_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(AbstractFileActions_ActionGroup.ID, "VcsGroup", AbstractFileActions_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, "VcsGroup", EditorPopup_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, "VcsGroup", LanguageActions_ActionGroup.LABEL_ID_vcs);
  }

  public void insertGroupIntoAnother(String toId, String whatId, String labelName) {
    DefaultActionGroup gTo = (DefaultActionGroup)ActionManager.getInstance().getAction(toId);
    DefaultActionGroup gWhat = (DefaultActionGroup)ActionManager.getInstance().getAction(whatId);
    if (gTo == null || gWhat == null) {
      return;
    }
    if (labelName != null) {
      Constraints constraints = new Constraints(Anchor.AFTER, labelName);
      gTo.add(gWhat, constraints);
    } else {
      gTo.add(gWhat);
    }
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Mac_KeymapChanges());
    return res;
  }
}
