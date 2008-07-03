package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.constraintsLanguage.behavior.NodePropertyConstraint_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConstraintsFunctionParameter_node_InferenceRule implements InferenceRule_Runtime {

  public typeof_ConstraintsFunctionParameter_node_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode applicableConcept = NodePropertyConstraint_Behavior.call_getApplicableConcept_1213877292345(SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint", false, false));
    if ((applicableConcept == null)) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.constraintsLanguage.helgins", "1212093388354", true), new QuotationClass_().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.constraintsLanguage.helgins", "1212093388352");
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = node;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.constraintsLanguage.helgins", "1212093393092", true), new QuotationClass_1().createNode(applicableConcept), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.constraintsLanguage.helgins", "1212093393090");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
