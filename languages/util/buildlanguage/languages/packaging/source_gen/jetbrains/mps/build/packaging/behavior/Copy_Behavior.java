package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.io.File;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import org.apache.commons.lang.StringUtils;

public class Copy_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "name", "");
    SPropertyOperations.set(thisNode, "excludes", "");
    SLinkOperations.setTarget(thisNode, "sourcePath", SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Path", null), true);
  }

  public static File virtual_getPath_1213877333777(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")) {
      return new File(IAbstractCompositeComponent_Behavior.call_getChildrenTargetDir_1237389224202(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent")));
    }
    return new File("");
  }

  public static String call_getExcludes_1213877251358(SNode thisNode) {
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

  public static String call_getIncludes_1213877251415(SNode thisNode) {
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

  public static boolean virtual_equals_1213877333900(SNode thisNode, SNode snode) {
    if (!(SNodeOperations.isInstanceOf(snode, NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(thisNode))))) {
      return false;
    }
    return StringUtils.equalsIgnoreCase(Path_Behavior.call_getName_1221141245424(SLinkOperations.getTarget(thisNode, "sourcePath", true)), Path_Behavior.call_getName_1221141245424(SLinkOperations.getTarget(SNodeOperations.cast(snode, "jetbrains.mps.build.packaging.structure.Copy"), "sourcePath", true)));
  }
}
