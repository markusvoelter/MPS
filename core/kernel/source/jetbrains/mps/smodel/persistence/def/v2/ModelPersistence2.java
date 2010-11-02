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
package jetbrains.mps.smodel.persistence.def.v2;

import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.persistence.def.IModelReader;
import jetbrains.mps.smodel.persistence.def.IModelWriter;
import jetbrains.mps.smodel.persistence.def.v1.ModelPersistence1;
import jetbrains.mps.vfs.IFile;

/**
 * Created by IntelliJ IDEA.
 * User: Michael.Vlassiev
 * Date: Nov 2, 2010
 * Time: 7:44:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ModelPersistence2 extends ModelPersistence1 {
  @Override
  public IModelWriter getModelWriter() {
    return new ModelWriter2();
  }

  @Override
  public IModelReader getModelReader() {
    return new ModelReader2();
  }

  @Override
  public boolean needsRecreating(IFile file) {
    String fileName = file.getName();
    int index = fileName.indexOf('.');
    String rawModelName = (index >= 0) ? fileName.substring(0, index) : fileName;
    String modelStereotype = "";
    int index1 = rawModelName.indexOf("@");
    if (index1 >= 0) {
      modelStereotype = rawModelName.substring(index1 + 1);
    }
    return SModelStereotype.TEMPLATES.equals(modelStereotype);
  }

  @Override
  protected String upgradeStereotype(String stereotype) {
    if (SModelStereotype.TEMPLATES.equals(stereotype)) {
      return SModelStereotype.GENERATOR;
    }
    return stereotype;
  }
}
