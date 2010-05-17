package jetbrains.mps.ui.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.ui.behavior.BeanPropertyView_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.pattern.util.MatchingUtil;

public class BeanPropertyView_canWrite_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public BeanPropertyView_canWrite_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.ui.structure.BeanPropertyView", "canWrite", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.ui.structure.BeanPropertyView", "canWrite");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    String gn = BeanPropertyView_Behavior.call_setterName_8381258131358762400(node);
    for (SNode imd : SLinkOperations.getTargets(SNodeOperations.as(SNodeOperations.getParent(SLinkOperations.getTarget(node, "getter", false)), "jetbrains.mps.baseLanguage.structure.Classifier"), "method", true)) {
      if (SPropertyOperations.getString(imd, "name").equals(gn) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(imd, "visibility", true), "jetbrains.mps.baseLanguage.structure.PublicVisibility") && ListSequence.fromList(SLinkOperations.getTargets(imd, "parameter", true)).count() == 1) {
        return MatchingUtil.matchNodes(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(imd, "parameter", true)).first(), "type", true), SLinkOperations.getTarget(SLinkOperations.getTarget(node, "getter", false), "returnType", true));
      }
    }
    return false;
  }
}
