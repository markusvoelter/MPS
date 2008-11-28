package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class ModificationStatement_modifiedGroup_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public ModificationStatement_modifiedGroup_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.plugin.structure.ModificationStatement", "modifiedGroup", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.plugin.structure.ModificationStatement", "modifiedGroup");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> actionGroupDeclarations = SModelOperations.getRootsIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration");
    SNode groupDeclaration = SNodeOperations.getAncestor(_context.getReferenceNode(), "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration", false, false);
    List<SNode> thisGroupChildGroups = ListSequence.fromList(SNodeOperations.getDescendants(groupDeclaration, null, false)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration");
      }

    }).toListSequence();
    ListSequence.fromList(thisGroupChildGroups).addElement(groupDeclaration);
    return new SimpleSearchScope(ListSequence.fromList(actionGroupDeclarations).subtract(ListSequence.fromList(thisGroupChildGroups)).toListSequence());
  }

}
