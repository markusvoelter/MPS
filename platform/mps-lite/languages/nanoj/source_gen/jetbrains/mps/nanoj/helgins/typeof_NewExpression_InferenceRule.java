package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NewExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_NewExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode ct = SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.ClassifierType", null);
    SLinkOperations.setTarget(ct, "classifier", SNodeOperations.getParent(SLinkOperations.getTarget(argument, "constructor", false), null, false, false), false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197634363986", true), ct, argument, null, "jetbrains.mps.nanoj.helgins", "1197634363985");
    if(SequenceOperations.getSize(SLinkOperations.getTargets(argument, "parameter", true)) != SequenceOperations.getSize(SLinkOperations.getTargets(SLinkOperations.getTarget(argument, "constructor", false), "parameter", true))) {
      TypeChecker.getInstance().reportTypeError(argument, "Wrong parameters number", "jetbrains.mps.nanoj.helgins", "1197634363991");
      return;
    }
    List<SNode> args = SLinkOperations.getTargets(argument, "parameter", true);
    List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(argument, "constructor", false), "parameter", true);
    for(int i = 0 ; i < SequenceOperations.getSize(SLinkOperations.getTargets(argument, "parameter", true)) ; i = i + 1) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(ListOperations.getElement(args, i), "jetbrains.mps.nanoj.helgins", "1197634364043", true), SLinkOperations.getTarget(ListOperations.getElement(params, i), "type", true), ListOperations.getElement(args, i), null, "jetbrains.mps.nanoj.helgins", "1197634364041");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.NewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
