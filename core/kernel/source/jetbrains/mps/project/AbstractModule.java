package jetbrains.mps.project;

import jetbrains.mps.javastub.classpath.ClassPathModelRootManager;
import jetbrains.mps.ide.BootstrapLanguagesManager;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.projectLanguage.structure.*;
import jetbrains.mps.reloading.*;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.persistence.ModelRootsUtil;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.JarFileEntryFile;

import java.io.File;
import java.util.*;

public abstract class AbstractModule implements IModule {
  private static final Logger LOG = Logger.getLogger(AbstractModule.class);

  public static IClassPathItem getDependenciesClasspath(Set<IModule> modules) {
    return getDependenciesClasspath(modules, true, true);
  }

  public static IClassPathItem getDependenciesClasspath(Set<IModule> modules, boolean includeJDK, boolean includeMPS) {
    return new ClasspathCollector(modules).collect(includeJDK, includeMPS);
  }
  
  private boolean myModelsRead = false;
  private boolean myInitialized = false;
  protected IFile myDescriptorFile;

  private ModuleScope myScope = new ModuleScope();

  private IClassPathItem myClassPath;
  private Map<String, Class> myClassesCache = new HashMap<String, Class>();


  protected void reload() {
    MPSModuleRepository.getInstance().unRegisterModules(this);
    SModelRepository.getInstance().unRegisterModelDescriptors(this);
    rereadModels();

    updateClassPath();

    createManifest();
  }

  public void convert() {
    boolean save = false;

    Set<String> visited = new HashSet<String>();
    for (ClassPathEntry e : getModuleDescriptor().getClassPathEntrys()) {
      if (visited.contains(e.getPath())) {
        e.delete();
        save = true;
      }

      visited.add(e.getPath());
    }

    if (save && !isPackaged()) {
      save();
    }
  }

  public boolean isPackaged() {
    return getDescriptorFile().isReadOnly();
  }

  public boolean isValid() {
    for (Dependency dep : getDependOn()) {
      String modelUID = dep.getModuleUID();
      if (MPSModuleRepository.getInstance().getModuleByUID(modelUID) == null) {
        return false;
      }
    }
    for (String usedLanguage : getUsedLanguagesNamespaces()) {
      if (MPSModuleRepository.getInstance().getModuleByUID(usedLanguage) == null) {
        return false;
      }
    }
    return true;
  }

