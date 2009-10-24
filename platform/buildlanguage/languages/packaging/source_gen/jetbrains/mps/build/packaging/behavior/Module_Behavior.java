package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import java.util.List;
import jetbrains.mps.generator.fileGenerator.BaseModelCache;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.generator.fileGenerator.AllCaches;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
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

  public static List<String> call_getCachesDirs_8196794507570019546(SNode thisNode) {
    List<BaseModelCache> caches = ListSequence.fromListWithValues(new ArrayList<BaseModelCache>(), AllCaches.getInstance().getCaches());
    Set<String> result = SetSequence.fromSet(new LinkedHashSet<String>());
    for (BaseModelCache cache : caches) {
      List<IFile> dirs = cache.getCachesDirs(Module_Behavior.call_getModule_1213877515148(thisNode));
      for (IFile cacheDir : dirs) {
        SetSequence.fromSet(result).addElement(ModuleUtil.getRelativePath(cacheDir.getPath(), AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getPath()));
      }
    }
    return SetSequence.fromSet(result).toListSequence();
  }

  public static String call_findMPSProjectFile_1213877514840(SNode thisNode, File file) {
    if (AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getAbsolutePath().startsWith(file.getAbsolutePath()) && !(AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getAbsolutePath().equals(file.getAbsolutePath()))) {
      return null;
    }
    File[] children = file.listFiles();
    if (children == null) {
      return null;
    }
    for (File child : children) {
      if (!(child.isDirectory()) && (child.getAbsolutePath().endsWith(MPSExtentions.DOT_MPS_PROJECT))) {
        return child.getParent();
      }
    }
    return Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, file.getParentFile());
  }

  public static String call_getProjectBasedir_1213877514893(SNode thisNode) {
    return Module_Behavior.call_findMPSProjectFile_1213877514840(thisNode, Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile().getParent().toFile());
  }

  public static String call_getChildrenTargetDir_1213877514970(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      return IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) + File.separator + Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
    }
    return Module_Behavior.call_getTemporalDir_1213877514765(thisNode);
  }

  public static SNode call_getPathHolder_1239195000114(SNode thisNode, String path) {
    SNode pathHolder = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathHolder", null);
    SPropertyOperations.set(pathHolder, "fullPath", ModuleUtil.getRelativePath(path, AbstractProjectComponent_Behavior.call_getHomePath_1213877333764(thisNode).getPath()));
    if (SPropertyOperations.getString(pathHolder, "fullPath").equals(path)) {
      ModuleUtil.findMacro(pathHolder, SLinkOperations.getTargets(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.MPSLayout", true, true), "macro", true));
    }
    SLinkOperations.setTarget(pathHolder, "module", thisNode, false);
    return pathHolder;
  }

  public static List<SNode> call_getPathHolders_1213877515000(SNode thisNode, List<String> classpath, boolean onlyUnderProjectBasedir) {
    List<SNode> result = new ArrayList<SNode>();
    String projectBasedir = "";
    // search for project if needed
    if (onlyUnderProjectBasedir) {
      projectBasedir = Module_Behavior.call_getProjectBasedir_1213877514893(thisNode);
      if (projectBasedir == null) {
        projectBasedir = Module_Behavior.call_getModule_1213877515148(thisNode).getDescriptorFile().getParent().getAbsolutePath();
      }
    }
    // process classpath
    for (String cp : ListSequence.fromList(classpath)) {
      if (!(onlyUnderProjectBasedir) || cp.startsWith(projectBasedir)) {
        ListSequence.fromList(result).addElement(Module_Behavior.call_getPathHolder_1239195000114(thisNode, cp));
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
    return new ArrayList<SNode>();
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
    List<String> list = ListSequence.fromList(new ArrayList<String>());
    for (Language language : ListSequence.fromList(GlobalScope.getInstance().getVisibleLanguages())) {
      ListSequence.fromList(list).addElement(language.getModuleReference().getModuleFqName());
    }
    for (DevKit devKit : ListSequence.fromList(GlobalScope.getInstance().getVisibleDevkits())) {
      ListSequence.fromList(list).addElement(devKit.getModuleReference().getModuleFqName());
    }
    for (Solution solution : ListSequence.fromList(GlobalScope.getInstance().getVisibleSolutions())) {
      ListSequence.fromList(list).addElement(solution.getModuleReference().getModuleFqName());
    }
    return list;
  }

  public static List<IModule> getAllAvailableModules_1222444746697() {
    List<IModule> list = ListSequence.fromList(new ArrayList<IModule>());
    for (Language language : ListSequence.fromList(GlobalScope.getInstance().getVisibleLanguages())) {
      ListSequence.fromList(list).addElement(language);
    }
    for (DevKit devKit : ListSequence.fromList(GlobalScope.getInstance().getVisibleDevkits())) {
      ListSequence.fromList(list).addElement(devKit);
    }
    for (Solution solution : ListSequence.fromList(GlobalScope.getInstance().getVisibleSolutions())) {
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
