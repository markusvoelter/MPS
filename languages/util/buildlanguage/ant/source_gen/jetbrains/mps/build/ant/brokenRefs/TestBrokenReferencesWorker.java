package jetbrains.mps.build.ant.brokenRefs;

/*Generated by MPS */

import jetbrains.mps.build.ant.MpsWorker;
import jetbrains.mps.build.ant.IBuildServerMessageFormat;
import jetbrains.mps.build.ant.WhatToDo;
import java.lang.management.MemoryMXBean;
import java.lang.management.ManagementFactory;
import jetbrains.mps.project.Project;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.util.Computable;
import jetbrains.mps.project.validation.ModelValidator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SNodeUtil;
import java.io.File;
import jetbrains.mps.build.ant.TeamCityMessageFormat;

public class TestBrokenReferencesWorker extends MpsWorker {
  private final IBuildServerMessageFormat myBuildServerMessageFormat = TestBrokenReferencesWorker.getBuildServerMessageFormat();
  private long myUsedHeap;
  private long myUsedNonHeap;

  public TestBrokenReferencesWorker(WhatToDo whatToDo, MpsWorker.LogLogger systemOutLogger) {
    super(whatToDo, systemOutLogger);
    MemoryMXBean mmbean = ManagementFactory.getMemoryMXBean();
    this.myUsedHeap = mmbean.getHeapMemoryUsage().getUsed();
    this.myUsedNonHeap = mmbean.getNonHeapMemoryUsage().getUsed();
  }

  public void work() {
    setupEnvironment();
    Project project = createDummyProject();
    MpsWorker.ObjectsToProcess go = new MpsWorker.ObjectsToProcess();
    collectModelsToGenerate(go);
    reload();
    executeTask(project, go);
    dispose();
  }

  @Override
  protected void executeTask(Project project, final MpsWorker.ObjectsToProcess go) {
    for (Project p : go.getProjects()) {
      extractModels(go.getModels(), p);
    }
    for (IModule m : go.getModules()) {
      extractModels(go.getModels(), m);
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (SModelDescriptor sm : go.getModels()) {
          if (!(SModelStereotype.isUserModel(sm))) {
            continue;
          }
          String testName = "test references for " + sm.getLongName();
          output(myBuildServerMessageFormat.formatTestStart(testName));
          StringBuffer errorMessages = checkModel(sm);
          if (errorMessages.length() > 0) {
            output(myBuildServerMessageFormat.formatTestFailure(testName, "Broken References", errorMessages.toString()));
          }
          output(myBuildServerMessageFormat.formatTestFinish(testName));
        }
      }
    });
  }

  protected void output(CharSequence s) {
    System.out.println(s);
  }

  private StringBuffer checkModel(final SModelDescriptor sm) {
    final IScope scope = sm.getModule().getScope();
    StringBuffer errorMessages = new StringBuffer();
    List<String> validationResult = ModelAccess.instance().runReadAction(new Computable<List<String>>() {
      public List<String> compute() {
        return new ModelValidator(sm.getSModel()).validate(scope);
      }
    });
    for (String item : validationResult) {
      errorMessages.append(item);
      errorMessages.append("\n");
    }
    for (SNode node : sm.getSModel().nodes()) {
      debug("Checking node " + node);
      if (SModelUtil.findConceptDeclaration(node.getConceptFqName(), GlobalScope.getInstance()) == null) {
        errorMessages.append("Unknown concept ");
        errorMessages.append(node.getConceptFqName());
        errorMessages.append("\n");
      }
    }
    for (SNode node : sm.getSModel().nodes()) {
      for (SReference ref : node.getReferences()) {
        if (SNodeUtil.hasReferenceMacro(node, ref.getRole())) {
          continue;
        }
        if (ref.getTargetNode() == null) {
          errorMessages.append("Broken reference in node ");
          errorMessages.append(node.getId());
          errorMessages.append("(");
          errorMessages.append(node);
          errorMessages.append(")\n");
        }
      }
    }
    return myBuildServerMessageFormat.escapeBuildMessage(errorMessages);
  }

  protected void showStatistic() {
    MemoryMXBean mmbean = ManagementFactory.getMemoryMXBean();
    output("Used heap: " + (mmbean.getHeapMemoryUsage().getUsed() - myUsedHeap));
    output("Used non-heap: " + (mmbean.getNonHeapMemoryUsage().getUsed() - myUsedNonHeap));
    failBuild("broken reference testing");
  }

  public static void main(String[] args) {
    MpsWorker generator = new TestBrokenReferencesWorker(WhatToDo.fromDumpInFile(new File(args[0])), new MpsWorker.LogLogger());
    generator.workFromMain();
  }

  public static IBuildServerMessageFormat getBuildServerMessageFormat() {
    return new TeamCityMessageFormat();
  }
}
