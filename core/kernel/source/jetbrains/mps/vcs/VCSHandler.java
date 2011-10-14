/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.vcs;

import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vfs.IFile;

public interface VCSHandler {
  //-----suspicious

  // NEEDED IN CORE
  @Deprecated
  void addSuspiciousModule(AbstractModule abstractModule, boolean isInConflict);

  // NEEDED IN CORE
  @Deprecated
  void addSuspiciousModel(DefaultSModelDescriptor modelDescriptor, boolean isInConflict);

  //-----misc

  // NOT NEEDED IN CORE
  VcsRevisionNumber getRevisionNumber(IFile file);

  boolean isInConflict(IFile iFile, boolean synchronously);

  // NEEDED IN CORE
  @Deprecated
  boolean resolveDiskMemoryConflict(IFile modelFile, SModel model);
}
