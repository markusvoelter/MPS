package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class StyleSheet_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getClassFqName_1213877515585(SNode thisNode) {
    String namespace = SNodeOperations.getModel(thisNode).getSModelReference().getLongName();
    if (namespace.length() > 0) {
      namespace = namespace + ".";
    }
    return namespace + StyleSheet_Behavior.call_getClassName_1213877515618(thisNode);
  }

  public static String call_getClassName_1213877515618(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + "_StyleSheet";
  }
}
