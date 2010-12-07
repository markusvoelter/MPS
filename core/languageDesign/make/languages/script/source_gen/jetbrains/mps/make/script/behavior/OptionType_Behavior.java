package jetbrains.mps.make.script.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class OptionType_Behavior {
  private static Class[] PARAMETERS_4125795553994047768 = {SNode.class};
  private static Class[] PARAMETERS_4125795553994049045 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_classifierName_4609636120081351397(SNode thisNode) {
    return IWillBeClassifier_Behavior.call_classifierName_4609636120081351397(SLinkOperations.getTarget(thisNode, "expectedOption", false));
  }

  public static SNode virtual_baseClassifier_4125795553993767872(SNode thisNode) {
    return SLinkOperations.getTarget(new OptionType_Behavior.QuotationClass_cm5g9t_a0a0a2().createNode(), "classifier", false);
  }

  public static String call_classifierName_4125795553994047768(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.OptionType"), "virtual_classifierName_4609636120081351397", PARAMETERS_4125795553994047768);
  }

  public static SNode call_baseClassifier_4125795553994049045(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.OptionType"), "virtual_baseClassifier_4125795553993767872", PARAMETERS_4125795553994049045);
  }

  public static String callSuper_classifierName_4125795553994047768(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.OptionType"), callerConceptFqName, "virtual_classifierName_4609636120081351397", PARAMETERS_4125795553994047768);
  }

  public static SNode callSuper_baseClassifier_4125795553994049045(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.make.script.structure.OptionType"), callerConceptFqName, "virtual_baseClassifier_4125795553993767872", PARAMETERS_4125795553994049045);
  }

  public static class QuotationClass_cm5g9t_a0a0a2 {
    public QuotationClass_cm5g9t_a0a0a2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.baseLanguage.structure(jetbrains.mps.baseLanguage.structure@java_stub)"), SNodeId.fromString("~EnumClass")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
