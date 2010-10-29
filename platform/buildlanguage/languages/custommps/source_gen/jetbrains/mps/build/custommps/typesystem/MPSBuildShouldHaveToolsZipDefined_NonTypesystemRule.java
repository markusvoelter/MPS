package jetbrains.mps.build.custommps.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import java.io.File;
import jetbrains.mps.build.packaging.behavior.IPath_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class MPSBuildShouldHaveToolsZipDefined_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public MPSBuildShouldHaveToolsZipDefined_NonTypesystemRule() {
  }

  public void applyRule(final SNode mpsBuild, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((SLinkOperations.getTarget(mpsBuild, "pathToBuildToolsZip", true) == null)) {
      {
        BaseQuickFixProvider intentionProvider = null;
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(mpsBuild, "Path to " + MPSBuild_Behavior.getMPSBuildToolsZipName_1234294616845() + " is not set.", "r:60aa75c8-3091-4b06-9278-1b723842355e(jetbrains.mps.build.custommps.typesystem)", "1238771106116", intentionProvider, errorTarget);
      }
      return;
    }
    File file = IPath_Behavior.call_getFile_1233322718999(SLinkOperations.getTarget(mpsBuild, "pathToBuildToolsZip", true));
    if (file != null && (!(file.exists()) || !(file.isFile()))) {
      {
        BaseQuickFixProvider intentionProvider = null;
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(mpsBuild, "pathToBuildToolsZip", true), "Path to " + MPSBuild_Behavior.getMPSBuildToolsZipName_1234294616845() + " is not valid.", "r:60aa75c8-3091-4b06-9278-1b723842355e(jetbrains.mps.build.custommps.typesystem)", "512310472859159199", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.build.custommps.structure.MPSBuild";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
