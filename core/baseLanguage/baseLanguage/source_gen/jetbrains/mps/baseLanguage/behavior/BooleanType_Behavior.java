package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class BooleanType_Behavior {
  private static Class[] PARAMETERS_9011026350741579292 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getUnboxedType_1213877337320(SNode thisNode) {
    return new BooleanType_Behavior.QuotationClass_1wwrx3_a0a0b().createNode();
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new BooleanType_Behavior.QuotationClass_1wwrx3_a0a0c().createNode();
  }

  public static SNode virtual_createDefaultTypeExpression_3359611512358152580(SNode thisNode) {
    return new BooleanType_Behavior.QuotationClass_1wwrx3_a0a0d().createNode();
  }

  public static String virtual_jniSignature_8847328628797633411(SNode thisNode) {
    return "Z";
  }

  public static SNode call_createDefaultTypeExpression_9011026350741579292(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BooleanType"), "virtual_createDefaultTypeExpression_3359611512358152580", PARAMETERS_9011026350741579292);
  }

  public static SNode callSuper_createDefaultTypeExpression_9011026350741579292(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BooleanType"), callerConceptFqName, "virtual_createDefaultTypeExpression_3359611512358152580", PARAMETERS_9011026350741579292);
  }

  public static class QuotationClass_1wwrx3_a0a0b {
    public QuotationClass_1wwrx3_a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Boolean")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_1wwrx3_a0a0c {
    public QuotationClass_1wwrx3_a0a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Boolean")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Boolean.TYPE")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_1wwrx3_a0a0d {
    public QuotationClass_1wwrx3_a0a0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
