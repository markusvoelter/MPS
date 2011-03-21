package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.vfs.IFileUtils;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IconResource_Behavior {
  private static Class[] PARAMETERS_8976425910813640826 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static void virtual_generate_9219036563477424614(final SNode thisNode) {
    ModelAccess.instance().writeFilesInEDT(new Runnable() {
      public void run() {
        SModelDescriptor model = SNodeOperations.getModel(thisNode).getModelDescriptor();
        String outputRoot = model.getModule().getOutputFor(model);
        IFile outputRootFile = FileSystem.getInstance().getFileByPath(outputRoot);
        IFile output = FileGenerationUtil.getDefaultOutputDir(model, outputRootFile);

        // copy 
        String source = MacrosUtil.expandPath(SPropertyOperations.getString(thisNode, "path"), model.getModule().getModuleFqName());
        IFile sourceFile = FileSystem.getInstance().getFileByPath(source);

        IFileUtils.copyFileContent(sourceFile, output.child(sourceFile.getName()));
      }
    });
  }

  public static void call_generate_8976425910813640826(SNode thisNode) {
    BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.IconResource"), "virtual_generate_9219036563477424614", PARAMETERS_8976425910813640826);
  }

  public static void callSuper_generate_8976425910813640826(SNode thisNode, String callerConceptFqName) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.IconResource"), callerConceptFqName, "virtual_generate_9219036563477424614", PARAMETERS_8976425910813640826);
  }
}
