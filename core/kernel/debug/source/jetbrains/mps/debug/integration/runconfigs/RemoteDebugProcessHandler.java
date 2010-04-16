package jetbrains.mps.debug.integration.runconfigs;

import com.intellij.execution.process.ProcessHandler;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.debug.api.DebugSessionManagerComponent;
import jetbrains.mps.debug.runtime.*;
import org.jetbrains.annotations.NotNull;

import java.io.OutputStream;

public class RemoteDebugProcessHandler extends ProcessHandler {
  private final Project myProject;

  public RemoteDebugProcessHandler(Project project) {
    myProject = project;
  }

  public void startNotify() {
    final DebugSessionManagerComponent debugManager = DebugSessionManagerComponent.getInstance(myProject);
    final VMEventsProcessorManagerComponent vmManager = VMEventsProcessorManagerComponent.getInstance(myProject);
    final AbstractDebugSession abstractSession = debugManager.getDebugSession(this);
    if (abstractSession instanceof DebugSession) {
      final DebugSession session = (DebugSession) abstractSession;
      final DebugProcessAdapter listener = new DebugProcessAdapter() {
        @Override
        public void processDetached(@NotNull DebugVMEventsProcessor process, boolean closedByUser) {
          if (process == vmManager.getDebugVMEventsProcessor(session)) {
            vmManager.removeAllProcessListener(this);
            notifyProcessDetached();
          }
        }
      };
      vmManager.addAllProcessListener(listener);
      try {
        super.startNotify();
      }
      finally {
        // in case we added our listener too late, we may have lost processDetached notification,
        // so check here if process is detached
        if (session.isStopped()) {
          vmManager.removeAllProcessListener(listener);
          notifyProcessDetached();
        }
      }
    }
  }

  protected void destroyProcessImpl() {
    AbstractDebugSession debugProcess = DebugSessionManagerComponent.getInstance(myProject).getDebugSession(this);
    if (debugProcess != null) {
      debugProcess.stop(true);
    }
  }

  protected void detachProcessImpl() {
    AbstractDebugSession debugProcess = DebugSessionManagerComponent.getInstance(myProject).getDebugSession(this);
    if (debugProcess != null) {
      debugProcess.stop(false);
    }
  }

  public boolean detachIsDefault() {
    return true;
  }

  public OutputStream getProcessInput() {
    return null;
  }
}