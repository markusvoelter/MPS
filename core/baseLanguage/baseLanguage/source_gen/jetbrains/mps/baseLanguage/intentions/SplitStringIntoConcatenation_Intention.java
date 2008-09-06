package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.smodel.SNode;

import java.util.HashMap;
import java.util.Map;

public class SplitStringIntoConcatenation_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.StringLiteral";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Split string into concatenation";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    EditorCell_Property ecProperty = (EditorCell_Property) editorContext.getContextCell();
    int caretPosition = ecProperty.getCaretPosition();
    String s1 = SPropertyOperations.getString(node, "value").substring(0, caretPosition);
    String s2 = SPropertyOperations.getString(node, "value").substring(caretPosition);
    SNode plusExpression = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.PlusExpression");
    SPropertyOperations.set(SLinkOperations.setNewChild(plusExpression, "leftExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s1);
    SPropertyOperations.set(SLinkOperations.setNewChild(plusExpression, "rightExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s2);
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
