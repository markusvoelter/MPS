package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_SModel extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ConceptFunctionParameter_SModel";

  public ConceptFunctionParameter_SModel(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_SModel newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_SModel)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ConceptFunctionParameter_SModel", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_SModel newInstance(SModel sm) {
    return ConceptFunctionParameter_SModel.newInstance(sm, false);
  }
}
