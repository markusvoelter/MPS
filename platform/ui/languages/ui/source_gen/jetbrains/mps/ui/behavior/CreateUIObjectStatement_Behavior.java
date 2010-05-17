package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class CreateUIObjectStatement_Behavior {
  private static Class[] PARAMETERS_6410919744913642010 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_6410919744913609596(SNode thisNode) {
    return new CreateUIObjectStatement_Behavior.QuotationClass_qpbyzc_a0a0b().createNode(SLinkOperations.getTarget(thisNode, "uiObject", false));
  }

  public static SNode call_getType_6410919744913642010(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.CreateUIObjectStatement"), "virtual_getType_6410919744913609596", PARAMETERS_6410919744913642010);
  }

  public static SNode callSuper_getType_6410919744913642010(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.structure.CreateUIObjectStatement"), callerConceptFqName, "virtual_getType_6410919744913609596", PARAMETERS_6410919744913642010);
  }

  public static class QuotationClass_qpbyzc_a0a0b {
    public QuotationClass_qpbyzc_a0a0b() {
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
