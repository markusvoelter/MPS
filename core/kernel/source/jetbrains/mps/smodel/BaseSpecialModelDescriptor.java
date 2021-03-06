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
package jetbrains.mps.smodel;

import jetbrains.mps.smodel.loading.ModelLoadingState;
import org.jetbrains.annotations.NotNull;

public abstract class BaseSpecialModelDescriptor extends BaseSModelDescriptor {
  protected SModel mySModel;

  protected BaseSpecialModelDescriptor(@NotNull SModelReference modelReference, boolean checkDup) {
    super(modelReference, checkDup);
  }

  public final synchronized SModel getSModel() {
    if (mySModel == null) {
      mySModel = createModel();
      mySModel.setModelDescriptor(this);
      fireModelStateChanged(ModelLoadingState.NOT_LOADED, ModelLoadingState.FULLY_LOADED);
    }
    return mySModel;
  }

  public final ModelLoadingState getLoadingState() {
    return mySModel == null ? ModelLoadingState.NOT_LOADED : ModelLoadingState.FULLY_LOADED;
  }

  @Override
  protected SModel getCurrentModelInternal() {
    return mySModel;
  }

  protected abstract SModel createModel();

}
