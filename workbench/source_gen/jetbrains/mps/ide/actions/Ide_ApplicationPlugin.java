package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.Anchor;
import com.intellij.openapi.actionSystem.Constraints;
import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

import java.util.ArrayList;
import java.util.List;

public class Ide_ApplicationPlugin extends BaseApplicationPlugin {

  public void initGroups() {
    this.addGroup(new ProjectPaneNodeActions_ActionGroup());
    this.addGroup(new ProjectPaneNodeActionsInternal_ActionGroup());
    this.addGroup(new ProjectPaneModelActions_ActionGroup());
    this.addGroup(new ProjectActions_ActionGroup());
    this.addGroup(new ProjectNewActions_ActionGroup());
    this.addGroup(new LanguageActions_ActionGroup());
    this.addGroup(new LanguageNewActions_ActionGroup());
    this.addGroup(new SolutionActions_ActionGroup());
    this.addGroup(new SolutionNewActions_ActionGroup());
    this.addGroup(new DevkitActions_ActionGroup());
    this.addGroup(new GeneratorNewActions_ActionGroup());
    this.addGroup(new GeneratorActions_ActionGroup());
    this.addGroup(new TransientModulesActions_ActionGroup());
    this.addGroup(new EditorPopup_ActionGroup());
    this.addGroup(new EditorInternal_ActionGroup());
    this.addGroup(new Edit_ActionGroup());
    this.addGroup(new Generate_ActionGroup());
    this.addGroup(new Goto_ActionGroup());
    this.addGroup(new Tools_ActionGroup());
    this.addGroup(new Help_ActionGroup());
    this.addGroup(new ProjectPaneModelActionsInternal_ActionGroup());
    this.addGroup(new ToolsInternal_ActionGroup());
    this.addGroup(new LanguageNewCustomPartActions_ActionGroup());
    this.addGroup(new Build_ActionGroup());
    this.addGroup(new AbstractFileActions_ActionGroup());
    this.addGroup(new FileActions_ActionGroup());
    this.addGroup(new FolderActions_ActionGroup());
    this.addGroup(new ModuleActions_ActionGroup());
  }

  public void adjustGroups() {
    (this.getGroup(ProjectPaneNodeActions_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectPaneNodeActionsInternal_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectPaneModelActions_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectActions_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectNewActions_ActionGroup.ID)).adjust();
    (this.getGroup(LanguageActions_ActionGroup.ID)).adjust();
    (this.getGroup(LanguageNewActions_ActionGroup.ID)).adjust();
    (this.getGroup(SolutionActions_ActionGroup.ID)).adjust();
    (this.getGroup(SolutionNewActions_ActionGroup.ID)).adjust();
    (this.getGroup(DevkitActions_ActionGroup.ID)).adjust();
    (this.getGroup(GeneratorNewActions_ActionGroup.ID)).adjust();
    (this.getGroup(GeneratorActions_ActionGroup.ID)).adjust();
    (this.getGroup(TransientModulesActions_ActionGroup.ID)).adjust();
    (this.getGroup(EditorPopup_ActionGroup.ID)).adjust();
    (this.getGroup(EditorInternal_ActionGroup.ID)).adjust();
    (this.getGroup(Edit_ActionGroup.ID)).adjust();
    (this.getGroup(Generate_ActionGroup.ID)).adjust();
    (this.getGroup(Goto_ActionGroup.ID)).adjust();
    (this.getGroup(Tools_ActionGroup.ID)).adjust();
    (this.getGroup(Help_ActionGroup.ID)).adjust();
    (this.getGroup(ProjectPaneModelActionsInternal_ActionGroup.ID)).adjust();
    (this.getGroup(ToolsInternal_ActionGroup.ID)).adjust();
    (this.getGroup(LanguageNewCustomPartActions_ActionGroup.ID)).adjust();
    (this.getGroup(Build_ActionGroup.ID)).adjust();
    (this.getGroup(AbstractFileActions_ActionGroup.ID)).adjust();
    (this.getGroup(FileActions_ActionGroup.ID)).adjust();
    (this.getGroup(FolderActions_ActionGroup.ID)).adjust();
    (this.getGroup(ModuleActions_ActionGroup.ID)).adjust();
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneModelActions_ActionGroup.ID);
      ActionGroup gWhat = ActionUtils.getDefaultGroup("VcsGroup");
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = ProjectPaneModelActions_ActionGroup.LABEL_ID_vcs;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(AbstractFileActions_ActionGroup.ID);
      ActionGroup gWhat = ActionUtils.getDefaultGroup("VcsGroup");
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = AbstractFileActions_ActionGroup.LABEL_ID_vcs;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = new ArrayList<BaseCustomApplicationPlugin>();
    {
      BaseCustomApplicationPlugin plugin = new RegisterMainMenuShortcuts_CustomApplicationPlugin();
      res.add(plugin);
      plugin.init();
    }
    return res;
  }

}
