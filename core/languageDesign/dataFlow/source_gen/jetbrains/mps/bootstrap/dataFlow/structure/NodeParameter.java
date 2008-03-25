package jetbrains.mps.bootstrap.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeParameter extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter";

  public  NodeParameter(SNode node) {
    super(node);
  }

  public static NodeParameter newInstance(SModel sm, boolean init) {
    return (NodeParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeParameter newInstance(SModel sm) {
    return NodeParameter.newInstance(sm, false);
  }

}
