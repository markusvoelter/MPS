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
package jetbrains.mps.datatransfer;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PasteWrappersManager implements ApplicationComponent {

  public static PasteWrappersManager getInstance() {
    return ApplicationManager.getApplication().getComponent(PasteWrappersManager.class);
  }

  public static final String PASTE_WRAPPER_CLASS_NAME = "PasteWrappers";
  public static final String PASTE_WRAPPERS_FACTORY_METHOD = "createPasteWrappers";

  private static final Logger LOG = Logger.getLogger(PasteWrappersManager.class);

  private ClassLoaderManager myClassLoaderManager;
  private MyReloadHandler myReloadHandler = new MyReloadHandler();
  private Map<String, Map<String, PasteWrapper>> myWrappers = new HashMap<String, Map<String, PasteWrapper>>();

  public PasteWrappersManager(ClassLoaderManager classLoaderManager) {
    myClassLoaderManager = classLoaderManager;
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Paste Wrapper Manager";
  }

  public void initComponent() {
    myClassLoaderManager.addReloadHandler(myReloadHandler);
  }

  public void disposeComponent() {
    myClassLoaderManager.removeReloadHandler(myReloadHandler);
  }

  public boolean canWrapInto(SNode node, AbstractConceptDeclaration targetConcept) {
    return getWrapperFor(node, targetConcept) != null;
  }

  public SNode wrapInto(SNode node, AbstractConceptDeclaration targetConcept) {
    PasteWrapper wrapper = getWrapperFor(node, targetConcept);
    if (wrapper == null) {
      throw new IllegalStateException();
    }
    SNode result = wrapper.wrap(new PasteWrapperContext(node));
    if (result.getParent() != null) {
      result.getParent().removeChild(result);
    }
    return result;
  }

  private PasteWrapper getWrapperFor(SNode node, AbstractConceptDeclaration targetConcept) {
    Map<String, PasteWrapper> wrappers = myWrappers.get(NameUtil.nodeFQName(targetConcept));
    if (wrappers == null) return null;
    List<AbstractConceptDeclaration> superConcepts = SModelUtil_new.getConceptAndSuperConcepts(node.getConceptDeclarationAdapter());
    for (AbstractConceptDeclaration acd : superConcepts) {
      if (wrappers.containsKey(NameUtil.nodeFQName(acd))) {
        return wrappers.get(NameUtil.nodeFQName(acd));
      }
    }
    return null;
  }

  private void addWrapper(PasteWrapper wrapper) {
    if (!myWrappers.containsKey(wrapper.getTargetConceptFqName())) {
      myWrappers.put(wrapper.getTargetConceptFqName(), new HashMap<String, PasteWrapper>());
    }
    myWrappers.get(wrapper.getTargetConceptFqName()).put(wrapper.getSourceConceptFqName(), wrapper);
  }

  private class MyReloadHandler extends ReloadAdapter {
    public void unload() {
      myWrappers.clear();
    }

    public void load() {
      for (Language language : MPSModuleRepository.getInstance().getAllLanguages()) {
        try {
          String pasteWrappersClass = language.getNamespace() + "." + LanguageAspect.ACTIONS.getName() + "." + PASTE_WRAPPER_CLASS_NAME;
          Class cls = language.getClass(pasteWrappersClass);
          if (cls == null) continue;

          List<PasteWrapper> wrappers = (List<PasteWrapper>) cls.getMethod(PASTE_WRAPPERS_FACTORY_METHOD).invoke(null);

          for (PasteWrapper w : wrappers) {
            addWrapper(w);
          }
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }
  }
}
