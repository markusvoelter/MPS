package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.CopyUtil;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.typesystem.inference.TypeChecker;

/*package*/ class ExtractMethodFromExpressionRefactoring extends ExtractMethodRefactoring {
  @NotNull
  private SNode myExpression;

  /*package*/ ExtractMethodFromExpressionRefactoring(ExtractMethodRefactoringParameters params) {
    super(params);
    this.myExpression = SNodeOperations.cast(ListSequence.fromList(params.getNodesToRefactor()).first(), "jetbrains.mps.baseLanguage.structure.Expression");
  }

  @NotNull
  public SNode doRefactor() {
    SNode typeNode = SNodeOperations.copyNode(this.getMethodType());
    SNode body = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null);
    Map<SNode, SNode> mapping = MapSequence.fromMap(new HashMap<SNode, SNode>());
    if (SNodeOperations.isInstanceOf(typeNode, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      SNode expressionStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
      SLinkOperations.setTarget(expressionStatement, "expression", SNodeOperations.cast(CopyUtil.copy(this.myExpression, mapping, true), "jetbrains.mps.baseLanguage.structure.Expression"), true);
      ListSequence.fromList(SLinkOperations.getTargets(body, "statement", true)).addElement(expressionStatement);
    } else {
      SNode ret = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ReturnStatement", null);
      SLinkOperations.setTarget(ret, "expression", SNodeOperations.cast(CopyUtil.copy(this.myExpression, mapping, true), "jetbrains.mps.baseLanguage.structure.Expression"), true);
      ListSequence.fromList(SLinkOperations.getTargets(body, "statement", true)).addElement(ret);
    }
    List<SNode> params = new ArrayList<SNode>();
    Map<SNode, SNode> inputToParams = this.createInputParameters(body, params);
    Map<SNode, SNode> inputMapping = this.createInputVaryablesMapping(inputToParams);
    this.myMatches = new MethodDuplicatesFinder(this.myParameters.getNodesToRefactor(), inputMapping, params).findDuplicates(SNodeOperations.getAncestor(ListSequence.fromList(this.myParameters.getNodesToRefactor()).first(), "jetbrains.mps.baseLanguage.structure.Classifier", false, false));
    this.replaceInputVariablesByParameters(body, inputToParams, mapping);
    SNode newMethod = this.createNewMethod(typeNode, params, body);
    this.addMethod(newMethod);
    MethodMatch exactMatch = this.createMatch(this.myParameters.getNodesToRefactor(), inputMapping, params);
    this.replaceMatch(exactMatch, newMethod);
    return newMethod;
  }

  public void replaceMatch(final MethodMatch match, final SNode methodDeclaration) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SNodeOperations.replaceWithAnother(ListSequence.fromList(match.getNodes()).first(), ExtractMethodFromExpressionRefactoring.this.createMethodCall(match, methodDeclaration));
      }
    });
  }

  @NotNull
  public SNode getMethodType() {
    SNode typeOf = TypeChecker.getInstance().getTypeOf(this.myExpression);
    assert typeOf != null;
    return SNodeOperations.cast(typeOf, "jetbrains.mps.baseLanguage.structure.Type");
  }
}
