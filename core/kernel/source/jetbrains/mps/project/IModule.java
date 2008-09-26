package jetbrains.mps.project;

import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.*;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.runtime.BytecodeLocator;

import java.io.File;
import java.util.List;
import java.util.Set;

public interface IModule extends ModelOwner, MPSModuleOwner {
  @Deprecated
  String getModuleUID();

  ModuleReference getModuleReference();
  ModuleId getModuleId();
  String getModuleFqName();

  List<SModelDescriptor> getOwnModelDescriptors();

  List<SModelRoot> getSModelRoots();
  SModelRoot findModelRoot(String path);

  List<Dependency> getDependOn();
  List<IModule> getDependOnModules();
  List<IModule> getAllDependOnModules();

  List<ModuleReference> getUsedLanguagesReferences();
  List<Language> getUsedLanguages();
  List<Language> getAllUsedLanguages();

  List<ModuleReference> getUsedDevkitReferences();
  List<DevKit> getUsedDevkits();

  List<IModule> getExplicitlyDependOnModules();
  List<IModule> getExplicitlyDependOnModules(boolean includeBootstrap);

  List<IModule> getDesignTimeDependOnModules();

  void addDependency(ModuleReference moduleRef, boolean reexport);
  void addUsedLangauge(ModuleReference langRef);
  void addUsedDevkit(ModuleReference devkitRef);

  SModelDescriptor createModel(SModelFqName fqName, SModelRoot root);

  Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm);
  Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm);
  <T extends IModule> Set<T> getAllDependOnModules(Class<T> cls);

  IFile getDescriptorFile();

  ModuleDescriptor getModuleDescriptor();
  void setModuleDescriptor(ModuleDescriptor moduleDescriptor);

  String getGeneratorOutputPath();
  IFile getClassesGen();
  File getBundleHome();

  IScope getScope();

  List<String> getSourcePaths();
  Class getClass(String fqName);

  IClassPathItem getClassPathItem();
  IClassPathItem getModuleWithDependenciesClassPathItem();

  BytecodeLocator getBytecodeLocator();

  boolean isCompileInMPS();
  boolean reloadClassesAfterGeneration();

  void invalidateCaches();
  void updateClassPath();
  void save();
  void onModuleLoad();
  boolean isPackaged();

  void dispose();

  boolean isValid();
  List<String> validate();

  void reloadFromDisk();

  boolean needReloading();
}
