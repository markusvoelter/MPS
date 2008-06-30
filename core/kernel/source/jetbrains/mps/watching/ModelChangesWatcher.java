package jetbrains.mps.watching;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.vfs.*;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileDeleteEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileCreateEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileContentChangeEvent;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task.Modal;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.FileStatus;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import com.intellij.util.messages.MessageBus;
import com.intellij.util.messages.MessageBusConnection;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProjects;
import jetbrains.mps.project.MPSProject;

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class ModelChangesWatcher implements ApplicationComponent {
  public static final Logger LOG = Logger.getLogger(ModelChangesWatcher.class);
  private final MessageBus myBus;

  private BulkFileListener myBusListener = new BulkFileListener() {
    public void before(List<? extends VFileEvent> events) {

    }

    public void after(List<? extends VFileEvent> events) {
      final Set<SModelDescriptor> toReload = new LinkedHashSet<SModelDescriptor>();

      for (VFileEvent event : events) {
        if ((event instanceof VFileDeleteEvent) || (event instanceof VFileCreateEvent)) {

          String path = event.getPath();
          if (path.endsWith(".mps")) {
            ProgressManager.getInstance().run(new Modal(null, "Reloading Updated Models", false) {
              public void run(@NotNull final ProgressIndicator indicator) {
                ModelAccess.instance().runReadAction(new Runnable() {
                  public void run() {
                    try {
                      indicator.setIndeterminate(true);
                      List<SModelDescriptor> allModelDescriptors = ApplicationManager.getApplication().getComponent(SModelRepository.class).getAllModelDescriptors();

                      for (SModelDescriptor d : allModelDescriptors) {
                        IFile modelFile = d.getModelFile();
                        if ((modelFile != null) && (!isInConflict(modelFile))) {
                          d.reloadFromDisk();
                        }
                      }
                    } catch (Throwable t) {
                      LOG.error(t);
                    }
                  }
                });
              }
            });
          }
          return;

        } else {

          IFile ifile = VFileSystem.toIFile(event.getFileSystem().findFileByPath(event.getPath()));
          if ((ifile == null) || (!ifile.exists())) continue;
          final SModelDescriptor model = ApplicationManager.getApplication().getComponent(SModelRepository.class).findModel(ifile);

          if (model != null) {
            if (isInConflict(ifile)) {
              continue;
            }
            if (model.needsReloading()) {
              toReload.add(model);
            }
          }

        }
      }

      ProgressManager.getInstance().run(new Modal(null, "Reloading Updated Models", false) {
        public void run(@NotNull final ProgressIndicator indicator) {
          for (final SModelDescriptor model : toReload) {
            ModelAccess.instance().runReadAction(new Runnable() {
              public void run() {
                indicator.setText("Reloading " + model.getModelUID());
                model.reloadFromDisk();
              }
            });
          }
        }
      });

    }
  };

  private boolean isInConflict(IFile ifile) {
    VirtualFile vfile = VFileSystem.getFile(ifile);
    if ((vfile != null) && (vfile.exists())) {
      Project[] projects = ApplicationManager.getApplication().getComponent(ProjectManager.class).getOpenProjects();
      for (Project project : projects) {
        VcsFileStatusProvider statusProvider = project.getComponent(VcsFileStatusProvider.class);
        if (statusProvider.getFileStatus(vfile).equals(FileStatus.MERGED_WITH_CONFLICTS)) {
          return true;
        }
      }
    }
    return false;
  }

  private MessageBusConnection myConnection;


  public ModelChangesWatcher(final MessageBus bus) {
    myBus = bus;

  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Model Changes Whatcher";
  }

  public void initComponent() {
    myConnection = myBus.connect();
    myConnection.subscribe(VirtualFileManager.VFS_CHANGES, myBusListener);
  }

  public void disposeComponent() {
    myConnection.disconnect();
  }
}