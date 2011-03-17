package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class SetType_Behavior {
  private static Class[] PARAMETERS_7602110602933345893 = {SNode.class ,SModel.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SConceptPropertyOperations.getString(thisNode, "alias") + "<" + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "elementType", true)) + ">";
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "set");
    if ((SLinkOperations.getTarget(thisNode, "elementType", true) != null)) {
      if (Type_Behavior.call_hasPluralVariableSuffixes_1447667470349154499(SLinkOperations.getTarget(thisNode, "elementType", true))) {
        for (String suffix : ListSequence.fromList(Type_Behavior.call_getVariableSuffixes_1213877337304(SLinkOperations.getTarget(thisNode, "elementType", true)))) {
          if (!(ListSequence.fromList(variableSuffixes).contains(suffix))) {
            ListSequence.fromList(variableSuffixes).addElement(suffix);
          }
        }
      } else {
        for (String suffix : ListSequence.fromList(Type_Behavior.call_getVariableSuffixes_1213877337304(SLinkOperations.getTarget(thisNode, "elementType", true)))) {
          ListSequence.fromList(variableSuffixes).addElement(NameUtil.pluralize(suffix));
        }
      }
    }
    return variableSuffixes;
  }

  public static boolean virtual_hasPluralVariableSuffixes_1447667470349154499(SNode thisNode) {
    return true;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    return null;
  }

  public static List<SNode> virtual_getAbstractCreators_7602110602933317830(SNode thisNode, SModel targetModel) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(new SetType_Behavior.QuotationClass_q66uze_a0a0b0f().createNode(SLinkOperations.getTarget(thisNode, "elementType", true)));
    ListSequence.fromList(result).addElement(new SetType_Behavior.QuotationClass_q66uze_a0a0c0f().createNode(SLinkOperations.getTarget(thisNode, "elementType", true)));
    ListSequence.fromList(result).addSequence(Sequence.fromIterable(CustomContainersUtil.containerCreators(targetModel, thisNode)));
    return result;
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new SetType_Behavior.QuotationClass_q66uze_a0a0g().createNode();
  }

  public static List<SNode> call_getAbstractCreators_7602110602933345893(SNode thisNode, SModel targetModel) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SetType"), "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345893, targetModel);
  }

  public static List<SNode> callSuper_getAbstractCreators_7602110602933345893(SNode thisNode, String callerConceptFqName, SModel targetModel) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.collections.structure.SetType"), callerConceptFqName, "virtual_getAbstractCreators_7602110602933317830", PARAMETERS_7602110602933345893, targetModel);
  }

  public static class QuotationClass_q66uze_a0a0b0f {
    public QuotationClass_q66uze_a0a0b0f() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.HashSetCreator", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
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

  public static class QuotationClass_q66uze_a0a0c0f {
    public QuotationClass_q66uze_a0a0c0f() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.LinkedHashSetCreator", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
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

  public static class QuotationClass_q66uze_a0a0g {
    public QuotationClass_q66uze_a0a0g() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)"), SNodeId.fromString("~Set")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
