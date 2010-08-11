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
package jetbrains.mps.workbench.actions.goTo.index;

import jetbrains.mps.baseLanguage.structure.Annotation;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.structure.EnumClass;
import jetbrains.mps.baseLanguage.structure.Interface;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.javastub.classpath.ClassifierKind;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.util.InternUtil;

public class StubSNodeDescriptor extends SNodeDescriptor {
  private final String myCls;
  private final String myPack;
  private final IClassPathItem myItem;

  public StubSNodeDescriptor(String cls, String pack, IClassPathItem item) {
    super(cls, null, 0, 0, -1);
    myCls = cls;
    myPack = pack;
    myItem = item;
  }

  protected SModelReference calculateModelReference() {
    return StubHelper.uidForPackageInStubs(myPack);
  }

  public String getConceptFqName() {
    if (myConceptFqName == null) {
      ClassifierKind kind = myItem.getClassifierKind(("".equals(myPack) ?
        myCls :
        myPack + "." + myCls
      ));
      if (kind == ClassifierKind.CLASS) {
        myConceptFqName = ClassConcept.concept;
      } else if (kind == ClassifierKind.INTERFACE) {
        myConceptFqName = Interface.concept;
      } else if (kind == ClassifierKind.ANNOTATIONS) {
        myConceptFqName = Annotation.concept;
      } else if (kind == ClassifierKind.ENUM) {
        return EnumClass.concept;
      } else {
        myConceptFqName = ClassConcept.concept;
      }
      myConceptFqName = InternUtil.intern(myConceptFqName);
    }
    return myConceptFqName;
  }
}
