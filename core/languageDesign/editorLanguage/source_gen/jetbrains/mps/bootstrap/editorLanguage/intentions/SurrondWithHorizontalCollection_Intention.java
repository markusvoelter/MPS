package jetbrains.mps.bootstrap.editorLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SurrondWithHorizontalCollection_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.bootstrap.editorLanguage.structure.EditorCellModel";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Surround with horizontal collection";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return editorContext.getSelectedNodes().size() > 0;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection", null);
    SPropertyOperations.set(result, "vertical", "" + false);
    List<SNode> nodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(ListSequence.fromList(nodes).last(), result);
    for (SNode sn : nodes) {
      SLinkOperations.addChild(result, "childCellModel", sn);
    }
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
    return "jetbrains.mps.bootstrap.editorLanguage.intentions";
  }

}
