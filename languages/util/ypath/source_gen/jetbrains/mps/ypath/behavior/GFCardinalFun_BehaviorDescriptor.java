package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.ConceptFunction_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public abstract class GFCardinalFun_BehaviorDescriptor extends ConceptFunction_BehaviorDescriptor implements IDesignFunction_BehaviorDescriptor {
  public GFCardinalFun_BehaviorDescriptor() {
  }

  public SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return GFCardinalFun_Behavior.virtual_getExpectedReturnType_1213877374441(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.ypath.structure.GFCardinalFun";
  }
}
