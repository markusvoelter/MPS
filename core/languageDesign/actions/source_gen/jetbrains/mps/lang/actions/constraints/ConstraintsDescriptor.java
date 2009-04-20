package jetbrains.mps.lang.actions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.actions.constraints.NodeFactory_alias_PropertyConstraint;
import jetbrains.mps.lang.actions.constraints.SubstituteNodeBuilderVariableReference_nodeBuilderVariableDeclaration_ReferentConstraint;
import jetbrains.mps.lang.actions.constraints.SideTransformVariableReference_rightTransformVariableDeclaration_ReferentConstraint;
import jetbrains.mps.lang.actions.constraints.NodeFactory_applicableConcept_ReferentConstraint;
import jetbrains.mps.lang.actions.constraints.SmartActionParameterReference_smartActionParameter_ReferentConstraint;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListOperations.<IModelConstraints>createList();

  public ConstraintsDescriptor() {
    ListOperations.addElement(this.myConstraints, new NodeFactory_alias_PropertyConstraint());
    ListOperations.addElement(this.myConstraints, new SubstituteNodeBuilderVariableReference_nodeBuilderVariableDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SideTransformVariableReference_rightTransformVariableDeclaration_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new NodeFactory_applicableConcept_ReferentConstraint());
    ListOperations.addElement(this.myConstraints, new SmartActionParameterReference_smartActionParameter_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }

}
