package jetbrains.mps.baseLanguage.dates.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ParseExpression_convert_Intention extends BaseIntention implements Intention {
  public ParseExpression_convert_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.dates.structure.ParseExpression";
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
    return "Convert deprecated parse expression to a new one";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode pde = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression", null);
    SLinkOperations.setTarget(pde, "dateFormat", SLinkOperations.getTarget(node, "dateFormat", false), false);
    SLinkOperations.setTarget(pde, "zone", SLinkOperations.getTarget(node, "zone", true), true);
    SLinkOperations.setTarget(pde, "default", SLinkOperations.getTarget(node, "default", true), true);
    SLinkOperations.setTarget(pde, "locale", SLinkOperations.getTarget(node, "locale", false), false);
    SLinkOperations.setTarget(pde, "source", SLinkOperations.getTarget(node, "source", true), true);
    SNodeOperations.replaceWithAnother(node, pde);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.dates.intentions";
  }
}
