package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class AnonymousClass_Behavior {
  private static Class[] PARAMETERS_2193927380279967693 = {SNode.class};
  private static Class[] PARAMETERS_7523932196475787022 = {SNode.class};
  private static Class[] PARAMETERS_2496361171403550994 = {SNode.class};

  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "nonStatic", "" + true);
  }

  public static SNode virtual_getSuperclass_1240936569950(SNode thisNode) {
    return new AnonymousClass_Behavior.QuotationClass_mhnjwj_a0a0b().createNode(SLinkOperations.getTargets(thisNode, "typeParameter", true), SLinkOperations.getTarget(thisNode, "classifier", false));
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      return SLinkOperations.getTargets(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "constructor", true);
    } else {
      return SLinkOperations.getTargets(SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Object"), "constructor", true);
    }
  }

  public static String call_getJavaName_2977939203456914071(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, true);
    if ((ancestor == null)) {
      return INamedConcept_Behavior.call_getFqName_1213877404258(thisNode);
    }
    return INamedConcept_Behavior.call_getFqName_1213877404258(ancestor) + "$" + AnonymousClass_Behavior.call_getIndexInContainingClass_4164197659856373643(thisNode);
  }

  public static int call_getIndexInContainingClass_4164197659856373643(SNode thisNode) {
    final SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    int index;
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
      index = AnonymousClass_Behavior.call_getIndexInContainingClass_4164197659856373643(SNodeOperations.cast(ancestor, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) + 1;
    } else {
      index = ListSequence.fromList(SNodeOperations.getDescendants(ancestor, "jetbrains.mps.baseLanguage.structure.AnonymousClass", false, new String[]{})).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.getAncestor(it, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) == ancestor;
        }
      }).indexOf(thisNode) + 1;
    }
    return index;
  }

  public static String virtual_getNestedName_8540045600162184125(SNode thisNode) {
    SNode containingClassifier = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    return (containingClassifier != null ?
      AnonymousClass_Behavior.call_getAnonymousClassPresentation_7523932196475740197(thisNode, containingClassifier) + Classifier_Behavior.call_getNestedName_8540045600162184125(containingClassifier) :
      Classifier_Behavior.callSuper_getNestedName_8540045600162184125(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass")
    );
  }

  public static String virtual_getFqName_1213877404258(SNode thisNode) {
    SNode containingClassifier = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    return (containingClassifier != null ?
      AnonymousClass_Behavior.call_getAnonymousClassPresentation_7523932196475740197(thisNode, containingClassifier) + INamedConcept_Behavior.call_getFqName_1213877404258(containingClassifier) :
      INamedConcept_Behavior.callSuper_getFqName_1213877404258(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass")
    );
  }

  public static String call_getAnonymousClassPresentation_7523932196475740197(SNode thisNode, @NotNull SNode containingClassifier) {
    String result = "Anonymous in ";
    SNode containingMethod = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    if (containingMethod != null && SNodeOperations.getParent(containingMethod) == containingClassifier) {
      result += SPropertyOperations.getString(containingMethod, "name") + "() in ";
    }
    return result;
  }

  public static String virtual_getUnitName_3822000666564591112(SNode thisNode) {
    return AnonymousClass_Behavior.call_getJavaName_2977939203456914071(thisNode);
  }

  public static String call_getNestedName_2193927380279967693(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "virtual_getNestedName_8540045600162184125", PARAMETERS_2193927380279967693);
  }

  public static String call_getFqName_7523932196475787022(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "virtual_getFqName_1213877404258", PARAMETERS_7523932196475787022);
  }

  public static String call_getUnitName_2496361171403550994(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "virtual_getUnitName_3822000666564591112", PARAMETERS_2496361171403550994);
  }

  public static String callSuper_getNestedName_2193927380279967693(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), callerConceptFqName, "virtual_getNestedName_8540045600162184125", PARAMETERS_2193927380279967693);
  }

  public static String callSuper_getFqName_7523932196475787022(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), callerConceptFqName, "virtual_getFqName_1213877404258", PARAMETERS_7523932196475787022);
  }

  public static String callSuper_getUnitName_2496361171403550994(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), callerConceptFqName, "virtual_getUnitName_3822000666564591112", PARAMETERS_2496361171403550994);
  }

  public static class QuotationClass_mhnjwj_a0a0b {
    public QuotationClass_mhnjwj_a0a0b() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
