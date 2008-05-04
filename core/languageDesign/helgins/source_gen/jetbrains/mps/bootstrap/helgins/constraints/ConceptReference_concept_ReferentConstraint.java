package jetbrains.mps.bootstrap.helgins.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class ConceptReference_concept_ReferentConstraint implements IModelConstraints, INodeReferentSetEventHandler {

  public ConceptReference_concept_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.bootstrap.helgins.structure.ConceptReference", "concept", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.bootstrap.helgins.structure.ConceptReference", "concept");
  }

  public void processReferentSetEvent(SNode referenceNode, SNode oldReferentNode, SNode newReferentNode, IScope scope) {
    if ((newReferentNode != null) && newReferentNode != oldReferentNode) {
      SPropertyOperations.set(referenceNode, "name", NameUtil.decapitalize(SPropertyOperations.getString(newReferentNode, "name")));
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(referenceNode, null, false, false), "jetbrains.mps.bootstrap.helgins.structure.InferenceRule")) {
        SPropertyOperations.set(SNodeOperations.getParent(referenceNode, null, false, false), "name", "typeof_" + SPropertyOperations.getString(newReferentNode, "name"));
      }
    }
  }

}
