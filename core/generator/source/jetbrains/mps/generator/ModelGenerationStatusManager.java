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
package jetbrains.mps.generator;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.generator.cache.BaseModelCache;
import jetbrains.mps.generator.cache.CacheGenerator;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import jetbrains.mps.generator.generationTypes.StreamHandler;
import jetbrains.mps.generator.impl.dependencies.ModelDigestUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.util.ReadUtil;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.IFileNameFilter;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ModelGenerationStatusManager implements ApplicationComponent {
  public static final String HASH_PREFIX = ".hash.";

  private static final Logger LOG = Logger.getLogger(ModelGenerationStatusManager.class);
  private CacheGenerator myCacheGenerator;

  public static ModelGenerationStatusManager getInstance() {
    return ApplicationManager.getApplication().getComponent(ModelGenerationStatusManager.class);
  }

  private final Object LOCK = new Object();
  private Map<SModelDescriptor, Boolean> myEmptyStatus = new HashMap<SModelDescriptor, Boolean>();
  private Map<SModelDescriptor, Long> myEmptyStatusRetrievalTime = new HashMap<SModelDescriptor, Long>();

  private Map<SModelDescriptor, String> myGeneratedFilesHashes = new HashMap<SModelDescriptor, String>();

  private final List<ModelGenerationStatusListener> myListeners = new ArrayList<ModelGenerationStatusListener>();

  private final GlobalSModelEventsManager myGlobalEventsManager;
  private final SModelAdapter mySmodelReloadListener = new SModelAdapter() {
    @Override
    public void modelReplaced(SModelDescriptor sm) {
      ModelGenerationStatusManager.this.invalidateData(Collections.singletonList(sm));
    }
  };

  public ModelGenerationStatusManager(GlobalSModelEventsManager globalEventsManager) {
    myGlobalEventsManager = globalEventsManager;
    myCacheGenerator = new CacheGenerator() {
      public void generateCache(GenerationStatus status, StreamHandler handler) {
        String hashName = generateHashFileName(status);
        if (hashName != null) {
          handler.saveStream(hashName, status.getInputModel().getSModelReference().toString(), true);
        }
      }
    };
  }

  @NotNull
  public String getComponentName() {
    return "Model Status Manager";
  }

  public void initComponent() {
    myGlobalEventsManager.addGlobalModelListener(mySmodelReloadListener);
  }

  public void disposeComponent() {
    myGlobalEventsManager.removeGlobalModelListener(mySmodelReloadListener);
  }

  public CacheGenerator getCacheGenerator() {
    return myCacheGenerator;
  }

  public boolean generationRequired(SModelDescriptor sm, IOperationContext operationContext, boolean fast, boolean defaultValue) {
    if (!(sm instanceof EditableSModelDescriptor)) return false;
    EditableSModelDescriptor esm = (EditableSModelDescriptor) sm;
    if (esm.isPackaged()) return false;
    if (SModelStereotype.isStubModelStereotype(sm.getStereotype())) return false;
    if (GeneratorManager.isDoNotGenerate(sm)) return false;
    if (SModelRepository.getInstance().isChanged(esm)) return true;
    if (isEmpty(esm)) return false;

    Map<String, String> generationHashes = ModelDigestHelper.getInstance().getGenerationHashes(sm, operationContext, fast);
    if (generationHashes == null) return defaultValue;

    String generatedHash = getGenerationHash(sm);
    if (generatedHash == null) return true;

    return !generatedHash.equals(generationHashes.get(ModelDigestHelper.FILE));
  }

  private boolean isEmpty(@NotNull SModelDescriptor sm) {
    if (!(sm instanceof EditableSModelDescriptor)) {
      return sm.isEmpty();
    }

    synchronized (LOCK) {
      if (myEmptyStatus.containsKey(sm) && myEmptyStatusRetrievalTime.get(sm) >= ((EditableSModelDescriptor) sm).lastChangeTime()) return myEmptyStatus.get(sm);

      boolean result = sm.isEmpty();
      myEmptyStatus.put(sm, result);
      myEmptyStatusRetrievalTime.put(sm, System.currentTimeMillis());
      return result;
    }
  }

  private String getGenerationHash(SModelDescriptor sm) {
    if (!myGeneratedFilesHashes.containsKey(sm)) {
      String hash = calculateGeneratedHash(sm);
      myGeneratedFilesHashes.put(sm, hash);
    }
    return myGeneratedFilesHashes.get(sm);
  }

  public void invalidateData(List<SModelDescriptor> models) {
    ModelGenerationStatusListener[] copy;
    synchronized (myListeners) {
      copy = myListeners.toArray(new ModelGenerationStatusListener[myListeners.size()]);
    }
    for (SModelDescriptor model : models) {
      myGeneratedFilesHashes.remove(model);
      for (ModelGenerationStatusListener l : copy) {
        l.generatedFilesChanged(model);
      }
    }
  }

  public void addGenerationStatusListener(ModelGenerationStatusListener l) {
    synchronized (myListeners) {
      myListeners.add(l);
    }
  }

  public void removeGenerationStatusListener(ModelGenerationStatusListener l) {
    synchronized (myListeners) {
      myListeners.remove(l);
    }
  }

  private String calculateGeneratedHash(SModelDescriptor sm) {
    IModule module = sm.getModule();

    if (module == null) throw new IllegalStateException();

    IFile outputPath = BaseModelCache.getCachesDir(module, module.getOutputFor(sm));
    IFile sourcesDir = FileGenerationUtil.getDefaultOutputDir(sm, outputPath);

    List<IFile> files = sourcesDir.list(new IFileNameFilter() {
      public boolean accept(IFile parent, String name) {
        return name.startsWith(HASH_PREFIX);
      }
    });
    if (files.size() != 1) return null;

    return files.get(0).getName().substring(HASH_PREFIX.length());
  }

  private String generateHashFileName(GenerationStatus status) {
    SModelDescriptor descriptor = status.getOriginalInputModel();
    if (!(descriptor instanceof EditableSModelDescriptor)) return null;

    IFile file = ((EditableSModelDescriptor) descriptor).getModelFile();
    if (file == null) return null;

    byte[] content = new byte[(int) file.length()];

    InputStream is = null;
    try {
      is = file.openInputStream();
      ReadUtil.read(content, is);
    } catch (IOException e) {
      LOG.error(e);
    } finally {
      if (is != null) {
        try {
          is.close();
        } catch (IOException e) {
          LOG.error(e);
        }
      }
    }

    String hash = ModelDigestUtil.hash(content);
    return ModelGenerationStatusManager.HASH_PREFIX + hash;
  }

}
