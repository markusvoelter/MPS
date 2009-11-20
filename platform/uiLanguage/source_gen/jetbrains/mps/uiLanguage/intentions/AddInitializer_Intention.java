package jetbrains.mps.uiLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class AddInitializer_Intention extends BaseIntention {
  public AddInitializer_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.uiLanguage.structure.AttributeDeclaration";
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
    return "Add Initializer";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SLinkOperations.getTarget(node, "onChange", true) == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode expression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.Expression", null);
    SLinkOperations.setTarget(node, "initializer", expression, true);
    editorContext.select(expression);
  }

  public String getLocationString() {
    return "jetbrains.mps.uiLanguage.intentions";
  }
}
