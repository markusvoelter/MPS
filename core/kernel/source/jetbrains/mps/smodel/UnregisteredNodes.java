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
package jetbrains.mps.smodel;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.util.PairMap;

class UnregisteredNodes {
  private static final Logger LOG = Logger.getLogger(UnregisteredNodes.class);
  private static UnregisteredNodes ourInstance;

  private final PairMap<SModelReference, SNodeId, SNode> myMap = new PairMap<SModelReference, SNodeId, SNode>();
  private final Object myLock = new Object();

  public static UnregisteredNodes instance() {
    if (ourInstance == null) {
      ourInstance = new UnregisteredNodes();
    }
    return ourInstance;
  }

  private UnregisteredNodes() {
    ModelAccess.instance().addCommandListener(new ModelAccessAdapter(){
      public void commandFinished() {
        clear();
      }
    });
  }

  void clear() {
    synchronized (myLock) {
      myMap.clear();
    }
  }

  void put(SNode node) {
    if (!node.hasId()) return;
    add(node.getModel().getSModelReference(), node.getSNodeId(), node);
  }

  void remove(SNode node) {
    if (!node.hasId()) return;
    remove(node.getModel().getSModelReference(), node.getSNodeId());
  }

  SNode get(SModelReference modelReference, SNodeId nodeId) {
    synchronized (myLock) {
      return myMap.get(modelReference, nodeId);
    }
  }

  void nodeIdChanged(SNode node, SNodeId oldNodeId) {
    if (oldNodeId != null) {
      remove(node.getModel().getSModelReference(), oldNodeId);
    }
    if (node.hasId()) {
      add(node.getModel().getSModelReference(), node.getSNodeId(), node);
    }
  }

  void nodeModelChanged(SNode node, SModel oldModel) {
    if (!node.hasId()) return;
    remove(oldModel.getSModelReference(), node.getSNodeId());
    add(node.getModel().getSModelReference(), node.getSNodeId(), node);
  }

  private void add(SModelReference reference, SNodeId id, SNode node) {
    boolean showError = false;
    synchronized (myLock) {
      if (myMap.contains(reference, id)) {
        showError = true;
      }
      myMap.put(reference, id, node);
    }
    if(showError) {
      LOG.error("attempt to put another node with same key: " + reference + "#" + id, new Exception());
    }
  }

  private void remove(SModelReference reference, SNodeId id) {
    synchronized (myLock) {
      myMap.remove(reference, id);
    }
  }

  /**
   * We need this method to make generation economical with memory during generation
   * Do not remove it
   */
  void clear(SModelReference reference) {
    synchronized (myLock) {
      myMap.clear(reference);
    }
  }
}
