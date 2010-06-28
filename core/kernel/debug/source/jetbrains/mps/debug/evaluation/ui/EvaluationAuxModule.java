package jetbrains.mps.debug.evaluation.ui;

import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.baseLanguage.structure.BaseLanguage_Language;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.UUID;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.stubs.StubReloadManager;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;

public class EvaluationAuxModule extends AbstractModule {
  private static final ModelRootManager STUBS_MANAGER = new ModelRootManager(BaseLanguage_Language.MODULE_REFERENCE.getModuleId().toString(), AllMembersJavaStubs.class.getName());

  private Project myProject;
  private IModule myInvocationContext;
  private final List<AbstractModule.StubPath> myStubPaths = ListSequence.fromList(new ArrayList<AbstractModule.StubPath>());

  public EvaluationAuxModule(Project project) {
    this.myProject = project;
    ModuleReference reference = ModuleReference.fromString(UUID.randomUUID() + "(Debug Evaluation Aux Module)");
    this.setModulePointer(reference);
    this.init();
  }

  public void init() {
    MPSModuleRepository.getInstance().addModule(EvaluationAuxModule.this, this.getMPSProject());
  }

  public void dispose() {
    super.dispose();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        EvaluationAuxModule.this.clearAll();
        MPSModuleRepository.getInstance().removeModule(EvaluationAuxModule.this);
        if (ListSequence.fromList(myStubPaths).isNotEmpty()) {
          ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
            public void run() {
              ModelAccess.instance().runWriteAction(new Runnable() {
                public void run() {
                  StubReloadManager.getInstance().reload();
                }
              });
            }
          });
        }
      }
    });
  }

  public MPSProject getMPSProject() {
    return this.myProject.getComponent(MPSProject.class);
  }

  public void setInvocationContext(IModule invocationContext) {
    this.myInvocationContext = invocationContext;
  }

  public Class getClass(String fqName) {
    if (this.myInvocationContext == null) {
      throw new IllegalStateException();
    }
    return this.myInvocationContext.getClass(fqName);
  }

  @NotNull
  public IScope getScope() {
    return GlobalScope.getInstance();
  }

  public ModuleDescriptor getModuleDescriptor() {
    return null;
  }

  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor, boolean reloadClasses) {
    throw new UnsupportedOperationException();
  }

  public String getGeneratorOutputPath() {
    return null;
  }

  public String getTestsGeneratorOutputPath() {
    return null;
  }

  public void save() {
  }

  @Override
  public List<AbstractModule.StubPath> getStubPaths() {
    return myStubPaths;
  }

  public void addStubPath(String stubPath) {
    ListSequence.fromList(myStubPaths).addElement(new AbstractModule.StubPath(stubPath, STUBS_MANAGER));
  }

  public void clearAll() {
    // model is already disposed by EmbeddableEditor 
    // <node> 
    // <node> 
    this.invalidateCaches();
    this.setInvocationContext(null);
  }

  @NotNull
  public String toString() {
    return "Debug Evaluation Aux Module";
  }
}
