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
package jetbrains.mps.migration20;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.migration20.stages.MigrationStage;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.ModelAccess;

public class MigrationHelper {
  private Project myProject;

  public MigrationHelper(Project project) {
    myProject = project;
  }

  public void migrate() {
    final MigrationState msComponent = myProject.getComponent(MigrationState.class);
    final MPSProject mpsProject = myProject.getComponent(MPSProject.class);

    for (MState state : MState.values()) {
      if (state == MState.DONE) break;
      if (msComponent.getMigrationState() == state) {
        final MState next = MState.values()[state.ordinal() + 1];
        final MigrationStage stage = next.getStage();

        if (stage == null) {
          msComponent.setMigrationState(next);
          continue;
        }

        if (!showMessageBefore(stage)) return;

        final Runnable stageRunnable = new StageExecutor(stage, mpsProject);
        if (stage.needsCommand()) {
          ModelAccess.instance().runWriteActionInCommand(stageRunnable);
        } else {
          stageRunnable.run();
        }

        if (!showMessageAfter(stage)) return;

        msComponent.setMigrationState(next);
      }
    }
  }

  private boolean showMessageAfter(MigrationStage stage) {
    String ma = stage.messageAfter();
    if (ma == null) return true;

    int res = Messages.showDialog(ma, stage.title() + " finished", new String[]{"Force next step", "Stop"}, 0, Messages.getInformationIcon());
    return res == 0;
  }

  private boolean showMessageBefore(MigrationStage stage) {
    String mb = stage.messageBefore();
    if (mb == null) return true;

    int res = Messages.showDialog(mb, stage.title(), new String[]{"Proceed", "Stop"}, 0, Messages.getInformationIcon());
    return res == 0;
  }

  private static class StageExecutor implements Runnable {
    private final MigrationStage myStage;
    private final MPSProject myMpsProject;

    public StageExecutor(MigrationStage stage, MPSProject mpsProject) {
      myStage = stage;
      myMpsProject = mpsProject;
    }

    public void run() {
      myStage.execute(myMpsProject);
    }
  }
}
