package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;

public class ConvertInlineTemplateToTemplateFragment_Intention extends BaseIntention {
  public ConvertInlineTemplateToTemplateFragment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence";
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
    return "Convert to Template Fragment";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode ruleNode = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.BaseMappingRule", false, false);
    if (!(SNodeOperations.isInstanceOf(ruleNode, "jetbrains.mps.lang.generator.structure.Root_MappingRule") || SNodeOperations.isInstanceOf(ruleNode, "jetbrains.mps.lang.generator.structure.Weaving_MappingRule") || SNodeOperations.isInstanceOf(ruleNode, "jetbrains.mps.lang.generator.structure.Reduction_MappingRule"))) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode templateNode = SModelOperations.createNewRootNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.generator.structure.TemplateDeclaration", null);
    SNode ruleNode = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.BaseMappingRule", false, false);
    SLinkOperations.setTarget(templateNode, "applicableConcept", SLinkOperations.getTarget(ruleNode, "applicableConcept", false), false);
    SPropertyOperations.set(templateNode, "name", "template1");
    SLinkOperations.setTarget(templateNode, "contentNode", SLinkOperations.getTarget(node, "templateNode", true), true);
    templateNode.setProperty(SModelTreeNode.PACK, SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getContainingRoot(node), "jetbrains.mps.lang.core.structure.BaseConcept"), "virtualPackage"));

    SNode templateRefNode = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference");
    SLinkOperations.setTarget(templateRefNode, "template", templateNode, false);

    editorContext.select(templateNode);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }
}
