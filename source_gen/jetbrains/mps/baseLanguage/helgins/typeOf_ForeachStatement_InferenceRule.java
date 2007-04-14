package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ForeachStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_ForeachStatement_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode T_typevar_1176561507041 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "iterable", true)), new QuotationClass_20().createNode(T_typevar_1176561507041), SLinkOperations.getTarget(argument, "iterable", true));
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(T_typevar_1176561507041, TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "variable", true)), SLinkOperations.getTarget(argument, "variable", true));
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1176561476779"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
