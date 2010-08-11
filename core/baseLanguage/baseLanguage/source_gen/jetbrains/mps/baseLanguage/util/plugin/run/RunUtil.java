package jetbrains.mps.baseLanguage.util.plugin.run;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.List;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.generator.ModelGenerationStatusManager;
import jetbrains.mps.generator.NoCachesStrategy;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.generator.generationTypes.JavaGenerationHandler;

public class RunUtil {
  public RunUtil() {
  }

  public static void makeBeforeRun(Project project, SNode... nodes) {
    makeBeforeRun(project, Sequence.fromIterable(Sequence.fromArray(nodes)).toListSequence());
  }

  public static void makeBeforeRun(final Project project, List<SNode> nodes) {
    GeneratorManager genManager = project.getComponent(GeneratorManager.class);
    final List<SModelDescriptor> models = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    for (final SNode node : nodes) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          SModelDescriptor md = SNodeOperations.getModel(node).getModelDescriptor();
          if (md instanceof EditableSModelDescriptor) {
            if (!(ListSequence.fromList(models).contains((EditableSModelDescriptor) md)) && ModelGenerationStatusManager.getInstance().generationRequired(md, project, NoCachesStrategy.createBuildCachesStrategy())) {
              ListSequence.fromList(models).addElement((EditableSModelDescriptor) md);
            }

          }
        }
      });
    }
    if (ListSequence.fromList(models).isNotEmpty()) {
      genManager.generateModelsFromDifferentModules(ProjectOperationContext.get(project), models, new JavaGenerationHandler());
    }
  }
}
