package jetbrains.mps.debugger.java.runtime.breakpoints;

/*Generated by MPS */

import jetbrains.mps.debug.api.breakpoints.AbstractBreakpoint;
import jetbrains.mps.debugger.java.runtime.requests.ClassPrepareRequestor;
import jetbrains.mps.debugger.java.runtime.requests.LocatableEventRequestor;
import com.sun.jdi.request.EventRequest;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debugger.java.runtime.DebugVMEventsProcessor;
import jetbrains.mps.debugger.java.runtime.execution.DebuggerManagerThread;
import java.util.List;
import com.sun.jdi.ReferenceType;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debugger.java.runtime.RequestManager;
import jetbrains.mps.debugger.java.runtime.SuspendContextCommand;
import com.sun.jdi.event.LocatableEvent;
import jetbrains.mps.debugger.java.runtime.SuspendContext;
import com.sun.jdi.StackFrame;
import com.sun.jdi.IncompatibleThreadStateException;

public abstract class JavaBreakpoint extends AbstractBreakpoint implements ClassPrepareRequestor, LocatableEventRequestor {
  private int mySuspendPolicy = EventRequest.SUSPEND_ALL;
  private boolean myLogMessage = false;
  private final Logger LOG = Logger.getLogger(JavaBreakpoint.class);

  protected JavaBreakpoint(Project project) {
    super(project);
  }

  public void createClassPrepareRequest(DebugVMEventsProcessor debugProcess) {
    // this should be called on every breakpoint when DebugEventsProcessor is attached 
    DebuggerManagerThread.assertIsManagerThread();
    //  check is this breakpoint is enabled, vm reference is valid and there're no requests created yet 
    if (!(myIsEnabled)) {
      // || !debugProcess.isAttached() || debugProcess.getRequestManager().findRequests(this).isEmpty() 
      return;
    }
    if (!(isValid())) {
      return;
    }
    createOrWaitPrepare(debugProcess);
    //  updateUI(); 
  }

  public void createOrWaitPrepare(final DebugVMEventsProcessor debugProcess) {
    String className = getClassNameToPrepare();
    // add requests for not prepared classes 
    debugProcess.getRequestManager().callbackOnPrepareClasses(this, className);
    // and get all already prepared classes for a SNode 
    List<ReferenceType> list = debugProcess.getVirtualMachine().classesByName(className);
    for (final ReferenceType refType : list) {
      if (refType.isPrepared()) {
        processClassPrepare(debugProcess, refType);
      }
    }
  }

  protected abstract String getClassNameToPrepare();

  @NotNull
  public abstract JavaBreakpointKind getKind();

  @Override
  public void processClassPrepare(DebugVMEventsProcessor debugProcess, ReferenceType classType) {
    // this is called when a class for this ClassPrepareRequestor is prepared 
    if (!(myIsEnabled) || !(isValid())) {
      return;
    }
    createRequestForPreparedClass(debugProcess, classType);
  }

  protected abstract void createRequestForPreparedClass(DebugVMEventsProcessor debugProcess, ReferenceType classType);

  @Override
  public void removeFromRunningSessions() {
    RequestManager.removeClassPrepareRequests(this);
  }

  @Override
  public void addToRunningSessions() {
    RequestManager.createClassPrepareRequests(this);
  }

  @Override
  public int getSuspendPolicy() {
    return mySuspendPolicy;
  }

  public void setSuspendPolicy(final int policy) {
    if (policy != mySuspendPolicy) {
      mySuspendPolicy = policy;
      removeFromRunningSessions();
      addToRunningSessions();
    }
  }

  public boolean isLogMessage() {
    return myLogMessage;
  }

  public void setLogMessage(boolean logMessage) {
    myLogMessage = logMessage;
  }

  @Override
  public boolean processLocatableEvent(SuspendContextCommand action, LocatableEvent event) {
    // called when breakpoint is hit 
    final SuspendContext context = action.getSuspendContext();
    if (!(isValid())) {
      context.getDebugProcess().getRequestManager().deleteRequests(this);
      return false;
    }
    try {
      final StackFrame stackFrame = context.getThread().frame(0);
      if (stackFrame == null) {
        //  might be if the thread has been collected 
        return false;
      }
      // todo conditions - later 
      //   final EvaluationContextImpl evaluationContext = new EvaluationContextImpl( 
      //   action.getSuspendContext(), 
      //   frameProxy, 
      //   getThisObject(context, event) 
      // ); 
      //  
      // if(!evaluateCondition(evaluationContext, event)) { 
      //   return false; 
      // } 
      // todo here some expressions may be evaluated; later 
      //  runAction(evaluationContext, event); 
    } catch (IncompatibleThreadStateException ex) {
      LOG.error(ex);
      return false;
    }
    return true;
  }
}
