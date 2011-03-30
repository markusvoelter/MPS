package jetbrains.mps.lang.constraints.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new ConceptConstraints_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NodePropertyConstraint_applicableProperty_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NodeReferentConstraint_applicableLink_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ConceptConstraints_defaultConcreteConcept_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }
}
