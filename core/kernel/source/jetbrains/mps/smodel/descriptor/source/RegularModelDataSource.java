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

import jetbrains.mps.generator.ModelDigestUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.BaseSModelDescriptor.ModelLoadResult;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.nodeidmap.RegularNodeIdMap;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.smodel.persistence.def.ModelFileReadException;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.PersistenceVersionNotFoundException;
import jetbrains.mps.vcs.VcsMigrationUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

public class RegularModelDataSource extends FileBasedModelDataSource {
  private static Logger LOG = Logger.getLogger(RegularModelDataSource.class);

  private final IFile myFile;

  public RegularModelDataSource(@NotNull IFile file) {
    myFile = file;
  }

  @Deprecated  //todo remove
  public IFile getFile() {
    return myFile;
  }

  public String toString() {
    return myFile.toString();
  }

  public boolean containFile(IFile file) {
    return myFile.getPath().equals(file.getPath());
  }

  public boolean isPackaged() {
    return FileSystem.getInstance().isPackaged(myFile);
  }

  public String getModelHash() {
    if (myFile == null) return null;
    return ModelDigestUtil.hash(myFile);
  }

  public long getTimestamp() {
    if (myFile == null || !myFile.exists()) return -1;
    return myFile.lastModified();
  }

  public DescriptorLoadResult loadDescriptor(IModule module, SModelFqName modelName) {
    return ModelPersistence.loadDescriptor(myFile);
  }

  @Override
  public ModelLoadResult loadSModel(SModelDescriptor descriptor, ModelLoadingState targetState) {
    DefaultSModelDescriptor dsm = (DefaultSModelDescriptor) descriptor;
    SModelReference dsmRef = dsm.getSModelReference();

    if (!dsm.getModelFile().isReadOnly() && !dsm.getModelFile().exists()) {
      SModel model = new SModel(dsmRef, new RegularNodeIdMap());
      return new ModelLoadResult(model, ModelLoadingState.FULLY_LOADED);
    }

    ModelLoadResult result;
    try {
      result = ModelPersistence.readModel(dsm.getSModelHeader(), dsm.getModelFile(), targetState);
      if (result.getState() == ModelLoadingState.NOT_LOADED) {
        // TODO this is a temporary fix to enable invoking merge dialog for model with wrong markup
        if (targetState != ModelLoadingState.NOT_LOADED) {
          VcsMigrationUtil.getHandler().addSuspiciousModel(dsm, false);
        }

        return result;
      }
    } catch (ModelFileReadException t) {
      return handleExceptionDuringModelRead(dsm, t, false);
    } catch (PersistenceVersionNotFoundException e) {
      LOG.error(e);
      StubModel model = new StubModel(dsmRef);
      return new ModelLoadResult(model, ModelLoadingState.NOT_LOADED);
    }

    SModel model = result.getModel();
    if (result.getState() == ModelLoadingState.FULLY_LOADED) {
      try {
        model.setLoading(true);
        boolean needToSave = model.updateSModelReferences() || model.updateModuleReferences();

        if (needToSave && !dsm.getModelFile().isReadOnly()) {
          SModelRepository.getInstance().markChanged(model);
        }
      } finally {
        model.setLoading(false);
      }
    }

    LOG.assertLog(model.getSModelReference().equals(dsmRef),
      "\nError loading model from file: \"" + dsm.getModelFile() + "\"\n" +
        "expected model UID     : \"" + dsmRef + "\"\n" +
        "but was UID            : \"" + model.getSModelReference() + "\"\n" +
        "the model will not be available.\n" +
        "Make sure that all project's roots and/or the model namespace is correct");
    return result;
  }

  public boolean saveModel(SModelDescriptor descriptor) {
    DefaultSModelDescriptor dsm = (DefaultSModelDescriptor) descriptor;
    SModel smodel = dsm.getSModel();
    if (smodel instanceof StubModel) {
      // we do not save stub model to do not overwrite the real model
      return false;
    }
    IFile modelFile = dsm.getModelFile();
    assert modelFile != null;
    return ModelPersistence.saveModel(smodel, modelFile)!=null;
  }

  public boolean hasModel(SModelDescriptor md) {
    return myFile == null || !myFile.exists();
  }

  private ModelLoadResult handleExceptionDuringModelRead(EditableSModelDescriptor modelDescriptor, RuntimeException exception, boolean isConflictStateFixed) {
    VcsMigrationUtil.getHandler().addSuspiciousModel(modelDescriptor, isConflictStateFixed);
    SModel newModel = new StubModel(modelDescriptor.getSModelReference());
    LOG.error(exception.getMessage(), newModel);
    return new ModelLoadResult(newModel, ModelLoadingState.NOT_LOADED);
  }
}
