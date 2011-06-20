package jetbrains.mps.testbench;

/*Generated by MPS */

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
import jetbrains.mps.internal.make.runtime.util.FutureValue;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.dependencies.ModulesClusterizer;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IFeedback;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.facet.ITarget;
import org.jetbrains.annotations.NonNls;

public class TestMakeService implements IMakeService {
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

  public boolean startNewSession(MakeSession session) {
    return false;
  }

  public void endSession(MakeSession session) {
  }

  public void addListener(IMakeNotificationListener listener) {
    throw new UnsupportedOperationException();
  }

  public void removeListener(IMakeNotificationListener listener) {
    throw new UnsupportedOperationException();
  }

  public Future<IResult> make(Iterable<? extends IResource> resources) {
    return new FutureValue(doMake(resources, null, null));
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script) {
    return new FutureValue(doMake(resources, script, null));
  }

  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script, IScriptController controller) {
    return new FutureValue(doMake(resources, script, controller));
  }

  private IResult doMake(final Iterable<? extends IResource> inputRes, final IScript script, IScriptController controller) {
    final String scrName = "Build";

    if (Sequence.fromIterable(inputRes).isEmpty()) {
      String msg = scrName + " aborted: nothing to do";
      this.showError(msg);
      return new IResult.FAILURE(null);
    }


    if (!(script.isValid())) {
      String msg = scrName + " failed";
      showError(msg + ". Invalid script.");
      return new IResult.FAILURE(null);
    }
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
    final Wrappers._T<IResult> res = new Wrappers._T<IResult>();
    final IScriptController ctl = this.completeController(controller);

    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        IdeEventQueue.getInstance().flushQueue();
        ProgressManager.getInstance().run(new Task.Backgroundable(context.getProject(), scrName, true) {
          public void run(@NotNull ProgressIndicator pi) {
            for (Iterable<IResource> cl : clInput.value) {
              res.value = script.execute(ctl, cl);
              if (!(res.value.isSucessful()) || pi.isCanceled()) {
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
              showError(msg);
            } else if (!(res.value.isSucessful())) {
              String msg = scrName + " failed";
              showError(msg + ". See previous messages for details.");
            }
          }
        });
      }
    });
    return res.value;
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
}
