package jetbrains.mps.lang.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class DFAActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DFAActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.dataFlow.plugin.DFAActions";

  public DFAActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.lang.dataFlow"));
        this.add(ActionFactory.getInstance().getRegisteredAction(language.getClass("jetbrains.mps.lang.dataFlow.plugin.PrintDFAResult_Action"), language.getModuleFqName()));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.lang.dataFlow"));
        this.add(ActionFactory.getInstance().getRegisteredAction(language.getClass("jetbrains.mps.lang.dataFlow.plugin.PrintInitializationInformation_Action"), language.getModuleFqName()));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.lang.dataFlow"));
        this.add(ActionFactory.getInstance().getRegisteredAction(language.getClass("jetbrains.mps.lang.dataFlow.plugin.PrintReachingDefinintionsInformation_Action"), language.getModuleFqName()));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.lang.dataFlow"));
        this.add(ActionFactory.getInstance().getRegisteredAction(language.getClass("jetbrains.mps.lang.dataFlow.plugin.ShowDFA_Action"), language.getModuleFqName()));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorInternal_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(DFAActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
