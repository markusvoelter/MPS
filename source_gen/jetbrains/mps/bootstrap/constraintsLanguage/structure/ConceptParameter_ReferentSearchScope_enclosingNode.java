package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConceptParameter_ReferentSearchScope_enclosingNode extends ConceptFunctionParameter {

  public  ConceptParameter_ReferentSearchScope_enclosingNode(SNode node) {
    super(node);
  }

  public static ConceptParameter_ReferentSearchScope_enclosingNode newInstance(SModel sm) {
    return (ConceptParameter_ReferentSearchScope_enclosingNode)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
