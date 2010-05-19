package jetbrains.mps.vcs;

import com.intellij.ProjectTopics;
import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootListener;
import com.intellij.openapi.roots.impl.ModuleRootEventImpl;
import com.intellij.openapi.vcs.changes.ChangeListManager;
import com.intellij.openapi.vcs.changes.VcsDirtyScopeManager;
import com.intellij.openapi.vcs.changes.VcsDirtyScopeManagerImpl;
import com.intellij.openapi.vfs.VirtualFileManager;
import jetbrains.mps.vcs.MPSVcsProjectConfiguration.MyState;

@State(
  name = "MPSVcsConfiguration",
  storages = {
    @Storage(
      id ="other",
      file = "$WORKSPACE_FILE$"
    )
  }
)
public class MPSVcsProjectConfiguration extends AbstractProjectComponent implements PersistentStateComponent<MyState> {
  private MyState myState = new MyState();

  protected MPSVcsProjectConfiguration(Project project) {
    super(project);
  }

  @Override
  public MyState getState() {
    return myState;
  }

  @Override
  public void loadState(MyState state) {
    myState = state;
  }

  public boolean isIgnoreGeneratedFiles() {
    return myState.myIgnoreGeneratedFiles;
  }

  public void setIgnoreGeneratedFiles(boolean ignoreGeneratedFiles) {
    if (myState.myIgnoreGeneratedFiles != ignoreGeneratedFiles) {
      myState.myIgnoreGeneratedFiles = ignoreGeneratedFiles;
      ModuleRootListener moduleRootListener = myProject.getMessageBus().asyncPublisher(ProjectTopics.PROJECT_ROOTS);
      moduleRootListener.rootsChanged(new ModuleRootEventImpl(myProject, false));

      VirtualFileManager.getInstance().refresh(true, new Runnable() {
        public void run() {
          // already called in EDT or under write action
          if (! myProject.isDisposed()) {
            VcsDirtyScopeManager.getInstance(myProject).markEverythingDirty();
          }
        }
      });
    }
  }

  public static MPSVcsProjectConfiguration getInstance(Project project) {
    return project.getComponent(MPSVcsProjectConfiguration.class);
  }

  public static class MyState {
    private boolean myIgnoreGeneratedFiles;

    public boolean isIgnoreGeneratedFiles() {
      return myIgnoreGeneratedFiles;
    }

    public void setIgnoreGeneratedFiles(boolean ignoreGeneratedFiles) {
      myIgnoreGeneratedFiles = ignoreGeneratedFiles;
    }
  }
}
