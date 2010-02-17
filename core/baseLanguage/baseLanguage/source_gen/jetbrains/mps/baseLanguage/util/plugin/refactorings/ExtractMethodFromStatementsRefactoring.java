package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExtractMethodFromStatementsRefactoring extends ExtractMethodRefactoring {
  protected List<SNode> myStatements = new ArrayList<SNode>();

  public ExtractMethodFromStatementsRefactoring(ExtractMethodRefactoringParameters params) {
    super(params);
    ListSequence.fromList(this.myStatements).addSequence(ListSequence.fromList(((List<SNode>) params.getNodesToRefactor())));
  }

  public SNode doRefactor() {
    SNode type = this.getMethodType();
    SNode body = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null);
    this.modifyPartToExtract();
    Map<SNode, SNode> mapping = MapSequence.fromMap(new HashMap<SNode, SNode>());
    ListSequence.fromList(SLinkOperations.getTargets(body, "statement", true)).addSequence(ListSequence.fromList(CopyUtil.copy(this.myStatements, mapping)));
    List<SNode> params = new ArrayList<SNode>();
    Map<SNode, SNode> inputToParams = this.createInputParameters(body, params);
    SNode newMethod = this.createNewMethod(type, params, body);
    this.addMethod(newMethod);
    this.replaceInputVariablesWithParameters(body, inputToParams, mapping);
    this.addCallExpression(newMethod);
    MethodOptimizer.optimize(body);
    return newMethod;
  }

  protected void modifyPartToExtract() {
  }

  public SNode getMethodType() {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VoidType", null);
  }

  protected void addCallExpression(SNode newMethod) {
    SNode methodCall = this.createMethodCall(newMethod);
    SNode callStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(callStatement, "expression", methodCall, true);
    SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(this.myStatements).first(), callStatement);
    for (SNode statement : ListSequence.fromList(this.myStatements)) {
      SNodeOperations.deleteNode(statement);
    }
  }
}
