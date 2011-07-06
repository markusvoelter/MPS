package jetbrains.mps.testbench;

/*Generated by MPS */

import jetbrains.mps.make.service.AbstractMakeService;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.messages.IMessageHandler;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.make.IMakeNotificationListener;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.make.runtime.util.FutureValue;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IFeedback;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.facet.ITarget;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.make.service.MakeTask;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import com.intellij.openapi.progress.ProgressManager;

public class TestMakeService extends AbstractMakeService implements IMakeService {
  private IOperationContext context;
  private IMessageHandler messageHandler;

  public TestMakeService(IOperationContext context, IMessageHandler messageHandler) {
    this.context = context;
    this.messageHandler = messageHandler;
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script, IScriptController controller) {
    return null;
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script) {
    return null;
  }

  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources) {
    return null;
  }

  public boolean isSessionActive() {
    return false;
  }

  public boolean openNewSession(MakeSession session) {
    return false;
  }

  public void closeSession(MakeSession session) {
  }

  public void addListener(IMakeNotificationListener listener) {
    throw new UnsupportedOperationException();
  }

  public void removeListener(IMakeNotificationListener listener) {
    throw new UnsupportedOperationException();
  }

  public Future<IResult> make(Iterable<? extends IResource> resources) {
    return doMake(resources, null, null);
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script) {
    return doMake(resources, script, null);
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script, IScriptController controller) {
    return doMake(resources, script, controller);
  }

  private Future<IResult> doMake(Iterable<? extends IResource> inputRes, IScript defaultScript, IScriptController controller) {
    String scrName = "Build";

    if (Sequence.fromIterable(inputRes).isEmpty()) {
      String msg = scrName + " aborted: nothing to do";
      this.showError(msg);
      return new FutureValue(new IResult.FAILURE(null));
    }

    return new TestMakeService.TaskRunner(scrName, messageHandler).runTask(inputRes, defaultScript, controller);
  }

  private void showError(String msg) {
    messageHandler.handle(new Message(MessageKind.ERROR, msg));
  }

  private IScriptController completeController(final IScriptController ctl) {
    final Wrappers._T<IConfigMonitor> cmon2delegate = new Wrappers._T<IConfigMonitor>(null);
    final IConfigMonitor cmon = new IConfigMonitor.Stub() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        T opt = null;
        if (cmon2delegate.value != null) {
          opt = cmon2delegate.value.relayQuery(query);
        }
        return (opt != null ?
          opt :
          query.defaultOption()
        );
      }
    };
    final IJobMonitor jmon = new IJobMonitor.Stub() {
      @Override
      public void reportFeedback(IFeedback fdbk) {
        new MessageFeedbackStrategy(messageHandler).reportFeedback(fdbk);
      }
    };

    final Wrappers._T<ProgressIndicator> pind = new Wrappers._T<ProgressIndicator>(new EmptyProgressIndicator());
    return new IScriptController.Stub() {
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
        pind.value = new EmptyProgressIndicator();
        code.invoke(jmon);
      }

      public void setup(IParametersPool pool) {
        Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) pool.parameters(new ITarget.Name("checkParameters"), Object.class);
        vars._0(TestMakeService.this.context.getProject());
        vars._1(TestMakeService.this.context);
        vars._2(true);
        vars._3(new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
          public ProgressIndicator invoke() {
            return pind.value;
          }
        });

        if (ctl != null) {
          ctl.setup(pool);
        }
      }
    };
  }

  public void disposeComponent() {
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return null;
  }

  public void initComponent() {
  }

  public class TaskRunner extends AbstractMakeService.AbstractInputProcessor {
    private String taskName;
    private IMessageHandler mh;

    private TaskRunner(String taskName, IMessageHandler mh) {
      this.taskName = taskName;
      this.mh = mh;
    }

    public Future<IResult> runTask(Iterable<? extends IResource> inputRes, IScript defaultScript, IScriptController controller) {
      return processRawInput(inputRes, defaultScript, controller);
    }

    @Override
    protected Future<IResult> processClusteredInput(Iterable<? extends Iterable<IResource>> clustRes, Iterable<IScript> scripts, IScriptController controller) {
      IScriptController ctl = TestMakeService.this.completeController(controller);

      MakeTask task = new MakeTask(context.getProject(), taskName, scripts, taskName, clustRes, ctl, mh, PerformInBackgroundOption.DEAF);
      ProgressManager.getInstance().run(task);

      return task;
    }
  }
}
