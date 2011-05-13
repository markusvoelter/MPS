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
package jetbrains.mps.smodel.descriptor.source;

import gnu.trove.THashSet;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.StubPath;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.BaseSModelDescriptor.ModelLoadResult;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;

import java.util.Collection;
import java.util.Set;

public abstract class StubModelDataSource extends FileBasedModelDataSource {
  private static Logger LOG = Logger.getLogger(StubModelDataSource.class);

  private final Set<StubPath> myStubPaths;

  public StubModelDataSource(Collection<StubPath> stubPaths) {
    myStubPaths = new THashSet<StubPath>(stubPaths);
  }

  public String toString() {
    //todo
    return "stub model data source";
  }

  public boolean containFile(IFile file) {
    for (StubPath p:myStubPaths){
      if (FileSystem.getInstance().getFileByPath(p.getPath())==file) return true;
    }
    return false;
  }

  public long getTimestamp() {
    long max = -1;
    for (StubPath path : myStubPaths) {
      long ts = getTimestampRecursive(FileSystem.getInstance().getFileByPath(path.getPath()));
      max = Math.max(max, ts);
    }
    return max;
  }

  public DescriptorLoadResult loadDescriptor(IModule module, SModelFqName modelName) {
    DescriptorLoadResult result = new DescriptorLoadResult();

    SModelId modelId = SModelId.foreign(modelName.getStereotype(), module.getModuleReference().getModuleId().toString(), modelName.getLongName());
    result.setUID(modelId.toString());

    return result;
  }

  public final boolean saveModel(SModelDescriptor descriptor) {
    throw new UnsupportedOperationException();
  }

  private static long getTimestampRecursive(IFile path) {
    long max = path.lastModified();
    if (path.isDirectory()) {
      for (IFile child : path.getChildren()) {
        long timestamp = getTimestampRecursive(child);
        if (timestamp > max) {
          max = timestamp;
        }
      }
    }
    return max;
  }

  public boolean isPackaged() {
    return true;
  }

  public Collection<StubPath> getStubPaths() {
    return myStubPaths;
  }

  public void addPath(StubPath sp) {
    myStubPaths.add(sp);
  }

  //todo more precise
  public boolean hasModel(SModelDescriptor md) {
    return myStubPaths.isEmpty();
  }
}
