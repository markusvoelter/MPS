package jetbrains.mps.smodel;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.command.undo.UndoManager;
import com.intellij.openapi.command.impl.UndoManagerImpl;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;


class OnReloadingUndoCleaner implements ApplicationComponent {
  private GlobalSModelEventsManager myEventsManager;
  private ProjectManager myProjectManager;

  OnReloadingUndoCleaner(GlobalSModelEventsManager eventsManager, ProjectManager projectManager) {
    myEventsManager = eventsManager;
    myProjectManager = projectManager;
  }

  @NotNull
  public String getComponentName() {
    return "Undo Cleaner";
  }

  public void initComponent() {

    myEventsManager.addGlobalModelListener(new SModelAdapter() {
      @Override
      public void modelReloaded(SModelDescriptor sm) {
        for (SNode root : sm.getSModel().getRoots()) {
          MPSNodeVirtualFile file = MPSNodesVirtualFileSystem.getInstance().getFileFor(root);
          for (Project p : myProjectManager.getOpenProjects()) {
            ((UndoManagerImpl) UndoManager.getInstance(p)).clearUndoRedoQueueInTests(file);
          }
        }
      }
    });

  }

  public void disposeComponent() {
  }
}
