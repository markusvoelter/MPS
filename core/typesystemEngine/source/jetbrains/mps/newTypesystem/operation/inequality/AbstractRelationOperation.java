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
package jetbrains.mps.newTypesystem.operation.inequality;

import jetbrains.mps.newTypesystem.operation.AbstractOperation;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;

/**
 * Created by IntelliJ IDEA.
 * User: Ilya.Lintsbakh
 * Date: Sep 16, 2010
 * Time: 4:11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractRelationOperation extends AbstractOperation {
  protected SNode mySubType;
  protected SNode mySuperType;
  protected jetbrains.mps.newTypesystem.state.RelationMapKind myRelationMapKind;

  public AbstractRelationOperation(SNode subType, SNode superType, EquationInfo info, jetbrains.mps.newTypesystem.state.RelationMapKind kind) {
    mySubType = subType;
    mySuperType = superType;
    myRelationMapKind = kind;
    myEquationInfo = info;
  }

  public SNode getSubType() {
    return mySubType;
  }

  public SNode getSuperType() {
    return mySuperType;
  }

  protected jetbrains.mps.newTypesystem.state.RelationMapPair getRelationMap(State state) {
    return state.getInequalities().getRelation(myRelationMapKind);
  }
}
