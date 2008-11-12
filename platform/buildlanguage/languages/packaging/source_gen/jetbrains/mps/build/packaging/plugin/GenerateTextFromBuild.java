package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;

import java.io.File;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.build.packaging.behavior.ILayoutComponent_Behavior;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.generationTypes.GenerateModelGenerationType;
import jetbrains.mps.generator.GenerationStatus;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.messages.IMessageHandler;

import java.util.List;

import jetbrains.mps.util.FileUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.generator.generationTypes.TextGenerationUtil;
import jetbrains.mps.generator.fileGenerator.IFileGenerator;

import java.io.IOException;

import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GenerateTextFromBuild {
  private static Logger LOG = Logger.getLogger(GenerateTextFromBuild.class);

  public GenerateTextFromBuild() {
  }

  public static File generate(final SNode mpsLayout, SModelDescriptor descriptor, IOperationContext context, MPSProject project) {
    final String basedir = ModelAccess.instance().runReadAction(new Computable<String>() {

      public String compute() {
        return ILayoutComponent_Behavior.call_getPath_1213877230696(mpsLayout);
      }

    });
    // generate files
    final GeneratorManager generatorManager = project.getComponentSafe(GeneratorManager.class);
    final File[] layoutFile = new File[1];
    GenerateModelGenerationType generationType = new GenerateModelGenerationType() {

      @Override()
      public boolean handleOutput(GenerationStatus status, String outputDir, IOperationContext ocontext, ProgressIndicator monitor, IMessageHandler messages) {
        List<SNode> roots = status.getOutputModel().getRoots();
        File tmpDir = FileUtil.createTmpDir();
        List<File> generatedFiles = ListSequence.<File>fromArray();
        // generate files
        for (SNode output : Sequence.fromIterable(roots)) {
          TextGenerationUtil.TextGenerationResult result = TextGenerationUtil.generateText(ocontext, output);
          GenerateTextFromBuild.LOG.assertLog(!(result.hasErrors()), "Could not generate build files");
          SNode input = status.getTraceMap().getOriginalInputNode(output);
          IFileGenerator fileGenerator = generatorManager.chooseFileGenerator(output, input);
          try {
            File generatedFile = fileGenerator.generateFile(output, input, status.getInputModel(), result.getText(), tmpDir);
            ListSequence.fromList(generatedFiles).addElement(generatedFile);
          } catch (IOException e) {
            GenerateTextFromBuild.LOG.error("Could not generate build files.", e);
          }
        }
        // move to basedir
        for (File file : Sequence.fromIterable(generatedFiles)) {
          File target = new File(basedir + File.separator + file.getName());
          FileUtil.copyFile(file, target);
          if (file.getName().equals(SPropertyOperations.getString(mpsLayout, "name") + "-" + ListSequence.fromList(SLinkOperations.getTargets(mpsLayout, "configuration", true)).first() + ".xml")) {
            layoutFile[0] = target;
          }
        }
        tmpDir.delete();
        return true;
      }

    };
    generatorManager.generateModelsWithProgressWindow(ListSequence.<SModelDescriptor>fromArray(descriptor), context, generationType, true);
    return layoutFile[0];
  }

  public static SNode getLayout(SModelDescriptor descriptor) {
    final List<SNode> roots = descriptor.getSModel().getRoots();
    final Wrappers._T<SNode> layout = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        for (SNode root : Sequence.fromIterable(roots)) {
          if (SNodeOperations.isInstanceOf(root, "jetbrains.mps.build.packaging.structure.MPSLayout")) {
            layout.value = (SNode) root;
            return;
          }
        }
      }

    });
    return layout.value;
  }

}
