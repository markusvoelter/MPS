package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_result extends ConceptFunctionParameter {

  public  ConceptFunctionParameter_result(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_result newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_result)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_result", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptFunctionParameter_result newInstance(SModel sm) {
    return ConceptFunctionParameter_result.newInstance(sm, false);
  }
}
