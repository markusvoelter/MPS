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
package jetbrains.mps.workbench.actions.goTo.index;

import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.indexing.FileBasedIndex;
import com.intellij.util.indexing.ID;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.workbench.choose.base.BaseMPSChooseModel;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MPSChooseSNodeDescriptor extends BaseMPSChooseModel<SNodeDescriptor> {
  public BaseSNodeDescriptorIndex myIndex;

  public MPSChooseSNodeDescriptor(Project project, BaseSNodeDescriptorIndex index) {
    super(project, "node");
    myIndex = index;
  }

  public SNodeDescriptor[] find(final IScope scope) {
    final List<SNodeDescriptor> keys = new ArrayList<SNodeDescriptor>();

    final ID<Integer, List<SNodeDescriptor>> indexName = myIndex.getName();
    final ModelConstraintsManager cm = ModelConstraintsManager.getInstance();
    final FileBasedIndex fileBasedIndex = FileBasedIndex.getInstance();


    Set<SModelDescriptor> findDirectly = new HashSet<SModelDescriptor>();

    for (SModelDescriptor sm : scope.getModelDescriptors()) {
      if (!SModelStereotype.isUserModel(sm)) continue;

      if (sm.getLoadingState() == ModelLoadingState.FULLY_LOADED) {
        findDirectly.add(sm);
        continue;
      }

      if (!(sm instanceof EditableSModelDescriptor)) continue;
      EditableSModelDescriptor esm = (EditableSModelDescriptor) sm;
      IFile modelFile = esm.getModelFile();
      if (modelFile == null) continue;
      VirtualFile vf = modelFile.toVirtualFile();
      if (vf == null) continue; // e.g. model was deleted

      int fileId = FileBasedIndex.getFileId(vf);

      List<List<SNodeDescriptor>> descriptors = fileBasedIndex.getValues(indexName, fileId, GlobalSearchScope.fileScope(getProject(), vf));

      if (!descriptors.isEmpty()) {
        boolean needToLoad = false;
        for (SNodeDescriptor snd : descriptors.get(0)) {
          if (cm.hasGetter(snd.getConceptFqName(), INamedConcept.NAME)) {
            needToLoad = true;
            break;
          }
        }

        if (needToLoad) {
          findDirectly.add(sm);
        } else {
          keys.addAll(descriptors.get(0));
        }
      }
    }

    for (SModelDescriptor sm : findDirectly) {
      List<SNode> nodes = myIndex.getNodesToIterate(sm.getSModel());

      for (SNode root : nodes) {
        int number = nodes.indexOf(root);
        String nodeName = (root.getName() == null) ? "null" : root.getName();
        SNodeDescriptor nodeDescriptor = SNodeDescriptor.fromModelReference(
          nodeName, root.getConceptFqName(), root.getModel().getSModelReference(), number);
        keys.add(nodeDescriptor);
      }
    }

    addJavaStubs(keys, scope);

    return keys.toArray(new SNodeDescriptor[keys.size()]);
  }

  private void addJavaStubs(List<SNodeDescriptor> result, IScope scope) {
    for (IModule m : scope.getVisibleModules()) {
      result.addAll(StubsNodeDescriptorsCache.getInstance().getSNodeDescriptors(m));
    }
  }

  public NavigationItem doGetNavigationItem(final SNodeDescriptor object) {
    return new RootNodeElement(object) {
      private Project myProject = getProject();

      public void navigate(boolean requestFocus) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            SModelDescriptor descriptor = GlobalScope.getInstance().getModelDescriptor(object.getModelReference());
            SModel model = descriptor.getSModel();
            SNode node = object.getNode(model);
            myProject.getComponent(MPSEditorOpener.class).openNode(node);
          }
        });
      }
    };
  }

  public String doGetObjectName(SNodeDescriptor object) {
    return object.getNodeName();
  }

  public String doGetFullName(Object element) {
    SNodeDescriptorPresentation presentation = (SNodeDescriptorPresentation) ((NavigationItem) element).getPresentation();
    assert presentation != null;
    return presentation.getModelName() + "." + presentation.getPresentableText();
  }

  public String getCheckBoxName() {
    return "Include non-project models";
  }


}
