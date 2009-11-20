package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AddIndent_Intention extends BaseIntention {
  public AddIndent_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.EditorCellModel";
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
    return "Add Indent";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (SNodeOperations.getParent(node) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection"), "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent") && !(EditorCellModel_Behavior.call_isIndented_1237383418148(node));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode newLine = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem", null);
    SPropertyOperations.set(newLine, "flag", "" + (true));
    SLinkOperations.addChild(node, "styleItem", newLine);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }
}
