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
package jetbrains.mps.plugin;

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.QueryMethodGenerated;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

public class GeneratedQueriesOpener {
  public static boolean openQueryMethod(IOperationContext context, SNode node) {
    String modelName = node.getModel().getModelDescriptor().getLongName();

    Class cls = QueryMethodGenerated.getQueriesGeneratedClassFor(node.getModel().getModelDescriptor());

    if (cls == null) {
      return false;
    }

    for (Method m : cls.getMethods()) {
      if (m.getName().endsWith("_" + node.getId())) {
        try {
          IProjectHandler handler = MPSPlugin.getInstance().getProjectHandler(context.getProject());
          if (handler != null) {
            handler.openMethod(modelName + ".QueriesGenerated", m.getName(), m.getParameterTypes().length);
            return true;
          }
        } catch (RemoteException e) {
          e.printStackTrace();
        }
      }
    }

    return false;
  }
}
