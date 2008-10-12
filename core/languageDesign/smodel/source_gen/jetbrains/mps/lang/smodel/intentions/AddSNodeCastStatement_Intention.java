package jetbrains.mps.lang.smodel.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;

public class AddSNodeCastStatement_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Insert cast variable declaration";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    boolean isApplicable = false;
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "condition", true), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode dotExpression = SLinkOperations.getTarget(node, "condition", true);
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(dotExpression, "operation", true), "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation")) {
        SNode iioo = SLinkOperations.getTarget(dotExpression, "operation", true);
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(iioo, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference")) {
          SNode rc = SLinkOperations.getTarget(iioo, "conceptArgument", true);
          isApplicable = (SLinkOperations.getTarget(rc, "conceptDeclaration", false) != null);
        }
      }
    }
    return isApplicable;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode castVariable = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
    SNode de = SLinkOperations.getTarget(node, "condition", true);
    SNode conceptDeclaration = SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(de, "operation", true), "conceptArgument", true), "conceptDeclaration", false);
    SNode declaration = SLinkOperations.getTarget(castVariable, "localVariableDeclaration", true);
    SLinkOperations.setTarget(SLinkOperations.setNewChild(declaration, "type", "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", conceptDeclaration, false);
    SPropertyOperations.set(declaration, "name", NameUtil.decapitalize(SPropertyOperations.getString(conceptDeclaration, "name")));
    SNode expression = SLinkOperations.getTarget(de, "operand", true);
    if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(expression), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      SNode nodeTypeCastExpression = SLinkOperations.setNewChild(declaration, "initializer", "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
      SLinkOperations.setTarget(nodeTypeCastExpression, "concept", conceptDeclaration, false);
      SLinkOperations.setTarget(nodeTypeCastExpression, "leftExpression", SNodeOperations.copyNode(expression), true);
    } else
    {
      SNode castExpression = SLinkOperations.setNewChild(declaration, "initializer", "jetbrains.mps.baseLanguage.structure.CastExpression");
      SLinkOperations.setTarget(castExpression, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(declaration, "type", true)), true);
      SLinkOperations.setTarget(castExpression, "expression", SNodeOperations.copyNode(expression), true);
    }
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(node, "ifTrue", true), "statement", castVariable);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.smodel.intentions";
  }

}
