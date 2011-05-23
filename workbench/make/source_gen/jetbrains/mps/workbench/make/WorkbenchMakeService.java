package jetbrains.mps.workbench.make;

/*Generated by MPS */

import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import dependencies.ModulesClusterizer;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IProgress;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.make.runtime.backports.JobMonitorProgressIndicator;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.messages.IMessage;

public class WorkbenchMakeService implements IMakeService {
  private IOperationContext context;
  private boolean cleanMake;
  private ProgressIndicator progInd;

  public WorkbenchMakeService(IOperationContext context, boolean cleanMake) {
    this.context = context;
    this.cleanMake = cleanMake;
  }

  public IResult make(Iterable<? extends IResource> resources) {
    return doMake(resources, WorkbenchMakeService.defaultMakeScript(), null);
  }

  public IResult make(Iterable<? extends IResource> resources, IScript script) {
    return doMake(resources, script, null);
  }

  public IResult make(Iterable<? extends IResource> resources, IScript script, IScriptController ctl) {
    return doMake(resources, script, ctl);
  }

  protected void doExecute(Runnable scriptRunnable) {
    scriptRunnable.run();
  }

  private IResult doMake(final Iterable<? extends IResource> inputRes, final IScript script, IScriptController controller) {
    final String scrName = ((cleanMake ?
      "Rebuild" :
      "Make"
    ));
    final WorkbenchMakeService.MessageHandler mh = new WorkbenchMakeService.MessageHandler("Make");
    mh.clear();

    if (Sequence.fromIterable(inputRes).isEmpty()) {
      if (cleanMake) {
        String msg = scrName + " aborted: nothing to do";
        this.showError(mh, msg);
        this.displayInfo(msg);
        return new IResult.FAILURE(null);
      } else {
        this.displayInfo("Everything up to date");
        return new IResult.SUCCESS(null);
      }
    }


    if (!(script.isValid())) {
      String msg = scrName + " failed";
      showError(mh, msg + ". Invalid script.");
      this.displayInfo(msg);
      return new IResult.FAILURE(null);
    }

    // save all before launching the script 
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });
    final Wrappers._T<Iterable<? extends Iterable<IResource>>> clInput = new Wrappers._T<Iterable<? extends Iterable<IResource>>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        clInput.value = new ModulesClusterizer().clusterize(Sequence.fromIterable(inputRes).<IResource>select(new ISelector<IResource, IResource>() {
          public IResource select(IResource r) {
            return (IResource) r;
          }
        }));
      }
    });
    final IScriptController ctl = this.completeController(scrName, mh, controller);
    final Wrappers._T<IResult> res = new Wrappers._T<IResult>();
    doExecute(new Runnable() {
      public void run() {
        ThreadUtils.runInUIThreadAndWait(new Runnable() {
          public void run() {
            IdeEventQueue.getInstance().flushQueue();
            ProgressManager.getInstance().run(new Task.Backgroundable(context.getProject(), scrName, true) {
              public void run(@NotNull ProgressIndicator pi) {
                progInd = pi;
                for (Iterable<IResource> cl : clInput.value) {
                  res.value = script.execute(ctl, cl);
                  if (!(res.value.isSucessful()) || progInd.isCanceled()) {
                    break;
                  }
                }
              }

              @Override
              public void onSuccess() {
                reconcile();
              }

              @Override
              public void onCancel() {
                reconcile();
              }

              private void reconcile() {
                if (res.value == null) {
                  String msg = scrName + " aborted";
                  WorkbenchMakeService.this.displayInfo(msg);
                } else if (!(res.value.isSucessful())) {
                  String msg = scrName + " failed";
                  showError(mh, msg + ". See previous messages for details.");
                  WorkbenchMakeService.this.displayInfo(msg);
                } else {
                  String msg = scrName + " successful";
                  WorkbenchMakeService.this.displayInfo(msg);
                }
              }
            });
          }
        });
      }
    });

    return null;
  }

  private void showError(WorkbenchMakeService.MessageHandler mh, String msg) {
    mh.handle(new Message(MessageKind.ERROR, msg));
  }

  private void displayInfo(String info) {
    IdeFrame frame = WindowManager.getInstance().getIdeFrame(context.getProject());
    if (frame != null) {
      frame.getStatusBar().setInfo(info);
    }
  }

  private IScriptController completeController(final String scrName, final IMessageHandler mh, final IScriptController ctl) {
    final Wrappers._T<IConfigMonitor> cmon2delegate = new Wrappers._T<IConfigMonitor>(null);
    final IConfigMonitor cmon = new IConfigMonitor.Stub() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        T opt = null;
        if (cmon2delegate.value != null) {
          opt = cmon2delegate.value.relayQuery(query);
        }
        return (opt != null ?
          opt :
          new UIQueryRelayStrategy().relayQuery(query, WorkbenchMakeService.this.context)
        );
      }
    };
    final ProgressIndicatorProgressStrategy progStrat = new ProgressIndicatorProgressStrategy();
    final IJobMonitor jmon = new IJobMonitor() {
      public boolean stopRequested() {
        return (progStrat.getProgressIndicator() != null ?
          progStrat.getProgressIndicator().isCanceled() :
          false
        );
      }

      public IProgress currentProgress() {
        return progStrat.currentProgress();
      }

      public void reportFeedback(IFeedback fdbk) {
        new UIFeedbackStrategy(mh).reportFeedback(fdbk);
      }
    };

    final Wrappers._T<ProgressIndicator> pind = new Wrappers._T<ProgressIndicator>(null);
    return new IScriptController() {
      public void runConfigWithMonitor(final _FunctionTypes._void_P1_E0<? super IConfigMonitor> code) {
        if (ctl != null) {
          ctl.runConfigWithMonitor(new _FunctionTypes._void_P1_E0<IConfigMonitor>() {
            public void invoke(IConfigMonitor c) {
              try {
                cmon2delegate.value = c;
                code.invoke(cmon);
              } finally {
                cmon2delegate.value = null;
              }
            }
          });
        } else {
          code.invoke(cmon);
        }
      }

      public void runJobWithMonitor(_FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
        try {
          progStrat.setProgressIndicator(progInd);
          pind.value = new JobMonitorProgressIndicator(jmon);
          code.invoke(jmon);
        } catch (Throwable e) {
          e.printStackTrace();
          jmon.reportFeedback(new IFeedback.ERROR(e.getMessage()));
        }
      }

      public void setup(IParametersPool pool) {
        Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) pool.parameters(new ITarget.Name("checkParameters"), Object.class);
        if (vars != null) {
          vars._0(WorkbenchMakeService.this.context.getProject());
          vars._1(WorkbenchMakeService.this.context);
          vars._2(WorkbenchMakeService.this.cleanMake);
          vars._3(new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
            public ProgressIndicator invoke() {
              return pind.value;
            }
          });
        }

        Tuples._2<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean> tparams = (Tuples._2<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean>) pool.parameters(new ITarget.Name("textGen"), Object.class);
        if (tparams != null) {
          tparams._1(GenerationSettings.getInstance().isFailOnMissingTextGen());
        }

        if (ctl != null) {
          ctl.setup(pool);
        }
      }
    };
  }

  public static IScript defaultMakeScript() {
    return new ScriptBuilder().withFacets(new IFacet.Name("Binaries"), new IFacet.Name("Generate"), new IFacet.Name("TextGen"), new IFacet.Name("JavaCompile"), new IFacet.Name("ReloadClasses"), new IFacet.Name("Make")).withFinalTarget(new ITarget.Name("make")).toScript();
  }

  private class MessageHandler implements IMessageHandler {
    private String name;
    private MessagesViewTool mvt;

    public MessageHandler(String name) {
      this.name = name;
      this.mvt = context.getProject().getComponent(MessagesViewTool.class);
    }

    public void clear() {
      this.mvt.clear(name);
    }

    public void handle(IMessage message) {
      this.mvt.add(message, name);
    }
  }
}
