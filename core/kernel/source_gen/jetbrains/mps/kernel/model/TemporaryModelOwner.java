package jetbrains.mps.kernel.model;

/*Generated by MPS */

import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.MPSModuleOwner;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.GlobalScope;

public class TemporaryModelOwner extends AbstractModule {
  public TemporaryModelOwner() {
    setModuleReference(ModuleReference.fromString("TemporaryModelOwner #" + System.identityHashCode(this)));
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        MPSModuleRepository.getInstance().addModule(TemporaryModelOwner.this, new MPSModuleOwner() {});
      }
    });
  }

  public void unregisterModelOwner() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        MPSModuleRepository.getInstance().removeModule(TemporaryModelOwner.this);
      }
    });
  }

  public void save() {
  }

  public String getTestsGeneratorOutputPath() {
    return null;
  }

  public String getGeneratorOutputPath() {
    return null;
  }

  public List<ModuleReference> getUsedLanguagesReferences() {
    List<ModuleReference> result = new ArrayList<ModuleReference>();
    for (SModelDescriptor md : getOwnModelDescriptors()) {
      result.addAll(md.getSModel().importedLanguages());
    }
    return result;
  }

  public List<ModuleReference> getUsedDevkitReferences() {
    List<ModuleReference> result = new ArrayList<ModuleReference>();
    for (SModelDescriptor md : getOwnModelDescriptors()) {
      result.addAll(md.getSModel().importedDevkits());
    }
    return result;
  }

  public List<Dependency> getDependOn() {
    List<Dependency> result = new ArrayList<Dependency>();
    for (SModelDescriptor md : getOwnModelDescriptors()) {
      for (SModel.ImportElement ie : md.getSModel().importedModels()) {
        SModelReference mRef = ie.getModelReference();
        SModelDescriptor model = SModelRepository.getInstance().getModelDescriptor(mRef);
        if (model == null) {
          continue;
        }
        IModule module = model.getModule();
        if (module == null) {
          continue;
        }
        Dependency dep = new Dependency();
        dep.setModuleRef(module.getModuleReference());
        result.add(dep);
      }
    }
    return result;
  }

  public void setModuleDescriptor(ModuleDescriptor descriptor, boolean b) {
    throw new UnsupportedOperationException();
  }

  public ModuleDescriptor getModuleDescriptor() {
    return null;
  }

  @NotNull
  @Override
  public IScope getScope() {
    return GlobalScope.getInstance();
  }
}
