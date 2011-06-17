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
package jetbrains.mps.migration20.stages;

import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.ide.migration.persistence.PersistenceUpdater;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;

public class PersistenceUpgradeStage implements MigrationStage {
  public String title() {
    return "Persistence Upgrade";
  }

  public void execute(MPSProject p) {
    for (IModule module : p.getModules()) {
      if (module.isPackaged()) continue;
      module.save();
    }

    PersistenceUpdater persistenceUpdater = new PersistenceUpdater();
    persistenceUpdater.upgradePersistenceInProject(p.getProject(), WindowManager.getInstance().getFrame(p.getProject()));
  }

  public boolean needsCommand() {
    return false;
  }

  public boolean needsRestart() {
    return true;
  }

  public String messageBefore() {
    return null;
  }

  public String messageAfter() {
    return null;
  }
}
