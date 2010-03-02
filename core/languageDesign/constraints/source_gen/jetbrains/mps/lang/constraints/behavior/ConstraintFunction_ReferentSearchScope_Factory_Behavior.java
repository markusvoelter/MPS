package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ConstraintFunction_ReferentSearchScope_Factory_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return new ConstraintFunction_ReferentSearchScope_Factory_Behavior.QuotationClass_q6xvx3_a0a0b().createNode();
  }

  public static class QuotationClass_q6xvx3_a0a0b {
    public QuotationClass_q6xvx3_a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)"), SNodeId.fromString("~ISearchScope")));
          quotedNode_1.addChild("argument", quotedNode1_6);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_3;
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_4;
            quotedNode_3.addChild("elementType", quotedNode1_8);
          }
          quotedNode_1.addChild("argument", quotedNode1_7);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }
}
