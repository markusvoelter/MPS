package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.Map;
import jetbrains.mps.baseLanguage.search.MethodResolveUtil;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class InstanceMethodCallOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    String variableExpectedName = null;
    if ((SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false) != null)) {
      String name = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), "name");
      if (name.startsWith("get")) {
        variableExpectedName = name.substring(3);
      } else
      if (name.startsWith("is")) {
        variableExpectedName = name.substring(2);
      } else {
        variableExpectedName = name;
      }
    }
    return NameUtil.decapitalize(variableExpectedName);
  }

  public static SNode virtual_getInstanceType_8008512149545154471(SNode thisNode) {
    return TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(IOperation_Behavior.call_getOperand_1213877410070(thisNode)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
  }

  public static Map<SNode, SNode> virtual_getTypesByTypeVars_851115533308208851(SNode thisNode) {
    SNode instanceType = IMethodCall_Behavior.call_getInstanceType_8008512149545154471(thisNode);
    return MethodResolveUtil.getTypesByTypeVars(SLinkOperations.getTarget(instanceType, "classifier", false), SLinkOperations.getTargets(instanceType, "parameter", true));
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    List<BaseMethodDeclaration> methods = new ClassifierAndSuperClassifiersScope(((Classifier) SNodeOperations.getAdapter(SLinkOperations.getTarget(IMethodCall_Behavior.call_getInstanceType_8008512149545154471(thisNode), "classifier", false))), IClassifiersSearchScope.INSTANCE_METHOD).getMethodsByName(methodName);
    List<SNode> result = new ArrayList<SNode>();
    for (BaseMethodDeclaration bmd : methods) {
      SNode node = bmd.getNode();
      ListSequence.fromList(result).addElement(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
    }
    return result;
  }

  public static boolean call_canBeConvertedToLocal_5311267937735225328(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(IOperation_Behavior.call_getOperand_1213877410070(thisNode), "jetbrains.mps.baseLanguage.structure.ThisExpression"))) {
      return false;
    }
    if (SLinkOperations.getTarget(SNodeOperations.cast(IOperation_Behavior.call_getOperand_1213877410070(thisNode), "jetbrains.mps.baseLanguage.structure.ThisExpression"), "classConcept", false) == null) {
      return true;
    }
    SNode declaration = SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false);
    SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(thisNode);
    SNode declarationClassifier = SNodeOperations.getAncestor(declaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (!(classifier == declarationClassifier || ListSequence.fromList(SNodeOperations.getAncestors(classifier, null, false)).contains(declarationClassifier))) {
      return false;
    }
    int constraint = IClassifiersSearchScope.INSTANCE_METHOD;
    while (classifier != declarationClassifier) {
      for (SNode method : (List<SNode>) Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, thisNode, constraint)) {
        if (SPropertyOperations.getString(method, "name").equals(SPropertyOperations.getString(declaration, "name"))) {
          return false;
        }
      }
      classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    }
    return true;
  }

  public static void call_convertToLocal_5311267937735269230(SNode thisNode) {
    SNode methodCall = SNodeOperations.replaceWithNewChild(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall");
    SLinkOperations.setTarget(methodCall, "baseMethodDeclaration", SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), false);
    ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "actualArgument", true)));
  }
}
