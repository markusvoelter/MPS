package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import java.util.List;

public interface IMethodCall_BehaviorDescriptor extends TypeDerivable_BehaviorDescriptor, TypeAnnotable_BehaviorDescriptor {
  public SNode virtual_getInstanceType_8008512149545154471(SNode thisNode);
  public Map<SNode, SNode> virtual_getTypesByTypeVars_851115533308208851(SNode thisNode);
  public List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName);
}
