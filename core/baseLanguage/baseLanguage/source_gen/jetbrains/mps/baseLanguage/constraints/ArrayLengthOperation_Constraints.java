package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;

public class ArrayLengthOperation_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    boolean result = false;
    if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      result = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getParentNode(), "operand", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ArrayType"), false) != null;
    }
    return result;
  }

}
