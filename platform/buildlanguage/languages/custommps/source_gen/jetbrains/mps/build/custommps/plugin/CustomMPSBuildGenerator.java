/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.build.packaging.plugin.BuildGeneratorImpl;
import com.intellij.openapi.project.Project;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.structure.modules.ModuleReference;
import com.intellij.openapi.application.ApplicationManager;
import java.util.List;
import jetbrains.mps.build.packaging.plugin.NodeData;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.Macros;
import java.io.File;
import jetbrains.mps.build.packaging.plugin.PackagingLanguageGenerator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;

public class CustomMPSBuildGenerator extends BuildGeneratorImpl {

  private String myPathToBuildTools = "";

  public CustomMPSBuildGenerator(Project project) {
    super(project);
  }

  public void setPathToBuildTools(String path) {
    this.myPathToBuildTools = path;
  }

  public String getPathToBuildTools() {
    return this.myPathToBuildTools;
  }

  public boolean isValid() {
    return super.isValid() && StringUtils.isNotEmpty(this.myPathToBuildTools);
  }

  public SModelDescriptor getSModelDescriptor(ProgressIndicator indicator) {
    final SModelDescriptor descriptor = super.getSModelDescriptor(indicator);
    final Language custommpsLanguage = MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.build.custommps");
    ModelAccess.instance().runWriteAction(new Runnable() {

      public void run() {
        ModuleReference moduleReference = custommpsLanguage.getModuleReference();
        descriptor.getModule().addUsedLangauge(moduleReference);
      }
    });
    ApplicationManager.getApplication().invokeLater(new Runnable() {

      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            ModuleReference moduleReference = custommpsLanguage.getModuleReference();
            descriptor.getSModel().addLanguage(moduleReference);
          }
        });
      }
    });
    return descriptor;
  }

  public void generate(SModelDescriptor targetModelDescriptor, String name, String basedir, List<NodeData> selectedData) {
    SNode mpsLayout = this.createMPSLayout(targetModelDescriptor, name, basedir, selectedData);
    // 
    SNode zipNode = SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(mpsLayout, "component", true)).first(), "jetbrains.mps.build.packaging.structure.Zip");
    SNode rootFolder = SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(zipNode, "entry", true)).first(), "jetbrains.mps.build.packaging.structure.Folder");
    List<SNode> entries = SLinkOperations.getTargets(rootFolder, "entry", true);
    SNode mpsBuild = SConceptOperations.createNewNode("jetbrains.mps.build.custommps.structure.MPSBuild", null);
    SLinkOperations.addChild(mpsLayout, "component", mpsBuild);
    // 
    SNode libraryFolder = createLibraryFolder(rootFolder);
    for(SNode entry : ListSequence.fromList(entries)) {
      if (SNodeOperations.isInstanceOf(entry, "jetbrains.mps.build.packaging.structure.Module")) {
        SLinkOperations.addChild(libraryFolder, "entry", entry);
      } else if (SNodeOperations.isInstanceOf(entry, "jetbrains.mps.build.packaging.structure.Folder")) {
        SNode oldFolder = SNodeOperations.cast(entry, "jetbrains.mps.build.packaging.structure.Folder");
        SNode newFolder = createLibraryFolder(oldFolder);
        SLinkOperations.addAll(newFolder, "entry", SLinkOperations.getTargets(oldFolder, "entry", true));
        SLinkOperations.addChild(mpsBuild, "entry", newFolder);
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(libraryFolder, "entry", true)).isNotEmpty()) {
      SLinkOperations.addChild(mpsBuild, "entry", libraryFolder);
    }
    SNodeOperations.deleteNode(zipNode);
    //  setting buildtools.zip path
    SNode buildToolsPath = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Path", null);
    String result = Macros.mpsHomeMacros().shrinkPath(this.myPathToBuildTools, new File("")).replace("\\", File.separator);
    int index = result.lastIndexOf("}");
    if (index > -1) {
      String macro = result.substring(result.indexOf("{") + 1, index);
      PackagingLanguageGenerator.createPath(buildToolsPath, macro, result.substring(index + 2));
    } else
    {
      PackagingLanguageGenerator.createPath(buildToolsPath, "", this.myPathToBuildTools);
    }
    SLinkOperations.setTarget(mpsBuild, "pathToBuildToolsZip", buildToolsPath, true);
    SPropertyOperations.set(mpsLayout, "scriptsFolder", "build");
    this.finishGeneration(targetModelDescriptor, mpsLayout);
  }


  public static SNode createLibraryFolder(SNode prototypeFolder) {
    SNode libraryFolder = SConceptOperations.createNewNode("jetbrains.mps.build.custommps.structure.LibraryFolder", null);
    SLinkOperations.setTarget(libraryFolder, "sourcePath", SLinkOperations.getTarget(prototypeFolder, "sourcePath", true), true);
    SLinkOperations.setTarget(libraryFolder, "title", SLinkOperations.getTarget(prototypeFolder, "title", true), true);
    SLinkOperations.setTarget(libraryFolder, "libraryName", PackagingLanguageGenerator.createSimpleString(IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(libraryFolder, "title", true)).toLowerCase()), true);
    return libraryFolder;
  }

}
