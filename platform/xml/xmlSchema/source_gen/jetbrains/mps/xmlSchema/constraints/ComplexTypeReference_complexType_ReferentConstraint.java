package jetbrains.mps.xmlSchema.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ModelAndImportedModelsScope;
import jetbrains.mps.smodel.SNodePointer;

public class ComplexTypeReference_complexType_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ComplexTypeReference_complexType_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.xmlSchema.structure.ComplexTypeReference", "complexType", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.xmlSchema.structure.ComplexTypeReference", "complexType");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new ModelAndImportedModelsScope(_context.getModel(), false, operationContext.getScope());
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c89590595(jetbrains.mps.xmlSchema.constraints)", "115745247309443797");
  }
}
