package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class UIObjectStatement_Behavior {
  private static Class[] PARAMETERS_7109250785404509292 = {SNode.class};
  private static Class[] PARAMETERS_5197527271413889619 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_shouldReturnValue_7109250785404509292(SNode thisNode) {
    return IUIObjectContextProvider_Behavior.call_shouldReturnValue_8923564134259848103(UIObjectStatement_Behavior.call_getContextProvider_8923564134258524082(thisNode));
  }

  public static SNode call_getContextProvider_8923564134258524082(SNode thisNode) {
    return SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ui.structure.IUIObjectContextProvider", false, false);
  }

  public static SNode call_inContainer_8923564134258524098(SNode thisNode) {
    return IUIObjectContextProvider_Behavior.call_getContainer_8923564134258257521(UIObjectStatement_Behavior.call_getContextProvider_8923564134258524082(thisNode));
  }

  public static boolean call_hasOwner_8923564134258699721(SNode thisNode) {
    return (IUIObjectContextProvider_Behavior.call_getContext_8923564134258345451(UIObjectStatement_Behavior.call_getContextProvider_8923564134258524082(thisNode)) != null);
  }

  public static SNode call_getContext_8923564134258876765(SNode thisNode) {
    return IUIObjectContextProvider_Behavior.call_getContext_8923564134258345451(UIObjectStatement_Behavior.call_getContextProvider_8923564134258524082(thisNode));
  }

  public static SNode virtual_expectedContextType_5197527271413889619(SNode thisNode, SNode belongsTo) {
    return new UIObjectStatement_Behavior.QuotationClass_55aimi_a0a0g().createNode(belongsTo);
  }

  public static boolean call_shouldReturnValue_7109250785404509292(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectStatement"), "virtual_shouldReturnValue_7109250785404509292", PARAMETERS_7109250785404509292);
  }

  public static SNode call_expectedContextType_5197527271413889619(SNode thisNode, SNode belongsTo) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectStatement"), "virtual_expectedContextType_5197527271413889619", PARAMETERS_5197527271413889619, belongsTo);
  }

  public static boolean callSuper_shouldReturnValue_7109250785404509292(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectStatement"), callerConceptFqName, "virtual_shouldReturnValue_7109250785404509292", PARAMETERS_7109250785404509292);
  }

  public static SNode callSuper_expectedContextType_5197527271413889619(SNode thisNode, String callerConceptFqName, SNode belongsTo) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.UIObjectStatement"), callerConceptFqName, "virtual_expectedContextType_5197527271413889619", PARAMETERS_5197527271413889619, belongsTo);
  }

  public static class QuotationClass_55aimi_a0a0g {
    public QuotationClass_55aimi_a0a0g() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.UIObjectType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
