package jetbrains.mps.build.distrib.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class WindowsConfig_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getStartupFileName_1230208021944(SNode thisNode) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(SystemSpecificConfig_Behavior.call_getDistribConfiguration_1230207861621(thisNode), "shortName", true)).toLowerCase();
  }

  public static String call_getStartupFileExtension_1230208056584(SNode thisNode) {
    return "bat";
  }

  public static String call_getInstallerScriptName_1234792987224(SNode thisNode) {
    return "installer";
  }

  public static String call_getInstallerNsiScriptExtension_1234793014843(SNode thisNode) {
    return "nsi";
  }

  public static String call_getApplicationIcon_1234793320553(SNode thisNode) {
    return "application.ico";
  }

  public static String call_getHomepageIcon_1234793472160(SNode thisNode) {
    return "homepage.ico";
  }

  public static String call_getInstallerIcon_1240557277373(SNode thisNode) {
    return "installer.ico";
  }

  public static String call_getUninstallerIcon_1240557275695(SNode thisNode) {
    return "uninstaller.ico";
  }

  public static String call_getLicensePath_1237900615474(SNode thisNode) {
    return "license.txt";
  }

  public static List<SNode> call_getUserHomeDirs_1241017510516(SNode thisNode) {
    List<SNode> result = ListOperations.<SNode>createList();
    if ((SLinkOperations.getTarget(thisNode, "settingsDir", true) != null)) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "settingsDir", true));
    }
    if ((SLinkOperations.getTarget(thisNode, "examplesDir", true) != null)) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "examplesDir", true));
    }
    return result;
  }

}
