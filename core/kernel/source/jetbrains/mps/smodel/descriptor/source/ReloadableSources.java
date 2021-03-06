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
package jetbrains.mps.smodel.descriptor.source;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.progress.ProgressMonitor;

import java.util.ArrayList;
import java.util.List;

public class ReloadableSources {
  private static Logger LOG = Logger.getLogger(ReloadableSources.class);

  private static ReloadableSources ourInstance = new ReloadableSources();

  public static ReloadableSources getInstance() {
    return ourInstance;
  }

  private ReloadableSources() {

  }

  //--------------

  private final List<FileBasedModelDataSource> mySources = new ArrayList<FileBasedModelDataSource>();

  public void addSource(FileBasedModelDataSource source) {
    mySources.add(source);
  }

  public void removeSource(FileBasedModelDataSource source) {
    mySources.remove(source);
  }

  //--------------

  public boolean needsReloading() {
    for (FileBasedModelDataSource source : mySources) {
      if (source.isInvalidated()) return true;
    }
    return false;
  }

  public void reload(ProgressMonitor monitor) {
    final ArrayList<FileBasedModelDataSource> fileSourceChangeWatchers = new ArrayList<FileBasedModelDataSource>(mySources);
    monitor.start("", fileSourceChangeWatchers.size());
    try {
      for (FileBasedModelDataSource source : fileSourceChangeWatchers) {
        try {
          if (!source.isInvalidated()) continue;
          source.reload(monitor.subTask(1));
        } catch (RuntimeException e) {
          LOG.error("error on reloading model", e);
        }
      }
    } finally {
      monitor.done();
    }
  }
}
