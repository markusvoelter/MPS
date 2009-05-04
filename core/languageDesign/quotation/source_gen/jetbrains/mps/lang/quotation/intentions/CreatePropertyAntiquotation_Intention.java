package jetbrains.mps.lang.quotation.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.PropertyAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class CreatePropertyAntiquotation_Intention extends BaseIntention {

  public CreatePropertyAntiquotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.quotation.structure.Quotation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Create Property Antiquotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    EditorCell selectedCell = editorContext.getSelectedCell();
    SNode contextNode = SNodeOperations.cast(selectedCell.getSNode(), "jetbrains.mps.lang.core.structure.BaseConcept");
    if (contextNode == null) {
      return false;
    }
    if (!(selectedCell instanceof EditorCell_Property)) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    EditorCell selectedCell = editorContext.getSelectedCell();
    SNode contextNode = SNodeOperations.cast(selectedCell.getSNode(), "jetbrains.mps.lang.core.structure.BaseConcept");
    if (contextNode == null) {
      return;
    }
    if (!(selectedCell instanceof EditorCell_Property)) {
      return;
    }
    EditorCell_Property editorCell_Property = (EditorCell_Property)selectedCell;
    String propertyName = ((PropertyAccessor)editorCell_Property.getModelAccessor()).getPropertyName();
    if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.PropertyAntiquotation")) {
      SNode attributedNode = SNodeOperations.cast(SNodeOperations.getParent(contextNode), "jetbrains.mps.lang.core.structure.BaseConcept");
      assert attributedNode != null;
      SLinkOperations.setTarget(attributedNode, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyAntiquotation", propertyName), null, true);
      attributedNode.setAttribute(null);
      return;
    }
    if (SLinkOperations.getTarget(contextNode, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyAntiquotation", propertyName), true) != null) {
      SLinkOperations.setTarget(contextNode, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyAntiquotation", propertyName), null, true);
    } else
    {
      SLinkOperations.setNewChild(contextNode, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyAntiquotation", propertyName), "jetbrains.mps.lang.quotation.structure.PropertyAntiquotation");
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.quotation.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
