package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilders;
import jetbrains.mps.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.structure.VariableReference", new VariableReference_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.IfStatement", new IfStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.WhileStatement", new WhileStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.Statement", new Statement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.Expression", new Expression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ExpressionStatement", new ExpressionStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BlockStatement", new BlockStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.StatementList", new StatementList_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AssignmentExpression", new AssignmentExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.CastExpression", new CastExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BinaryOperation", new BinaryOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ReturnStatement", new ReturnStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ForStatement", new ForStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ForeachStatement", new ForeachStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DoWhileStatement", new DoWhileStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AssertStatement", new AssertStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ThrowStatement", new ThrowStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BreakStatement", new BreakStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ContinueStatement", new ContinueStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ElsifClause", new ElsifClause_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.VariableDeclaration", new VariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression", new TernaryOperatorExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", new SynchronizedStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TryStatement", new TryStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TryCatchStatement", new TryCatchStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", new ParenthesizedExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DotExpression", new DotExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.IMethodCall", new IMethodCall_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayAccessExpression", new ArrayAccessExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayLiteral", new ArrayLiteral_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DimensionExpression", new DimensionExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.InstanceOfExpression", new InstanceOfExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", new LocalVariableDeclarationStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", new LocalVariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", new BaseMethodDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayLengthExpression", new ArrayLengthExpression_DataFlow());
  }

}
