package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunctionParameter_oldReferentNode extends ConceptFunctionParameter {

  public  ConstraintFunctionParameter_oldReferentNode(SNode node) {
    super(node);
  }

  public static ConstraintFunctionParameter_oldReferentNode newInstance(SModel sm) {
    return (ConstraintFunctionParameter_oldReferentNode)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunctionParameter_oldReferentNode", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
