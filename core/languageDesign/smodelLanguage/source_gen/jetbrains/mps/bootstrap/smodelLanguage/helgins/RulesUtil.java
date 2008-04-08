package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.dependencies.InferenceMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.constraints.SNodeOperation_Behavior;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.patterns.IMatchingPattern;

public class RulesUtil {

  @InferenceMethod()
  public static void checkAppliedCorrectly_generic(final SNode op) {
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(op), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation")) {
      // don't check - it is red anyway
      return;
    }
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    {
      final SNode LeftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206099323449", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(LeftType, new Runnable() {

        public void run() {
          boolean isGood = false;
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_model")) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), new QuotationClass_37().createNode(), false, false)) {
              isGood = true;
            }
          }
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept")) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), new QuotationClass_38().createNode(), false, false)) {
              isGood = true;
            }
          }
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_node")) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), new QuotationClass_39().createNode(), false, false)) {
              isGood = true;
            }
          }
          // ===========
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_link")) {
            SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
            if (linkAccessT != null) {
              isGood = SPropertyOperations.getBoolean(linkAccessT, "singularCradinality");
              if (isGood) {
                // some of ops applicable to 'link' require left-expr to be a concept
                if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept") && !(SConceptPropertyOperations.getBoolean(op, "applicable_to_node"))) {
                  isGood = TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), new QuotationClass_97().createNode());
                }
              }
            }
          }
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_linkList")) {
            SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
            if (linkAccessT != null) {
              isGood = !(SPropertyOperations.getBoolean(linkAccessT, "singularCradinality"));
            }
          }
          // ===========
          SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_simple_property")) {
            if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
              SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
              if (DataTypeUtil.isSimple(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
                isGood = true;
              }
            }
          }
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_enum_property")) {
            if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
              SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
              if (DataTypeUtil.isEnum(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
                isGood = true;
              }
            }
          }
          if (SConceptPropertyOperations.getBoolean(op, "applicable_to_concept_property")) {
            if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess")) {
              isGood = true;
            }
          }
          if (!(isGood)) {
            TypeChecker.getInstance().reportTypeError(op, "operation is not applicable to " + TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186067417054");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186065634833");
    }
  }

  @InferenceMethod()
  public static void checkAppliedTo_LinkListAccess_aggregation(final SNode op) {
    // expect access to an aggregation link with plural cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    {
      final SNode LeftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206099228546", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(LeftType, new Runnable() {

        public void run() {
          boolean isGood = false;
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
          if (linkAccessT != null) {
            if (!(SPropertyOperations.getBoolean(linkAccessT, "singularCradinality"))) {
              isGood = true;
            }
          }
          if (!(isGood)) {
            TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-list-access", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205271287931");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267224541");
    }
  }

  @InferenceMethod()
  public static void checkAppliedTo_LinkAccess_aggregation(final SNode op) {
    // expect access to an aggregation link with singular cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    {
      final SNode LeftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206099156468", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(LeftType, new Runnable() {

        public void run() {
          boolean isGood = false;
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
          if (linkAccessT != null) {
            if (SPropertyOperations.getBoolean(linkAccessT, "singularCradinality")) {
              isGood = true;
            }
          }
          // ----
          if (!(isGood)) {
            TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-access", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205272067893");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267101146");
    }
  }

  public static boolean checkAssignableConcept(SNode fromConcept, SNode toConcept, SNode nodeToReportError, String errorTextPrefix) {
    if (SConceptOperations.isSubConceptOf(fromConcept, NameUtil.nodeFQName(toConcept))) {
      return true;
    }
    TypeChecker.getInstance().reportTypeError(nodeToReportError, "" + errorTextPrefix + "\nexpected: " + SPropertyOperations.getString(toConcept, "name") + "\nwas: " + SPropertyOperations.getString(fromConcept, "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179506569646");
    return false;
  }

  public static boolean checkOpParameters_generic(SNode op) {
    boolean noProblem = true;
    List<SNode> applicableParmConcepts = SLinkOperations.getConceptLinkTargets(op, "applicableParameter");
    {
      ICursor<SNode> _zCursor3 = CursorFactory.createCursor(SLinkOperations.getTargets(op, "parameter", true));
      try {
        while(_zCursor3.moveToNext()) {
          SNode parm = _zCursor3.getCurrent();
          if (!(SequenceOperations.contains(applicableParmConcepts, SNodeOperations.getConceptDeclaration(parm)))) {
            TypeChecker.getInstance().reportTypeError(parm, "not applicable here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178302007667");
            noProblem = false;
          }
        }
      } finally {
        _zCursor3.release();
      }
    }
    return noProblem;
  }

  @InferenceMethod()
  public static void equate_inputNodeConcept(SNode op, final SNode TypeToEquate) {
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    {
      final SNode LeftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206098758674", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(LeftType, new Runnable() {

        public void run() {
          SNode conceptDeclaration;
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT")) {
            conceptDeclaration = SLinkOperations.getTarget(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "targetConcept", false);
          } else
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
            conceptDeclaration = SLinkOperations.getTarget(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "concept", false);
          } else
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
            conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration");
          } else
          {
            conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
          }
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, conceptDeclaration, null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205278228661");
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062066737");
    }
  }

  @InferenceMethod()
  public static void equate_inputNodeType(SNode op, SNode TypeToEquate) {
    final SNode Concept_typevar_1206099042246 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099042246));
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, new QuotationClass_81().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099042246)), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206099071408");
  }

  @InferenceMethod()
  public static void equate_conceptFromOpParm(SNode op, final SNode TypeToEquate) {
    SNode opParm = SNodeOperation_Behavior.call_getParameter_1207352678202(op, SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept"));
    if (opParm == null) {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept"), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207352395113");
    } else
    if (SLinkOperations.getTarget(opParm, "concept", false) != null) {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, SLinkOperations.getTarget(opParm, "concept", false), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207352428450");
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference")) {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, SLinkOperations.getTarget(SLinkOperations.getTarget(opParm, "conceptArgument", true), "conceptDeclaration", false), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207352483830");
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression")) {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207351413582", true), SLinkOperations.getTarget(opParm, "conceptArgument", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207351398406");
      {
        final SNode poundExpressionType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207351580597", false);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(poundExpressionType, new Runnable() {

          public void run() {
            {
              IMatchingPattern pattern_1207351747614 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType");
              SNode coercedNode_1207351739547 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(poundExpressionType), pattern_1207351747614);
              if (coercedNode_1207351739547 != null) {
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeToEquate, SLinkOperations.getTarget(coercedNode_1207351739547, "conceptDeclaraton", false), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207351882024");
              }
            }
          }

        }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207351576171");
      }
    }
  }

}
