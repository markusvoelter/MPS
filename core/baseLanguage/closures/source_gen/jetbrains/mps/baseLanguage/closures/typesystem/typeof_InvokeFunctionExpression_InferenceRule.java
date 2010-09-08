package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper.FunctionTypeUtil;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InvokeFunctionExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_InvokeFunctionExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    final List<SNode> ptypes = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode p : SLinkOperations.getTargets(invoke, "parameter", true)) {
      final SNode T_typevar_4196788561248608548 = typeCheckingContext.createNewRuntimeTypesVariable();
      ListSequence.fromList(ptypes).addElement(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_4196788561248608548));
      {
        SNode _nodeToCheck_1029348928467 = p;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608554", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608556", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(T_typevar_4196788561248608548), _info_12389875345);
      }
    }
    final SNode ret_typevar_4196788561248608565 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608566", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608570", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_4196788561248608565), _info_12389875345);
    }
    final SNode ftype_typevar_4196788561248608572 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(invoke, "function", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608573", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(ftype_typevar_4196788561248608572), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608575", true), _info_12389875345);
    }
    {
      final SNode _representatorVar_juleau_g0a = typeCheckingContext.getEquationManager().getRepresentator(ftype_typevar_4196788561248608572);
      typeCheckingContext.whenConcrete(_representatorVar_juleau_g0a, new Runnable() {
        public void run() {
          {
            SNode _nodeToCheck_1029348928467 = invoke;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608583", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.getEquationManager().getRepresentator(ret_typevar_4196788561248608565), (SNode) FunctionTypeUtil.getResultType(typeCheckingContext.getEquationManager().getRepresentator(ftype_typevar_4196788561248608572)), false, _info_12389875345);
          }
          {
            SNode pt;
            SNode fpt;
            Iterator<SNode> pt_iterator = ListSequence.fromList(ptypes).iterator();
            Iterator<SNode> fpt_iterator = ListSequence.fromList(FunctionTypeUtil.getParameterTypes(typeCheckingContext.getEquationManager().getRepresentator(ftype_typevar_4196788561248608572))).iterator();
            while (true) {
              if (!(pt_iterator.hasNext())) {
                break;
              }
              if (!(fpt_iterator.hasNext())) {
                break;
              }
              pt = pt_iterator.next();
              fpt = fpt_iterator.next();
              {
                SNode _nodeToCheck_1029348928467 = pt;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608601", 0, intentionProvider);
                _info_12389875345.setInequationGroup("default");
                typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608606", true), (SNode) fpt, false, _info_12389875345);
              }
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4196788561248608581", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
