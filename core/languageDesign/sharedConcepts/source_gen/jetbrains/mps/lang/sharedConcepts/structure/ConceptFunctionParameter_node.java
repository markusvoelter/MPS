package jetbrains.mps.lang.sharedConcepts.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_node extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_node";

  public ConceptFunctionParameter_node(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_node newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_node)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_node", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_node newInstance(SModel sm) {
    return ConceptFunctionParameter_node.newInstance(sm, false);
  }

}
