package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.SModelFqName;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import java.io.File;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.project.IModule;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.persistence.SolutionDescriptorPersistence;
import jetbrains.mps.project.structure.modules.ModuleReference;

public class BuildGeneratorUtil {
  public BuildGeneratorUtil() {
  }

  public static SModelDescriptor createModel(String modelName, final Solution solution) {
    final SModelFqName newModelFQName = SModelFqName.fromString(modelName);
    List<SModelDescriptor> ownModelDescriptors = solution.getOwnModelDescriptors();
    final Wrappers._T<SModelDescriptor> modelDescriptor = new Wrappers._T<SModelDescriptor>(null);
    for (SModelDescriptor descriptor : ListSequence.fromList(ownModelDescriptors)) {
      if (descriptor.getSModelReference().getSModelFqName().equals(newModelFQName)) {
        modelDescriptor.value = descriptor;
        break;
      }
    }
    if (modelDescriptor.value == null) {
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          modelDescriptor.value = solution.createModel(newModelFQName, solution.getSModelRoots().get(0));
        }
      });
    }
    return modelDescriptor.value;
  }

  public static Solution createSolution(MPSProject mpsProject, String solutionName, String solutionBaseDir) {
    IFile baseDirFile = FileSystem.getInstance().getFileByPath(solutionBaseDir);
    if (!(baseDirFile.exists())) {
      baseDirFile.mkdirs();
    }
    String solutionFilePath = solutionBaseDir + File.separator + solutionName + MPSExtentions.DOT_SOLUTION;
    final IFile solutionFile = FileSystem.getInstance().getFileByPath(solutionFilePath);
    final Solution solution;
    if (solutionFile.exists()) {
      IModule module = ModelAccess.instance().runReadAction(new Computable<IModule>() {
        public IModule compute() {
          return MPSModuleRepository.getInstance().getModuleByFile(solutionFile);
        }
      });
      if (module instanceof Solution) {
        solution = (Solution) module;
      } else if (module == null) {
        solution = BuildGeneratorUtil.createSolutionFromFile(mpsProject, solutionFile);
      } else {
        return null;
      }
    } else {
      solution = BuildGeneratorUtil.createSolutionFromFile(mpsProject, solutionFile);
    }
    return solution;
  }

  public static Solution createSolutionFromFile(final MPSProject mpsProject, final IFile solutionDescriptorFile) {
    SolutionDescriptor descriptor = new SolutionDescriptor();
    descriptor.setCompileInMPS(true);
    String fileName = solutionDescriptorFile.getName();
    descriptor.setNamespace(fileName.substring(0, fileName.length() - 4));
    ModelRoot mr = new ModelRoot();
    mr.setPrefix("");
    mr.setPath(solutionDescriptorFile.getParent().getPath());
    descriptor.getModelRoots().add(mr);
    SolutionDescriptorPersistence.saveSolutionDescriptor(solutionDescriptorFile, descriptor);
    return ModelAccess.instance().runWriteAction(new Computable<Solution>() {
      public Solution compute() {
        return MPSModuleRepository.getInstance().registerModule(solutionDescriptorFile, mpsProject, Solution.class);
      }
    });
  }

  public static ModuleReference getPackagingLanguageReference() {
    return MPSModuleRepository.getInstance().getLanguage(ModuleReference.fromString("4e6c5313-7662-4c44-9bc7-b488cec17508")).getModuleReference();
  }
}
