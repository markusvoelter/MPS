package jetbrains.mps.workbench.make;

/*Generated by MPS */

import jetbrains.mps.make.IMakeService;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorDelegate;
import java.util.concurrent.atomic.AtomicMarkableReference;
import jetbrains.mps.make.MakeSession;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import java.util.concurrent.ExecutionException;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.make.runtime.util.FutureValue;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.dependencies.ModulesClusterizer;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import javax.swing.SwingUtilities;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.ProgressManager;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.application.impl.ApplicationImpl;
import jetbrains.mps.make.script.IFeedback;
import com.intellij.openapi.progress.ProgressIndicator;
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
import com.intellij.openapi.progress.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class WorkbenchMakeService implements IMakeService {
  private static Logger LOG = Logger.getLogger(WorkbenchMakeService.class);
  private static WorkbenchMakeService INSTANCE = null;

  private ProgressIndicatorDelegate progInd;
  private AtomicMarkableReference<MakeSession> currentSessionStickyMark = new AtomicMarkableReference<MakeSession>(null, false);
  private volatile Future<IResult> currentProcess;

  public WorkbenchMakeService() {
  }

  @Deprecated
  public WorkbenchMakeService(IOperationContext context, boolean cleanMake) {
    this.currentSessionStickyMark.set(new MakeSession(context, new WorkbenchMakeService.MessageHandler("Make", context), cleanMake), false);
  }

  public void initComponent() {
    INSTANCE = this;
  }

  public void disposeComponent() {
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
    return doMake(resources, defaultMakeScript(), null);
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

  public boolean startNewSession(MakeSession session) {
    this.checkValidUsage();
    return currentSessionStickyMark.compareAndSet(null, session, false, session.isSticky());
  }

  public void endSession(MakeSession session) {
    this.checkValidUsage();
    this.checkValidSession(session);
    currentSessionStickyMark.attemptMark(session, false);
    if (currentProcess == null || currentProcess.isDone()) {
      currentSessionStickyMark.set(null, false);
    }
  }

  public Future<IResult> make(Iterable<? extends IResource> resources) {
    if (isInstance()) {
      throw new IllegalStateException("deprecated API called on a service");
    }
    return _doMake(resources, WorkbenchMakeService.defaultMakeScript(), null);
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

  private Future<IResult> doMake(Iterable<? extends IResource> inputRes, final IScript script, IScriptController controller) {
    Future<IResult> result = null;
    try {
      awaitCurrentProcess();
      result = _doMake(inputRes, script, controller);
    } finally {
      if (result == null || result.isDone()) {
        if (!(currentSessionStickyMark.isMarked())) {
          currentSessionStickyMark.set(null, false);
        }
      }
    }
    return result;
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
        this.showError(mh, msg);
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
    IScriptController ctl = this.completeController(mh, controller);
    Iterable<IScript> scripts = Sequence.fromIterable(usedLangs.value).<IScript>select(new ISelector<Iterable<String>, IScript>() {
      public IScript select(Iterable<String> langs) {
        final ScriptBuilder scb = new ScriptBuilder();
        Sequence.fromIterable(langs).visitAll(new IVisitor<String>() {
          public void visit(String ns) {
            LanguageRuntime lr = LanguageRegistry.getInstance().getLanguage(ns);
            Iterable<IFacet> fcts = lr.getFacetProvider().getDescriptor(null).getManifest().facets();
            scb.withFacets(fcts);
          }
        });
        return scb.withFinalTarget(new ITarget.Name("make")).toScript();
      }
    }).toListSequence();

    if (!(Sequence.fromIterable(scripts).all(new IWhereFilter<IScript>() {
      public boolean accept(IScript sc) {
        return sc.isValid();
      }
    }))) {
      String msg = scrName + " failed";
      showError(mh, msg + ". Invalid script.");
      this.displayInfo(msg);
      return new FutureValue(new IResult.FAILURE(null));
    }

    final WorkbenchMakeService.MakeTask task = new WorkbenchMakeService.MakeTask(this.getSession().getContext().getProject(), scrName, scripts, scrName, clInput.value, ctl, mh, PerformInBackgroundOption.DEAF) {
      @Override
      protected void done() {
        if (!(currentSessionStickyMark.isMarked())) {
          currentSessionStickyMark.set(null, false);
        }
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
    if (!(isInstance())) {
      throw new IllegalStateException("invalid usage of service");
    }
  }

  public void checkValidSession(MakeSession session) {
    if (!(this.getSession() == session)) {
      throw new IllegalStateException("invalid session");
    }
  }

  private void showError(IMessageHandler mh, String msg) {
    mh.handle(new Message(MessageKind.ERROR, msg));
  }

  private void displayInfo(String info) {
    IdeFrame frame = WindowManager.getInstance().getIdeFrame(this.getSession().getContext().getProject());
    if (frame != null) {
      frame.getStatusBar().setInfo(info);
    }
  }

  private IScriptController completeController(final IMessageHandler mh, final IScriptController ctl) {
    return new WorkbenchMakeService.Controller(ctl, mh);
  }

  public static IScript defaultMakeScript() {
    return new ScriptBuilder().withFacetNames(new IFacet.Name("jetbrains.mps.lang.plugin.Binaries"), new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen"), new IFacet.Name("jetbrains.mps.baseLanguage.JavaCompile"), new IFacet.Name("jetbrains.mps.baseLanguage.ReloadClasses"), new IFacet.Name("jetbrains.mps.lang.core.Make")).withFinalTarget(new ITarget.Name("make")).toScript();
  }

  private class Controller implements IScriptController {
    private ProgressIndicatorProgressStrategy progStrat = new ProgressIndicatorProgressStrategy();
    private IScriptController delegateScrCtr;
    private IConfigMonitor delegateConfMon;
    private IConfigMonitor confMon;
    private IJobMonitor jobMon;
    private IMessageHandler mh;
    private IParametersPool predParamPool;

    public Controller(IScriptController delegate, IMessageHandler mh) {
      this.delegateScrCtr = delegate;
      this.mh = mh;
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
        progStrat.setProgressIndicator(progInd);
        code.invoke(jobMon);
      } catch (Throwable e) {
        WorkbenchMakeService.LOG.debug("Error running job", e);
        jobMon.reportFeedback(new IFeedback.ERROR(e.getMessage()));
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
            new UIQueryRelayStrategy(new UIQueryRelayStrategy.DialogListener() {
              public void beforeDialogShown() {
                progInd.background();
              }
            }).relayQuery(query, getSession().getContext())
          );
        }
      };
      this.jobMon = new IJobMonitor.Stub() {
        @Override
        public boolean stopRequested() {
          return (progStrat.getProgressIndicator() != null ?
            progStrat.getProgressIndicator().isCanceled() :
            false
          );
        }

        @Override
        public void reportFeedback(IFeedback fdbk) {
          new UIFeedbackStrategy(mh).reportFeedback(fdbk);
        }

        @Override
        public IProgress currentProgress() {
          return progStrat.currentProgress();
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

  private abstract class MakeTask extends Task.Backgroundable implements Future<IResult> {
    private CountDownLatch myLatch = new CountDownLatch(1);
    private AtomicReference<WorkbenchMakeService.TaskState> myState = new AtomicReference<WorkbenchMakeService.TaskState>(WorkbenchMakeService.TaskState.NOT_STARTED);
    private final Iterable<IScript> myScripts;
    private final String myScrName;
    private final Iterable<? extends Iterable<IResource>> myClInput;
    private IResult myResult = null;
    private final IScriptController myController;
    private final IMessageHandler myMessageHandler;

    public MakeTask(@Nullable Project project, @NotNull String title, Iterable<IScript> scripts, String scrName, Iterable<? extends Iterable<IResource>> clInput, IScriptController ctl, IMessageHandler mh, PerformInBackgroundOption bgoption) {
      super(project, title, true, bgoption);
      this.myScripts = scripts;
      this.myScrName = scrName;
      this.myClInput = clInput;
      this.myController = ctl;
      this.myMessageHandler = mh;
    }

    public void run(@NotNull ProgressIndicator pi) {
      if (myState.compareAndSet(WorkbenchMakeService.TaskState.NOT_STARTED, WorkbenchMakeService.TaskState.RUNNING)) {
        pi.pushState();
        final int clsize = Sequence.fromIterable(this.myClInput).count();
        if (clsize == 0) {
          return;
        }
        final double clfrac = (1.0 / clsize);
        final int[] idx = new int[]{0};
        progInd = new ProgressIndicatorDelegate(pi) {
          @Override
          public void setFraction(double d) {
            getDelegate().setFraction((idx[0] + d) * clfrac);
          }

          @Override
          public void setText2(String string) {
          }
        };

        Iterator<IScript> scit = Sequence.fromIterable(myScripts).iterator();
        Iterator<? extends Iterable<IResource>> clit = Sequence.fromIterable(myClInput).iterator();
        while (scit.hasNext() && clit.hasNext()) {
          Iterable<IResource> cl = clit.next();
          IScript scr = scit.next();
          pi.setText2((idx[0] + 1) + "/" + clsize + " " + IterableUtils.join(Sequence.fromIterable(cl).<String>select(new ISelector<IResource, String>() {
            public String select(IResource r) {
              return ((IResource) r).describe();
            }
          }), ","));
          this.myResult = scr.execute(this.myController, cl);
          if (!(this.myResult.isSucessful()) || progInd.isCanceled()) {
            break;
          }
          idx[0]++;
        }
        pi.popState();
        this.myState.set(WorkbenchMakeService.TaskState.INDETERMINATE);
      }
    }

    @Override
    public void onSuccess() {
      reconcile();
    }

    @Override
    public void onCancel() {
      this.myResult = null;
      reconcile();
    }

    public boolean cancel(boolean b) {
      return false;
    }

    public boolean isCancelled() {
      return myState.get() == WorkbenchMakeService.TaskState.CANCELLED;
    }

    public boolean isDone() {
      return myState.get() != WorkbenchMakeService.TaskState.NOT_STARTED && myState.get() != WorkbenchMakeService.TaskState.RUNNING;
    }

    public IResult get() throws InterruptedException, ExecutionException {
      myLatch.await();
      if (myState.get() == WorkbenchMakeService.TaskState.CANCELLED) {
        throw new CancellationException();
      }
      return myResult;
    }

    public IResult get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
      myLatch.await(timeout, unit);
      if (myState.get() == WorkbenchMakeService.TaskState.CANCELLED) {
        throw new CancellationException();
      }
      return myResult;
    }

    protected abstract void done();

    private void reconcile() {
      if (this.myResult == null) {
        String msg = this.myScrName + " aborted";
        WorkbenchMakeService.this.displayInfo(msg);
        this.myState.set(WorkbenchMakeService.TaskState.CANCELLED);
      } else if (!(this.myResult.isSucessful())) {
        String msg = this.myScrName + " failed";
        showError(this.myMessageHandler, msg + ". See previous messages for details.");
        WorkbenchMakeService.this.displayInfo(msg);
        this.myState.set(WorkbenchMakeService.TaskState.DONE);
      } else {
        String msg = this.myScrName + " successful";
        WorkbenchMakeService.this.displayInfo(msg);
        this.myState.set(WorkbenchMakeService.TaskState.DONE);
      }
      done();
      myLatch.countDown();
    }
  }

  private static   enum TaskState {
    NOT_STARTED(),
    RUNNING(),
    DONE(),
    CANCELLED(),
    INDETERMINATE();

    TaskState() {
    }
  }
}
