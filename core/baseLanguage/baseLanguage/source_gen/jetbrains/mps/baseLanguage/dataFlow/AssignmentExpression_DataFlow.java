package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.LocalVariableReference_Behavior;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;

public class AssignmentExpression_DataFlow extends DataFlowBuilder {

  public AssignmentExpression_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "rValue", true));
    SNode variable = SLinkOperations.getTarget(_context.getNode(), "lValue", true);
    if (SNodeOperations.isInstanceOf(variable, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
      if (!(SNodeOperations.isInstanceOf(variable, "jetbrains.mps.baseLanguage.structure.LocalVariableReference")) || LocalVariableReference_Behavior.call_isVariableDefinedInThisMethod_1225456272518(variable)) {
        _context.getBuilder().emitWrite(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "variableDeclaration", false), Expression_Behavior.call_getNullableState_1230540989695(SLinkOperations.getTarget(_context.getNode(), "rValue", true)));
      }
    } else
    {
      _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "lValue", true));
    }
  }

}
