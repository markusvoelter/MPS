package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.CheckingMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.HashSet;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import java.util.Iterator;

public class RulesUtil {

  @CheckingMethod()
  public static void checkAppliedCorrectly_generic(final TypeCheckingContext typeCheckingContext, final SNode op) {
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(op), "jetbrains.mps.lang.smodel.structure.SNodeOperation")) {
      // don't check - it is red anyway
      return;
    }
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode LeftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    boolean isGood = false;
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_model")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_44().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_45().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_node")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_46().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    // ===========
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_link")) {
      SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
      if (linkAccessT != null) {
        isGood = SPropertyOperations.getBoolean(linkAccessT, "singularCradinality");
        if (isGood) {
          // some of ops applicable to 'link' require left-expr to be a concept
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept") && !(SConceptPropertyOperations.getBoolean(op, "applicable_to_node"))) {
            isGood = TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_47().createNode(typeCheckingContext));
          }
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_linkList")) {
      SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
      if (linkAccessT != null) {
        isGood = !(SPropertyOperations.getBoolean(linkAccessT, "singularCradinality"));
      }
    }
    // ===========
    SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1213877508946(op);
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_simple_property")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
        if (DataTypeDeclaration_Behavior.call_isSimple_1220268671473(SLinkOperations.getTarget(propertyDecl, "dataType", false))) {
          isGood = true;
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_enum_property")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
        if (DataTypeDeclaration_Behavior.call_isEnum_1220268692373(SLinkOperations.getTarget(propertyDecl, "dataType", false))) {
          isGood = true;
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept_property")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess")) {
        isGood = true;
      }
    }
    if (!(isGood)) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(op, "operation is not applicable to " + LeftType, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186067417054", intentionProvider);
    }
  }

  @InferenceMethod()
  public static void checkAppliedTo_LinkListAccess_aggregation(final TypeCheckingContext typeCheckingContext, final SNode op) {
    // expect access to an aggregation link with plural cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    {
      final SNode LeftType = typeCheckingContext.typeOf(leftExpression, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206099228546", false);
      typeCheckingContext.whenConcrete(LeftType, new Runnable() {

        public void run() {
          boolean isGood = false;
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
          if (linkAccessT != null) {
            if (!(SPropertyOperations.getBoolean(linkAccessT, "singularCradinality"))) {
              isGood = true;
            }
          }
          if (!(isGood)) {
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.reportTypeError(op, "operation is only applicable to aggregation-link-list-access", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205271287931", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205267224541");
    }
  }

  @InferenceMethod()
  public static void checkAppliedTo_LinkAccess_aggregation(final TypeCheckingContext typeCheckingContext, final SNode op) {
    // expect access to an aggregation link with singular cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    {
      final SNode LeftType = typeCheckingContext.typeOf(leftExpression, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206099156468", false);
      typeCheckingContext.whenConcrete(LeftType, new Runnable() {

        public void run() {
          boolean isGood = false;
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
          if (linkAccessT != null) {
            if (SPropertyOperations.getBoolean(linkAccessT, "singularCradinality")) {
              isGood = true;
            }
          }
          // ----
          if (!(isGood)) {
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.reportTypeError(op, "operation is only applicable to aggregation-link-access", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205272067893", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205267101146");
    }
  }

  @CheckingMethod()
  public static boolean checkAssignableConcept(final TypeCheckingContext typeCheckingContext, SNode fromConcept, SNode toConcept, SNode nodeToReportError, String errorTextPrefix) {
    if (SConceptOperations.isSubConceptOf(fromConcept, NameUtil.nodeFQName(toConcept))) {
      return true;
    }
    {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(nodeToReportError, "" + errorTextPrefix + "\nexpected: " + SPropertyOperations.getString(toConcept, "name") + "\nwas: " + SPropertyOperations.getString(fromConcept, "name"), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179506569646", intentionProvider);
    }
    return false;
  }

  @CheckingMethod()
  public static boolean checkOpParameters_generic(final TypeCheckingContext typeCheckingContext, SNode op) {
    boolean noProblem = true;
    List<SNode> applicableParmConcepts = SLinkOperations.getConceptLinkTargets(op, "applicableParameter");
    for(SNode parm : Sequence.fromIterable(SLinkOperations.getTargets(op, "parameter", true))) {
      if (!(ListSequence.fromList(applicableParmConcepts).contains(SNodeOperations.getConceptDeclaration(parm)))) {
        {
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.reportTypeError(parm, "not applicable here", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1178302007667", intentionProvider);
        }
        noProblem = false;
      }
    }
    return noProblem;
  }

  @InferenceMethod()
  public static void equate_inputNodeConcept(final TypeCheckingContext typeCheckingContext, SNode op, SNode TypeToEquate) {
    RulesUtil.equate_inputNodeConcept_internal(typeCheckingContext, op, TypeToEquate, false);
  }

  @InferenceMethod()
  public static void equate_inputNodeConceptOrInputConceptType(final TypeCheckingContext typeCheckingContext, SNode op, SNode TypeToEquate) {
    RulesUtil.equate_inputNodeConcept_internal(typeCheckingContext, op, TypeToEquate, true);
  }

  @InferenceMethod()
  private static void equate_inputNodeConcept_internal(final TypeCheckingContext typeCheckingContext, final SNode op, final SNode TypeToEquate, final boolean conceptOfConceptIfInputConcept) {
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    {
      final SNode LeftType = typeCheckingContext.typeOf(leftExpression, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1208202100499", false);
      typeCheckingContext.whenConcrete(LeftType, new Runnable() {

        public void run() {
          SNode conceptDeclaration = null;
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "jetbrains.mps.lang.smodel.structure._LinkAccessT")) {
            conceptDeclaration = SLinkOperations.getTarget(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "targetConcept", false);
          } else
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
            conceptDeclaration = SLinkOperations.getTarget(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "concept", false);
          } else
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "jetbrains.mps.lang.smodel.structure.SConceptType")) {
            if (conceptOfConceptIfInputConcept) {
              conceptDeclaration = SLinkOperations.getTarget(typeCheckingContext.getEquationManager().getRepresentator(LeftType), "conceptDeclaraton", false);
            } else
            {
              conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
            }
          }
          if (conceptDeclaration == null) {
            conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
          }
          {
            SNode _nodeToCheck_1029348928467 = null;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(TypeToEquate, conceptDeclaration, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1208202100494", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1208202100447");
    }
  }

  public static SNode get_inputNodeConcept(final SNode op, final boolean conceptOfConceptIfInputConcept) {
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    SNode conceptDeclaration = null;
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure._LinkAccessT")) {
      conceptDeclaration = SLinkOperations.getTarget(leftType, "targetConcept", false);
    } else
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      conceptDeclaration = SLinkOperations.getTarget(leftType, "concept", false);
    } else
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType")) {
      if (conceptOfConceptIfInputConcept) {
        conceptDeclaration = SLinkOperations.getTarget(leftType, "conceptDeclaraton", false);
      } else
      {
        conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
      }
    }
    if (conceptDeclaration == null) {
      conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return conceptDeclaration;
  }

  @InferenceMethod()
  public static void equate_inputNodeType(final TypeCheckingContext typeCheckingContext, SNode op, SNode TypeToEquate) {
    final SNode Concept_typevar_1206099042246 = typeCheckingContext.createNewRuntimeTypesVariable();
    equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099042246));
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(TypeToEquate, new _Quotations.QuotationClass_48().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099042246), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206099071408", intentionProvider);
    }
  }

  @InferenceMethod()
  public static void equate_conceptFromOpParm(final TypeCheckingContext typeCheckingContext, final SNode op, final SNode TypeToEquate) {
    SNode opParm = SNodeOperation_Behavior.call_getParameter_1213877508972(op, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_Concept"));
    SNode opParmList = SNodeOperation_Behavior.call_getParameter_1213877508972(op, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList"));
    if (opParm == null) {
      if (opParmList == null) {
        {
          SNode _nodeToCheck_1029348928467 = null;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation(TypeToEquate, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207352395113", intentionProvider);
        }
      } else
      {
        List<SNode> concepts = new ArrayList<SNode>();
        for(SNode conceptReference : SLinkOperations.getTargets(opParmList, "concept", true)) {
          ListSequence.fromList(concepts).addElement(SLinkOperations.getTarget(conceptReference, "concept", false));
        }
        {
          SNode _nodeToCheck_1029348928467 = null;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation(TypeToEquate, leastCommonSuperconcept(concepts), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1222429361005", intentionProvider);
        }
      }
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference")) {
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(TypeToEquate, SLinkOperations.getTarget(SLinkOperations.getTarget(opParm, "conceptArgument", true), "conceptDeclaration", false), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348168406", intentionProvider);
      }
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.PoundExpression")) {
      {
        final SNode poundExpressionType = typeCheckingContext.typeOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348182125", false);
        typeCheckingContext.whenConcrete(poundExpressionType, new Runnable() {

          public void run() {
            SNode conceptType = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(poundExpressionType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), true, typeCheckingContext);
            if (SLinkOperations.getTarget(conceptType, "conceptDeclaraton", false) != null) {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation(TypeToEquate, SLinkOperations.getTarget(conceptType, "conceptDeclaraton", false), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348182106", intentionProvider);
              }
            } else
            {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation(TypeToEquate, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348182120", intentionProvider);
              }
            }
          }

        }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348182096");
      }
    }
  }

  public static SNode leastCommonSuperconcept(List<SNode> concepts) {
    Map<SNode, Set<SNode>> subTypesToSuperTypes = MapSequence.fromMap(new HashMap<SNode, Set<SNode>>());
    Set<SNode> keyset = new HashSet<SNode>();
    Set<SNode> allTypes = new HashSet<SNode>();
    Set<SNode> frontier = new HashSet(concepts);
    Set<SNode> newFrontier = new HashSet<SNode>();
    while (!(frontier.isEmpty())) {
      for(SNode concept : frontier) {
        if (keyset.contains(concept)) {
          continue;
        }
        List<SNode> supertypes = AbstractConceptDeclaration_Behavior.call_getImmediateSuperconcepts_1222430305282(concept);
        Set<SNode> set = MapSequence.fromMap(subTypesToSuperTypes).get(concept);
        if (set == null) {
          set = new HashSet<SNode>();
          MapSequence.fromMap(subTypesToSuperTypes).put(concept, set);
        }
        set.addAll(supertypes);
        keyset.add(concept);
        newFrontier.addAll(supertypes);
        allTypes.addAll(supertypes);
        ListSequence.fromList(supertypes).addElement(concept);
      }
      frontier = newFrontier;
      newFrontier = new HashSet<SNode>();
    }
    // transitive closure
    for(SNode node2 : allTypes) {
      for(SNode node1 : allTypes) {
        for(SNode node3 : allTypes) {
          Set<SNode> supertypes1 = MapSequence.fromMap(subTypesToSuperTypes).get(node1);
          if (supertypes1 == null) {
            continue;
          }
          Set<SNode> supertypes2 = MapSequence.fromMap(subTypesToSuperTypes).get(node2);
          if (supertypes2 == null) {
            continue;
          }
          if (supertypes1.contains(node2) && supertypes2.contains(node3)) {
            supertypes1.add(node3);
          }
        }
      }
    }
    Set<SNode> result = new HashSet<SNode>(concepts);
    while (result.size() >= 2) {
      Iterator<SNode> iterator = result.iterator();
      SNode a = iterator.next();
      SNode b = iterator.next();
      result.remove(a);
      result.remove(b);
      result.add(leastCommonSuperconcept(a, b, subTypesToSuperTypes));
    }
    if (result.isEmpty()) {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return result.iterator().next();
  }

  private static SNode leastCommonSuperconcept(SNode a, SNode b, Map<SNode, Set<SNode>> subTypesToSuperTypes) {
    if (a == b) {
      return a;
    }
    Set<SNode> superTypesA = MapSequence.fromMap(subTypesToSuperTypes).get(a);
    superTypesA = (superTypesA == null ?
      new HashSet<SNode>() :
      superTypesA
    );
    Set<SNode> superTypesB = MapSequence.fromMap(subTypesToSuperTypes).get(b);
    superTypesB = (superTypesB == null ?
      new HashSet<SNode>() :
      superTypesB
    );
    superTypesA.add(a);
    superTypesB.add(b);
    for(SNode superTypeA : new HashSet<SNode>(superTypesA)) {
      boolean matches = false;
      for(SNode superTypeB : superTypesB) {
        if (superTypeA == superTypeB) {
          matches = true;
          break;
        }
      }
      if (!(matches)) {
        superTypesA.remove(superTypeA);
      }
    }
    Set<SNode> commonSupertypes = superTypesA;
    for(SNode commonSupertype : new HashSet<SNode>(commonSupertypes)) {
      if (!(commonSupertypes.contains(commonSupertype))) {
        continue;
      }
      Set<SNode> superTypes = MapSequence.fromMap(subTypesToSuperTypes).get(commonSupertype);
      if (superTypes != null) {
        for(SNode superType : superTypes) {
          if (superType != commonSupertype) {
            commonSupertypes.remove(superType);
          }
        }
      }
    }
    if (commonSupertypes.size() != 1) {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return commonSupertypes.iterator().next();
  }

}
