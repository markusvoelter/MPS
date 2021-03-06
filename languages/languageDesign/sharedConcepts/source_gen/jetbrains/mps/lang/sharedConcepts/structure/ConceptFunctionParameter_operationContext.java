package jetbrains.mps.lang.sharedConcepts.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_operationContext extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext";

  public ConceptFunctionParameter_operationContext(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_operationContext newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_operationContext) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_operationContext newInstance(SModel sm) {
    return ConceptFunctionParameter_operationContext.newInstance(sm, false);
  }
}
