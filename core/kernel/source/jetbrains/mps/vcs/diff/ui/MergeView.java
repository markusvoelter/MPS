/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.vcs.diff.ui;

import jetbrains.mps.ide.ui.HeaderWrapper;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;

import javax.swing.JPanel;
import java.awt.GridLayout;

class MergeView extends JPanel {
  private MergeResultView myMergeResult;

  public MergeView(final SModel baseModel, final SModel mine, final SModel repo) {
    setLayout(new GridLayout(1, 3));
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        add(new HeaderWrapper("Mine Version", new ModelDifferenceComponent().showDifference(baseModel, mine)));
        myMergeResult = new MergeResultView(baseModel, mine, repo);
        add(new HeaderWrapper("Merge Result", myMergeResult));
        add(new HeaderWrapper("Repository Version", new ModelDifferenceComponent().showDifference(baseModel, repo)));
      }
    });
  }

  public SModel getResultModel() {
    return myMergeResult.getResult();
  }

  public boolean isResolved() {
    return myMergeResult.isResolved();
  }
}
