package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.debug.api.AbstractDebugSession;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.execution.ui.RunContentManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionManager;
import com.intellij.execution.executors.DefaultDebugExecutor;
import jetbrains.mps.debug.api.DebugSessionManagerComponent;

public class DebugActionsUtil {
  public DebugActionsUtil() {
  }

  public static AbstractDebugSession getDebugSession(AnActionEvent event) {
    DataContext dataContext = event.getDataContext();
    return DebugActionsUtil.getDebugSession(dataContext);
  }

  public static AbstractDebugSession getDebugSession(DataContext dataContext) {
    RunContentDescriptor runContentDescriptor = RunContentManager.RUN_CONTENT_DESCRIPTOR.getData(dataContext);
    Project project = PlatformDataKeys.PROJECT.getData(dataContext);
    return DebugActionsUtil.getDebugSession(runContentDescriptor, project);
  }

  public static AbstractDebugSession getDebugSession(@Nullable RunContentDescriptor runContentDescriptor, @Nullable Project project) {
    ProcessHandler processHandler;
    if (runContentDescriptor != null) {
      // tool window 
      processHandler = runContentDescriptor.getProcessHandler();
    } else {
      // main menu 
      if (project == null) {
        return null;
      }
      RunContentDescriptor selected = ExecutionManager.getInstance(project).getContentManager().getSelectedContent();
      if (selected == null) {
        // when Debug is first started for the first time, the debug tool window is shown but not activated 
        // here we deal with this situation 
        selected = ExecutionManager.getInstance(project).getContentManager().getSelectedContent(DefaultDebugExecutor.getDebugExecutorInstance());
      }
      processHandler = (selected == null ?
        null :
        selected.getProcessHandler()
      );
    }
    if (project == null) {
      return null;
    }
    return DebugSessionManagerComponent.getInstance(project).getDebugSession(processHandler);
  }
}
