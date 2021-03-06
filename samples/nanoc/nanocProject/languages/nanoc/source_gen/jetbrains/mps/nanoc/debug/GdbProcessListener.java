package jetbrains.mps.nanoc.debug;

/*Generated by MPS */

import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.openapi.project.Project;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.util.Key;
import jetbrains.mps.nanoc.debug.requests.BreakpointRequestor;
import jetbrains.mps.nanoc.debug.answer.ResultAnswer;
import java.util.List;
import jetbrains.mps.nanoc.debug.answer.StreamAnswer;
import jetbrains.mps.nanoc.debug.events.GDBEventsHandler;
import jetbrains.mps.nanoc.debug.events.GDBEventsAdapter;
import jetbrains.mps.nanoc.debug.answer.AsyncAnswer;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.debug.api.DebugSessionManagerComponent;

public class GdbProcessListener extends ProcessAdapter {
  private boolean myReadyForInput = false;
  private final ProcessHandler myProcess;
  private final Project myProject;
  private final File myExecutableFile;

  public GdbProcessListener(@NotNull Project project, @NotNull ProcessHandler process, @NotNull File executableFile) {
    myProcess = process;
    myProject = project;
    myExecutableFile = executableFile;
  }

  public void onTextAvailable(ProcessEvent event, Key outputType) {
    if (!(myReadyForInput)) {
      String s = event.getText();
      if (s.startsWith("(gdb)")) {
        myReadyForInput = true;
        assert myProcess == event.getProcessHandler();
        ProcessUtil.inputWithFlush(myProcess, "-environment-cd " + myExecutableFile.getParentFile().getAbsolutePath() + "\n");
        ProcessUtil.inputWithFlush(myProcess, "-file-exec-and-symbols " + myExecutableFile.getAbsolutePath().replace(File.separatorChar, '/') + "\n");
        final CppDebugSession cppDebugSession = this.getDebugSession();
        cppDebugSession.getGDBRequestManager().createRequest(new BreakpointRequestor("main") {
          public void onRequestFulfilled(ResultAnswer answer, List<StreamAnswer> receivedStreamAnswers) {
            final GDBEventsHandler eventsHandler = cppDebugSession.getGDBEventsHandler();
            eventsHandler.addEventListener(new GDBEventsAdapter() {
              public void paused(AsyncAnswer answer, ProcessHandler gdbProcess) {
                eventsHandler.removeEventListener(this);
                connectedToDebuggee(cppDebugSession);
              }
            });
            ProcessUtil.inputWithFlush(myProcess, "-exec-run\n");
          }
        });
      }
    }
  }

  private CppDebugSession getDebugSession() {
    AbstractDebugSession debugSession = DebugSessionManagerComponent.getInstance(myProject).getDebugSession(myProcess);
    assert debugSession instanceof CppDebugSession;
    return ((CppDebugSession) debugSession);
  }

  private void connectedToDebuggee(CppDebugSession session) {
    session.getGDBRequestManager().createBreakpointRequests();
    session.setupBreakpointListener();
    ProcessUtil.inputWithFlush(myProcess, "-exec-continue\n");
  }
}
