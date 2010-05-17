package jetbrains.mps.ui.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ui.modeling.behavior.UIObject_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ContainerCompartment_container_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ContainerCompartment_container_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ui.structure.ContainerCompartment", "container", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ui.structure.ContainerCompartment", "container");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    Iterable<SNode> allConts = Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(SLinkOperations.getTarget(SNodeOperations.as(_context.getEnclosingNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false))).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode uio) {
        return SLinkOperations.getTargets(uio, "compartment", true);
      }
    });
    Iterable<SNode> specializedConts = Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(SLinkOperations.getTarget(SNodeOperations.as(_context.getEnclosingNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "uiObject", false))).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode uio) {
        return SLinkOperations.getTargets(uio, "compartment", true);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode comp) {
        return SLinkOperations.getTarget(comp, "specializes", false);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode comp) {
        return comp != null;
      }
    });
    Iterable<SNode> existingConts = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(_context.getEnclosingNode(), "jetbrains.mps.ui.structure.UIObjectStatement"), "compartment", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode comp) {
        return SLinkOperations.getTarget(comp, "container", false);
      }
    });
    return Sequence.fromIterable(allConts).subtract(Sequence.fromIterable(specializedConts)).subtract(Sequence.fromIterable(existingConts));
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    return SPropertyOperations.getString(_context.getParameterNode(), "name");
  }
}
