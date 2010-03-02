package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ParameterizedSubstitute_Handler_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model")) {
      return false;
    }
    return ConceptFunction_Behavior.callSuper_usesParameterObjectFor_1213877374432(thisNode, "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Handler", parameter);
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.actions.structure.ConceptPart", false, false);
    SNode conceptOfNodeReturnedByHandler = SLinkOperations.getTarget(ancestor, "concept", false);
    return new QueryFunction_ParameterizedSubstitute_Handler_Behavior.QuotationClass_494qzt_a0c0c().createNode(conceptOfNodeReturnedByHandler);
  }

  public static class QuotationClass_494qzt_a0c0c {
    public QuotationClass_494qzt_a0c0c() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
