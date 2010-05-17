package jetbrains.mps.ui.modeling.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class ContainerItemIterator_Behavior {
  private static Class[] PARAMETERS_7798684637310718747 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode itype = SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ui.modeling.structure.ContainerTemplate", false, false), "itemType", true);
    return new ContainerItemIterator_Behavior.QuotationClass_4yrdx3_a0b0b().createNode(itype);
  }

  public static SNode call_getExpectedReturnType_7798684637310718747(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.ContainerItemIterator"), "virtual_getExpectedReturnType_1213877374441", PARAMETERS_7798684637310718747);
  }

  public static SNode callSuper_getExpectedReturnType_7798684637310718747(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.ContainerItemIterator"), callerConceptFqName, "virtual_getExpectedReturnType_1213877374441", PARAMETERS_7798684637310718747);
  }

  public static class QuotationClass_4yrdx3_a0b0b {
    public QuotationClass_4yrdx3_a0b0b() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ContainerIteratorType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
