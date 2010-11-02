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
package jetbrains.mps.smodel.persistence.def.v3;

import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.persistence.def.IModelReader;
import jetbrains.mps.smodel.persistence.def.IModelWriter;
import jetbrains.mps.smodel.persistence.def.v2.ModelPersistence2;
import jetbrains.mps.vfs.IFile;

/**
 * Created by IntelliJ IDEA.
 * User: Michael.Vlassiev
 * Date: Nov 2, 2010
 * Time: 7:49:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ModelPersistence3 extends ModelPersistence2 {
  @Override
  public IModelWriter getModelWriter() {
    return new ModelWriter3();
  }

  @Override
  public IModelReader getModelReader() {
    return new ModelReader3();
  }

  @Override
  public SModelReference upgradeModelUID(SModelReference modelReference) {
    return new SModelReference(new SModelFqName(modelReference.getLongName(), upgradeStereotype(modelReference.getStereotype())), modelReference.getSModelId());
  }

}
