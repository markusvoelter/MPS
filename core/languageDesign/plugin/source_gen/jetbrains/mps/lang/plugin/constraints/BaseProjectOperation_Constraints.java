package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class BaseProjectOperation_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    boolean can = false;
    if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      can = TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), new BaseProjectOperation_Constraints.QuotationClass_u117dn_a1a0a0a1a0().createNode());
    }
    return can;
  }

  public static class QuotationClass_u117dn_a1a0a0a1a0 {
    public QuotationClass_u117dn_a1a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.project(MPS.Classpath/com.intellij.openapi.project@java_stub)"), SNodeId.fromString("~Project")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
