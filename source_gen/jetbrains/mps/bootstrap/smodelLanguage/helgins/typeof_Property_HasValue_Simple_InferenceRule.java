package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.RulesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_5;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_6;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_7;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_8;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Property_HasValue_Simple_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Property_HasValue_Simple_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    if(RulesUtil.checkAppliedCorrectly_generic(argument)) {
      SNode propertyAccessOp = SLinkOperations.getTarget(RulesUtil.leftExpression(argument), "nodeOperation", true);
      SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(propertyAccessOp, "property", false), "dataType", false);
      if(!((dataType != null))) {
        TypeChecker.getInstance().reportTypeError(argument, "couldn't define accessed property datatype");
      }
      SNode value = SLinkOperations.getTarget(argument, "value", true);
      if((value != null)) {
        if(DataTypeUtil.isSimpleString(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value), new QuotationClass_5().createNode(), value);
        } else 
        if(DataTypeUtil.isSimpleInteger(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value), new QuotationClass_6().createNode(), value);
        } else 
        if(DataTypeUtil.isSimpleBoolean(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value), new QuotationClass_7().createNode(), value);
        } else 
        {
          TypeChecker.getInstance().reportTypeError(argument, "unknown property datatype: " + dataType);
        }
      }
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_8().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Simple";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178287490190"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
