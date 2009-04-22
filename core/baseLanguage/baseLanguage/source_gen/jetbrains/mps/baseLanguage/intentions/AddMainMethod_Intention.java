package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class AddMainMethod_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add main method";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.addChild(node, "staticMethod", new _Quotations.QuotationClass_4().createNode());
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
