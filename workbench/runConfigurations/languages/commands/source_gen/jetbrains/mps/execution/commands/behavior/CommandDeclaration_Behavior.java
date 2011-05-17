package jetbrains.mps.execution.commands.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.NonNls;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
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

public class CommandDeclaration_Behavior {
  private static Class[] PARAMETERS_856705193941282112 = {SNode.class};
  private static Class[] PARAMETERS_856705193941282121 = {SNode.class};
  private static Class[] PARAMETERS_856705193941282132 = {SNode.class};
  private static Class[] PARAMETERS_856705193941282142 = {SNode.class};
  private static Class[] PARAMETERS_856705193941282152 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_isDebuggable_856705193941282102(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "debuggerConfiguration", true) != null);
  }

  @NonNls
  public static String virtual_getSuffix_946964771156905483(SNode thisNode) {
    return "Command";
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new CommandDeclaration_Behavior.QuotationClass_5aznw1_a0a0d().createNode(thisNode, thisNode);
  }

  public static List<SNode> virtual_getThrowableTypes_6204026822016975623(SNode thisNode) {
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), new CommandDeclaration_Behavior.QuotationClass_5aznw1_a1a0a4().createNode());
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "execute", true), "statements", true);
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    return new CommandDeclaration_Behavior.QuotationClass_5aznw1_a0a0g().createNode();
  }

  public static String call_getSuffix_856705193941282112(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_getSuffix_946964771156905483", PARAMETERS_856705193941282112);
  }

  public static SNode call_createType_856705193941282121(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_createType_1213877527970", PARAMETERS_856705193941282121);
  }

  public static List<SNode> call_getThrowableTypes_856705193941282132(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_getThrowableTypes_6204026822016975623", PARAMETERS_856705193941282132);
  }

  public static SNode call_getBody_856705193941282142(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_getBody_1239354440022", PARAMETERS_856705193941282142);
  }

  public static SNode call_getExpectedRetType_856705193941282152(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_getExpectedRetType_1239354342632", PARAMETERS_856705193941282152);
  }

  public static String callSuper_getSuffix_856705193941282112(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_getSuffix_946964771156905483", PARAMETERS_856705193941282112);
  }

  public static SNode callSuper_createType_856705193941282121(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_856705193941282121);
  }

  public static List<SNode> callSuper_getThrowableTypes_856705193941282132(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_getThrowableTypes_6204026822016975623", PARAMETERS_856705193941282132);
  }

  public static SNode callSuper_getBody_856705193941282142(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_getBody_1239354440022", PARAMETERS_856705193941282142);
  }

  public static SNode callSuper_getExpectedRetType_856705193941282152(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_getExpectedRetType_1239354342632", PARAMETERS_856705193941282152);
  }

  public static String getCreateProcessMethodName_856705193941282090() {
    return "createProcess";
  }

  public static String getGetDebuggerMethodName_856705193941282096() {
    return "getDebugger";
  }

  public static class QuotationClass_5aznw1_a0a0d {
    public QuotationClass_5aznw1_a0a0d() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.CommandType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_4);
        quotedNode1_2.setReferent("command", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_5aznw1_a1a0a4 {
    public QuotationClass_5aznw1_a1a0a4() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution(MPS.Classpath/com.intellij.execution@java_stub)"), SNodeId.fromString("~ExecutionException")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_5aznw1_a0a0g {
    public QuotationClass_5aznw1_a0a0g() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.ProcessType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("argument", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.process(MPS.Classpath/com.intellij.execution.process@java_stub)"), SNodeId.fromString("~ProcessHandler")));
          quotedNode_1.addChild("argument", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
