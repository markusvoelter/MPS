package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class FilpEqualsIntention_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Flip equals()";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    if (SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name") == null) {
      return false;
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name").equals("equals") && SLinkOperations.getCount(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter") == 1;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode parameter = ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first();
    SNodeOperations.replaceWithAnother(parameter, SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", true));
    SLinkOperations.setTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", parameter, true);
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
