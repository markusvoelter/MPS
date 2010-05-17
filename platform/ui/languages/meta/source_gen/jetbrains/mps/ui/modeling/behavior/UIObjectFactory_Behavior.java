package jetbrains.mps.ui.modeling.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class UIObjectFactory_Behavior {
  private static Class[] PARAMETERS_7655275107718262770 = {SNode.class};
  private static Class[] PARAMETERS_1642651187739434868 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ui.modeling.structure.UIObjectTemplate", false, false), "runtimeType", true);
  }

  public static SNode call_getExpression_7655275107718418307(SNode thisNode) {
    if (!(ConceptFunction_Behavior.call_isReturnOnly_3745452943050787634(thisNode))) {
      return null;
    }
    SNode exp = SLinkOperations.getTarget(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
    return ((exp != null) ?
      exp :
      SLinkOperations.getTarget(SNodeOperations.as(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.ReturnStatement"), "expression", true)
    );
  }

  public static List<SNode> virtual_getParameters_1213877374450(SNode thisNode) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    if ((SLinkOperations.getTarget(thisNode, "context", true) != null)) {
      ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.ui.modeling.structure.ContextUIObjectParam"));
    }
    return result;
  }

  public static SNode call_getExpectedReturnType_7655275107718262770(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.UIObjectFactory"), "virtual_getExpectedReturnType_1213877374441", PARAMETERS_7655275107718262770);
  }

  public static List<SNode> call_getParameters_1642651187739434868(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.UIObjectFactory"), "virtual_getParameters_1213877374450", PARAMETERS_1642651187739434868);
  }

  public static SNode callSuper_getExpectedReturnType_7655275107718262770(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.UIObjectFactory"), callerConceptFqName, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_7655275107718262770);
  }

  public static List<SNode> callSuper_getParameters_1642651187739434868(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.UIObjectFactory"), callerConceptFqName, "virtual_getParameters_1213877374450", PARAMETERS_1642651187739434868);
  }
}
