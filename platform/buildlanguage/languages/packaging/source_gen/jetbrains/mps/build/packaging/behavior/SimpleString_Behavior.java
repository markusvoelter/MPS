package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class SimpleString_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getValue_1213877173054(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name");
  }
}
