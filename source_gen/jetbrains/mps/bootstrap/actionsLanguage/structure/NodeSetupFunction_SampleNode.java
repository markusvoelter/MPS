package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeSetupFunction_SampleNode extends ConceptFunctionParameter {

  public  NodeSetupFunction_SampleNode(SNode node) {
    super(node);
  }

  public static NodeSetupFunction_SampleNode newInstance(SModel sm, boolean init) {
    return (NodeSetupFunction_SampleNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_SampleNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static NodeSetupFunction_SampleNode newInstance(SModel sm) {
    return NodeSetupFunction_SampleNode.newInstance(sm, false);
  }
}
