package jetbrains.mps.workbench.make;

/*Generated by MPS */

import jetbrains.mps.make.IMakeService;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorDelegate;
import java.util.concurrent.atomic.AtomicMarkableReference;
import jetbrains.mps.make.MakeSession;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import java.util.List;
import jetbrains.mps.make.IMakeNotificationListener;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.plugins.PluginReloader;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.make.MakeNotification;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.concurrent.ExecutionException;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.internal.make.runtime.util.FutureValue;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.dependencies.ModulesClusterizer;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.task.MakeTask;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import com.intellij.openapi.progress.ProgressIndicator;
import javax.swing.SwingUtilities;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.application.impl.ApplicationImpl;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.internal.make.runtime.backports.JobMonitorProgressIndicator;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IProgress;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.messages.IMessage;

public class WorkbenchMakeService implements IMakeService {
  private static Logger LOG = Logger.getLogger(WorkbenchMakeService.class);
  private static WorkbenchMakeService INSTANCE = null;

  private ProgressIndicatorDelegate progInd;
  private AtomicMarkableReference<MakeSession> currentSessionStickyMark = new AtomicMarkableReference<MakeSession>(null, false);
  private volatile Future<IResult> currentProcess;
  private List<IMakeNotificationListener> listeners = ListSequence.fromList(new ArrayList<IMakeNotificationListener>());
  private PluginReloader pluginReloader;

  public WorkbenchMakeService(PluginReloader pluginReloader) {
    this.pluginReloader = pluginReloader;
  }

  @Deprecated
  public WorkbenchMakeService(IOperationContext context, boolean cleanMake) {
    this.currentSessionStickyMark.set(new MakeSession(context, new WorkbenchMakeService.MessageHandler("Make", context), cleanMake), false);
  }

  public void initComponent() {
    INSTANCE = this;
    pluginReloader.setMakeService(this);
  }

  public void disposeComponent() {
    pluginReloader.setMakeService(null);
    INSTANCE = null;
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Workbench Make Service";
  }

  private boolean isInstance() {
    return this == INSTANCE;
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources) {
    this.checkValidUsage();
    this.checkValidSession(session);
    return doMake(resources, null, null);
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script) {
    this.checkValidUsage();
    this.checkValidSession(session);
    return doMake(resources, script, null);
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script, IScriptController controller) {
    this.checkValidUsage();
    this.checkValidSession(session);
    return doMake(resources, script, controller);
  }

  public boolean isSessionActive() {
    this.checkValidUsage();
    return this.getSession() != null;
  }

  public boolean openNewSession(MakeSession session) {
    this.checkValidUsage();
    if (!(currentSessionStickyMark.compareAndSet(null, session, false, session.isSticky()))) {
      return false;
    }
    notifyListeners(new MakeNotification(this, MakeNotification.Kind.SESSION_OPENED));
    return true;
  }

  public void closeSession(MakeSession session) {
    this.checkValidUsage();
    this.checkValidSession(session);
    currentSessionStickyMark.attemptMark(session, false);
    if (currentProcess == null || currentProcess.isDone()) {
      if (currentSessionStickyMark.compareAndSet(session, null, false, false) || currentSessionStickyMark.compareAndSet(session, null, true, false)) {
        notifyListeners(new MakeNotification(this, MakeNotification.Kind.SESSION_CLOSED));
      }
    }
  }

  public Future<IResult> make(Iterable<? extends IResource> resources) {
    if (isInstance()) {
      throw new IllegalStateException("deprecated API called on a service");
    }
    return _doMake(resources, null, null);
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script) {
    if (isInstance()) {
      throw new IllegalStateException("deprecated API called on a service");
    }
    return _doMake(resources, script, null);
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script, IScriptController ctl) {
    if (isInstance()) {
      throw new IllegalStateException("deprecated API called on a service");
    }
    return _doMake(resources, script, ctl);
  }

  private MakeSession getSession() {
    return currentSessionStickyMark.getReference();
  }

  public void addListener(IMakeNotificationListener listener) {
    checkValidUsage();
    ListSequence.fromList(listeners).addElement(listener);
  }

  public void removeListener(IMakeNotificationListener listener) {
    checkValidUsage();
    ListSequence.fromList(listeners).addElement(listener);
  }

  private void notifyListeners(final MakeNotification notification) {
    ListSequence.fromList(ListSequence.fromListWithValues(new ArrayList<IMakeNotificationListener>(), listeners)).visitAll(new IVisitor<IMakeNotificationListener>() {
      public void visit(IMakeNotificationListener li) {
        li.handleNotification(notification);
      }
    });
  }

  private Future<IResult> doMake(Iterable<? extends IResource> inputRes, final IScript script, IScriptController controller) {
    Future<IResult> result = null;
    try {
      awaitCurrentProcess();
      result = _doMake(inputRes, script, controller);
    } finally {
      if (result == null || result.isDone()) {
        this.attemptCloseSession();
      }
    }
    return result;
  }

