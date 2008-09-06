package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

import java.util.HashMap;
import java.util.Map;

public class ElsifSwapWithMain_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ElsifClause";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "swap this elsif clause with the main clause";
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode ifStatement = SNodeOperations.getParent(node);
    SNode condition = SLinkOperations.getTarget(ifStatement, "condition", true);
    SNode statementList = SLinkOperations.getTarget(ifStatement, "ifTrue", true);
    SLinkOperations.setTarget(ifStatement, "condition", SLinkOperations.getTarget(node, "condition", true), true);
    SLinkOperations.setTarget(ifStatement, "ifTrue", SLinkOperations.getTarget(node, "statementList", true), true);
    SLinkOperations.setTarget(node, "condition", condition, true);
    SLinkOperations.setTarget(node, "statementList", statementList, true);
  }

  public Object[] getField(String key) {
    Object[] value = this.myMap.get(key);
    if (value == null) {
      value = new Object[1];
      this.myMap.put(key, value);
    }
    return value;
  }

  public void putArgument(String key, Object argument) {
    this.getField(key)[0] = argument;
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
