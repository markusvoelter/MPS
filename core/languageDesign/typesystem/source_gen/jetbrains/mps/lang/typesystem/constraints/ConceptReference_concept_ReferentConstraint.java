package jetbrains.mps.lang.typesystem.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferenceFullSetHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ConceptReference_concept_ReferentConstraint implements IModelConstraints, INodeReferenceFullSetHandler {
  public ConceptReference_concept_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.lang.typesystem.structure.ConceptReference", "concept", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.lang.typesystem.structure.ConceptReference", "concept");
  }

  public void processReferentSetEvent(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
    if ((newReferentNode != null) && newReferentNode != oldReferentNode) {
      SPropertyOperations.set(referenceNode, "name", NameUtil.decapitalize(SPropertyOperations.getString(newReferentNode, "name")));
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(referenceNode), "jetbrains.mps.lang.typesystem.structure.InferenceRule")) {
        SPropertyOperations.set(SNodeOperations.cast(SNodeOperations.getParent(referenceNode), "jetbrains.mps.lang.typesystem.structure.InferenceRule"), "name", "typeof_" + SPropertyOperations.getString(newReferentNode, "name"));
      }
    }
  }

  public boolean keepsOriginalReference(SNode referenceNode, SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
    return true;
  }
}
