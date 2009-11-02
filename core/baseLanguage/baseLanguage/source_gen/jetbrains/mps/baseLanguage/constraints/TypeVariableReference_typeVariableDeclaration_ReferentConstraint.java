package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TypeVariableReference_typeVariableDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public TypeVariableReference_typeVariableDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    List<SNode> declarations = new ArrayList<SNode>();
    for (SNode genericDeclaration : ListSequence.fromList(SNodeOperations.getAncestors(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.GenericDeclaration", true))) {
      ListSequence.fromList(declarations).addSequence(ListSequence.fromList(SLinkOperations.getTargets(genericDeclaration, "typeVariableDeclaration", true)));
    }
    return declarations;
  }
}