  public void addDependency(String modelUID, boolean reexport) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    SModel model = descriptor.getModel();
    ModuleReference ref = ModuleReference.newInstance(model);
    ref.setName(modelUID);
    ref.setReexport(reexport);
    descriptor.addDependency(ref);
    setModuleDescriptor(descriptor);
    save();
  }

  public void addUsedLangauge(String languageNamespace) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    SModel model = descriptor.getModel();
    LanguageReference ref = LanguageReference.newInstance(model);
    ref.setName(languageNamespace);
    descriptor.addUsedLanguage(ref);
    setModuleDescriptor(descriptor);
    save();
  }

  public void addUsedDevkit(String devkit) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    SModel model = descriptor.getModel();
    DevKitReference ref = DevKitReference.newInstance(model);
    ref.setName(devkit);
    descriptor.addUsedDevKit(ref);
    setModuleDescriptor(descriptor);
    save();
  }

  public String getModuleUID() {
    return toString();
  }

  /**
   * @return all depend on
   */
  public <T extends IModule> Set<T> getAllDependOnModules(Class<T> cls) {
    Set<T> modules = new HashSet<T>();

    modules.addAll(new DependencyCollector(this, cls).collect());

    // add bootstrap languages
    if (Language.class.isAssignableFrom(cls)) {
      Set<Language> languages = BootstrapLanguagesManager.getInstance().getLanguages();
      for (Language language : languages) {
        //noinspection SuspiciousMethodCalls
        if (!modules.contains(language)) {
          modules.add((T) language);
          modules.addAll(new DependencyCollector(this, cls).collect());
        }
      }
    }

    return modules;
  }

  public List<SModelDescriptor> getOwnModelDescriptors() {
    List<SModelDescriptor> modelDescriptors = SModelRepository.getInstance().getModelDescriptors(this);
    return modelDescriptors;
  }

  public IFile getClassesGen() {
    if (getDescriptorFile() == null) {
      return null;
    }
    return getDescriptorFile().getParent().child("classes_gen");
  }

  public final List<ModelRoot> getModelRoots() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      return descriptor.getModelRoots();
    }
    return new ArrayList<ModelRoot>();
  }

  public List<Dependency> getDependOn() {
    List<Dependency> result = new ArrayList<Dependency>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (ModuleReference ref : descriptor.getDependencys()) {
        result.add(new Dependency(ref.getName(), ref.getReexport()));
      }
    }
    return result;
  }

  public final List<IModule> getExplicitlyDependOnModules() {
    return getExplicitlyDependOnModules(false);
  }

  public List<IModule> getExplicitlyDependOnModules(boolean includeBootstrap) {
    LinkedList<IModule> result = new LinkedList<IModule>();
    result.addAll(getDependOnModules());
    for (Language usedLanguage : getUsedLanguages()) {
      if (!result.contains(usedLanguage)) {
        result.add(usedLanguage);
      }
    }

    for (DevKit dk : getUsedDevkits()) {
      if (!result.contains(dk)) {
        result.add(dk);
      }
    }

    if (includeBootstrap) {
      return appendBootstrapLanguages(result);
    }
    return result;
  }

  public List<IModule> getDependOnModules() {
    List<IModule> result = new ArrayList<IModule>();
    for (Dependency dep : getDependOn()) {
      IModule m = MPSModuleRepository.getInstance().getModuleByUID(dep.getModuleUID());
      if (m != null) {
        result.add(m);
      } else {
        LOG.error("Can't load module " + dep.getModuleUID() + " from " + this);
      }
    }
    return result;
  }

  public List<String> getUsedLanguagesNamespaces() {
    List<String> result = new ArrayList<String>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (LanguageReference lr : descriptor.getUsedLanguages()) {
        result.add(lr.getName());
      }
    }
    return result;
  }

  public List<Language> getUsedLanguages() {
    List<Language> result = new ArrayList<Language>();
    for (String namespace : getUsedLanguagesNamespaces()) {
      Language l = MPSModuleRepository.getInstance().getLanguage(namespace);
      if (l != null) {
        result.add(l);
      } else {
        LOG.error("Can't load language " + l + " from " + this);
      }
    }
    
    result.add(BootstrapLanguagesManager.getInstance().getBaseLanguage());
    result.add(BootstrapLanguagesManager.getInstance().getProjectLanguage());
    result.add(BootstrapLanguagesManager.getInstance().getCollectionsLanguage());
    return result;
  }

  public List<String> getUsedDevKitNamespaces() {
    List<String> result = new ArrayList<String>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (DevKitReference dr : descriptor.getUsedDevKits()) {
        result.add(dr.getName());
      }
    }
    return result;
  }

  public List<DevKit> getUsedDevkits() {
    List<DevKit> result = new ArrayList<DevKit>();

    for (String namespace : getUsedDevKitNamespaces()) {
      DevKit dk = MPSModuleRepository.getInstance().getDevKit(namespace);
      if (dk != null) {
        result.add(dk);
      } else {
        LOG.error("Can't load devkit " + dk + " from " + this);
      }
    }

    return result;
  }

  protected static List<IModule> appendBootstrapLanguages(List<IModule> list) {
    Set<Language> languages = BootstrapLanguagesManager.getInstance().getLanguages();
    for (Language language : languages) {
      if (!list.contains(language)) {
        list.add(language);
      }
    }
    return list;
  }

  public SModelDescriptor createModel(SModelUID uid, ModelRoot root) {
    IModelRootManager manager = ModelRootsUtil.getManagerFor(root);

    if (!manager.isNewModelsSupported()) {
      LOG.error("Trying to create model root manager in root which doesn't support new models");
    }

    SModelDescriptor result = manager.createNewModel(root, uid, this);
    result.save();
    return result;
  }

  public Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm) {
    return new LinkedHashSet<SModelDescriptor>();
  }

  public Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm) {
    return new LinkedHashSet<Language>();
  }

  public IFile getDescriptorFile() {
    return myDescriptorFile;
  }

  public IScope getScope() {
    return myScope;
  }


  protected void readModels() {
    if (!myModelsRead) {
      myModelsRead = true;
      for (ModelRoot modelRoot : getModelRoots()) {
        try {
          IModelRootManager manager = ModelRootsUtil.getManagerFor(modelRoot);
          manager.read(modelRoot, this);
        } catch (Exception e) {
          LOG.error("Error loading models from root: prefix: \"" + modelRoot.getPrefix() + "\" path: \"" + modelRoot.getPath() + "\". Requested by: " + this, e);
        }
      }

      myInitialized = true;
    }
  }

  public List<String> getClassPath() {
    ArrayList<String> result = new ArrayList<String>();

    if (getClassesGen() != null && getClassesGen().exists()) {
      result.add(getClassesGen().getCanonicalPath());
    }
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (ClassPathEntry entry : descriptor.getClassPathEntrys()) {
        result.add(entry.getPath());
      }
    }

    return result;
  }

  public List<String> getSourcePaths() {
    List<String> result = new ArrayList<String>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (SourcePath p : descriptor.getSourcePaths()) {
        result.add(p.getPath());
      }
    }
    result.add(getGeneratorOutputPath());
    return result;
  }

  protected void rereadModels() {
    myModelsRead = false;
    myInitialized = false;
    readModels();
  }

  protected boolean isInitialized() {
    return myInitialized;
  }

  protected void fireModuleInitialized() {
    MPSModuleRepository.getInstance().fireModuleInitialized(this);
  }

  public IClassPathItem getClassPathItem() {
    return myClassPath;
  }

  public Class getClass(String fqName) {
    if (myClassesCache.containsKey(fqName)) {
      return myClassesCache.get(fqName);
    }

    Class result = ClassLoaderManager.getInstance().getClassFor(this, fqName);
    myClassesCache.put(fqName, result);
    return result;
  }

  public void updateClassPath() {
    updateClassPathItem();
    releaseJavaStubs();
    loadNewStubs();
  }

  private void updateClassPathItem() {
    CompositeClassPathItem result = new CompositeClassPathItem();
    for (String s : getClassPath()) {
      IFile file = FileSystem.getFile(s);
      if (!file.exists()) {
        LOG.error("Can't load class path item " + s + " in " + this);
      } else {
        IClassPathItem currentItem;
        if (file.isDirectory()) {
          currentItem = new FileClassPathItem(s);
        } else {
          currentItem = new JarFileClassPathItem(s);
        }

        result.add(currentItem);
      }
    }

    myClassPath = result;
  }

  private void releaseJavaStubs() {
    for (SModelDescriptor sm : SModelRepository.getInstance().getModelDescriptors(this)) {
      if (SModelStereotype.JAVA_STUB.equals(sm.getStereotype())) {
        SModelRepository.getInstance().removeModelDescriptor(sm);
      }
    }
  }

  private void loadNewStubs() {
    loadJavaStubModelRoots();

    ClassPathModelRootManager manager = new ClassPathModelRootManager() {
      protected IClassPathItem getClassPathItem() {
        return myClassPath;
      }
    };

    SModel sm = new SModel();
    sm.setLoading(true);

    ModelRoot mr = ModelRoot.newInstance(sm);
    mr.setPrefix("");

    manager.read(mr, this);
  }

  private void loadJavaStubModelRoots() {
    for (ModelRoot mr : getModelRoots()) {
      IModelRootManager m = ModelRootsUtil.getManagerFor(mr);
      if (m instanceof ClassPathModelRootManager) {
        m.read(mr, this);
      }
    }
  }


  public IClassPathItem getModuleWithDependenciesClassPathItem() {
    return getDependenciesClasspath(CollectionUtil.asSet((IModule) this), false, false);
  }

  protected IClassPathItem createClassPathItem(String s) {
    IFile f = FileSystem.getFile(s);
    IClassPathItem classPathItem = null;
    if (f.exists()) {
      if (f.isDirectory()) {
        classPathItem = new FileClassPathItem(s);
      } else {
        classPathItem = new JarFileClassPathItem(s);
      }
    }
    return classPathItem;
  }

  public File getBundleHome() {
    IFile descriptorFile = getDescriptorFile();

    if (descriptorFile != null) {
      if (descriptorFile instanceof JarFileEntryFile) {
        return ((JarFileEntryFile) descriptorFile).getJarFile();
      }

      return FileSystem.toFile(descriptorFile.getParent());
    }


    return null;
  }

  protected String generateManifest() {
    StringBuilder result = new StringBuilder();
    result.append("Manifest-Version: 1.0\n");
    result.append("Bundle-ManifestVersion: 2\n");
    result.append("Bundle-SymbolicName: ").append(getModuleUID()).append("\n");
    result.append("Eclipse-LazyStart: true\n");
    result.append("Require-Bundle: \n").append(getRequiredBundlesString());
    if (getClassPathString().length() > 0) {
      result.append("Bundle-Classpath: \n").append(getClassPathString());
    }
    String exportedPackages = getExportedPackagesString();
    if (exportedPackages.length() > 0) {
      result.append("Export-Package:\n").append(exportedPackages);
    }

    if (getDescriptorFile() != null) {
      result.append("MPS-Module-File:").append(getDescriptorFile().getName()).append("\n");
    }

    return result.toString();
  }

  public boolean isCompileInMPS() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    return descriptor != null && descriptor.getCompileInMPS();
  }

  public boolean reloadClassesAfterGeneration() {
    return true;
  }

  protected String getRequiredBundlesString() {
    StringBuilder result = new StringBuilder();

    Map<String, Boolean> requiredBundles = new LinkedHashMap<String, Boolean>();
    for (Dependency dep : getRequiredBundles()) {
      if (!requiredBundles.containsKey(dep.getModuleUID())) {
        requiredBundles.put(dep.getModuleUID(), dep.isREExport());
      } else {
        boolean oldValue = requiredBundles.get(dep.getModuleUID());
        requiredBundles.put(dep.getModuleUID(), dep.isREExport() || oldValue);
      }
    }

    List<String> bundleUids = new ArrayList<String>(requiredBundles.keySet());
    for (int i = 0; i < bundleUids.size(); i++) {
      String uid = bundleUids.get(i);
      boolean reexport = requiredBundles.get(uid);
      result.append("  ").append(uid);
      if (reexport) {
        result.append(";visibility:=reexport");
      }
      if (i != bundleUids.size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }

    return result.toString();
  }

  private List<Dependency> getRequiredBundles() {
    List<Dependency> result = new ArrayList<Dependency>();
    result.add(new Dependency("jetbrains.mps", false));

    for (String s : BootstrapLanguagesManager.getInstance().getLanguagesUIDsUsedInCore()) {
      result.add(new Dependency(s, false));
    }

    result.addAll(getDependOn());

    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      OSGiOptions osgiOptions = descriptor.getOsgiOptions();
      if (osgiOptions != null) {
        for (BundleReference br : osgiOptions.getRequiredBundles()) {
          result.add(new Dependency(br.getName(), false));
        }
      }
    }

    return result;
  }

  private String getClassPathString() {
    StringBuilder result = new StringBuilder();

    IFile descriptor = getDescriptorFile();
    if (descriptor == null) {
      return "";
    }

    String basePath = descriptor.getParent().getCanonicalPath();
    for (int i = 0; i < getClassPath().size(); i++) {
      String s = getClassPath().get(i);

      if (FileSystem.getFile(s).isDirectory()) {
        s += "/";
      }

      String relativePath = getPathRelativeTo(s, basePath);
      relativePath = relativePath.replace(File.separatorChar, '/');
      result.append("  ").append(relativePath);
      if (i != getClassPath().size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }
    return result.toString();
  }

  private String getExportedPackagesString() {
    StringBuilder result = new StringBuilder();
    List<String> exportedPackages = getExportedPackages();
    List<String> packs = exportedPackages;
    for (int i = 0; i < packs.size(); i++) {
      String s = exportedPackages.get(i);
      result.append("  ").append(s);
      if (i != packs.size() - 1) {
        result.append(",");
      }
      result.append("\n");
    }
    return result.toString();
  }

  protected List<String> getExportedPackages() {
    List<String> result = new ArrayList<String>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      OSGiOptions osgiOptions = descriptor.getOsgiOptions();
      if (osgiOptions != null) {
        for (PackageReference pr : osgiOptions.getExportedPackages()) {
          result.add(pr.getName());
        }
      }
    }
    return result;
  }

  private String getPathRelativeTo(String path, String base) {
    if (path.startsWith(base)) {
      return path.substring(base.length());
    }

    String relativeToParent = getPathRelativeTo(path, new File(base).getParent());

    if (relativeToParent.startsWith(File.separator)) {
      return ".." + relativeToParent;
    } else {
      return ".." + File.separator + relativeToParent;
    }
  }

  public void addModuleImport(final String moduleUID) {
    CommandProcessor.instance().executeCommand(new Runnable() {
      public void run() {
        ModuleDescriptor md = getModuleDescriptor();
        if (md == null) return;

        for (ModuleReference r : md.getDependencys()) {
          if (moduleUID.equals(r.getName())) {
            return;
          }
        }

        ModuleReference ref = ModuleReference.newInstance(md.getModel());
        ref.setName(moduleUID);
        md.addDependency(ref);

        setModuleDescriptor(md);
        save();
      }
    });
  }

  public void addUsedLanguage(final String languageNamespace) {
    CommandProcessor.instance().executeCommand(new Runnable() {
      public void run() {
        ModuleDescriptor md = getModuleDescriptor();
        if (md == null) return;

        for (LanguageReference r : md.getUsedLanguages()) {
          if (languageNamespace.equals(r.getName())) {
            return;
          }
        }

        LanguageReference ref = LanguageReference.newInstance(md.getModel());
        ref.setName(languageNamespace);
        md.addUsedLanguage(ref);

        setModuleDescriptor(md);
        save();
      }
    });
  }

  protected void createManifest() {
    String manifestContents = generateManifest();

    File bundleHome = getBundleHome();

    assert bundleHome != null;
    if (bundleHome.isFile()) { //i.e. packaged
      return;
    }

    File metaInfDir = new File(bundleHome, "META-INF");
    metaInfDir.mkdir();

    File manifest = new File(metaInfDir, "MANIFEST.MF");
    FileUtil.write(manifest, manifestContents);
  }

  public void invalidateCaches() {
    myScope.invalidateCaches();
    myClassesCache.clear();
  }

  public class ModuleScope extends BaseScope {
    public ModelOwner getModelOwner() {
      return AbstractModule.this;
    }

    protected Set<IModule> getInitialModules() {
      Set<IModule> result = new HashSet<IModule>();
      result.add(AbstractModule.this);
      return result;
    }

    protected Set<Language> getInitialUsedLanguages() {
      HashSet<Language> result = new HashSet<Language>(getUsedLanguages());

      if (AbstractModule.this instanceof Language) {
        result.add((Language) AbstractModule.this);
      }

      if (AbstractModule.this instanceof Generator) {
        result.add(((Generator) AbstractModule.this).getSourceLanguage());
      }

      return result;
    }

    public String toString() {
      return "Scope of module " + AbstractModule.this;
    }
  }
}
