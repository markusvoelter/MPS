package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class VariableDeclaration_Behavior {
  public static Class[] PARAMETERS_1213877517476 = {SNode.class ,EditorContext.class};
  public static Class[] PARAMETERS_1213877517482 = {SNode.class};
  public static Class[] PARAMETERS_1213877517488 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static void virtual_inline_1213877517476(SNode thisNode, EditorContext editorContext) {
    // Do nothing by default
  }

  public static SNode virtual_createReference_1213877517482(SNode thisNode) {
    throw new RuntimeException();
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return false;
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    SNode type = null;
    if (SNodeOperations.getParent(expression, null, false, false) == thisNode && SNodeOperations.hasRole(expression, "jetbrains.mps.baseLanguage.structure.VariableDeclaration", "initializer")) {
      type = SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "type", true));
    }
    return type;
  }

  public static void call_inline_1213877517476(SNode thisNode, EditorContext editorContext) {
    BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_inline_1213877517476", PARAMETERS_1213877517476, editorContext);
  }

  public static SNode call_createReference_1213877517482(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_createReference_1213877517482", PARAMETERS_1213877517482);
  }

  public static boolean call_isInitializable_1213877517488(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_isInitializable_1213877517488", PARAMETERS_1213877517488);
  }

  public static void callSuper_inline_1213877517476(SNode thisNode, String callerConceptFqName, EditorContext editorContext) {
    BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_inline_1213877517476", PARAMETERS_1213877517476, editorContext);
  }

  public static SNode callSuper_createReference_1213877517482(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_createReference_1213877517482", PARAMETERS_1213877517482);
  }

  public static boolean callSuper_isInitializable_1213877517488(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_isInitializable_1213877517488", PARAMETERS_1213877517488);
  }

}
