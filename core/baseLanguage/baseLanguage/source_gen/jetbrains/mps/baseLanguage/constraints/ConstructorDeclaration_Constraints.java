package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ConstructorDeclaration_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.isInstanceOf(, "jetbrains.mps.lang.core.structure.INamedConcept") && SNodeOperations.isInstanceOf(, "jetbrains.mps.lang.core.structure.IResolveInfo");
  }

}
