package jetbrains.mps.platform.conf.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNodePointer;

public class InterfaceExtension_intefaceExtensionPoint_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public InterfaceExtension_intefaceExtensionPoint_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.platform.conf.structure.InterfaceExtension", "extensionPoint", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.platform.conf.structure.InterfaceExtension", "extensionPoint");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return Sequence.fromIterable(ConfUtil.visibleConfModels(operationContext.getScope())).<SNode>translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel m) {
        return SModelOperations.getNodes(m, "jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint");
      }
    });
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:2fe958f4-f755-4faa-af2a-c5125dc0cfc1(jetbrains.mps.platform.conf.constraints)", "8515964913726293783");
  }
}
