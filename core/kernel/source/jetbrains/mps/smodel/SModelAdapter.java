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

import jetbrains.mps.smodel.event.*;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * @author Kostik
 */
public class SModelAdapter implements SModelListener {
  public static final SModelListenerComparator COMPARATOR = new SModelListenerComparator();
  private SModelListenerPriority myPriority;

  public SModelAdapter() {
    this(SModelListenerPriority.CLIENT);
  }

  public SModelAdapter(@NotNull SModelListenerPriority priority) {
    myPriority = priority;
  }

  public void languageAdded(SModelLanguageEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void languageRemoved(SModelLanguageEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void importAdded(SModelImportEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void importRemoved(SModelImportEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void devkitAdded(SModelDevKitEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }


  public void devkitRemoved(SModelDevKitEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void rootAdded(SModelRootEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void rootRemoved(SModelRootEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void beforeRootRemoved(SModelRootEvent event) {
  }

  public void propertyChanged(SModelPropertyEvent event) {
    eventFired(event);
    modelChanged(event.getModel());
  }

  public void childAdded(SModelChildEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void childRemoved(SModelChildEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void beforeChildRemoved(SModelChildEvent event) {
  }

  public void referenceAdded(SModelReferenceEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void referenceRemoved(SModelReferenceEvent event) {
    eventFired(event);
    modelChangedDramatically(event.getModel());
  }

  public void beforeModelRenamed(SModelRenamedEvent event) {
  }

  public void modelRenamed(SModelRenamedEvent event) {
    eventFired(event);
  }

  public void beforeModelFileChanged(SModelFileChangedEvent event) {
  }

  public void modelFileChanged(SModelFileChangedEvent event) {
    eventFired(event);
  }

  public void loadingStateChanged(SModelDescriptor model, boolean isLoading) {
  }

  public void modelInitialized(SModelDescriptor sm) {
  }

  public void beforeModelDisposed(SModel sm) {
  }

  @Override
  public void modelReplaced(SModelDescriptor md) {
  }

  public void modelSaved(SModelDescriptor sm) {
  }

  public void eventFired(SModelEvent event) {
  }

  public void modelChanged(SModel model) {
  }

  public void modelChangedDramatically(SModel model) {
  }

  @NotNull
  @Override
  public SModelListenerPriority getPriority() {
    return myPriority;
  }

  private static class SModelListenerComparator implements Comparator<SModelListener> {

    @Override
    public int compare(SModelListener listener1, SModelListener listener2) {
      return listener1.getPriority().ordinal() - listener2.getPriority().ordinal();
    }
  }
}
