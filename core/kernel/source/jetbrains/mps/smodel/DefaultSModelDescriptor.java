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
import jetbrains.mps.refactoring.StructureModificationLog;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.descriptor.source.RegularModelDataSource;
import jetbrains.mps.smodel.event.EventUtil;
import jetbrains.mps.smodel.event.SModelCommandListener;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.smodel.event.SModelFileChangedEvent;
import jetbrains.mps.smodel.persistence.BaseMPSModelRootManager;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DefaultSModelDescriptor extends BaseSModelDescriptorWithSource implements EditableSModelDescriptor {
  private static final Logger LOG = Logger.getLogger(DefaultSModelDescriptor.class);

  private Map<String, String> myMetadata;
  private SModelHeader myHeader;

  private final Object myRefactoringHistoryLock = new Object();
  private StructureModificationLog myStructureModificationLog;

  private long myLastChange;

  private boolean myChanged = false;

  private final Object myFullLoadSync = new Object();

  {
    this.addModelCommandListener(new SModelCommandListener() {
      public void eventsHappenedInCommand(List<SModelEvent> events) {
        if (EventUtil.isChange(events)) {
          myLastChange = System.currentTimeMillis();
        }
      }
    });
  }

  public DefaultSModelDescriptor(IModelRootManager manager, IFile modelFile, SModelReference modelReference) {
    this(manager, modelFile, modelReference, new DescriptorLoadResult(), true);
  }

  public DefaultSModelDescriptor(IModelRootManager manager, IFile modelFile, SModelReference modelReference, DescriptorLoadResult d) {
    this(manager, modelFile, modelReference, d, true);
  }

  protected DefaultSModelDescriptor(IModelRootManager manager, IFile modelFile, SModelReference modelReference, DescriptorLoadResult d, boolean checkDup) {
    super(manager, modelReference, new RegularModelDataSource(modelFile), checkDup);
    myHeader = d.getHeader();
    myMetadata = d.getMetadata();
    getSource().setDescriptor(this);
  }

  protected ModelLoadResult initialLoad() {
    ModelLoadResult result = load(ModelLoadingState.ROOTS_LOADED);
    tryFixingVersion();
    updateDiskTimestamp();
    return result;
  }

  //updates model with loading state == ROOTS_LOADED
  public void enforceFullLoad() {
    synchronized (myFullLoadSync) {
      if (mySModel.isLoading()) return;
      if (getLoadingState() == ModelLoadingState.FULLY_LOADED) return;

      SModel fullModel = load(ModelLoadingState.FULLY_LOADED).getModel();
      fullModel.setLoading(true);

      try {
        mySModel.setLoading(true);
        new ModelLoader(mySModel, fullModel).update();
        setLoadingState(ModelLoadingState.FULLY_LOADED);
        fireModelStateChanged(ModelLoadingState.ROOTS_LOADED, ModelLoadingState.FULLY_LOADED);
      } finally {
        mySModel.setLoading(false);
      }
    }
  }

  //just loads model, w/o changing state of SModelDescriptor
  private ModelLoadResult load(ModelLoadingState loadingState) {
    return ((BaseMPSModelRootManager) myModelRootManager).loadModel(this, loadingState);
  }

  public boolean isChanged() {
    return myChanged;
  }

  public void setChanged(boolean changed) {
    myChanged = changed;
  }

  public int getPersistenceVersion() {
    return getSModelHeader().getPersistenceVersion();
  }

  @NotNull
  public StructureModificationLog getStructureModificationLog() {
    synchronized (myRefactoringHistoryLock) {
      if (myStructureModificationLog == null) {
        myStructureModificationLog = myModelRootManager.loadModelRefactorings(this);
      }
      if (myStructureModificationLog == null) {
        myStructureModificationLog = new StructureModificationLog();
      }
    }
    return myStructureModificationLog;
  }

  public void saveStructureModificationLog(@NotNull StructureModificationLog log) {
    myStructureModificationLog = log;
    myModelRootManager.saveModelRefactorings(this, log);
  }

  public void save() {
    ModelAccess.assertLegalWrite();

    if (getLoadingState() == ModelLoadingState.NOT_LOADED) return;

    //we must be in command since model save might change model by adding model/language imports
    //if (!mySModel.isLoading()) LOG.assertInCommand();

    LOG.info("Saving model " + mySModel.getSModelFqName());

    if (!getSource().checkAndResolveConflictOnSave()) return;

    setChanged(false);
    SModel newData = myModelRootManager.saveModel(this);
    if (newData != null) {
      replaceModel(newData);
    }

    updateDiskTimestamp();

    fireModelSaved();
  }

  public boolean isGeneratable() {
    return !isDoNotGenerate() && !getSource().isPackaged() && SModelStereotype.isUserModel(this);
  }

  //this method should be called only with a fully loaded model as parameter
  public void replaceModel(@NotNull SModel newModel) {
    replaceModel(newModel, ModelLoadingState.FULLY_LOADED);
  }

  private void replaceModel(SModel newModel, ModelLoadingState state) {
    ModelAccess.assertLegalWrite();
    if (newModel == mySModel) return;
    final SModel oldSModel = mySModel;
    if (oldSModel != null) {
      oldSModel.setModelDescriptor(null);
    }
    mySModel = newModel;
    setLoadingState(state);

    myStructureModificationLog = null;
    if (mySModel != null) {
      mySModel.setModelDescriptor(this);
    }
    setChanged(false);
    MPSModuleRepository.getInstance().invalidateCaches();
    Runnable modelReplacedNotifier = new Runnable() {
      public void run() {
        fireModelReplaced();
        if (oldSModel != null) {
          oldSModel.dispose();
        }
      }
    };
    if (ModelAccess.instance().isInEDT()) {
      modelReplacedNotifier.run();
    } else {
      ModelAccess.instance().runWriteInEDT(modelReplacedNotifier);
    }
  }

  public void dispose() {
    UnregisteredNodes.instance().clear(getSModelReference());
    super.dispose();
  }

  public void setDoNotGenerate(boolean value) {
    ModelAccess.assertLegalWrite();

    getSModelHeader().setDoNotGenerate(value);
  }

  public long lastChangeTime() {
    return myLastChange;
  }

  public boolean isDoNotGenerate() {
    return getSModelHeader().isDoNotGenerate();
  }

  public int getVersion() {
    return getSModelHeader().getVersion();
  }

  public void setVersion(int newVersion) {
    ModelAccess.assertLegalWrite();

    getSModelHeader().setVersion(newVersion);
  }

  public String getAttribute(String key) {
    return myMetadata.get(key);
  }

  public void setAttribute(String key, String value) {
    ModelAccess.assertLegalWrite();

    if (value == null) {
      myMetadata.remove(key);
    } else {
      myMetadata.put(key, value);
    }
  }

  public SModelHeader getSModelHeader() {
    SModel model = mySModel;
    if (model != null) {
      return model.getSModelHeader();
    }
    return myHeader;
  }

  public Map<String, String> getMetaData() {
    return Collections.unmodifiableMap(myMetadata);
  }

  protected void checkModelDuplication() {
    SModelDescriptor anotherModel = SModelRepository.getInstance().getModelDescriptor(myModelReference);
    if (anotherModel != null) {
      String message = "Model already registered: " + myModelReference + "\n";
      message += "source = " + getSource() + "\n";

      if (anotherModel instanceof EditableSModelDescriptor) {
        message += "another model's source = " + ((EditableSModelDescriptor) anotherModel).getSource();
      } else {
        message += "another model is non-editable";
      }
      LOG.error(message);
    }
  }

  public void changeModelFile(IFile newModelFile) {
    ModelAccess.assertLegalWrite();
    if (getModelFile().getPath().equals(newModelFile.getPath())) return;

    IFile oldFile = myModelFile;
    SModel model = getSModel();
    fireBeforeModelFileChanged(new SModelFileChangedEvent(model, oldFile, newModelFile));
    myModelFile = newModelFile;
    updateDiskTimestamp();
    fireModelFileChanged(new SModelFileChangedEvent(model, oldFile, newModelFile));
  }

  private void tryFixingVersion() {
    if (getVersion() != -1) return;

    int latestVersion = getStructureModificationLog().getLatestVersion(getSModelReference());
    myStructureModificationLog = null;  // we don't need to keep log in memory
    if (latestVersion != -1) {
      setVersion(latestVersion);
      LOG.error("Metadata file for model " + getSModelReference().getSModelFqName() + " wasn't present. Recreated a new one.");
    }
  }

  public String toString() {
    return getSModelReference().toString();
  }

  //----------------------

  //should be called only from model's source
  public void setLastModified(long lastModified) {
    myLastChange = lastModified;
  }

  //should be called only from model's source
  public void reload() {
    DescriptorLoadResult dr = getModelRootManager().loadDescriptor(((RegularModelDataSource) getSource()).getFile());
    myHeader = dr.getHeader();
    myMetadata = dr.getMetadata();

    if (getLoadingState() == ModelLoadingState.NOT_LOADED) return;

    ModelLoadResult result = load(getLoadingState());
    replaceModel(result.getModel(), getLoadingState());
  }
}
