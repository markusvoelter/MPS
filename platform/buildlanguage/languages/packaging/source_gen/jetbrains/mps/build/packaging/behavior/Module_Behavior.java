package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import jetbrains.mps.vfs.MPSExtentions;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.Solution;

public class Module_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getTemporalDir_1213877514765(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + ".tmp";
  }

  public static boolean call_isCompiledInMPS_1213877514774(SNode thisNode) {
    return Module_Behavior.call_getModule_1213877515148(thisNode).isCompileInMPS();
  }

  public static String call_getModuleDir_1213877514783(SNode thisNode) {
    return Module_Behavior.call_getChildrenTargetDir_1213877514970(thisNode) + File.separator + AbstractModule.MODULE_DIR;
  }

  public static String call_getBasedir_1213877514794(SNode thisNode) {
    IFile descriptor = Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile();
    String str = Module_Behavior.call_getMacros_1213877515158(thisNode).expandPath(Macros.getMacroString(Module_Behavior.call_getModule_1213877515148(thisNode)), descriptor);
    return ModuleUtil.getRelativePath(str, AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getPath());
  }

  public static String call_findMPSProjectFile_1213877514840(SNode thisNode, File file) {
    if (AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getAbsolutePath().startsWith(file.getAbsolutePath()) && !(AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getAbsolutePath().equals(file.getAbsolutePath()))) {
      return null;
    }
    File[] children = file.listFiles();
    if (children == null) {
      return null;
    }
    for(File child : children) {
      if (!(child.isDirectory()) && (child.getAbsolutePath().endsWith(MPSExtentions.DOT_MPS_PROJECT))) {
        return child.getParent();
      }
    }
    return Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, file.getParentFile());
  }

  public static String call_getProjectBasedir_1213877514893(SNode thisNode) {
    String homePath = AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getPath();
    if (homePath.endsWith(File.separator)) {
      homePath = homePath.substring(0, homePath.length() - 1);
    }
    String basedir = (StringUtils.isEmpty(homePath) ?
      "" :
      (homePath + File.separator)
    ) + Module_Behavior.call_getBasedir_1213877514794(thisNode);
    File f = new File(basedir);
    String result = Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, f);
    if (result == null) {
      return result;
    }
    if (result.equals(homePath)) {
      return "";
    }
    if (homePath.equals("")) {
      return result;
    }
    return result.substring(homePath.length() + 1);
  }

  public static String call_getChildrenTargetDir_1213877514970(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      return IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(((SNode)SNodeOperations.getParent(thisNode))) + File.separator + Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
    }
    return Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
  }

  public static List<SNode> call_getPathHolders_1213877515000(SNode thisNode, List<String> classpath, boolean onlyUnderProjectBasedir) {
    List<SNode> result = ListOperations.<SNode>createList();
    String projectBasedir = "";
    // search for project if needed
    if (onlyUnderProjectBasedir) {
      projectBasedir = Module_Behavior.call_getProjectBasedir_1213877514893(thisNode);
      if (projectBasedir == null) {
        projectBasedir = Module_Behavior.call_getBasedir_1213877514794(thisNode);
      }
      projectBasedir = AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode) + File.separator + projectBasedir;
    }
    // process classpath
    for(String cp : ListSequence.fromList(classpath)) {
      if (!(onlyUnderProjectBasedir) || cp.startsWith(projectBasedir)) {
        SNode nodeCP = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathHolder", null);
        SPropertyOperations.set(nodeCP, "fullPath", ModuleUtil.getRelativePath(cp, AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getPath()));
        if (SPropertyOperations.getString(nodeCP, "fullPath").equals(cp)) {
          ModuleUtil.findMacro(nodeCP, SLinkOperations.getTargets(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.MPSLayout", true, true), "macro", true));
        }
        SLinkOperations.setTarget(nodeCP, "module", thisNode, false);
        ListSequence.fromList(result).addElement(nodeCP);
      }
    }
    return result;
  }

  public static List<SNode> call_getClassPath_1213877515083(SNode thisNode) {
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, ((AbstractModule)Module_Behavior.call_getModule_1213877515148(thisNode)).getClassPath(), true);
  }

  public static List<SNode> call_getRuntimeClassPath_1213877515098(SNode thisNode) {
    IModule module = Module_Behavior.call_getModule_1213877515148(thisNode);
    if (module instanceof Language) {
      return ListSequence.fromList(Module_Behavior.call_getPathHolders_1213877515000(thisNode, ((Language)module).getLanguageRuntimeClassPathItems(), true)).subtract(ListSequence.fromList(Module_Behavior.call_getClassPath_1213877515083(thisNode))).toListSequence();
    }
    return ListOperations.<SNode>createList();
  }

  public static String call_getRuntimeJarPath_1213877515126(SNode thisNode) {
    return AbstractProjectComponent_Behavior.call_getPath_1213877333777(thisNode) + "." + AbstractModule.RUNTIME_JAR_SUFFIX;
  }

  public static String call_getModuleJarPath_1213877515137(SNode thisNode) {
    return AbstractProjectComponent_Behavior.call_getPath_1213877333777(thisNode) + "." + AbstractModule.PACKAGE_SUFFIX;
  }

  public static IModule call_getModule_1213877515148(SNode thisNode) {
    return MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(SPropertyOperations.getString(thisNode, "id")));
  }

  public static Macros call_getMacros_1213877515158(SNode thisNode) {
    return Macros.moduleDescriptor(Module_Behavior.call_getModule_1213877515148(thisNode));
  }

  public static String call_getClassesGen_1216909316753(SNode thisNode) {
    return ModuleUtil.getRelativePath(Module_Behavior.call_getModule_1213877515148(thisNode).getClassesGen().getAbsolutePath(), AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getAbsolutePath());
  }

  public static List<SNode> call_getSources_1216909568805(SNode thisNode) {
    return Module_Behavior.call_getPathHolders_1213877515000(thisNode, Module_Behavior.call_getModule_1213877515148(thisNode).getSourcePaths(), false);
  }

  public static List<String> getAllAvailableModules_1222444513017() {
    List<String> list = ListSequence.<String>fromArray();
    for(Language language : ListSequence.fromList(GlobalScope.getInstance().getVisibleLanguages())) {
      ListSequence.fromList(list).addElement(language.getModuleReference().getModuleFqName());
    }
    for(DevKit devKit : ListSequence.fromList(GlobalScope.getInstance().getVisibleDevkits())) {
      ListSequence.fromList(list).addElement(devKit.getModuleReference().getModuleFqName());
    }
    for(Solution solution : ListSequence.fromList(GlobalScope.getInstance().getVisibleSolutions())) {
      ListSequence.fromList(list).addElement(solution.getModuleReference().getModuleFqName());
    }
    return list;
  }

  public static List<IModule> getAllAvailableModules_1222444746697() {
    List<IModule> list = ListSequence.<IModule>fromArray();
    for(Language language : ListSequence.fromList(GlobalScope.getInstance().getVisibleLanguages())) {
      ListSequence.fromList(list).addElement(language);
    }
    for(DevKit devKit : ListSequence.fromList(GlobalScope.getInstance().getVisibleDevkits())) {
      ListSequence.fromList(list).addElement(devKit);
    }
    for(Solution solution : ListSequence.fromList(GlobalScope.getInstance().getVisibleSolutions())) {
      ListSequence.fromList(list).addElement(solution);
    }
    return list;
  }

  public static String extractModuleProperName_1235487584035(IModule module) {
    if (module instanceof Solution) {
      Solution solution = (Solution)module;
      if (!(solution.isExternallyVisible())) {
        return Module_Behavior.replaceBadCharacters_1235487831795(solution.getSolutionDescriptor().getNamespace());
      }
    }
    return Module_Behavior.replaceBadCharacters_1235487831795(module.getModuleFqName());
  }

  public static String replaceBadCharacters_1235487831795(String name) {
    return name.replace("/", "_").replace("\\", "_");
  }

}
