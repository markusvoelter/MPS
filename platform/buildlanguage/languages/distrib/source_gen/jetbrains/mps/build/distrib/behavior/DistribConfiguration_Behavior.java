package jetbrains.mps.build.distrib.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.packaging.behavior.Configuration_Behavior;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.build.packaging.behavior.AbstractProjectComponent_Behavior;
import org.apache.commons.lang.StringUtils;

public class DistribConfiguration_Behavior {

  public static void init(SNode thisNode) {
    SNode path = SConceptOperations.createNewNode("jetbrains.mps.build.distrib.structure.SimplePath", null);
    SPropertyOperations.set(path, "path", ".");
    SLinkOperations.setTarget(thisNode, "startupDirectory", path, true);
  }

  public static String call_getProjectName_1230292821821(SNode thisNode) {
    return SPropertyOperations.getString(Configuration_Behavior.call_getLayout_1213877261819(SLinkOperations.getTarget(thisNode, "buildScriptConfiguration", false)), "name");
  }

  public static List<SNode> call_getAvailableFolders_1230293856288(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "buildScriptConfiguration", false) == null)) {
      return ListSequence.fromList(new LinkedList<SNode>());
    }
    SNode layout = Configuration_Behavior.call_getLayout_1213877261819(SLinkOperations.getTarget(thisNode, "buildScriptConfiguration", false));
    if ((layout == null)) {
      return ListSequence.fromList(new LinkedList<SNode>());
    }
    final SNode selectedConfiguration = SLinkOperations.getTarget(thisNode, "buildScriptConfiguration", false);
    Iterable<SNode> seq = ListSequence.fromList(SLinkOperations.getTargets(layout, "component", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Folder") && (ListSequence.fromList(SLinkOperations.getTargets(it, "configuration", true)).isEmpty() || ListSequence.fromList(SLinkOperations.getTargets(it, "configuration", true)).contains(selectedConfiguration));
      }

    });
    return Sequence.fromIterable(seq).select(new ISelector <SNode, SNode>() {

      public SNode select(SNode it) {
        return it;
      }

    }).toListSequence();
  }

  public static String call_getProjectFolderAntName_1230295546376(SNode thisNode) {
    return AbstractProjectComponent_Behavior.call_getPath_1213877333777(SLinkOperations.getTarget(thisNode, "projectFolder", false)).getPath();
  }

  public static String call_getScriptsFolderSafe_1230566454921(SNode thisNode) {
    String scriptsFolder = DistribConfiguration_Behavior.call_getScriptsFolder_1230570100269(thisNode);
    if (scriptsFolder == null || StringUtils.isEmpty(scriptsFolder)) {
      return ".";
    }
    return scriptsFolder;
  }

  public static String call_getScriptsFolder_1230570100269(SNode thisNode) {
    return SPropertyOperations.getString(Configuration_Behavior.call_getLayout_1213877261819(SLinkOperations.getTarget(thisNode, "buildScriptConfiguration", false)), "scriptsFolder");
  }

  public static String call_getVMOptionsExt_1231692561653(SNode thisNode) {
    return "vmoptions";
  }

  public static String call_getVMOptionsFileName_1231749012626(SNode thisNode) {
    return DistribConfiguration_Behavior.call_getProjectName_1230292821821(thisNode).toLowerCase();
  }

}
