package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SemanticDowncastExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr, final TypeCheckingContext typeCheckingContext) {
    if ((SLinkOperations.getTarget(expr, "leftExpression", true) != null)) {
      final SNode LeftType_typevar_1186060911559 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expr, "leftExpression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060928458", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060923030", intentionProvider);
      }
      //  this when concrete has a sense of overloading
      {
        final SNode v = typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559);
        typeCheckingContext.whenConcrete(v, new Runnable() {
          public void run() {
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SModelType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100030", true), (SNode)new _Quotations.QuotationClass_19().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100028", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107222", true), (SNode)new _Quotations.QuotationClass_20().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107220", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SConceptType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110101", true), (SNode)new _Quotations.QuotationClass_21().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110099", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure._LinkAccessT")) {
              if (SPropertyOperations.getBoolean(SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure._LinkAccessT"), "singularCradinality")) {
                {
                  SNode _nodeToCheck_1029348928467 = expr;
                  BaseIntentionProvider intentionProvider = null;
                  typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206059653548", true), (SNode)new _Quotations.QuotationClass_65().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206059653546", intentionProvider);
                }
              } else {
                {
                  final SNode lt = typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559);
                  typeCheckingContext.whenConcrete(lt, new Runnable() {
                    public void run() {
                      {
                        SNode _nodeToCheck_1029348928467 = expr;
                        BaseIntentionProvider intentionProvider = null;
                        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275785", true), (SNode)new _Quotations.QuotationClass_66().createNode(SLinkOperations.getTarget(SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(lt), "jetbrains.mps.lang.smodel.structure._LinkAccessT"), "targetConcept", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275783", intentionProvider);
                      }
                    }
                  }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "2930785965020102451", false, false);
                }
              }
            } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SearchScopeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162512076", true), (SNode)new _Quotations.QuotationClass_89().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162518298", intentionProvider);
              }
            } else {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162630424", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162640570", intentionProvider);
              }
            }
          }
        }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061035207", true, false);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
