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
package jetbrains.mps.newTypesystem.presentation.state;

import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.IOperationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Ilya.Lintsbakh
 * Date: Oct 15, 2010
 * Time: 11:44:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypeSystemStateTreeNode extends MPSTreeNode {
  public TypeSystemStateTreeNode(IOperationContext operationContext) {
    super(operationContext);
  }

  public TypeSystemStateTreeNode(Object userObject, IOperationContext operationContext) {
    super(userObject, operationContext);
    setNodeIdentifier(userObject.toString());
    setIcon(Icons.DEFAULT_ICON);
    this.setAutoExpandable(true);
  }
}
