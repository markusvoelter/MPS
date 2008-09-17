package jetbrains.mps.baseLanguage.ext.collections.lang.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class CreateInitializer_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.HashMapCreator";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "create initializer";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "initializer", true) == null);
  }

  public void execute(SNode node, EditorContext editorContext) {
    SLinkOperations.setNewChild(node, "initializer", "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapInitializer");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.intentions";
  }

}
