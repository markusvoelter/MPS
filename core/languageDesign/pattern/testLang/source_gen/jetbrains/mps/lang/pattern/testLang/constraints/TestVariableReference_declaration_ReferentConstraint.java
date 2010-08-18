package jetbrains.mps.lang.pattern.testLang.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class TestVariableReference_declaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public TestVariableReference_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.pattern.testLang.structure.TestVariableReference", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.pattern.testLang.structure.TestVariableReference", "declaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return SNodeOperations.getDescendants(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.pattern.testLang.structure.PatternTest", false, false), "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", false, new String[]{});
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:02c98d9f-8736-40ad-9bbb-eeffd3fee9b8(jetbrains.mps.lang.pattern.testLang.constraints)", "8707387027762047796");
  }
}
