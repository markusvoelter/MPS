package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
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
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060923030", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060928458", true), _info_12389875345);
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
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100028", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100030", true), (SNode)new _Quotations.QuotationClass_19().createNode(typeCheckingContext), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107220", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107222", true), (SNode)new _Quotations.QuotationClass_20().createNode(typeCheckingContext), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SConceptType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110099", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110101", true), (SNode)new _Quotations.QuotationClass_21().createNode(typeCheckingContext), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
              {
                final SNode lt = typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559);
                typeCheckingContext.whenConcrete(lt, new Runnable() {
                  public void run() {
                    {
                      SNode _nodeToCheck_1029348928467 = expr;
                      BaseIntentionProvider intentionProvider = null;
                      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275783", 0, intentionProvider);
                      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275785", true), (SNode)new _Quotations.QuotationClass_65().createNode(SLinkOperations.getTarget(SNodeOperations.cast(typeCheckingContext.getEquationManager().getRepresentator(lt), "jetbrains.mps.lang.smodel.structure.SNodeListType"), "elementConcept", false), typeCheckingContext), _info_12389875345);
                    }
                  }
                }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "2930785965020102451", false, false);
              }
            } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SearchScopeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162518298", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162512076", true), (SNode)new _Quotations.QuotationClass_86().createNode(typeCheckingContext), _info_12389875345);
              }
            } else {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162640570", 0, intentionProvider);
                typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162630424", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(LeftType_typevar_1186060911559), _info_12389875345);
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
