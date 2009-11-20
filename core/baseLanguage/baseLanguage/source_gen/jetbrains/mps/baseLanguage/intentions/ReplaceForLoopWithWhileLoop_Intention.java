package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ReplaceForLoopWithWhileLoop_Intention extends BaseIntention {
  public ReplaceForLoopWithWhileLoop_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ForStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace For with While";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    // replace for loop with while 
    SNode whileStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.WhileStatement", null);
    SNodeOperations.replaceWithAnother(node, whileStatement);
    // adjust while body 
    SLinkOperations.setTarget(whileStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
    // adjust precondition 
    SNode preStatement = SNodeOperations.insertNewPrevSiblingChild(whileStatement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
    SLinkOperations.setTarget(preStatement, "localVariableDeclaration", SLinkOperations.getTarget(node, "variable", true), true);
    // adjust iteration 
    SNode iterStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(iterStatement, "expression", SLinkOperations.getTarget(node, "iteration", true), true);
    SLinkOperations.addChild(SLinkOperations.getTarget(whileStatement, "body", true), "statement", iterStatement);
    // adjust exit condition 
    SLinkOperations.setTarget(whileStatement, "condition", SLinkOperations.getTarget(node, "condition", true), true);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