  private void attemptCloseSession() {
    boolean[] mark = new boolean[1];
    MakeSession sess = currentSessionStickyMark.get(mark);
    if (sess != null && !(mark[0]) && currentSessionStickyMark.compareAndSet(sess, null, false, false)) {
      notifyListeners(new MakeNotification(this, MakeNotification.Kind.SESSION_CLOSED));
    }
  }

  private synchronized void awaitCurrentProcess() {
    Future<IResult> proc = this.currentProcess;
    try {
      if (proc != null && !(proc.isDone())) {
        proc.get();
      }
    } catch (InterruptedException ignore) {
    } catch (ExecutionException ignore) {
    } finally {
      this.currentProcess = null;
    }
  }

  private Future<IResult> _doMake(final Iterable<? extends IResource> inputRes, final IScript script, IScriptController controller) {

    String scrName = ((this.getSession().isCleanMake() ?
      "Rebuild" :
      "Make"
    ));
    IMessageHandler mh = this.getSession().getMessageHandler();
    if (mh == null) {
      mh = new WorkbenchMakeService.MessageHandler("Make", this.getSession().getContext());
    }
    mh.clear();

    if (Sequence.fromIterable(inputRes).isEmpty()) {
      if (this.getSession().isCleanMake()) {
        String msg = scrName + " aborted: nothing to do";
        mh.handle(new Message(MessageKind.ERROR, msg));
        this.displayInfo(msg);
        return new FutureValue(new IResult.FAILURE(null));
      } else {
        this.displayInfo("Everything up to date");
        return new FutureValue(new IResult.SUCCESS(null));
      }
    }

    final Wrappers._T<Iterable<? extends Iterable<IResource>>> clInput = new Wrappers._T<Iterable<? extends Iterable<IResource>>>();
    final Wrappers._T<Iterable<Iterable<String>>> usedLangs = new Wrappers._T<Iterable<Iterable<String>>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        final ModulesClusterizer mcr = new ModulesClusterizer();
        clInput.value = mcr.clusterize(Sequence.fromIterable(inputRes).<IResource>select(new ISelector<IResource, IResource>() {
          public IResource select(IResource r) {
            return (IResource) r;
          }
        }));
        usedLangs.value = Sequence.fromIterable(clInput.value).<Iterable<String>>select(new ISelector<Iterable<IResource>, Iterable<String>>() {
          public Iterable<String> select(Iterable<IResource> it) {
            return mcr.allUsedLangNamespaces(it);
          }
        }).toListSequence();
      }
    });
    final ProgressIndicatorProgressStrategy pips = new ProgressIndicatorProgressStrategy();
    IScriptController ctl = new WorkbenchMakeService.Controller(controller, mh, pips);

    Iterable<ScriptBuilder> scriptBuilders = Sequence.fromIterable(usedLangs.value).<ScriptBuilder>select(new ISelector<Iterable<String>, ScriptBuilder>() {
      public ScriptBuilder select(Iterable<String> langs) {
        final ScriptBuilder scb = new ScriptBuilder();
        Sequence.fromIterable(langs).visitAll(new IVisitor<String>() {
          public void visit(String ns) {
            LanguageRuntime lr = LanguageRegistry.getInstance().getLanguage(ns);
            Iterable<IFacet> fcts = lr.getFacetProvider().getDescriptor(null).getManifest().facets();
            scb.withFacetNames(Sequence.fromIterable(fcts).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
              public IFacet.Name select(IFacet fct) {
                return fct.getName();
              }
            }));
          }
        });
        return scb.withFinalTarget(new ITarget.Name("make"));
      }
    }).toListSequence();

    Iterable<IScript> scripts = ((script != null ?
      Sequence.fromIterable(scriptBuilders).<IScript>select(new ISelector<ScriptBuilder, IScript>() {
        public IScript select(ScriptBuilder it) {
          return script;
        }
      }) :
      Sequence.fromIterable(scriptBuilders).<IScript>select(new ISelector<ScriptBuilder, IScript>() {
        public IScript select(ScriptBuilder scb) {
          return scb.toScript();
        }
      })
    ));

    final MakeTask task = new MakeTask(this.getSession().getContext().getProject(), scrName, scripts, scrName, clInput.value, ctl, mh, PerformInBackgroundOption.DEAF) {
      @Override
      protected void aboutToStart() {
        notifyListeners(new MakeNotification(WorkbenchMakeService.this, MakeNotification.Kind.SCRIPT_ABOUT_TO_START));
      }

      @Override
      protected void done() {
        attemptCloseSession();
        notifyListeners(new MakeNotification(WorkbenchMakeService.this, MakeNotification.Kind.SCRIPT_FINISHED));
      }

      @Override
      protected void displayInfo(String info) {
        WorkbenchMakeService.this.displayInfo(info);
      }

      @Override
      protected void useProgressIndicator(ProgressIndicator pi) {
        pips.setProgressIndicator(pi);
      }
    };
    this.getSession().doExecute(new Runnable() {
      public void run() {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            IdeEventQueue.getInstance().flushQueue();
            ProgressManager.getInstance().run(task);
            IdeEventQueue.getInstance().flushQueue();
          }
        });
      }
    });

    this.currentProcess = task;
    return task;
  }

  private void checkValidUsage() {
    if (INSTANCE == null) {
      throw new IllegalStateException("already disposed");
    }
    if (!(isInstance())) {
      throw new IllegalStateException("invalid usage of service");
    }
  }

  public void checkValidSession(MakeSession session) {
    if (!(this.getSession() == session)) {
      throw new IllegalStateException("invalid session");
    }
  }

  private void displayInfo(String info) {
    IdeFrame frame = WindowManager.getInstance().getIdeFrame(this.getSession().getContext().getProject());
    if (frame != null) {
      frame.getStatusBar().setInfo(info);
    }
  }

  public static IScript defaultMakeScript() {
    return new ScriptBuilder().withFacetNames(new IFacet.Name("jetbrains.mps.lang.plugin.Binaries"), new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen"), new IFacet.Name("jetbrains.mps.baseLanguage.JavaCompile"), new IFacet.Name("jetbrains.mps.baseLanguage.ReloadClasses"), new IFacet.Name("jetbrains.mps.lang.core.Make")).withFinalTarget(new ITarget.Name("make")).toScript();
  }

  private class Controller implements IScriptController {
    private ProgressIndicatorProgressStrategy pips;
    private IScriptController delegateScrCtr;
    private IConfigMonitor delegateConfMon;
    private IConfigMonitor confMon;
    private IJobMonitor jobMon;
    private IMessageHandler mh;
    private IParametersPool predParamPool;

    public Controller(IScriptController delegate, IMessageHandler mh, ProgressIndicatorProgressStrategy pips) {
      this.delegateScrCtr = delegate;
      this.mh = mh;
      this.pips = pips;
      init();
    }

    public void runConfigWithMonitor(final _FunctionTypes._void_P1_E0<? super IConfigMonitor> code) {
      if (delegateScrCtr != null) {
        delegateScrCtr.runConfigWithMonitor(new _FunctionTypes._void_P1_E0<IConfigMonitor>() {
          public void invoke(IConfigMonitor c) {
            try {
              Controller.this.delegateConfMon = c;
              code.invoke(confMon);
            } finally {
              Controller.this.delegateConfMon = null;
            }
          }
        });
      } else {
        code.invoke(confMon);
      }
    }

    public void runJobWithMonitor(_FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
      final boolean oldFlag = ApplicationImpl.setExceptionalThreadWithReadAccessFlag(true);
      try {
        code.invoke(jobMon);
      } catch (Throwable e) {
        WorkbenchMakeService.LOG.debug("Error running job", e);
        jobMon.reportFeedback(new IFeedback.ERROR("Error running job", e));
      } finally {
        ApplicationImpl.setExceptionalThreadWithReadAccessFlag(oldFlag);
      }
    }

    public void setup(IParametersPool ppool) {
      ppool.setPredecessor(predParamPool);
      predParamPool = ppool;
      final ProgressIndicator pind = new JobMonitorProgressIndicator(jobMon);
      Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) ppool.parameters(new ITarget.Name("checkParameters"), Object.class);
      if (vars != null) {
        vars._0(getSession().getContext().getProject());
        vars._1(getSession().getContext());
        vars._2(getSession().isCleanMake());
        vars._3(new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
          public ProgressIndicator invoke() {
            return pind;
          }
        });
      }

      Tuples._3<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean, Boolean> tparams = (Tuples._3<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean, Boolean>) ppool.parameters(new ITarget.Name("textGen"), Object.class);
      if (tparams != null) {
        tparams._1(GenerationSettings.getInstance().isFailOnMissingTextGen());
        tparams._2(GenerationSettings.getInstance().isGenerateDebugInfo());
      }

      if (delegateScrCtr != null) {
        delegateScrCtr.setup(ppool);
      }
    }

    private void init() {
      this.confMon = new IConfigMonitor.Stub() {
        @Override
        public <T extends IOption> T relayQuery(IQuery<T> query) {
          T opt = null;
          if (delegateConfMon != null) {
            opt = delegateConfMon.relayQuery(query);
          }
          return (opt != null ?
            opt :
            new UIQueryRelayStrategy().relayQuery(query, getSession().getContext())
          );
        }
      };
      this.jobMon = new IJobMonitor.Stub() {
        @Override
        public boolean stopRequested() {
          return (pips.getProgressIndicator() != null ?
            pips.getProgressIndicator().isCanceled() :
            false
          );
        }

        @Override
        public void reportFeedback(IFeedback fdbk) {
          new UIFeedbackStrategy(mh).reportFeedback(fdbk);
        }

        @Override
        public IProgress currentProgress() {
          return pips.currentProgress();
        }
      };
    }
  }

  private class MessageHandler implements IMessageHandler {
    private String name;
    private MessagesViewTool mvt;

    public MessageHandler(String name, IOperationContext context) {
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
