package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class CreateSetAccessor_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.GetAccessor";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Create set accessor";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return (SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation", false, false), "setAccessor", true) == null);
  }

  public void execute(SNode node, EditorContext editorContext) {
    SLinkOperations.setNewChild(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation", false, false), "setAccessor", "jetbrains.mps.baseLanguage.structure.SetAccessor");
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

  public String getSourceModelUID() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
