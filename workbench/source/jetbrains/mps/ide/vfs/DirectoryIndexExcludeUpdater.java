/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.vfs;

import com.intellij.ProjectTopics;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.impl.DirectoryIndexExcludePolicy;
import com.intellij.openapi.roots.impl.ModuleRootEventImpl;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileAdapter;
import com.intellij.openapi.vfs.VirtualFileEvent;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.util.messages.MessageBus;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.*;
import jetbrains.mps.vfs.IFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Gerashchenko
 * Date: 30 June 11
 */
public class DirectoryIndexExcludeUpdater extends AbstractProjectComponent {
  private MyModuleRepositoryListener myModuleRepositoryListener = new MyModuleRepositoryListener();
  private MessageBus myMessageBus;
  private MySModelRepositoryListener myModelRepositoryListener = new MySModelRepositoryListener();
  private VirtualFileAdapter myVirtualFileListener = new MyVirtualFileListener();
  private DirectoryIndexExcludePolicy[] myExcludePolicies;

  public DirectoryIndexExcludeUpdater(Project project) {
    super(project);
    myMessageBus = myProject.getMessageBus();

    DirectoryIndexExcludePolicy[] allExcludePolicies = Extensions.getExtensions(DirectoryIndexExcludePolicy.EP_NAME, myProject);
    List<DirectoryIndexExcludePolicy> excludePolicies = new ArrayList<DirectoryIndexExcludePolicy>();
    for (DirectoryIndexExcludePolicy ep : allExcludePolicies) {
      if (ep instanceof BaseDirectoryIndexExcludePolicy) {
        excludePolicies.add(ep);
      }
    }
    myExcludePolicies = excludePolicies.toArray(new DirectoryIndexExcludePolicy[excludePolicies.size()]);
  }

  @Override
  public void initComponent() {
    MPSModuleRepository.getInstance().addModuleRepositoryListener(myModuleRepositoryListener);
    SModelRepository.getInstance().addModelRepositoryListener(myModelRepositoryListener);
    VirtualFileManager.getInstance().addVirtualFileListener(myVirtualFileListener);
  }

  @Override
  public void disposeComponent() {
    VirtualFileManager.getInstance().removeVirtualFileListener(myVirtualFileListener);
    SModelRepository.getInstance().removeModelRepositoryListener(myModelRepositoryListener);
    MPSModuleRepository.getInstance().removeModuleRepositoryListener(myModuleRepositoryListener);
  }

  private void notifyRootsChanged(boolean immediately) {
    Runnable action = new Runnable() {
      @Override
      public void run() {
        if (!myProject.isDisposed()) {
          myMessageBus.syncPublisher(ProjectTopics.PROJECT_ROOTS).rootsChanged(new ModuleRootEventImpl(myProject, false));
        }
      }
    };
    if (immediately) {
      action.run();
    } else {
      ApplicationManager.getApplication().executeOnPooledThread(action);
    }
  }

  private boolean isExcluded(VirtualFile dir) {
    for (DirectoryIndexExcludePolicy ep : myExcludePolicies) {
      if (ep.isExcludeRoot(dir)) {
        return true;
      }
    }
    return false;
  }

  private class MyVirtualFileListener extends VirtualFileAdapter {
    @Override
    public void fileCreated(VirtualFileEvent event) {
      if (event.getFile().isDirectory() && isExcluded(event.getFile())) {
        notifyRootsChanged(true);
      }
    }
  }

  private class MyModuleRepositoryListener extends ModuleRepositoryAdapter {
    @Override
    public void moduleAdded(IModule module) {
      moduleChanged(module);
    }

    @Override
    public void moduleChanged(IModule module) {
      notifyRootsChanged(false);
    }
  }

  private class MySModelRepositoryListener extends SModelRepositoryAdapter {
    @Override
    public void modelCreated(SModelDescriptor modelDescriptor) {
      notifyRootsChanged(false);
    }

    @Override
    public void modelOwnerAdded(SModelDescriptor modelDescriptor, ModelOwner owner) {
      notifyRootsChanged(false);
    }

    @Override
    public void modelFileChanged(SModelDescriptor modelDescriptor, IFile from) {
      notifyRootsChanged(false);
    }
  }
}
