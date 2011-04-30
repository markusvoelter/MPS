package jetbrains.mps.testbench.suite.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.InternalFlag;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.project.structure.modules.ModuleReference;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.project.Solution;
import jetbrains.mps.internal.collections.runtime.ISelector;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.openapi.wm.WindowManager;

public class CollectTests_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CollectTests_Action.class);

  public CollectTests_Action() {
    super("Collect Tests", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return InternalFlag.isInternalMode() && CollectTests_Action.this.isUserEditableModel(((SModelDescriptor) MapSequence.fromMap(_params).get("modelDesc")), _params) && ((SModelDescriptor) MapSequence.fromMap(_params).get("modelDesc")).getSModel().importedLanguages().contains(ModuleReference.fromString("d3c5a46f-b8c2-47db-ad0a-30b8f19c2055(jetbrains.mps.testbench.suite)"));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CollectTests", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("modelDesc", event.getData(MPSDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("modelDesc") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._boolean done = new Wrappers._boolean(false);
      IdeEventQueue.getInstance().flushQueue();
      ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
        public void run() {
          ProgressIndicator proInd = ProgressManager.getInstance().getProgressIndicator();
          proInd.pushState();
          try {
            done.value = CollectTests_Action.this.doExecute(proInd, _params);
          } finally {
            proInd.popState();
          }
        }
      }, "Collecting Tests", true, ((Project) MapSequence.fromMap(_params).get("project")));
      if (!(done.value)) {
        CollectTests_Action.this.displayInfo("Collect Tests action cancelled", _params);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CollectTests", t);
    }
  }

  private boolean doExecute(ProgressIndicator proInd, final Map<String, Object> _params) {
    final Logger LOG = Logger.getLogger("jetbrains.mps.testbench.suite");
    final Wrappers._T<List<ModuleReference>> solutions = new Wrappers._T<List<ModuleReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        solutions.value = CollectTests_Action.this.allSolutions(_params);
      }
    });
    final SModel model = ((SModelDescriptor) MapSequence.fromMap(_params).get("modelDesc")).getSModel();
    int done = 0;
    for (ModuleReference mref : solutions.value) {
      if (proInd.isCanceled()) {
        return false;
      }
      proInd.setText("Processing " + mref.getModuleFqName());
      final IModule module = MPSModuleRepository.getInstance().getModule(mref);
      if (module != null) {
        final Wrappers._T<SNode> suite = new Wrappers._T<SNode>(null);
        for (final SModelDescriptor smd : module.getOwnModelDescriptors()) {
          if (!(CollectTests_Action.this.isUserEditableModel(smd, _params))) {
            continue;
          }

          final Wrappers._T<SModel> smodel = new Wrappers._T<SModel>();
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              try {
                smodel.value = smd.getSModel();
              } catch (RuntimeException ex) {
                LOG.error(ex);
              }
            }
          });
          if (smodel.value == null) {
            continue;
          }

          if (new TestCollector().collectTests(smodel.value, module.getScope(), new _FunctionTypes._void_P1_E0<_FunctionTypes._return_P0_E0<? extends SNode>>() {
            public void invoke(final _FunctionTypes._return_P0_E0<? extends SNode> tref) {
              ThreadUtils.runInUIThreadAndWait(new Runnable() {
                public void run() {
                  ModelAccess.instance().executeCommand(new Runnable() {
                    public void run() {
                      if (suite.value == null) {
                        suite.value = SModelOperations.createNewRootNode(model, "jetbrains.mps.testbench.suite.structure.ModuleSuite", null);
                        SNode sref = SLinkOperations.setNewChild(suite.value, "moduleRef", "jetbrains.mps.testbench.suite.structure.SolutionRef");
                        ModuleReference mref = module.getModuleReference();
                        SPropertyOperations.set(sref, "moduleFQName", mref.getModuleFqName());
                        SPropertyOperations.set(sref, "moduleID", mref.getModuleId().toString());
                      }
                      ListSequence.fromList(SLinkOperations.getTargets(suite.value, "testRef", true)).addElement(tref.invoke());
                      model.addModelImport(smd.getSModelReference(), false);
                      ((SModelDescriptor) MapSequence.fromMap(_params).get("modelDesc")).getModule().addDependency(module.getModuleReference(), false);
                    }
                  }, ((Project) MapSequence.fromMap(_params).get("project")));
                }
              });
            }
          })) {
            // huh? 
          }
        }
      }
      proInd.setFraction(((double) ++done) / ListSequence.fromList(solutions.value).count());
    }
    return true;
  }

  private boolean isUserEditableModel(SModelDescriptor md, final Map<String, Object> _params) {
    if (!(SModelStereotype.isUserModel(md))) {
      return false;
    }
    return md instanceof EditableSModelDescriptor && !(((EditableSModelDescriptor) md).isPackaged());
  }

  private List<ModuleReference> allSolutions(final Map<String, Object> _params) {
    List<Solution> allSolutions = MPSModuleRepository.getInstance().getAllSolutions();
    return ListSequence.fromList(allSolutions).<ModuleReference>select(new ISelector<Solution, ModuleReference>() {
      public ModuleReference select(Solution s) {
        return s.getModuleReference();
      }
    }).toListSequence();
  }

  private void displayInfo(String info, final Map<String, Object> _params) {
    IdeFrame frame = WindowManager.getInstance().getIdeFrame(((Project) MapSequence.fromMap(_params).get("project")));
    if (frame != null) {
      frame.getStatusBar().setInfo(info);
    }
  }
}
