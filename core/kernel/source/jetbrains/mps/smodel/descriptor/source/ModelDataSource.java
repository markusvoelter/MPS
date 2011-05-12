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
package jetbrains.mps.smodel.descriptor.source;

import jetbrains.mps.smodel.DefaultSModelDescriptor;

public interface ModelDataSource {

  //--------listening for changes--------

  void startListening();

  void stopListening();

  //--------corresponding descriptor--------

  void setDescriptor(DefaultSModelDescriptor d);

  DefaultSModelDescriptor getDescriptor();

  //--------reloading stuff--------

  boolean checkAndResolveConflictOnSave();

  boolean needsReloading();

  void reloadFromDisk();

  void resolveDiskConflict();

  //------todo try to get rid of


  boolean isPackaged();

  String getModelHash();
}
