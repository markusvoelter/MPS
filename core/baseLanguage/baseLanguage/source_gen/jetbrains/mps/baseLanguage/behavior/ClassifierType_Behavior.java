package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import java.util.ArrayList;

public class ClassifierType_Behavior {
  private static Class[] PARAMETERS_9011026350741578236 = {SNode.class};
  private static SNodePointer SNODE_POINTER0 = new SNodePointer("f:java_stub#java.lang(java.lang@java_stub)", "~Object");

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (classifier == null) {
      return "?no classifier?";
    }
    String result = SPropertyOperations.getString(classifier, "name");
    List<SNode> parms = SLinkOperations.getTargets(thisNode, "parameter", true);
    if (ListSequence.fromList(parms).isNotEmpty()) {
      String parmsText = "";
      for (SNode parm : ListSequence.fromList(parms)) {
        if (parmsText.length() > 0) {
          parmsText = parmsText + ",";
        }
        parmsText = parmsText + BaseConcept_Behavior.call_getPresentation_1213877396640(parm);
      }
      result = result + "<" + parmsText + ">";
    }
    return result;
  }

  public static String virtual_getErasureSignature_1213877337313(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (classifier == null) {
      return "?no classifier?";
    }
    return INamedConcept_Behavior.call_getFqName_1213877404258(classifier);
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    String classifierName = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "classifier", false), "name");
    String shortName = NameUtil.shortNameFromLongName(classifierName);
    return ((List<String>) NameUtil.splitByCamels(NameUtil.decapitalize(shortName)));
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new ClassifierType_Behavior.QuotationClass_3370_0().createNode(SLinkOperations.getTarget(thisNode, "classifier", false));
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      if (!(SPropertyOperations.getBoolean(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "constructor", true)).isNotEmpty()) {
        SNode creator = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassCreator", null);
        SLinkOperations.setTarget(creator, "baseMethodDeclaration", ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "constructor", true)).first(), false);
        for (SNode typeParm : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true))) {
          ListSequence.fromList(SLinkOperations.getTargets(creator, "typeParameter", true)).addElement(SNodeOperations.copyNode(typeParm));
        }
        return creator;
      }
    }
    return null;
  }

  public static boolean virtual_isSupersetOf_1220438914705(SNode thisNode, SNode t) {
    if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      do {
        SNode matchedNode_3370_0 = thisNode;
        {
          boolean matches_3370_0 = false;
          GeneratedMatchingPattern matchingPattern = new ClassifierType_Behavior.Pattern_3370_0();
          matches_3370_0 = matchingPattern.match(matchedNode_3370_0);
          if (matches_3370_0) {
            return true;
          }
        }
        return false;
      } while(false);
    }
    {
      GeneratedMatchingPattern pattern_3370_0 = new ClassifierType_Behavior.Pattern_3370_1(SLinkOperations.getTarget(thisNode, "classifier", false));
      SNode coercedNode_3370_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(t, pattern_3370_0);
      if (coercedNode_3370_0 != null) {
        {
          SNode typeParam;
          SNode myParam;
          Iterator<SNode> typeParam_iterator = ListSequence.fromList(((List<SNode>) pattern_3370_0.getFieldValue("PatternVar_l"))).iterator();
          Iterator<SNode> myParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).iterator();
          while (true) {
            if (!(typeParam_iterator.hasNext())) {
              break;
            }
            if (!(myParam_iterator.hasNext())) {
              break;
            }
            typeParam = typeParam_iterator.next();
            myParam = myParam_iterator.next();
            if (SNodeOperations.isInstanceOf(myParam, "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(myParam, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
              if (!(Type_Behavior.call_isSupersetOf_1220438914705(myParam, typeParam))) {
                return false;
              }
            } else {
              if (!(MatchingUtil.matchNodes(myParam, typeParam))) {
                return false;
              }
            }
          }
        }
        return true;
      } else {
      }
    }
    return Type_Behavior.callSuper_isSupersetOf_1220438914705(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierType", t);
  }

  public static SNode virtual_createDefaultTypeExpression_3359611512358152580(SNode thisNode) {
    return new ClassifierType_Behavior.QuotationClass_3370_1().createNode();
  }

  public static boolean virtual_hasMissingParameters_3508583411997314206(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "classifier", false), "typeVariableDeclaration", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count();
  }

  public static SNode virtual_getLooseType_5744862332972792015(SNode thisNode) {
    SNode classifierType = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(classifierType, "classifier", SLinkOperations.getTarget(thisNode, "classifier", false), false);
    for (SNode typeParam : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).addElement(Type_Behavior.call_getLooseType_5744862332972792015(typeParam));
    }
    return classifierType;
  }

  public static SNode call_createDefaultTypeExpression_9011026350741578236(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "virtual_createDefaultTypeExpression_3359611512358152580", PARAMETERS_9011026350741578236);
  }

  public static SNode callSuper_createDefaultTypeExpression_9011026350741578236(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierType"), callerConceptFqName, "virtual_createDefaultTypeExpression_3359611512358152580", PARAMETERS_9011026350741578236);
  }

  public static class QuotationClass_3370_0 {
    public QuotationClass_3370_0() {
    }

    public SNode createNode(Object parameter_3370_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3370_0 = null;
      {
        quotedNode_3370_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3370_0 = quotedNode_3370_0;
        quotedNode1_3370_0.setReferent("classifier", (SNode) parameter_3370_1);
        result = quotedNode1_3370_0;
      }
      return result;
    }
  }

  public static class Pattern_3370_0 extends GeneratedMatchingPattern implements IMatchingPattern {
    public Pattern_3370_0() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_3370_0;
        nodeToMatch_3370_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_3370_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = SNODE_POINTER0.getNode();
          if (nodeToMatch_3370_0.getReferent("classifier") != referent) {
            return false;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
    }

    public Object getFieldValue(String fieldName) {
      return null;
    }
  }

  public static class Pattern_3370_1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> PatternVar_l;
    /*package*/ SNode PatternVar_ignored;
    /*package*/ Object AntiquotationField3370_0;

    public Pattern_3370_1(Object parameter_3370_0) {
      this.AntiquotationField3370_0 = parameter_3370_0;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_3370_1;
        nodeToMatch_3370_1 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_3370_1.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField3370_0;
          if (nodeToMatch_3370_1.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole3370_0 = "parameter";
          this.PatternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          this.PatternVar_ignored = null;
          for (SNode childVar : nodeToMatch_3370_1.getChildren(childRole3370_0)) {
            this.PatternVar_ignored = childVar;
            ListSequence.fromList(this.PatternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_l = (List<SNode>) pattern.getFieldValue("PatternVar_l");
        this.PatternVar_ignored = (SNode) pattern.getFieldValue("PatternVar_ignored");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_l".equals(fieldName)) {
        return this.PatternVar_l;
      }
      if ("PatternVar_ignored".equals(fieldName)) {
        return this.PatternVar_ignored;
      }
      return null;
    }
  }

  public static class QuotationClass_3370_1 {
    public QuotationClass_3370_1() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3370_1 = null;
      {
        quotedNode_3370_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3370_1 = quotedNode_3370_1;
        result = quotedNode1_3370_1;
      }
      return result;
    }
  }
}
