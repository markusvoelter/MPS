package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ProjectOperation_Behavior {
  private static Class[] PARAMETERS_7012097027058652539 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_7012097027058652452(SNode thisNode) {
    return new ProjectOperation_Behavior.QuotationClass_td9bpt_a0a0b().createNode();
  }

  public static SNode call_createType_7012097027058652539(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.ProjectOperation"), "virtual_createType_7012097027058652452", PARAMETERS_7012097027058652539);
  }

  public static SNode callSuper_createType_7012097027058652539(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.ProjectOperation"), callerConceptFqName, "virtual_createType_7012097027058652452", PARAMETERS_7012097027058652539);
  }

  public static class QuotationClass_td9bpt_a0a0b {
    public QuotationClass_td9bpt_a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project(MPS.Classpath/jetbrains.mps.project@java_stub)"), SNodeId.fromString("~MPSProject")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
