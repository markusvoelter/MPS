package jetbrains.mps.debug.api.integration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.debug.api.AbstractDebugSessionCreator;
import jetbrains.mps.debug.api.integration.DebugContentBuilder;
import jetbrains.mps.debug.api.DebugSessionManagerComponent;
import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunProfileState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 05.02.2010
 * Time: 19:48:50
 * To change this template use File | Settings | File Templates.
 */
public class MPSDebugRunner extends GenericProgramRunner {

  public boolean canRun(@NotNull final String executorId, @NotNull final RunProfile profile) {
    return executorId.equals(DefaultDebugExecutor.EXECUTOR_ID) && (profile instanceof BaseRunConfig) && (((BaseRunConfig)profile).isDebuggable());
  }

  @NotNull
  public String getRunnerId() {
    return "Default Debug Runner";
  }

  protected RunContentDescriptor doExecute(final Project project, final Executor executor, final RunProfileState state, final RunContentDescriptor contentToReuse,
                                           final ExecutionEnvironment env) throws ExecutionException {
    // FileDocumentManager.getInstance().saveAllDocuments();
    return createContentDescriptor(project, executor, state, contentToReuse, env);
  }

  @Nullable
  protected RunContentDescriptor createContentDescriptor(Project project, Executor executor, RunProfileState state,
                                                         RunContentDescriptor contentToReuse,
                                                         ExecutionEnvironment env) throws ExecutionException {
    //todo get connection settings
    if (state instanceof BaseRunProfileState) {
      BaseRunProfileState baseRunProfileState = (BaseRunProfileState) state;
      AbstractDebugSessionCreator debugSessionCreator = baseRunProfileState.createDebugSessionCreator(project);
      ExecutionResult executionResult = debugSessionCreator.startSession(executor, this, state, project);
      AbstractDebugSession debugSession = debugSessionCreator.getDebugSession();
      DebugSessionManagerComponent.getInstance(project).addDebugSession(debugSession);
      DebugContentBuilder contentBuilder = new DebugContentBuilder(project, this, executor, executionResult, env);
      return contentBuilder.showRunContent(contentToReuse);
    } else {
      throw new RuntimeException("Unknown Run Profile State");
    }
  }



  public SettingsEditor getSettingsEditor(final Executor executor, RunConfiguration configuration) {
    return null;
  }
}
