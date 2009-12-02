package jetbrains.mps.xmlQuery.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new XMLElementType_schema_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new XMLElementBuilder_elementType_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new XMLElementType_complexType_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new AccessChildOperation_elementDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new AccessAttributeOperation_attributeDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new XMLAttributeBuilder_attributeDeclaration_ReferentConstraint());
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
