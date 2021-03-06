package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class FunctionType_subtypeOf_ClassifierType_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public FunctionType_subtypeOf_ClassifierType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status, final boolean inequalityIsWeak, final boolean inequalityIsLessThan) {
    SNode classifier = SLinkOperations.getTarget(supertype, "classifier", false);
    String errorMsg;
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface") || SPropertyOperations.getBoolean(SNodeOperations.as(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      Iterable<SNode> cands = ListSequence.fromList(methods).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode m) {
          return !("equals".equals(SPropertyOperations.getString(m, "name"))) && SPropertyOperations.getBoolean(m, "isAbstract");
        }
      });
      Iterator<SNode> it = Sequence.fromIterable(cands).iterator();
      SNode mtd = (it.hasNext() ?
        it.next() :
        null
      );
      if (it.hasNext()) {
        errorMsg = ": more than one abstract method";
      } else if (mtd != null) {
        SNode md = ListSequence.fromList(methods).getElement(0);
        if ((int) ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(md, "parameter", true)).count()) {
          SNode retType = ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), supertype);
          if (!(SNodeOperations.isInstanceOf(retType, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
            {
              SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1858552893540392470", 0, null);
              _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
              typeCheckingContext.createGreaterThanInequality((SNode) retType, (SNode) SLinkOperations.getTarget(subtype, "resultType", true), false, true, _info_12389875345);
            }
          }
          {
            SNode fpt;
            SNode mpt;
            Iterator<SNode> fpt_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).iterator();
            Iterator<SNode> mpt_iterator = ListSequence.fromList(SLinkOperations.getTargets(md, "parameter", true)).iterator();
            while (true) {
              if (!(fpt_iterator.hasNext())) {
                break;
              }
              if (!(mpt_iterator.hasNext())) {
                break;
              }
              fpt = fpt_iterator.next();
              mpt = mpt_iterator.next();
              {
                SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1202746383183", 0, null);
                _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                typeCheckingContext.createLessThanInequality((SNode) ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mpt, "type", true), supertype), (SNode) fpt, false, true, _info_12389875345);
              }
            }
          }
          return;
        } else {
          errorMsg = ": wrong parameter number";
        }
      } else {
        errorMsg = ": no abstract method";
      }
    } else {
      errorMsg = ": not an interface or an abstract class";
    }
    {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), BaseConcept_Behavior.call_getPresentation_1213877396640(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1213877396640(supertype) + errorMsg, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1202742336483", null, errorTarget);
      HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status, final boolean inequalityIsWeak, final boolean inequalityIsLessThan) {
    boolean result_14532009 = true;
    {
      SNode classifier = SLinkOperations.getTarget(supertype, "classifier", false);
      String errorMsg;
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface") || SPropertyOperations.getBoolean(SNodeOperations.as(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) {
        List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
        Iterable<SNode> cands = ListSequence.fromList(methods).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode m) {
            return !("equals".equals(SPropertyOperations.getString(m, "name"))) && SPropertyOperations.getBoolean(m, "isAbstract");
          }
        });
        Iterator<SNode> it = Sequence.fromIterable(cands).iterator();
        SNode mtd = (it.hasNext() ?
          it.next() :
          null
        );
        if (it.hasNext()) {
          errorMsg = ": more than one abstract method";
        } else if (mtd != null) {
          SNode md = ListSequence.fromList(methods).getElement(0);
          if ((int) ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(md, "parameter", true)).count()) {
            SNode retType = ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), supertype);
            if (!(SNodeOperations.isInstanceOf(retType, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
              result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) SLinkOperations.getTarget(subtype, "resultType", true), (SNode) retType, true);
            }
            {
              SNode fpt;
              SNode mpt;
              Iterator<SNode> fpt_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).iterator();
              Iterator<SNode> mpt_iterator = ListSequence.fromList(SLinkOperations.getTargets(md, "parameter", true)).iterator();
              while (true) {
                if (!(fpt_iterator.hasNext())) {
                  break;
                }
                if (!(mpt_iterator.hasNext())) {
                  break;
                }
                fpt = fpt_iterator.next();
                mpt = mpt_iterator.next();
                result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mpt, "type", true), supertype), (SNode) fpt, true);
              }
            }
            return result_14532009;
          } else {
            errorMsg = ": wrong parameter number";
          }
        } else {
          errorMsg = ": no abstract method";
        }
      } else {
        errorMsg = ": not an interface or an abstract class";
      }
      result_14532009 = false;
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }
}
