package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ICompositeComponent_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "excludes", "");
  }

  public static String call_getExcludes_1213877279373(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
      return ((SPropertyOperations.getString(thisNode, "excludes") != null) && (!(SPropertyOperations.getString(thisNode, "excludes").equals(""))) ?
        (SPropertyOperations.getString(thisNode, "excludes") + ", ") :
        ""
      ) + ICompositeComponent_Behavior.call_getExcludes_1213877279373(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.ICompositeComponent"));
    }
    return ((SPropertyOperations.getString(thisNode, "excludes") != null) ?
      (SPropertyOperations.getString(thisNode, "excludes")) :
      ""
    );
  }

  public static String call_getIncludes_1213877279430(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
      return ((SPropertyOperations.getString(thisNode, "includes") != null) && (!(SPropertyOperations.getString(thisNode, "includes").equals(""))) ?
        (SPropertyOperations.getString(thisNode, "includes") + ", ") :
        ""
      ) + ICompositeComponent_Behavior.call_getIncludes_1213877279430(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.ICompositeComponent"));
    }
    return ((SPropertyOperations.getString(thisNode, "includes") != null) ?
      (SPropertyOperations.getString(thisNode, "includes")) :
      ""
    );
  }
}
