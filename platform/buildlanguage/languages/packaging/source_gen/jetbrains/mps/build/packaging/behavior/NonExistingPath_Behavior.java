package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.io.File;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NonExistingPath_Behavior {
  public static void init(SNode thisNode) {
  }

  public static File virtual_getFile_1233322718999(SNode thisNode) {
    return new File(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "macro", true), "path") + File.separator + SPropertyOperations.getString(thisNode, "pathToCheck").replace("/", File.separator).replace("\\", File.separator));
  }
}
