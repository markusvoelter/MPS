package jetbrains.mps.lang.test.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class AddCellAnnotation_Intention extends BaseIntention {

  public AddCellAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
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
    return "Add Editor Annotation.";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.lang.test.structure.EditorTestCase", false, false) != null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ancessor = node;
    while (ancessor != null && !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(ancessor), "jetbrains.mps.lang.test.structure.EditorTestCase"))) {
      ancessor = SNodeOperations.getParent(ancessor);
    }
    for(SNode oldAnnotation : SNodeOperations.getDescendants(ancessor, "jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", false)) {
      SNodeOperations.deleteNode(oldAnnotation);
    }
    SNode newAnnotation = SConceptOperations.createNewNode("jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", null);
    EditorCell contextCell = editorContext.getContextCell();
    if (contextCell instanceof EditorCell_Label) {
      int caretPosition = ((EditorCell_Label)contextCell).getCaretPosition();
      if (caretPosition == ((EditorCell_Label)contextCell).getText().length()) {
        SPropertyOperations.set(newAnnotation, "isLastPosition", "" + true);
      } else
      {
        SPropertyOperations.set(newAnnotation, "caretPosition", "" + caretPosition);
      }
    } else
    {
      SPropertyOperations.set(newAnnotation, "caretPosition", "" + 0);
    }
    SPropertyOperations.set(newAnnotation, "cellId", contextCell.getCellId());
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("testNode"), newAnnotation, true);
    editorContext.select(newAnnotation);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.test.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
