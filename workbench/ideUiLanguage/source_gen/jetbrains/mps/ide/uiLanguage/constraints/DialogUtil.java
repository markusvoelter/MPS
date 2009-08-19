package jetbrains.mps.ide.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DialogUtil {
  public static SNode getContextComponent(SNode parentNode) {
    SNode container = SNodeOperations.getAncestorWhereConceptInList(parentNode, new String[]{"jetbrains.mps.uiLanguage.structure.ComponentDeclaration","jetbrains.mps.uiLanguage.structure.ComponentController"}, true, false);
    if (container == null) {
      return null;
    }
    SNode declaration;
    if (SNodeOperations.isInstanceOf(container, "jetbrains.mps.uiLanguage.structure.ComponentController")) {
      declaration = SLinkOperations.getTarget(SNodeOperations.cast(container, "jetbrains.mps.uiLanguage.structure.ComponentController"), "component", false);
    } else {
      declaration = SNodeOperations.cast(container, "jetbrains.mps.uiLanguage.structure.ComponentDeclaration");
    }
    return declaration;
  }

  public static boolean dialogAccessible(SNode parentNode) {
    SNode component = getContextComponent(parentNode);
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(component, "root", true), "jetbrains.mps.ide.uiLanguage.structure.IDEDialog");
  }
}
