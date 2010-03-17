package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.lang.reflect.Method;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ReflectionUtil;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.baseLanguage.typesystem.ResolveUtil;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class BaseMethodDeclaration_Behavior {
  private static Class[] PARAMETERS_1227714048980 = {SNode.class};
  private static Class[] PARAMETERS_4025276038182319417 = {SNode.class};
  private static Class[] PARAMETERS_1234359555698 = {SNode.class};
  private static Class[] PARAMETERS_5358895268254685434 = {SNode.class};
  private static Class[] PARAMETERS_1232982539764 = {SNode.class};
  private static Class[] PARAMETERS_8847328628797656446 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isDataFlowChecked_1227714048980(SNode thisNode) {
    return true;
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return false;
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    SNode expectedRetType = SLinkOperations.getTarget(thisNode, "returnType", true);
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.Type") || SNodeOperations.isInstanceOf(expectedRetType, "jetbrains.mps.baseLanguage.structure.VoidType") || BaseMethodDeclaration_Behavior.call_isReturnsVoid_1234359555698(thisNode)) {
      // actually - no return type 
      expectedRetType = null;
    }
    return expectedRetType;
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "body", true);
  }

  public static List<SNode> virtual_getChildrenToDisplayIntention_4025276038182319200(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "returnType", true));
    return result;
  }

  public static boolean virtual_isReturnsVoid_1234359555698(SNode thisNode) {
    return false;
  }

  public static String call_getParametersPresentation_1213877350304(SNode thisNode) {
    StringBuilder result = new StringBuilder();
    result.append("(");
    boolean first = true;
    for (SNode parm : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      if (!(first)) {
        result.append(",");
      }
      first = false;
      if (SLinkOperations.getTarget(parm, "type", true) != null) {
        result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(parm, "type", true)));
      } else {
        result.append("???");
      }
      /*
        if (SPropertyOperations.getString(parm, "name") != null) {
          result.append(" ").append(SPropertyOperations.getString(parm, "name"));
        }
      */
    }
    result.append(")");
    return result.toString();
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder result = new StringBuilder();
    String name = SPropertyOperations.getString(thisNode, "name");
    if (name != null) {
      result.append(name);
    } else {
      result.append("<no name>");
    }
    result.append(BaseMethodDeclaration_Behavior.call_getParametersPresentation_1213877350304(thisNode));
    result.append(":");
    if (SLinkOperations.getTarget(thisNode, "returnType", true) != null) {
      result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "returnType", true)));
    } else {
      result.append("???");
    }
    return result.toString();
  }

  public static Method call_getMethod_1213877350393(SNode thisNode, IModule module) {
    return ReflectionUtil.getMethod(module, SNodeOperations.getParent(thisNode), SPropertyOperations.getString(thisNode, "name"), BaseMethodDeclaration_Behavior.call_getParameterTypes_1213877350411(thisNode, module));
  }

  public static Class[] call_getParameterTypes_1213877350411(SNode thisNode, final IModule module) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).select(new ISelector<SNode, Class>() {
      public Class select(SNode it) {
        return Type_Behavior.call_getClass_1213877337327(SLinkOperations.getTarget(it, "type", true), module);
      }
    }).toGenericArray(Class.class);
  }

  public static SNode call_getBaseMethod_5014346297260519893(SNode thisNode) {
    SNode result = BaseMethodDeclaration_Behavior.call_getNearestOverriddenMethod_5358895268254685434(thisNode);
    if ((result == null)) {
      return null;
    }
    SNode next = BaseMethodDeclaration_Behavior.call_getNearestOverriddenMethod_5358895268254685434(result);
    while (next != null) {
      result = next;
      next = BaseMethodDeclaration_Behavior.call_getNearestOverriddenMethod_5358895268254685434(result);
    }
    return result;
  }

  public static SNode virtual_getNearestOverriddenMethod_5358895268254685434(SNode thisNode) {
    return null;
  }

  public static boolean call_hasSameParameters_855369272314187138(SNode thisNode, SNode checked) {
    String searchedReturnType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(checked, "returnType", true));
    String foundReturnType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(thisNode, "returnType", true));
    if (!(foundReturnType.equals(searchedReturnType))) {
      return false;
    }
    boolean same = true;
    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count(); i++) {
      String searchedParamType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(checked, "parameter", true)).getElement(i), "type", true));
      String foundParamType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).getElement(i), "type", true));
      if (!(foundParamType.equals(searchedParamType))) {
        same = false;
      }
    }
    return same;
  }

  public static boolean call_hasSameSignature_1213877350435(SNode thisNode, SNode checked) {
    if (StringUtils.isEmpty(SPropertyOperations.getString(thisNode, "name"))) {
      return false;
    }
    if (!(SPropertyOperations.getString(thisNode, "name").equals(SPropertyOperations.getString(checked, "name")))) {
      return false;
    }
    if (!(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(checked, "parameter", true)).count())) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(checked, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")) {
      SNode thisMethod = SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
      SNode enclosingClassifier = SNodeOperations.getAncestor(checked, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      SNode patternMethod = ResolveUtil.processMethodToImplement(enclosingClassifier, thisMethod);
      return BaseMethodDeclaration_Behavior.call_hasSameParameters_855369272314187138(patternMethod, checked);
    } else {
      return BaseMethodDeclaration_Behavior.call_hasSameParameters_855369272314187138(thisNode, checked);
    }
  }

  public static String call_getErasureSignature_2830572026628006618(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    List<SNode> parameters = SLinkOperations.getTargets(thisNode, "parameter", true);
    for (int i = 0; i < ListSequence.fromList(parameters).count(); i++) {
      SNode param = ListSequence.fromList(parameters).getElement(i);
      sb.append(Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(param, "type", true)));
      if (i < ListSequence.fromList(parameters).count() - 1) {
        sb.append(",");
      }
    }
    return sb.toString();
  }

  public static boolean virtual_isAbstract_1232982539764(SNode thisNode) {
    return false;
  }

  public static SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "returnType", true);
  }

  public static String virtual_jniSignature_8847328628797656446(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    sb.append("(");
    for (SNode p : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      sb.append(Type_Behavior.call_jniSignature_8847328628797633411(SLinkOperations.getTarget(p, "type", true)));
    }
    sb.append(")");
    sb.append(Type_Behavior.call_jniSignature_8847328628797633411(SLinkOperations.getTarget(thisNode, "returnType", true)));
    return sb.toString();
  }

  public static boolean call_isDataFlowChecked_1227714048980(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_isDataFlowChecked_1227714048980", PARAMETERS_1227714048980);
  }

  public static List<SNode> call_getChildrenToDisplayIntention_4025276038182319417(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182319417);
  }

  public static boolean call_isReturnsVoid_1234359555698(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_isReturnsVoid_1234359555698", PARAMETERS_1234359555698);
  }

  public static SNode call_getNearestOverriddenMethod_5358895268254685434(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_getNearestOverriddenMethod_5358895268254685434", PARAMETERS_5358895268254685434);
  }

  public static boolean call_isAbstract_1232982539764(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_isAbstract_1232982539764", PARAMETERS_1232982539764);
  }

  public static String call_jniSignature_8847328628797656446(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "virtual_jniSignature_8847328628797656446", PARAMETERS_8847328628797656446);
  }

  public static boolean callSuper_isDataFlowChecked_1227714048980(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_isDataFlowChecked_1227714048980", PARAMETERS_1227714048980);
  }

  public static List<SNode> callSuper_getChildrenToDisplayIntention_4025276038182319417(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182319417);
  }

  public static boolean callSuper_isReturnsVoid_1234359555698(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_isReturnsVoid_1234359555698", PARAMETERS_1234359555698);
  }

  public static SNode callSuper_getNearestOverriddenMethod_5358895268254685434(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_getNearestOverriddenMethod_5358895268254685434", PARAMETERS_5358895268254685434);
  }

  public static boolean callSuper_isAbstract_1232982539764(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_isAbstract_1232982539764", PARAMETERS_1232982539764);
  }

  public static String callSuper_jniSignature_8847328628797656446(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), callerConceptFqName, "virtual_jniSignature_8847328628797656446", PARAMETERS_8847328628797656446);
  }
}
