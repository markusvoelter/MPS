package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class NodeSubstitutePreconditionFunction extends ConceptFunction {

  public  NodeSubstitutePreconditionFunction(SNode node) {
    super(node);
  }

  public static NodeSubstitutePreconditionFunction newInstance(SModel sm) {
    return (NodeSubstitutePreconditionFunction)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
